package com.clt.cmm.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CmmHttpFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("filter init call..");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		System.out.println("filter doFilter call..");

		// 사전처리..
		System.out.println("filter before ....");
		
		String debug = req.getServletContext().getInitParameter("debugMode");
		
		// 한글깨짐 방지 인코딩
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=UTF-8");

		long startTime = System.currentTimeMillis();
		if("debug".equals(debug)) {
			System.out.println("::::::::::::::: 서블릿 로직 실행 시간 시작:::::::::::::::::::");
		}
		chain.doFilter(req, res);
		long endTime = System.currentTimeMillis();
		if("debug".equals(debug)) {
			System.out.println((endTime - startTime) / 1000 + "(ms)초 걸렸습니다.");
			System.out.println("::::::::::::::: 서블릿 로직 실행 시간 종료:::::::::::::::::::");
		}

		// 사후처리..
		System.out.println("filter after .....");

	}

	@Override
	public void destroy() {
		System.out.println("filter destroy call..");
	}
	
}
