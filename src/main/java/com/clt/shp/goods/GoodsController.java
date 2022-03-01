package com.clt.shp.goods;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.ModelAndView;

public class GoodsController implements Controller{

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		return new ModelAndView("/WEB-INF/jsp/shp/goods/goods_list.jsp");
	}

}
