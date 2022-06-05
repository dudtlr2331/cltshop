package com.clt.adm.point;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;

public class AdmPointController implements Controller{
	private String command = "";
	
	public AdmPointController(String command) {
		this.command = command;
	}
	
	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String leftMenuNav = HandlerMapping.ADM_POINT_LIST;
		
		//파라미터 셋팅
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_POINT_LIST)){
			modelAndView.setPath("/WEB-INF/jsp/adm/point/point_list.jsp");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", leftMenuNav);
		return modelAndView;
	}

}
