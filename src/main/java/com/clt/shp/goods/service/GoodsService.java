package com.clt.shp.goods.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.GoodsDao;
import com.clt.shp.main.GoodsDetailVO;

public class GoodsService {

	private GoodsDao dao;
	
	public GoodsService(GoodsDao dao) {
		this.dao = dao;
	}

	//파라미터 셋팅
	public GoodsVO parameterSetting(HttpServletRequest req) {
		long goodsInfoSeq = req.getParameter("goodsInfoSeq") == null? 0L : Long.parseLong(req.getParameter("goodsInfoSeq"));
		long goodsCd = req.getParameter("goodsCd") == null? 0L : Long.parseLong(req.getParameter("goodsCd"));
		long entrNo = req.getParameter("entrNo") == null? 0L : Long.parseLong(req.getParameter("entrNo"));
		String saleStatCd = req.getParameter("saleStatCd");
		String goodsNm = req.getParameter("goodsNm");
		int goodsPrc = req.getParameter("goodsPrc") == null? 0 : Integer.parseInt(req.getParameter("goodsPrc"));
		String catgryCd = req.getParameter("catgryCd");
		String catgryCd2 = req.getParameter("catgryCd2");
		int inyQty = req.getParameter("inyQty") == null? 0 : Integer.parseInt(req.getParameter("inyQty"));
		int dlvPrc = req.getParameter("dlvPrc") == null? 0 : Integer.parseInt(req.getParameter("dlvPrc"));
		String goodsSize = req.getParameter("goodsSize");
		String goodsClr = req.getParameter("goodsClr");
		String useYn = req.getParameter("useYn");
		String goodsIntr = req.getParameter("goodsIntr");
		
		String searchEntrNo = req.getParameter("searchEntrNo");
		String searchSaleBoardSeq = req.getParameter("searchSaleBoardSeq");
		
		GoodsVO pvo = new GoodsVO();
		pvo.setGoodsInfoSeq(goodsInfoSeq);
		pvo.setGoodsCd(goodsCd);
		pvo.setEntrNo(entrNo);
		pvo.setSaleStatCd(saleStatCd);
		pvo.setGoodsNm(goodsNm);
		pvo.setGoodsPrc(goodsPrc);
		pvo.setCatgryCd(catgryCd);
		pvo.setCatgryCd2(catgryCd2);
		pvo.setInyQty(inyQty);
		pvo.setDlvPrc(dlvPrc);
		pvo.setGoodsSize(goodsSize);
		pvo.setGoodsClr(goodsClr);
		pvo.setUseYn(useYn);
		pvo.setGoodsIntr(goodsIntr);
		
		pvo.setSearchEntrNo(searchEntrNo);
		pvo.setSearchSaleBoardSeq(searchSaleBoardSeq);
		
		//첨부파일 있으면 셋팅
		String imgPath = (String) req.getAttribute("imgPath");
		if(null == imgPath || "".equals(imgPath)) {
			imgPath = req.getParameter("imgPath");
		}
		String imgNm = (String) req.getAttribute("imgNm");
		if(null == imgNm || "".equals(imgNm)) {
			imgNm = req.getParameter("imgNm");
		}
		
		if(null != imgPath && !"".equals(imgPath)) {
			pvo.setImgPath(imgPath);
		}
		if(null != imgNm && !"".equals(imgNm)) {
			pvo.setImgNm(imgNm);
		}
		
		return pvo;
	}
	
	public GoodsVO selectGoodsOne(GoodsVO pvo) {
		return dao.selectGoodsOne(pvo);
	}

	public List<GoodsVO> selectGoodsList(GoodsVO pvo) {
		return dao.selectGoodsList(pvo);
	}
	
	public int insertGoods(GoodsVO pvo) {
		return dao.insertGoods(pvo);
	}
	
	public int updateGoods(GoodsVO pvo) {
		return dao.updateGoods(pvo);
	}
	
	public int deleteGoods(GoodsVO pvo) {
		return dao.deleteGoods(pvo);
	}
	
	public GoodsDetailVO selectGoodsDetail(String seq) {
		return dao.selectGoodsDetail(seq);
	}
	public List<GoodsDetailVO> selectMypgGoodsList(GoodsVO pvo) {
		return dao.selectMypgGoodsList(pvo);
	}
	public GoodsDetailVO selectMypgGoodsOne(GoodsVO pvo) {
		return dao.selectMypgGoodsOne(pvo);
	}
}
