package com.clt.shp.goods.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.cmm.dao.LogPreparedStatement;
import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.GoodsDao;
import com.clt.shp.goods.sql.GoodsSql;
import com.clt.shp.main.GoodsDetailVO;
import com.clt.shp.order.OrderVO;

public class GoodsDaoOracle implements GoodsDao{
	private CommonDao commonDao;
	
	public GoodsDaoOracle() {
		commonDao = new CommonDao();
	}

	@Override
	public int insertGoods(GoodsVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		String sql = GoodsSql.GOODS_INSERT;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
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
	public GoodsVO selectGoodsOne(GoodsVO pvo){
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		GoodsVO vo = null;
		String sql = GoodsSql.GOODS_SELECT;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setLong(1, pvo.getGoodsInfoSeq());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<GoodsVO> list = new ArrayList<GoodsVO>();
		String sql = GoodsSql.GOODS_LIST;
		if(null != pvo.getSearchEntrNo() && !"".equals(pvo.getSearchEntrNo())) {
			sql += " AND ENTR_NO = '" + pvo.getSearchEntrNo() + "'";
		}
		sql += " ORDER BY GOODS_INFO_SEQ ASC";
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = GoodsSql.GOODS_UPDATE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
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
	public int deleteGoods(GoodsVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = GoodsSql.GOODS_DELETE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setLong(1, pvo.getGoodsInfoSeq());
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
	public GoodsDetailVO selectGoodsDetail(String seq) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		GoodsDetailVO vo = null;
		String sql = GoodsSql.GOODS_DETAIL_ONE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
			ps.setString(1, seq);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new GoodsDetailVO();
				vo.getGoods().setGoodsCd(rs.getLong(1));
				vo.getGoods().setEntrNo(rs.getLong(2));
				vo.getGoods().setGoodsNm(rs.getString(3));
				vo.getGoods().setGoodsPrc(rs.getInt(4));
				vo.getGoods().setInyQty(rs.getInt(5));
				vo.getGoods().setDlvPrc(rs.getInt(6));
				vo.getGoods().setGoodsSize(rs.getString(7));
				vo.getGoods().setGoodsClr(rs.getString(8));
				vo.getGoods().setImgPath(rs.getString(9));
				vo.getGoods().setImgNm(rs.getString(10));
				vo.getGoods().setGoodsIntr(rs.getString(11));
				vo.getGoods().setSaleStatCd(rs.getString(12));
				vo.getGoods().setUseYn(rs.getString(13));
				vo.getGoods().setRgstId(rs.getString(14));
				vo.getGoods().setRgstDate(rs.getDate(15));
				vo.getGoods().setUpdtId(rs.getString(16));
				vo.getGoods().setUpdtDate(rs.getDate(17));
				vo.getSale().setSaleBoardSeq(rs.getLong(18));
				vo.getSale().setSaleStatCd(rs.getString(19));
				vo.getSale().setBulTitNm(rs.getString(20));
				vo.getSale().setBulStrtDt(rs.getDate(21));
				vo.getSale().setBulEndDt(rs.getDate(22));
				vo.getSale().setBulYn(rs.getString(23));
				vo.getSale().setNtcSctCd(rs.getString(24));
				vo.getSale().setBulCont(rs.getString(25));
				vo.getSale().setQryCnt(rs.getInt(26));
				vo.getSale().setLkeCnt(rs.getLong(27));
				vo.getSale().setGoodsPrc(rs.getInt(28));
				vo.getSale().setGoodsSalePrc(rs.getInt(29));
				vo.getSale().setPrclWay(rs.getString(30));
				vo.getSale().setSaleCnt(rs.getInt(31));
				vo.getSale().setRgstId(rs.getString(32));
				vo.getSale().setRgstDate(rs.getDate(33));
				vo.getSale().setUpdtId(rs.getString(34));
				vo.getSale().setUpdtDate(rs.getDate(35));
				vo.getSale().setUseYn(rs.getString(36));
				vo.getSale().setDescription(rs.getString(37));
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
	public List<GoodsDetailVO> selectMypgGoodsList(GoodsVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		GoodsDetailVO vo = null;
		List<GoodsDetailVO> list = new ArrayList<GoodsDetailVO>();
		String sql = GoodsSql.SELECT_MYPAGE_GOODS_ONE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setLong(1, pvo.getGoodsCd());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				vo = new GoodsDetailVO();
				vo.getGoods().setGoodsCd(rs.getLong(1));
				vo.getGoods().setEntrNo(rs.getLong(2));
				vo.getGoods().setGoodsNm(rs.getString(3));
				vo.getGoods().setGoodsPrc(rs.getInt(4));
				vo.getGoods().setInyQty(rs.getInt(5));
				vo.getGoods().setDlvPrc(rs.getInt(6));
				vo.getGoods().setGoodsSize(rs.getString(7));
				vo.getGoods().setGoodsClr(rs.getString(8));
				vo.getGoods().setImgPath(rs.getString(9));
				vo.getGoods().setImgNm(rs.getString(10));
				vo.getGoods().setGoodsIntr(rs.getString(11));
				vo.getGoods().setSaleStatCd(rs.getString(12));
				vo.getGoods().setUseYn(rs.getString(13));
				vo.getGoods().setRgstId(rs.getString(14));
				vo.getGoods().setRgstDate(rs.getDate(15));
				vo.getGoods().setUpdtId(rs.getString(16));
				vo.getGoods().setUpdtDate(rs.getDate(17));
				vo.getSale().setSaleBoardSeq(rs.getLong(18));
				vo.getSale().setSaleStatCd(rs.getString(19));
				vo.getSale().setBulTitNm(rs.getString(20));
				vo.getSale().setBulStrtDt(rs.getDate(21));
				vo.getSale().setBulEndDt(rs.getDate(22));
				vo.getSale().setBulYn(rs.getString(23));
				vo.getSale().setNtcSctCd(rs.getString(24));
				vo.getSale().setBulCont(rs.getString(25));
				vo.getSale().setQryCnt(rs.getInt(26));
				vo.getSale().setLkeCnt(rs.getLong(27));
				vo.getSale().setGoodsPrc(rs.getInt(28));
				vo.getSale().setGoodsSalePrc(rs.getInt(29));
				vo.getSale().setPrclWay(rs.getString(30));
				vo.getSale().setSaleCnt(rs.getInt(31));
				vo.getSale().setRgstId(rs.getString(32));
				vo.getSale().setRgstDate(rs.getDate(33));
				vo.getSale().setUpdtId(rs.getString(34));
				vo.getSale().setUpdtDate(rs.getDate(35));
				vo.getSale().setUseYn(rs.getString(36));
				vo.getSale().setDescription(rs.getString(37));
				list.add(vo);
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
	public GoodsDetailVO selectMypgGoodsOne(GoodsVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		GoodsDetailVO vo = null;
		String sql = GoodsSql.SELECT_MYPAGE_GOODS_ONE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setLong(1, pvo.getGoodsCd());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new GoodsDetailVO();
				vo.getGoods().setGoodsCd(rs.getLong(1));
				vo.getGoods().setEntrNo(rs.getLong(2));
				vo.getGoods().setGoodsNm(rs.getString(3));
				vo.getGoods().setGoodsPrc(rs.getInt(4));
				vo.getGoods().setInyQty(rs.getInt(5));
				vo.getGoods().setDlvPrc(rs.getInt(6));
				vo.getGoods().setGoodsSize(rs.getString(7));
				vo.getGoods().setGoodsClr(rs.getString(8));
				vo.getGoods().setImgPath(rs.getString(9));
				vo.getGoods().setImgNm(rs.getString(10));
				vo.getGoods().setGoodsIntr(rs.getString(11));
				vo.getGoods().setSaleStatCd(rs.getString(12));
				vo.getGoods().setUseYn(rs.getString(13));
				vo.getGoods().setRgstId(rs.getString(14));
				vo.getGoods().setRgstDate(rs.getDate(15));
				vo.getGoods().setUpdtId(rs.getString(16));
				vo.getGoods().setUpdtDate(rs.getDate(17));
				vo.getSale().setSaleBoardSeq(rs.getLong(18));
				vo.getSale().setSaleStatCd(rs.getString(19));
				vo.getSale().setBulTitNm(rs.getString(20));
				vo.getSale().setBulStrtDt(rs.getDate(21));
				vo.getSale().setBulEndDt(rs.getDate(22));
				vo.getSale().setBulYn(rs.getString(23));
				vo.getSale().setNtcSctCd(rs.getString(24));
				vo.getSale().setBulCont(rs.getString(25));
				vo.getSale().setQryCnt(rs.getInt(26));
				vo.getSale().setLkeCnt(rs.getLong(27));
				vo.getSale().setGoodsPrc(rs.getInt(28));
				vo.getSale().setGoodsSalePrc(rs.getInt(29));
				vo.getSale().setPrclWay(rs.getString(30));
				vo.getSale().setSaleCnt(rs.getInt(31));
				vo.getSale().setRgstId(rs.getString(32));
				vo.getSale().setRgstDate(rs.getDate(33));
				vo.getSale().setUpdtId(rs.getString(34));
				vo.getSale().setUpdtDate(rs.getDate(35));
				vo.getSale().setUseYn(rs.getString(36));
				vo.getSale().setDescription(rs.getString(37));
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
	public int deleteGoodsAll() {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = GoodsSql.GOODS_DELETE_ALL;
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
		String sql = GoodsSql.GOODS_DROP_SEQ;
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
		String sql = GoodsSql.GOODS_CREATE_SEQ;
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
