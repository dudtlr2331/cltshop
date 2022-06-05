package com.clt.shp.code.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.cmm.dao.LogPreparedStatement;
import com.clt.shp.code.CodeVO;
import com.clt.shp.code.dao.CodeDao;
import com.clt.shp.code.sql.CodeSql;

public class CodeDaoOracle implements CodeDao{
	private CommonDao commonDao;
	
	public CodeDaoOracle() {
		commonDao = new CommonDao();
	}
	
	@Override
	public int insertCode(CodeVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		String sql = CodeSql.CODE_INSERT;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setString(1, pvo.getCodeNm());
			ps.setString(2, pvo.getCodeVal());
			ps.setString(3, pvo.getCodeDesc());
			ps.setString(4, pvo.getGrpCd());
			ps.setInt(5, pvo.getGrpOrdr());
			ps.setString(6, pvo.getUseYn());
			ps.setString(7, pvo.getRgstId());
			ps.setString(8, pvo.getUpdtId());
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
	public CodeVO selectCodeOne(CodeVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		CodeVO vo = null;
		String sql = CodeSql.CODE_SELECT;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setLong(1, pvo.getStdCdBaseSeq());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new CodeVO(rs.getLong("STD_CD_BASE_SEQ"), rs.getString("CODE_NM") , rs.getString("CODE_VAL")
					, rs.getString("CODE_DESC"), rs.getString("GRP_CD"), rs.getInt("GRP_ORDR")
					, rs.getString("USE_YN"), rs.getString("RGST_ID"), rs.getString("RGST_DATE") 
					, rs.getString("UPDT_ID") , rs.getString("UPDT_DATE"));
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
	public List<CodeVO> selectCodeList(CodeVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CodeVO> list = new ArrayList<CodeVO>();
		String sql = CodeSql.CODE_LIST;
		try {
			conn = commonDao.getConnection();
			
			if(null != pvo.getSearchGrpCd() && !"".equals(pvo.getSearchGrpCd())) {
				sql += " AND GRP_CD = '" + pvo.getSearchGrpCd() + "' ";
			}
			sql += " ORDER BY STD_CD_BASE_SEQ ASC";
			
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add( new CodeVO(rs.getLong("STD_CD_BASE_SEQ"), rs.getString("CODE_NM") , rs.getString("CODE_VAL")
						, rs.getString("CODE_DESC"), rs.getString("GRP_CD"), rs.getInt("GRP_ORDR")
						, rs.getString("USE_YN"), rs.getString("RGST_ID"), rs.getString("RGST_DATE") 
						, rs.getString("UPDT_ID") , rs.getString("UPDT_DATE")));
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
	public List<CodeVO> selectSaleStatCdList(CodeVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CodeVO> list = new ArrayList<CodeVO>();
		String sql = CodeSql.SALESTAT_CODE_LIST;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add( new CodeVO(rs.getLong("STD_CD_BASE_SEQ"), rs.getString("CODE_NM") , rs.getString("CODE_VAL")
						, rs.getString("CODE_DESC"), rs.getString("GRP_CD"), rs.getInt("GRP_ORDR")
						, rs.getString("USE_YN"), rs.getString("RGST_ID"), rs.getString("RGST_DATE") 
						, rs.getString("UPDT_ID") , rs.getString("UPDT_DATE")));
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
	public List<CodeVO> selectOrdCdList(CodeVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CodeVO> list = new ArrayList<CodeVO>();
		String sql = CodeSql.ORD_CODE_LIST;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add( new CodeVO(rs.getLong("STD_CD_BASE_SEQ"), rs.getString("CODE_NM") , rs.getString("CODE_VAL")
						, rs.getString("CODE_DESC"), rs.getString("GRP_CD"), rs.getInt("GRP_ORDR")
						, rs.getString("USE_YN"), rs.getString("RGST_ID"), rs.getString("RGST_DATE") 
						, rs.getString("UPDT_ID") , rs.getString("UPDT_DATE")));
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
	public List<CodeVO> selectUsrCdList(CodeVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CodeVO> list = new ArrayList<CodeVO>();
		String sql = CodeSql.USR_CODE_LIST;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add( new CodeVO(rs.getLong("STD_CD_BASE_SEQ"), rs.getString("CODE_NM") , rs.getString("CODE_VAL")
						, rs.getString("CODE_DESC"), rs.getString("GRP_CD"), rs.getInt("GRP_ORDR")
						, rs.getString("USE_YN"), rs.getString("RGST_ID"), rs.getString("RGST_DATE") 
						, rs.getString("UPDT_ID") , rs.getString("UPDT_DATE")));
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
	public List<CodeVO> selectAdmCdList(CodeVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CodeVO> list = new ArrayList<CodeVO>();
		String sql = CodeSql.ADM_CODE_LIST;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add( new CodeVO(rs.getLong("STD_CD_BASE_SEQ"), rs.getString("CODE_NM") , rs.getString("CODE_VAL")
						, rs.getString("CODE_DESC"), rs.getString("GRP_CD"), rs.getInt("GRP_ORDR")
						, rs.getString("USE_YN"), rs.getString("RGST_ID"), rs.getString("RGST_DATE") 
						, rs.getString("UPDT_ID") , rs.getString("UPDT_DATE")));
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
	public int updateCode(CodeVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = CodeSql.CODE_UPDATE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setString(1, pvo.getCodeNm());
			ps.setString(2, pvo.getCodeVal());
			ps.setString(3, pvo.getCodeDesc());
			ps.setString(4, pvo.getGrpCd());
			ps.setInt(5, pvo.getGrpOrdr());
			ps.setString(6, pvo.getUseYn());
			ps.setString(7, pvo.getUpdtId());
			ps.setString(8, pvo.getUpdtDate());
			ps.setLong(9, pvo.getStdCdBaseSeq());
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
	public int deleteCode(CodeVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = CodeSql.CODE_DELETE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setLong(1, pvo.getStdCdBaseSeq());
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
	public int deleteCodeAll() {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = CodeSql.CODE_DELETE_ALL;
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
	public int dropSeq() {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = CodeSql.CODE_SEQ_DROP;
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
		String sql = CodeSql.CODE_SEQ_CREATE;
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
