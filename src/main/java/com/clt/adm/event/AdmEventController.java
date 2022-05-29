package com.clt.adm.event;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.event.EventVO;
import com.clt.shp.event.dao.impl.EventDaoOracle;
import com.clt.shp.event.service.EventService;

public class AdmEventController implements Controller{
	private String command = "";
	private EventService eventService;
	
	public AdmEventController(String command) {
		eventService = new EventService(new EventDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = req.getSession();
		
		//파라미터 셋팅
		EventVO pvo = eventService.parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_EVENT_LIST)) {
			List<EventVO> list = eventService.selectEventList(pvo);
			req.setAttribute("list", list);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/event/adm_event_list.jsp");
			modelAndView.setRedirect(false);
		}
		else if (command.equals(HandlerMapping.ADM_EVENT_REGISTER)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/event/adm_event_register.jsp");
			modelAndView.setRedirect(false);	
		}
		else if(command.equals(HandlerMapping.ADM_EVENT_REGISTER_ACT)) {
			int result = eventService.insertEvent(pvo);
			
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_event_list");
			modelAndView.setRedirect(true);
		}
		else if (command.equals(HandlerMapping.ADM_EVENT_EDIT)) {
			EventVO rvo = eventService.selectEventOne(pvo);
			
			req.setAttribute("pvo", rvo);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/event/adm_event_edit.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_EVENT_EDIT_ACT)) {
			int result = eventService.updateEvent(pvo);
			
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_event_list");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_EVENT_REMOVE_ACT)) {
			int result = eventService.deleteEvent(pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_event_list");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_EVENT_LIST);
				
		return modelAndView;
	}
}
