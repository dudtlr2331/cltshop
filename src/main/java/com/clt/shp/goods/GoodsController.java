package com.clt.shp.goods;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;

public class GoodsController implements Controller{
	
	private GoodsService goodsService;
	
	public GoodsController() {
		goodsService = new GoodsService(new GoodsDaoOracle());
//		goodsService = new GoodsService(new GoodsDaoMysql());
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		GoodsVO param = new GoodsVO();
//		param.setGoodsInfoSeq(1);
//		GoodsVO goodsInfo = goodsService.selectGoodsOne(param);
//		req.setAttribute("goodsInfo", goodsInfo);
		
		List<GoodsVO> goodsList = goodsService.selectGoodsList(param);
		
		req.setAttribute("goodsList", goodsList);
		
		return new ModelAndView("/WEB-INF/jsp/shp/goods/goods_list.jsp");
	}

}
