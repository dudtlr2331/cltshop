package com.clt.shp.event;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.event.dao.impl.EventDaoOracle;
import com.clt.shp.event.service.EventService;

public class EventController implements Controller {
	private String command = "";
	private EventService eventService;

	public EventController(String command) {
		eventService = new EventService(new EventDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		EventVO pvo = parameterSetting(req);
	      
		/*if(command.equals(HandlerMapping.CPN_LIST)) {
			List<CpnVO> goodsList = cpnService.selectCpnList(pvo);
			req.setAttribute("cpnList", cpnList);
			modelAndView.setPath("/WEB-INF/jsp/shp/cpn/cpn_list.jsp");
			modelAndView.setRedirect(false);
		}*/

		return modelAndView;
	}

	private EventVO parameterSetting(HttpServletRequest req) {
		EventVO pvo = new EventVO();
		return pvo;
	}

}
