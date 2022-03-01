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
	public int insertGoods(GoodsVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(GoodsSql.GOODS_INSERT);
			ps.setLong(1, pvo.getGoodsInfoSeq());
			ps.setString(2, pvo.getGoodsNm());
			ps.setInt(3, pvo.getGoodsPrc());

			row = ps.executeUpdate();
			
			System.out.println("INSERT OK.. Seq::" + pvo.getGoodsInfoSeq());
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
	public GoodsVO selectGoods(GoodsVO pvo){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		GoodsVO vo = null;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(GoodsSql.GOODS_SELECT);
			ps.setLong(1, pvo.getGoodsInfoSeq());
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new GoodsVO(rs.getLong("GOODS_INFO_SEQ"), rs.getString("GOODS_NM"), rs.getInt("GOODS_PRC"));
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
	public List<GoodsVO> selectListGoods(GoodsVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<GoodsVO> list = new ArrayList<GoodsVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(GoodsSql.GOODS_LIST);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new GoodsVO(rs.getLong("GOODS_INFO_SEQ"), rs.getString("GOODS_NM"), rs.getInt("GOODS_PRC")));
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
	public int updateGoods(GoodsVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(GoodsSql.GOODS_UPDATE);
			ps.setString(1, pvo.getGoodsNm());
			ps.setInt(2, pvo.getGoodsPrc());
			ps.setLong(3, pvo.getGoodsInfoSeq());
			row = ps.executeUpdate();
			System.out.println("UPDATE OK.. Seq::" + pvo.getGoodsInfoSeq());
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
	public int deleteGoods(GoodsVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(GoodsSql.GOODS_DELETE);
			ps.setLong(1, pvo.getGoodsInfoSeq());
			row = ps.executeUpdate();
			System.out.println("DELETE OK.. Seq::" + pvo.getGoodsInfoSeq());
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
