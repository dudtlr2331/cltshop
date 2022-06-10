package com.clt.adm.stats;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.order.OrderVO;
import com.clt.shp.order.dao.impl.OrderDaoOracle;
import com.clt.shp.order.service.OrderService;

public class AdmStatsController implements Controller{
	private String command = "";
	private OrderService orderService;
	
	public AdmStatsController(String command) {
		this.orderService = new OrderService(new OrderDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
//		AdmStatsVO pvo = parameterSetting(req);
		OrderVO pvo = orderService.parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_STATS_SALES)) {
			List<OrderVO> orderBaseList = orderService.selectOrdBaseList(pvo);
//			List<OrderVO> orderDetailList = orderService.selectOrdDtlList(pvo);
			long payMnyResult = 0L;
			int detailOrderCount = orderBaseList.size();
			
			for (int i = 0; i < detailOrderCount; i++) {
				payMnyResult += orderBaseList.get(i).getPayMny();
			}
			
			req.setAttribute("detailOrderCount", detailOrderCount);
			req.setAttribute("payMnyResult", payMnyResult);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/stats/stats_sales.jsp");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_STATS_SALES);
				
		return modelAndView;
	}
}
