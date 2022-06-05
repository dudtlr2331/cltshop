package com.clt.shp.main.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.cmm.dao.LogPreparedStatement;
import com.clt.shp.main.GoodsDetailVO;
import com.clt.shp.main.dao.MainDao;
import com.clt.shp.main.sql.MainSql;

public class MainDaoOracle implements MainDao{
	private CommonDao commonDao;
	
	public MainDaoOracle() {
		commonDao = new CommonDao();
	}
	
	@Override
	public List<GoodsDetailVO> selectListMainHome(GoodsDetailVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		List<GoodsDetailVO> list = new ArrayList<GoodsDetailVO>();
		GoodsDetailVO vo = null;
		String sql = MainSql.SELECT_LIST_MAIN_HOME;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
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
				vo.getGoods().setCatgryCd(rs.getString(13));
				vo.getGoods().setCatgryCd2(rs.getString(14));
				vo.getGoods().setUseYn(rs.getString(15));
				vo.getGoods().setRgstId(rs.getString(16));
				vo.getGoods().setRgstDate(rs.getDate(17));
				vo.getGoods().setUpdtId(rs.getString(18));
				vo.getGoods().setUpdtDate(rs.getDate(19));
				vo.getSale().setSaleBoardSeq(rs.getLong(20));
				vo.getSale().setSaleStatCd(rs.getString(21));
				vo.getSale().setBulTitNm(rs.getString(22));
				vo.getSale().setBulStrtDt(rs.getDate(23));
				vo.getSale().setBulEndDt(rs.getDate(24));
				vo.getSale().setBulYn(rs.getString(25));
				vo.getSale().setNtcSctCd(rs.getString(26));
				vo.getSale().setBulCont(rs.getString(27));
				vo.getSale().setQryCnt(rs.getInt(28));
				vo.getSale().setLkeCnt(rs.getLong(29));
				vo.getSale().setGoodsPrc(rs.getInt(30));
				vo.getSale().setGoodsSalePrc(rs.getInt(31));
				vo.getSale().setPrclWay(rs.getString(32));
				vo.getSale().setSaleCnt(rs.getInt(33));
				vo.getSale().setRgstId(rs.getString(34));
				vo.getSale().setRgstDate(rs.getDate(35));
				vo.getSale().setUpdtId(rs.getString(36));
				vo.getSale().setUpdtDate(rs.getDate(37));
				vo.getSale().setUseYn(rs.getString(38));
				vo.getSale().setDescription(rs.getString(39));
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
	public List<GoodsDetailVO> selectListMainCate(GoodsDetailVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		List<GoodsDetailVO> list = new ArrayList<GoodsDetailVO>();
		GoodsDetailVO vo = null;
		String sql = MainSql.SELECT_LIST_MAIN_CATE;

		if(null != pvo.getSearchCatgryCd() && !"".equals(pvo.getSearchCatgryCd())){
			sql += "   AND GOODS.CATGRY_CD = '" + pvo.getSearchCatgryCd() + "'";
		}
		if(null != pvo.getSearchCatgryCd2() && !"".equals(pvo.getSearchCatgryCd2())){
			sql += "   AND GOODS.CATGRY_CD2 = '" + pvo.getSearchCatgryCd2() + "'";
		}
		if(null != pvo.getSearchGoodsCd() && !"".equals(pvo.getSearchGoodsCd())){
			sql += "   AND GOODS.GOODS_CD = '" + pvo.getSearchGoodsCd() + "'";
		}
		
		sql += " ORDER BY SALE.SALE_BOARD_SEQ ASC";

		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
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
				vo.getGoods().setCatgryCd(rs.getString(13));
				vo.getGoods().setCatgryCd2(rs.getString(14));
				vo.getGoods().setUseYn(rs.getString(15));
				vo.getGoods().setRgstId(rs.getString(16));
				vo.getGoods().setRgstDate(rs.getDate(17));
				vo.getGoods().setUpdtId(rs.getString(18));
				vo.getGoods().setUpdtDate(rs.getDate(19));
				vo.getSale().setSaleBoardSeq(rs.getLong(20));
				vo.getSale().setSaleStatCd(rs.getString(21));
				vo.getSale().setBulTitNm(rs.getString(22));
				vo.getSale().setBulStrtDt(rs.getDate(23));
				vo.getSale().setBulEndDt(rs.getDate(24));
				vo.getSale().setBulYn(rs.getString(25));
				vo.getSale().setNtcSctCd(rs.getString(26));
				vo.getSale().setBulCont(rs.getString(27));
				vo.getSale().setQryCnt(rs.getInt(28));
				vo.getSale().setLkeCnt(rs.getLong(29));
				vo.getSale().setGoodsPrc(rs.getInt(30));
				vo.getSale().setGoodsSalePrc(rs.getInt(31));
				vo.getSale().setPrclWay(rs.getString(32));
				vo.getSale().setSaleCnt(rs.getInt(33));
				vo.getSale().setRgstId(rs.getString(34));
				vo.getSale().setRgstDate(rs.getDate(35));
				vo.getSale().setUpdtId(rs.getString(36));
				vo.getSale().setUpdtDate(rs.getDate(37));
				vo.getSale().setUseYn(rs.getString(38));
				vo.getSale().setDescription(rs.getString(39));
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
	

}
