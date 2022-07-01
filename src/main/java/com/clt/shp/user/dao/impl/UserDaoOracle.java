package com.clt.shp.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.cmm.dao.LogPreparedStatement;
import com.clt.shp.user.UserVO;
import com.clt.shp.user.dao.UserDao;
import com.clt.shp.user.sql.UserSql;

public class UserDaoOracle implements UserDao{
	private CommonDao commonDao;
   
	public UserDaoOracle() {
		commonDao = new CommonDao();
	}
   
	@Override
	public int insertUser(UserVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		String sql = UserSql.USER_INSERT;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setString(1, pvo.getUsrId());
			ps.setString(2, pvo.getUsrNm());
			ps.setString(3, pvo.getPassWd());
			ps.setString(4, pvo.getUsrBirth());
			ps.setString(5, pvo.getEmailAddr());
			ps.setString(6, pvo.getCellNo());
			ps.setString(7, pvo.getLandAddrBase());
			ps.setString(8, pvo.getLandAddrDtl());
			ps.setString(9, pvo.getLandPostNo());
			ps.setString(10, pvo.getLoadAddrBase());
			ps.setString(11, pvo.getLoadAddrDtl());
			ps.setString(12, pvo.getLoadPostNo());
			ps.setString(13, pvo.getRgstId());
			
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}
   
	@Override
	public UserVO selectUser(UserVO pvo){
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		UserVO vo = null;
		String sql = UserSql.USER_SELECT;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setLong(1, pvo.getUsrBaseSeq());
			
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new UserVO
				( rs.getLong("USR_BASE_SEQ")
				, rs.getString("USR_ID")
				, rs.getString("USR_NM")
				, rs.getString("PASS_WD")
				, rs.getString("USR_BIRTH")
				, rs.getString("EMAIL_ADDR")
				, rs.getString("CELL_NO")
				, rs.getString("LAND_ADDR_BASE")
				, rs.getString("LAND_ADDR_DTL")
				, rs.getString("LAND_POST_NO")
				, rs.getString("LOAD_ADDR_BASE")
				, rs.getString("LOAD_ADDR_DTL")
				, rs.getString("LOAD_POST_NO")
				, rs.getString("PASS_WD_CHG_DATE") //date로 바꿔야함
				, rs.getString("LOCK_YN")
				, rs.getString("RGST_ID")
				, rs.getString("RGST_DATE") //date로 바꿔야함
				, rs.getString("UPDT_ID")
				, rs.getString("UPDT_DATE") //date로 바꿔야함
				, rs.getString("USE_YN")
				);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vo;
	}

	@Override
	public List<UserVO> selectListUser(UserVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<UserVO> list = new ArrayList<UserVO>();
		String sql = UserSql.USER_LIST;
		try {
			conn = commonDao.getConnection();
				
			if(null == pvo.getSearchType() || "".equals(pvo.getSearchType())
					&& null == pvo.getSearchGradeUnderType() 
					&& pvo.getSearchStartRgstDate().equals("") && pvo.getSearchEndRgstDate().equals("")){
				
				if(null == pvo.getUserSequence() || pvo.getUserSequence().equals("") || pvo.getUserSequence().equals("num") ) {
					sql += " ORDER BY USR_BASE_SEQ ASC";
				}else {
					sql += " ORDER BY RGST_DATE ASC";
				}
				
			}else {
				if(pvo.getSearchType().equals("idType") && null != pvo.getSearchText()){
					sql += " AND USR_ID LIKE '%' || '" + pvo.getSearchText()+ "' || '%'";
				}else if(pvo.getSearchType().equals("nameType") && null != pvo.getSearchText()) {
					sql += " AND USR_NM LIKE '%' || '" + pvo.getSearchText()+ "' || '%'";
				}
				
				if(pvo.getSearchGradeUpperType().equals("user")){// && null != pvo.getSearchGradeUnderType()
					sql += " AND USR_GRDE LIKE '%' || '" + pvo.getSearchGradeUnderType()+ "' || '%'";
				}else if(pvo.getSearchGradeUpperType().equals("admin")) {
					sql += " AND ADM_GRDE LIKE '%' || '" + pvo.getSearchGradeUnderType()+ "' || '%'";
				}
				
				if(!pvo.getSearchStartRgstDate().equals("") && !pvo.getSearchEndRgstDate().equals(""))//null != pvo.getSearchStartRgstDate() && null != pvo.getSearchStartRgstDate()
					sql += " AND RGST_DATE BETWEEN '" + pvo.getSearchStartRgstDate() + "' AND '" + pvo.getSearchEndRgstDate()+"'";
				
				if(pvo.getUserSequence().equals("rgst")) {
					sql += " ORDER BY RGST_DATE ASC";
				}else {
					sql += " ORDER BY USR_BASE_SEQ ASC";
				}
			}
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(
					new UserVO
					( rs.getLong("USR_BASE_SEQ")
					, rs.getString("USR_ID")
					, rs.getString("USR_NM")
					, rs.getString("PASS_WD")
					, rs.getString("USR_BIRTH")
					, rs.getString("EMAIL_ADDR")
					, rs.getString("CELL_NO")
					, rs.getString("LAND_ADDR_BASE")
					, rs.getString("LAND_ADDR_DTL")
					, rs.getString("LAND_POST_NO")
					, rs.getString("LOAD_ADDR_BASE")
					, rs.getString("LOAD_ADDR_DTL")
					, rs.getString("LOAD_POST_NO")
					, rs.getString("PASS_WD_CHG_DATE")//date로 바꿔야함
					, rs.getString("LOCK_YN")
					, rs.getString("RGST_ID")
					, rs.getString("RGST_DATE")//date로 바꿔야함
					, rs.getString("UPDT_ID")
					, rs.getString("UPDT_DATE")//date로 바꿔야함
					, rs.getString("USE_YN")
					)
				);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
   
	@Override
	public int updateUser(UserVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = UserSql.USER_UPDATE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setString(1, pvo.getUsrNm());
			ps.setString(2, pvo.getPassWd());
			ps.setString(3, pvo.getUsrBirth());
			ps.setString(4, pvo.getEmailAddr());
			ps.setString(5, pvo.getCellNo());
			ps.setString(6, pvo.getLandAddrBase());
			ps.setString(7, pvo.getLandAddrDtl());
			ps.setString(8, pvo.getLandPostNo());
			ps.setString(9, pvo.getLoadAddrBase());
			ps.setString(10, pvo.getLoadAddrDtl());
			ps.setString(11, pvo.getLoadPostNo());
			ps.setString(12, pvo.getPassWdChgDate());//date로 바꿔야함
			ps.setString(13, pvo.getLockYn());
			ps.setString(14, pvo.getUpdtId());
			ps.setString(15, pvo.getUpdtDate());//date로 바꿔야함
			ps.setString(16, pvo.getUseYn());
			ps.setLong(17, pvo.getUsrBaseSeq());
			
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}
   
	@Override
	public int deleteUser(UserVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = UserSql.USER_DELETE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setLong(1, pvo.getUsrBaseSeq());
			
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	@Override
	public int deleteUserAll() {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = UserSql.USER_DELETE_ALL;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}
   
	public UserVO userLogin(UserVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		UserVO vo = null;
		String sql = UserSql.USER_LOGIN;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setString(1, pvo.getUsrId());
			
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new UserVO
				( rs.getLong("USR_BASE_SEQ")
				, rs.getString("USR_ID")
				, rs.getString("USR_NM")
				, rs.getString("PASS_WD")
				, rs.getString("USR_BIRTH")
				, rs.getString("EMAIL_ADDR")
				, rs.getString("CELL_NO")
				, rs.getString("LAND_ADDR_BASE")
				, rs.getString("LAND_ADDR_DTL")
				, rs.getString("LAND_POST_NO")
				, rs.getString("LOAD_ADDR_BASE")
				, rs.getString("LOAD_ADDR_DTL")
				, rs.getString("LOAD_POST_NO")
				, rs.getString("PASS_WD_CHG_DATE")//date로 바꿔야함
				, rs.getString("LOCK_YN")
				, rs.getString("RGST_ID")
				, rs.getString("RGST_DATE")//date로 바꿔야함
				, rs.getString("UPDT_ID")
				, rs.getString("UPDT_DATE")//date로 바꿔야함
				, rs.getString("USE_YN")
				);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vo;
	}

	@Override
	public int dropSeq() {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = UserSql.USER_DROP_SEQ;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}

	@Override
	public int createSeq() {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = UserSql.USER_CREATE_SEQ;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}

}