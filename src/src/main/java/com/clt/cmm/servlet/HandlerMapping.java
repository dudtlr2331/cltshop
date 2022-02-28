package com.clt.cmm.servlet;

import com.clt.cmm.controller.Controller;
import com.clt.shp.main.MainController;

public class HandlerMapping {
	private static HandlerMapping handler = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		return handler;
	}

	public Controller createController(String command) {
		Controller controller = null;
		if (command.equals("main")) {
			controller = new MainController();
		}
		return controller;
	}
}
