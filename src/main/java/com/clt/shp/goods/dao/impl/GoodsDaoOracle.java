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
			ps.setLong(1, pvo.getEntrNo());
			ps.setString(2, pvo.getGoodsNm());
			ps.setInt(3, pvo.getGoodsPrc());
			ps.setString(4, pvo.getCatgryCd());
			ps.setString(5, pvo.getCatgryCd2());
			ps.setInt(6, pvo.getInyQty());
			ps.setInt(7, pvo.getDlvPrc());
			ps.setString(8, pvo.getGoodsSize());
			ps.setString(9, pvo.getGoodsClr());
			ps.setString(10, pvo.getImgPath());
			ps.setString(11, pvo.getImgNm());
			ps.setString(12, pvo.getGoodsIntr());
			ps.setString(13, pvo.getSaleStatCd());
			ps.setString(14, pvo.getUseYn());
			ps.setString(15, pvo.getRgstId());
			ps.setDate(16, pvo.getRgstDate());
			ps.setString(17, pvo.getUpdtId());
			ps.setDate(18, pvo.getUpdtDate());

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
	public GoodsVO selectGoodsOne(GoodsVO pvo){
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
				vo = new GoodsVO(rs.getLong("GOODS_INFO_SEQ"), rs.getLong("GOODS_CD")
					, rs.getLong("ENTR_NO"), rs.getString("GOODS_NM"), rs.getInt("GOODS_PRC")
					, rs.getString("CATGRY_CD"), rs.getString("CATGRY_CD2"), rs.getInt("INY_QTY")
					, rs.getInt("DLV_PRC"), rs.getString("GOODS_SIZE"), rs.getString("GOODS_CLR")
					, rs.getString("IMG_PATH") , rs.getString("IMG_NM") , rs.getString("GOODS_INTR")
					, rs.getString("SALE_STAT_CD") , rs.getString("USE_YN"), rs.getString("RGST_ID")
					, rs.getDate("RGST_DATE") , rs.getString("UPDT_ID") , rs.getDate("UPDT_DATE"));
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
	public List<GoodsVO> selectGoodsList(GoodsVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<GoodsVO> list = new ArrayList<GoodsVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(GoodsSql.GOODS_LIST);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new GoodsVO(rs.getLong("GOODS_INFO_SEQ"), rs.getLong("GOODS_CD")
					, rs.getLong("ENTR_NO"), rs.getString("GOODS_NM"), rs.getInt("GOODS_PRC")
					, rs.getString("CATGRY_CD"), rs.getString("CATGRY_CD2"), rs.getInt("INY_QTY")
					, rs.getInt("DLV_PRC"), rs.getString("GOODS_SIZE"), rs.getString("GOODS_CLR")
					, rs.getString("IMG_PATH") , rs.getString("IMG_NM") , rs.getString("GOODS_INTR")
					, rs.getString("SALE_STAT_CD") , rs.getString("USE_YN"), rs.getString("RGST_ID")
					, rs.getDate("RGST_DATE") , rs.getString("UPDT_ID") , rs.getDate("UPDT_DATE")));
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
			ps.setLong(1, pvo.getGoodsCd());
			ps.setLong(2, pvo.getEntrNo());
			ps.setString(3, pvo.getGoodsNm());
			ps.setInt(4, pvo.getGoodsPrc());
			ps.setString(5, pvo.getCatgryCd());
			ps.setString(6, pvo.getCatgryCd2());
			ps.setInt(7, pvo.getInyQty());
			ps.setInt(8, pvo.getDlvPrc());
			ps.setString(9, pvo.getGoodsSize());
			ps.setString(10, pvo.getGoodsClr());
			ps.setString(11, pvo.getImgPath());
			ps.setString(12, pvo.getImgNm());
			ps.setString(13, pvo.getGoodsIntr());
			ps.setString(14, pvo.getSaleStatCd());
			ps.setString(15, pvo.getUseYn());
			ps.setString(16, pvo.getRgstId());
			ps.setDate(17, pvo.getRgstDate());
			ps.setString(18, pvo.getUpdtId());
			ps.setDate(19, pvo.getUpdtDate());
			ps.setLong(20, pvo.getGoodsInfoSeq());
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
	public int deleteGoods(GoodsVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(GoodsSql.GOODS_DELETE);
			ps.setLong(1, pvo.getGoodsInfoSeq());
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
