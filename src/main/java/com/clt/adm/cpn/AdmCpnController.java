package com.clt.adm.cpn;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;

public class AdmCpnController implements Controller{
	private ModelAndView modelAndView;
	private String command = "";
	
	public AdmCpnController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_COUPON)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/coupon/coupon.jsp");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_GOODS_LIST);
		//화면 반환
		return modelAndView;
	}
}
