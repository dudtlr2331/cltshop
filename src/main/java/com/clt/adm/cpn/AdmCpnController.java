package com.clt.adm.cpn;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.cpn.CpnVO;
import com.clt.shp.cpn.dao.impl.CpnDaoOracle;
import com.clt.shp.cpn.service.CpnService;

public class AdmCpnController implements Controller{
	private String command = "";
	private CpnService cpnService;
	
	public AdmCpnController(String command) {
		cpnService = new CpnService(new CpnDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = req.getSession();
		
		//파라미터 셋팅
		CpnVO pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_CPN_LIST)) {
			List<CpnVO> list = cpnService.selectCpnList(pvo);
			req.setAttribute("list", list);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/coupon/adm_cpn_list.jsp");
			modelAndView.setRedirect(false);
		}
		else if (command.equals(HandlerMapping.ADM_CPN_REGISTER)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/coupon/adm_cpn_register.jsp");
			modelAndView.setRedirect(false);	
		}
		else if(command.equals(HandlerMapping.ADM_CPN_REGISTER_ACT)) {
			int result = cpnService.insertCpn(pvo);
			
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_cpn_list");
			modelAndView.setRedirect(false);
		}
		else if (command.equals(HandlerMapping.ADM_CPN_EDIT)) {
			CpnVO rvo = cpnService.selectCpnOne(pvo);
			
			req.setAttribute("pvo", rvo);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/coupon/adm_cpn_edit.jsp");
			modelAndView.setRedirect(false);	
		}
		else if(command.equals(HandlerMapping.ADM_CPN_EDIT_ACT)) {
			int result = cpnService.updateCpn(pvo);
			
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_cpn_list");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_CPN_REMOVE_ACT)) {
			int result = cpnService.deleteCpn(pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_cpn_list");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_CPN_LIST);
				
		return modelAndView;
	}
	
	private CpnVO parameterSetting(HttpServletRequest req) {
		CpnVO pvo = new CpnVO();
		return pvo;
	}
}
