package com.clt.adm.goods;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;

public class AdmGoodsController implements Controller{
	private String command = "";
	private GoodsService goodsService;
	
	public AdmGoodsController(String command) {
		goodsService = new GoodsService(new GoodsDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String leftMenuNav = HandlerMapping.ADM_GOODS_LIST;
		
		//파라미터 셋팅
		GoodsVO pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_GOODS_LIST)) {
			List<GoodsVO> list = goodsService.selectGoodsList(pvo);
			req.setAttribute("list", list);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/goods/goods_list.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_GOODS_REGISTER)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/goods/goods_register.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_GOODS_REGISTER_ACT)) {
			int result = goodsService.insertGoods(pvo);
			
			req.setAttribute("result", result);
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/goods/goods_edit.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_GOODS_QNA)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/goods/goods_qna.jsp");
			modelAndView.setRedirect(false);
			leftMenuNav = HandlerMapping.ADM_GOODS_QNA;
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", leftMenuNav);
		
		return modelAndView;
	}

	private GoodsVO parameterSetting(HttpServletRequest req) {
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
		
		GoodsVO pvo = new GoodsVO();
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
		
		//첨부파일 있으면 셋팅
		String imgPath = (String) req.getAttribute("imgPath");
		String imgNm = (String) req.getAttribute("imgNm");
		if(null != imgPath && !"".equals(imgPath)) {
			pvo.setImgPath(imgPath);
		}
		if(null != imgNm && !"".equals(imgNm)) {
			pvo.setImgNm(imgNm);
		}
		
		return pvo;
	}
}
