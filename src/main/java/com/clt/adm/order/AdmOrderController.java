package com.clt.adm.order;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.GoodsVO;
import com.clt.shp.order.OrderVO;
import com.clt.shp.order.dao.impl.OrderDaoOracle;
import com.clt.shp.order.service.OrderService;

public class AdmOrderController implements Controller{
	private String command = "";
	private OrderService orderService;
	
	public AdmOrderController(String command) {
		this.orderService = new OrderService(new OrderDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		OrderVO pvo = orderService.parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_ORDER_LIST)) { //주문 리스트
			List<OrderVO> orderList = orderService.selectOrdList(pvo);
			req.setAttribute("orderList", orderList);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/order/order_list.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_ORDER_DETAIL)) { //주문 상세 페이지
			OrderVO ordVo = orderService.searchOrdNoList(pvo);
			req.setAttribute("ordVo", ordVo);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/order/order_detail.jsp");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_ORDER_LIST);
				
		return modelAndView;
	}
}
