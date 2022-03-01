package com.clt.cmm.servlet;

import com.clt.cmm.controller.Controller;
import com.clt.shp.goods.GoodsController;

public class HandlerMapping {
	private static HandlerMapping handler = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		return handler;
	}

	public Controller createController(String command) {
		Controller controller = null;
		if (command.equals("goods_list")) {
			controller = new GoodsController();
		}
		return controller;
	}
}
