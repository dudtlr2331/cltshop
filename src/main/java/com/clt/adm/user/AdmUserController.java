package com.clt.adm.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;

public class AdmUserController implements Controller{
	private String command = "";
	
	public AdmUserController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		AdmUserVO pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_USER_LIST)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/user/user_list.jsp");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_USER_LIST);
				
		return modelAndView;
	}

	private AdmUserVO parameterSetting(HttpServletRequest req) {
		AdmUserVO pvo = new AdmUserVO();
		return pvo;
	}
}
