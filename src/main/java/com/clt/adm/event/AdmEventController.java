package com.clt.adm.event;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.GoodsVO;

public class AdmEventController implements Controller{
	private String command = "";
	
	public AdmEventController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		AdmEventVO pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_EVENT_BANNER)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/event/event_banner.jsp");
			modelAndView.setRedirect(false);
		}
				
		return modelAndView;
	}

	private AdmEventVO parameterSetting(HttpServletRequest req) {
		AdmEventVO pvo = new AdmEventVO();
		return pvo;
	}
}
