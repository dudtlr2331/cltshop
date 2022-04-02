package com.clt.shp.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.ModelAndView;

public class MainController implements Controller{

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		return new ModelAndView("/WEB-INF/jsp/main/main.jsp");
	}

}
