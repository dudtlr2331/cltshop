package com.clt.adm.cpn;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.GoodsVO;

public class AdmCpnController implements Controller{
	private String command = "";
	
	public AdmCpnController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		AdmCpnVO pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_COUPON)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/coupon/coupon.jsp");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_GOODS_LIST);
		
		return modelAndView;
	}

	private AdmCpnVO parameterSetting(HttpServletRequest req) {
		AdmCpnVO pvo = new AdmCpnVO();
		return pvo;
	}
}
