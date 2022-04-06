package com.clt.shp.dress;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.adm.user.AdmUserVO;
import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.user.UserVo;
import com.clt.shp.user.dao.impl.UserDaoOracle;
import com.clt.shp.user.service.UserService;

public class DressController implements Controller {
private String command = "";
	
	public DressController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		DressVo pvo = parameterSetting(req);
		
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

	private DressVo parameterSetting(HttpServletRequest req) {
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
		
		DressVo pvo = new DressVo();

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
}
