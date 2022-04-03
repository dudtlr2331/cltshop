package com.clt.adm.order;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.GoodsVO;

public class AdmOrderController implements Controller{
	private String command = "";
	
	public AdmOrderController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		AdmOrderVO pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_ORDER_LIST)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/order/order_list.jsp");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_ORDER_LIST);
				
		return modelAndView;
	}

	private AdmOrderVO parameterSetting(HttpServletRequest req) {
		AdmOrderVO pvo = new AdmOrderVO();
		return pvo;
	}
}
