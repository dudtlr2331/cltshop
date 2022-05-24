package com.clt.shp.cpn;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.cpn.dao.impl.CpnDaoOracle;
import com.clt.shp.cpn.service.CpnService;

public class CpnController implements Controller {
	private String command = "";
	private CpnService cpnService;

	public CpnController(String command) {
		cpnService = new CpnService(new CpnDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		CpnVO pvo = parameterSetting(req);
	      
		/*if(command.equals(HandlerMapping.CPN_LIST)) {
			List<CpnVO> goodsList = cpnService.selectCpnList(pvo);
			req.setAttribute("cpnList", cpnList);
			modelAndView.setPath("/WEB-INF/jsp/shp/cpn/cpn_list.jsp");
			modelAndView.setRedirect(false);
		}*/

		return modelAndView;
	}

	private CpnVO parameterSetting(HttpServletRequest req) {
		CpnVO pvo = new CpnVO();
		return pvo;
	}

}
