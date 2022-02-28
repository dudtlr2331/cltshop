package com.clt.cmm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;

public class DispatcherServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doProcess(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doProcess(req, res);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//로직은 여기다 작성...
		String command = req.getParameter("command");
		Controller controller = 
				HandlerMapping.getInstance().createController(command);
		
		String path = "error.jsp";
		ModelAndView mv=  null;
		boolean isRedirect = false;
		try{
			mv=controller.execute(req, res);
			path = mv.getPath();
			isRedirect = mv.isRedirect();
		}catch(Exception e){
			e.printStackTrace();
		}
		if(isRedirect){
			res.sendRedirect(path);
		}else{
			req.getRequestDispatcher(path).forward(req, res);
		}
	}
}
