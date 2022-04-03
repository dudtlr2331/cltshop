package com.clt.adm.dress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.GoodsVO;

public class AdmDressController implements Controller{
	private String command = "";
	
	public AdmDressController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		AdmDressVO pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_DRESSROOM_MANAGER)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/dress/dressroom_manager.jsp");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_DRESSROOM_MANAGER);
				
		return modelAndView;
	}

	private AdmDressVO parameterSetting(HttpServletRequest req) {
		AdmDressVO pvo = new AdmDressVO();
		return pvo;
	}
}
