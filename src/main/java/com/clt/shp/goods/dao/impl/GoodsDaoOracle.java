package com.clt.shp.goods.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.GoodsDao;
import com.clt.shp.goods.sql.GoodsSql;

public class GoodsDaoOracle implements GoodsDao{
	private CommonDao commonDao;
	
	public GoodsDaoOracle() {
		commonDao = new CommonDao();
	}
	
	@Override
	public int insertMain(GoodsVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(GoodsSql.MAIN_INSERT);
			ps.setString(1, String.valueOf(pvo.getMainBoardSn()));
			ps.setString(2, pvo.getImgPath());

			row = ps.executeUpdate();
			
			System.out.println("dao..INSERT OK!!..No ::" + pvo.getMainBoardSn());
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
	public GoodsVO selectMain(GoodsVO pvo){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		GoodsVO vo = null;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(GoodsSql.MAIN_SELECT);
			ps.setLong(1, pvo.getMainBoardSn());
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new GoodsVO(rs.getLong("MAIN_BOARD_SN"), rs.getString("IMG_PATH"));
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
	public List<GoodsVO> selectListMain(GoodsVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<GoodsVO> list = new ArrayList<GoodsVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(GoodsSql.MAIN_LIST);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new GoodsVO(rs.getLong("MAIN_BOARD_SN"), rs.getString("IMG_PATH")));
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
	public int updateMain(GoodsVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(GoodsSql.MAIN_UPDATE);
			ps.setString(1, pvo.getImgPath());
			ps.setLong(2, pvo.getMainBoardSn());
			row = ps.executeUpdate();
			System.out.println(row + "row UPDATE..updatePosting()..end");
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
	public int deleteMain(GoodsVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(GoodsSql.MAIN_DELETE);
			ps.setLong(1, pvo.getMainBoardSn());
			row = ps.executeUpdate();
			System.out.println(row + " row DELETE...deletePosting()...end...");
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
