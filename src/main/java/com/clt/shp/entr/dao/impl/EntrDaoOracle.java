package com.clt.shp.entr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.cmm.dao.LogPreparedStatement;
import com.clt.shp.entr.EntrVO;
import com.clt.shp.entr.dao.EntrDao;
import com.clt.shp.entr.sql.EntrSql;

public class EntrDaoOracle implements EntrDao{

	private CommonDao commonDao;
	
	public EntrDaoOracle() {
		commonDao = new CommonDao();
	}
	
	@Override
	public int insertEntr(EntrVO evo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		String sql = EntrSql.ENTR_INSERT;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);

			ps.setString(1, evo.getUsrId());
			ps.setString(2, evo.getEntrNm());
			ps.setString(3, evo.getBmanRegNo());
			ps.setString(4, evo.getPresNm());
			ps.setString(5, evo.getPresTell());
			ps.setString(6, evo.getPresEmail());
			ps.setString(7, evo.getAempNm());
			ps.setString(8, evo.getAempTell());
			ps.setString(9, evo.getAempEmail());
			ps.setInt(10, evo.getScore());
			ps.setString(11, evo.getLandAddrBase());
			ps.setString(12, evo.getLandAddrDtl());
			ps.setString(13, evo.getLandPostNo());
			ps.setString(14, evo.getLoadAddrBase());
			ps.setString(15, evo.getLoadPostNo());
			ps.setDate(16, evo.getOpnDate());
			ps.setDate(17, evo.getCloseDate());
			ps.setString(18, evo.getOpnYn());
			ps.setString(19, evo.getUseYn());
			ps.setString(20, evo.getRgstId());
			ps.setString(21, evo.getUpdtId());
			
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
			
		} catch (SQLException e) {
			row = -1;
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
	public EntrVO selectEntrOne(EntrVO evo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		EntrVO vo = null;
		String sql = EntrSql.ENTR_SELECT;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setLong(1, evo.getEntrNo());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while(rs.next()) {
				vo = new EntrVO(rs.getLong("ENTR_NO"), rs.getString("USR_ID"), rs.getString("ENTR_NM")
					, rs.getString("BMAN_REG_NO"), rs.getString("PRES_NM"), rs.getString("PRES_TELL")
					, rs.getString("PRES_EMAIL"), rs.getString("AEMP_NM"), rs.getString("AEMP_TELL")
					, rs.getString("AEMP_EMAIL"), rs.getInt("SCORE"), rs.getString("LAND_ADDR_BASE")
					, rs.getString("LAND_ADDR_DTL"), rs.getString("LAND_POST_NO"), rs.getString("LOAD_ADDR_BASE")
					, rs.getString("LOAD_POST_NO"), rs.getDate("OPN_DATE"), rs.getDate("CLOSE_DATE")
					, rs.getString("OPN_YN"), rs.getString("USE_YN"), rs.getString("RGST_ID")
					, rs.getDate("RGST_DATE"), rs.getString("UPDT_ID"), rs.getDate("UPDT_DATE"));
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
	public List<EntrVO> selectEntrList(EntrVO evo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<EntrVO> list = new ArrayList<EntrVO>();
		String sql = EntrSql.ENTR_SELECT_LIST;
		
		if(null != evo.getUsrId() && !"".equals(evo.getUsrId())) {
			sql += " AND USR_ID = '" +evo.getUsrId()+ "'";
		}
		sql += " ORDER BY ENTR_NO DESC";
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new EntrVO(rs.getLong("ENTR_NO"), rs.getString("USR_ID"), rs.getString("ENTR_NM")
						, rs.getString("BMAN_REG_NO"), rs.getString("PRES_NM"), rs.getString("PRES_TELL")
						, rs.getString("PRES_EMAIL"), rs.getString("AEMP_NM"), rs.getString("AEMP_TELL")
						, rs.getString("AEMP_EMAIL"), rs.getInt("SCORE"), rs.getString("LAND_ADDR_BASE")
						, rs.getString("LAND_ADDR_DTL"), rs.getString("LAND_POST_NO"), rs.getString("LOAD_ADDR_BASE")
						, rs.getString("LOAD_POST_NO"), rs.getDate("OPN_DATE"), rs.getDate("CLOSE_DATE")
						, rs.getString("OPN_YN"), rs.getString("USE_YN"), rs.getString("RGST_ID")
						, rs.getDate("RGST_DATE"), rs.getString("UPDT_ID"), rs.getDate("UPDT_DATE")));
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
	public int updateEntr(EntrVO evo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = EntrSql.ENTR_UPDATE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setString(1, evo.getUsrId());
			ps.setString(2, evo.getEntrNm());
			ps.setString(3, evo.getBmanRegNo());
			ps.setString(4, evo.getPresNm());
			ps.setString(5, evo.getPresTell());
			ps.setString(6, evo.getPresEmail());
			ps.setString(7, evo.getAempNm());
			ps.setString(8, evo.getAempTell());
			ps.setString(9, evo.getAempEmail());
			ps.setInt(10, evo.getScore());
			ps.setString(11, evo.getLandAddrBase());
			ps.setString(12, evo.getLandAddrDtl());
			ps.setString(13, evo.getLandPostNo());
			ps.setString(14, evo.getLoadAddrBase());
			ps.setString(15, evo.getLoadPostNo());
			ps.setDate(16, evo.getOpnDate());
			ps.setDate(17, evo.getCloseDate());
			ps.setString(18, evo.getOpnYn());
			ps.setString(19, evo.getUseYn());
			ps.setString(20, evo.getUpdtId());
			ps.setLong(21, evo.getEntrNo());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
		} catch (SQLException e) {
			row = -1;
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
	public int deleteEntr(EntrVO evo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = EntrSql.ENTR_DELETE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setLong(1, evo.getEntrNo());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
		} catch (Exception e) {
			row = -1;
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
	public int deleteEntrAll() {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = EntrSql.ENTR_DELETE_ALL;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
		} catch (Exception e) {
			row = -1;
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
		String sql = EntrSql.ENTR_DROP_SEQ;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
		} catch (Exception e) {
			row = -1;
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
		String sql = EntrSql.ENTR_CREATE_SEQ;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
		} catch (Exception e) {
			row = -1;
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
