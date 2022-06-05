package com.clt.shp.cate.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.cmm.dao.LogPreparedStatement;
import com.clt.shp.cate.CateVO;
import com.clt.shp.cate.dao.CateDao;
import com.clt.shp.cate.sql.CateSql;

public class CateDaoOracle implements CateDao{
	private CommonDao commonDao;
	
	public CateDaoOracle() {
		commonDao = new CommonDao();
	}
	
	@Override
	public int insertCate(CateVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		String sql = CateSql.CATE_INSERT;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setString(1, pvo.getCatgryCd());
			ps.setInt(2, pvo.getGoodsCd());
			ps.setString(3, pvo.getCatgryNm());
			ps.setString(4, pvo.getNoteCont());
			ps.setString(5, pvo.getClassLvlCd());
			ps.setString(6, pvo.getUprClassCd());
			ps.setString(7, pvo.getRgstId());
			ps.setString(8, pvo.getUpdtId());
			ps.setString(9, pvo.getUseYn());

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
	public CateVO selectCateOne(CateVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		CateVO vo = null;
		String sql = CateSql.CATE_SELECT;

		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setLong(1, pvo.getGoodsCataSeq());

			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new CateVO(rs.getLong("GOODS_CATA_SEQ"), rs.getString("CATGRY_CD") , rs.getInt("GOODS_CD")
					, rs.getString("CATGRY_NM"), rs.getString("NOTE_CONT"), rs.getString("CLASS_LVL_CD")
					, rs.getString("UPR_CLASS_CD"), rs.getString("RGST_ID"), rs.getString("RGST_DATE") 
					, rs.getString("UPDT_ID") , rs.getString("UPDT_DATE"), rs.getString("USE_YN"));
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
	public List<CateVO> selectCateList(CateVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CateVO> list = new ArrayList<CateVO>();
		String sql = CateSql.CATE_LIST;

		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);

			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add( new CateVO(rs.getLong("GOODS_CATA_SEQ"), rs.getString("CATGRY_CD") , rs.getInt("GOODS_CD")
						, rs.getString("CATGRY_NM"), rs.getString("NOTE_CONT"), rs.getString("CLASS_LVL_CD")
						, rs.getString("UPR_CLASS_CD"), rs.getString("RGST_ID"), rs.getString("RGST_DATE") 
						, rs.getString("UPDT_ID") , rs.getString("UPDT_DATE"), rs.getString("USE_YN")));
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
	public List<CateVO> selectCateUnList(CateVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CateVO> list = new ArrayList<CateVO>();
		String sql = CateSql.CATE_UNDER_LIST;

		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setString(1, pvo.getCatgryCd());

			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add( new CateVO(rs.getLong("GOODS_CATA_SEQ"), rs.getString("CATGRY_CD") , rs.getInt("GOODS_CD")
						, rs.getString("CATGRY_NM"), rs.getString("NOTE_CONT"), rs.getString("CLASS_LVL_CD")
						, rs.getString("UPR_CLASS_CD"), rs.getString("RGST_ID"), rs.getString("RGST_DATE") 
						, rs.getString("UPDT_ID") , rs.getString("UPDT_DATE"), rs.getString("USE_YN")));
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
	public int updateCate(CateVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = CateSql.CATE_UPDATE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setString(1, pvo.getCatgryCd());
			ps.setString(2, pvo.getCatgryNm());
			ps.setString(3, pvo.getNoteCont());
			ps.setString(4, pvo.getUseYn());
			ps.setString(5, pvo.getUpdtId());
			ps.setString(6, pvo.getUpdtDate());
			ps.setLong(7, pvo.getGoodsCataSeq());

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
	public int deleteCate(CateVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = CateSql.CATE_DELETE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setLong(1, pvo.getGoodsCataSeq());

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
	public int deleteCateAll() {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = CateSql.CATE_DELETE_ALL;
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
		String sql = CateSql.CATE_DROP_SEQ;
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
		String sql = CateSql.CATE_CREATE_SEQ;
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
