package com.clt.shp.dress;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.dress.dao.impl.DressDaoOracle;
import com.clt.shp.dress.service.DressService;

public class DressController implements Controller {
private String command = "";
	
	public DressController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		DressVO pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.DRESS_MAIN)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/dress/dress_main.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.DRESS_REGISTER)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/dress/dress_register.jsp");
			modelAndView.setRedirect(false);
		}
				
		return modelAndView;
	}

	private DressVO parameterSetting(HttpServletRequest req) {
		long dressroom_id_SEQ = req.getParameter("dressroom_id_SEQ") == null? 0L : Long.parseLong(req.getParameter("dressroom_id_SEQ"));
		int tag_id = req.getParameter("tag_id") == null? 0 : Integer.parseInt(req.getParameter("tag_id"));
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

		DressVO pvo = new DressVO();
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

		return pvo;
	}
}
