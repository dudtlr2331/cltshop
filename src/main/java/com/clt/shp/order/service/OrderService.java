package com.clt.shp.order.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.clt.cmm.util.OrdUtil;
import com.clt.shp.main.GoodsDetailVO;
import com.clt.shp.order.OrderVO;
import com.clt.shp.order.dao.OrderDao;

public class OrderService {

	public OrderDao dao;
	
	public OrderService(OrderDao dao) {
		this.dao = dao;
	}

	//파라미터 셋팅
	public OrderVO parameterSetting(HttpServletRequest req) {
		
		//주문 기본
		String ordNo = req.getParameter("ordNo");
		String usrId = req.getParameter("usrId");
		long entrNo = req.getParameter("entrNo") == null? 0L : Long.parseLong(req.getParameter("entrNo"));
		String ordStat = req.getParameter("ordStat");
		String ordrId = req.getParameter("ordrId");
		String ordrNm = req.getParameter("ordrNm");
		String ordrPhon = req.getParameter("ordrPhon");
		String ordrEmail = req.getParameter("ordrEmail");
		String acqrPhon = req.getParameter("acqrPhon");
		String acqrNm = req.getParameter("acqrNm");
		String acqrAddr = req.getParameter("acqrAddr");
		String acqrAddrDtl = req.getParameter("acqrAddrDtl");
		String acqrEmail = req.getParameter("acqrEmail");
		String prclWay = req.getParameter("prclWay");
		String packWay = req.getParameter("packWay");
		String payWay = req.getParameter("payWay");
		long payMny = req.getParameter("payMny") == null? 0L : Long.parseLong(req.getParameter("payMny"));
		String reqMemo = req.getParameter("reqMemo");
		String ordDate = req.getParameter("ordDate");
		String updtDate = req.getParameter("updtDate");
		String updtId = req.getParameter("updtId");
		String rgstDate = req.getParameter("rgstDate");
		String rgstId = req.getParameter("rgstId");
		long billNum = req.getParameter("billNum") == null? 0L : Long.parseLong(req.getParameter("billNum"));
		
		//주문 상세
		long ordDtlNo = req.getParameter("ordDtlNo") == null? 0L : Long.parseLong(req.getParameter("ordDtlNo"));
		String goodsNm = req.getParameter("goodsNm");
		long goodsCd = req.getParameter("goodsCd") == null? 0L : Long.parseLong(req.getParameter("goodsCd"));
		int goodsQty = req.getParameter("goodsQty") == null? 0 : Integer.parseInt(req.getParameter("goodsQty"));

		//장바구니
		Long ordBasketSeq = req.getParameter("ordBasketSeq") == null? 0L : Long.parseLong(req.getParameter("ordBasketSeq"));
		String useYn = req.getParameter("useYn");
		Long saleBoardSeq = req.getParameter("saleBoardSeq") == null? 0L : Long.parseLong(req.getParameter("saleBoardSeq"));
		String searchSaleBoardSeq = req.getParameter("searchSaleBoardSeq");
		String checkedList = req.getParameter("checkedList");

		//상세페이지 상품 옵션
		String colorOption = req.getParameter("colorOption");
		String sizeOption = req.getParameter("sizeOption");
		
		String[] goodsNmArry = req.getParameterValues("goodsNm");
		String[] strGoodsCdArry = req.getParameterValues("goodsCd");
		String[] strGoodsQtyArry = req.getParameterValues("goodsQty");
		String[] saleBoardSeqs = req.getParameterValues("saleBoardSeqs");
		
		int goodsCdArryCnt = 1;
		int goodsQtyArryCnt = 1;
		
		if(strGoodsCdArry != null) {
			goodsCdArryCnt = strGoodsCdArry.length;
			goodsQtyArryCnt = strGoodsQtyArry.length;
		}
		
		Long[] goodsCdArry = new Long[goodsCdArryCnt];
		int[] goodsQtyArry = new int[goodsQtyArryCnt];
		
		if(strGoodsCdArry != null) {
			for(int i = 0; i < strGoodsCdArry.length; i++){
				goodsCdArry[i] = Long.parseLong(strGoodsCdArry[i]);
				goodsQtyArry[i] = Integer.parseInt(strGoodsQtyArry[i]);
			}
		}
		
		OrderVO pvo = new OrderVO();
		
		pvo.setOrdNo(ordNo);
		pvo.setUsrId(usrId);
		pvo.setEntrNo(entrNo);
		pvo.setOrdStat(ordStat);
		pvo.setOrdrId(ordrId);
		pvo.setOrdrNm(ordrNm);
		pvo.setOrdrPhon(ordrPhon);
		pvo.setOrdrEmail(ordrEmail);
		pvo.setAcqrPhon(acqrPhon);
		pvo.setAcqrNm(acqrNm);
		pvo.setAcqrAddr(acqrAddr);
		pvo.setAcqrAddrDtl(acqrAddrDtl);
		pvo.setAcqrEmail(acqrEmail);
		pvo.setPrclWay(prclWay);
		pvo.setPackWay(packWay);
		pvo.setPayWay(payWay);
		pvo.setPayMny(payMny);
		pvo.setReqMemo(reqMemo);
		pvo.setOrdDate(ordDate);
		pvo.setUpdtDate(updtDate);
		pvo.setUpdtId(updtId);
		pvo.setRgstDate(rgstDate);
		pvo.setRgstId(rgstId);
		pvo.setBillNum(billNum);
		pvo.setOrdDtlNo(ordDtlNo);
		pvo.setGoodsNm(goodsNm);
		pvo.setGoodsCd(goodsCd);
		pvo.setGoodsQty(goodsQty);
		pvo.setOrdBasketSeq(ordBasketSeq);
		pvo.setUseYn(useYn);
		pvo.setSaleBoardSeq(saleBoardSeq);
		pvo.setSearchSaleBoardSeq(searchSaleBoardSeq);
		pvo.setCheckedList(checkedList);
		pvo.setColorOption(colorOption);
		pvo.setSizeOption(sizeOption);
		pvo.setGoodsNmArry(goodsNmArry);
		pvo.setGoodsCdArry(goodsCdArry);
		pvo.setGoodsQtyArry(goodsQtyArry);
		pvo.setSaleBoardSeqs(saleBoardSeqs);
		
		return pvo;
	}

	public OrderVO selectOrdOne(OrderVO pvo) {
		return dao.selectOrdOne(pvo);
	}

	//=주문============================================================================================================================/
	public List<OrderVO> selectOrdList(OrderVO pvo) {
		return dao.selectOrdList(pvo);
	}
	
	public int insertOrd(OrderVO pvo) {
		pvo.setOrdNo(OrdUtil.getPinNo());
		return dao.insertOrd(pvo);
	}
	
	public int updateOrd(OrderVO pvo) {
		return dao.updateOrd(pvo);
	}
	
	public int deleteOrd(OrderVO pvo) {
		return dao.deleteOrd(pvo);
	}

	//=주문상세============================================================================================================================/
	public OrderVO selectOrdDtlOne(OrderVO pvo) {
		return dao.selectOrdDtlOne(pvo);
	}
	
	public List<OrderVO> selectOrdDtlList(OrderVO pvo) {
		return dao.selectOrdDtlList(pvo);
	}
	
	public int insertOrdDtl(OrderVO pvo) {
		return dao.insertOrdDtl(pvo);
	}
	
	public int updateOrdDtl(OrderVO pvo) {
		return dao.updateOrdDtl(pvo);
	}
	
	public int deleteOrdDtl(OrderVO pvo) {
		return dao.deleteOrdDtl(pvo);
	}
	//-----------------------------------------------------------------------------------------------------------------------
	public List<OrderVO> searchIdOrdList(OrderVO pvo) {
		return dao.searchIdOrdList(pvo);
	}
	
	public OrderVO searchOrdNoList(OrderVO pvo) {
		return dao.searchOrdNoList(pvo);
	}
	
	public List<OrderVO> searchOrdDtlGoods(OrderVO pvo) {
		return dao.searchOrdDtlGoods(pvo);
	}
	
	public List<OrderVO> selectOrdBaseList(OrderVO pvo) { //매출관리
		return dao.selectOrdBaseList(pvo);
	}

	//=장바구니============================================================================================================================/
	public int insertBasket(OrderVO pvo){
		return dao.insertBasket(pvo);
	}

	public int deleteBasket(OrderVO pvo){
		return dao.deleteBasket(pvo);
	}
	
	public int updateBasket(OrderVO pvo){
		return dao.updateBasket(pvo);
	}

	public List<OrderVO> selectBasketList(OrderVO pvo){
		return dao.selectBasketList(pvo);
	}
	
	public List<GoodsDetailVO> ordBasketSelect(OrderVO pvo){
		return dao.ordBasketSelect(pvo);
	}
	
	public int insertCartOrdDtl(OrderVO pvo) {
		int result = 1;
		String[] GoodsNmArry = pvo.getGoodsNmArry();
		Long[] GoodsCdArry = pvo.getGoodsCdArry();
		int[] GoodsQtyArry = pvo.getGoodsQtyArry();
		
		try {
			for (int i = 0; i < GoodsNmArry.length; i++) {
				pvo.setGoodsNm(GoodsNmArry[i]);
				pvo.setGoodsCd((GoodsCdArry[i]));
				pvo.setGoodsQty(GoodsQtyArry[i]);
				dao.insertOrdDtl(pvo);
			}
		} catch (Exception e) {
			result = 0;
		}
		
		return result;
	}
	
	public List<OrderVO> selectCartOrdDtlList(OrderVO pvo) {
		return dao.selectCartOrdDtlList(pvo);
	}
}