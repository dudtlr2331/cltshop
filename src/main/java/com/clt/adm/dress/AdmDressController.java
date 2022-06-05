package com.clt.adm.dress;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.dress.DressVO;
import com.clt.shp.dress.dao.impl.DressDaoOracle;
import com.clt.shp.dress.service.DressService;

public class AdmDressController implements Controller{
	private String command = "";
	private DressService dressService;
	
	public AdmDressController(String command) {
		dressService = new DressService(new DressDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = req.getSession();
		
		//파라미터 셋팅
		DressVO pvo = dressService.parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_DRESSROOM_MANAGER)) {
			List<DressVO> list = dressService.selectDressList(pvo);
			req.setAttribute("list", list);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/dress/dressroom_manager.jsp");
			modelAndView.setRedirect(false);
		}
		else if (command.equals(HandlerMapping.ADM_DRESSROOM_MANAGER_EDIT)) {
			DressVO rvo = dressService.selectDressOne(pvo);
			
			req.setAttribute("pvo", rvo);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/dress/dressroom_manager_edit.jsp");
			modelAndView.setRedirect(false);	
		}
		else if(command.equals(HandlerMapping.ADM_DRESSROOM_MANAGER_EDIT_ACT)) {
			int result = dressService.updateDress(pvo);
			
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_dressroom_manager");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_DRESSROOM_MANAGER_REMOVE_ACT)) {
			int result = dressService.deleteDress(pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_dressroom_manager");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_DRESSROOM_MANAGER);
				
		return modelAndView;
	}
}
