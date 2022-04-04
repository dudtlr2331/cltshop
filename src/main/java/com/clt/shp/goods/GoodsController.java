package com.clt.shp.goods;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;

public class GoodsController implements Controller {
	private String command = "";
	private GoodsService goodsService;

	public GoodsController(String command) {
		goodsService = new GoodsService(new GoodsDaoOracle());
//		goodsService = new GoodsService(new GoodsDaoMysql());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		GoodsVO pvo = parameterSetting(req);
	      
		if(command.equals(HandlerMapping.GOODS_LIST)) {
			List<GoodsVO> goodsList = goodsService.selectGoodsList(pvo);
			req.setAttribute("goodsList", goodsList);
			modelAndView.setPath("/WEB-INF/jsp/shp/goods/goods_list.jsp");
			modelAndView.setRedirect(false);
		} else if(command.equals(HandlerMapping.GOODS_CATEGORY)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/goods/goods_category.jsp");
			modelAndView.setRedirect(false);
		} else if(command.equals(HandlerMapping.GOODS_CART)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/goods/goods_cart.jsp");
			modelAndView.setRedirect(false);
		}

		return modelAndView;
	}

	private GoodsVO parameterSetting(HttpServletRequest req) {
		GoodsVO pvo = new GoodsVO();
		return pvo;
	}

}
