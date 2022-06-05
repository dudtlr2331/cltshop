package com.clt.cmm.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.WriteListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class JSONFilter implements Filter{
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        res.setCharacterEncoding("UTF-8");
		
		HttpServletRequest httpReq = (HttpServletRequest) req;
		
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		final ByteArrayPrintWriter pw = new ByteArrayPrintWriter(baos);
		
		HttpServletResponse wrappedResp = new HttpServletResponseWrapper((HttpServletResponse)res) {
			@Override
			public PrintWriter getWriter() throws IOException {
				return pw;
			}
			@Override
			public ServletOutputStream getOutputStream() throws IOException {
				return new ServletOutputStream() {
					
					@Override
					public void write(int b) throws IOException {
						baos.write(b);
					}
					
					@Override
					public void setWriteListener(WriteListener arg0) {}
					
					@Override
					public boolean isReady() {
						return false;
					}
				};
			}
		};
		
		System.out.println("=Filter Start==============================================");
		String requestUrl = String.valueOf(httpReq.getRequestURL());
		String queryString = String.valueOf(httpReq.getQueryString());
		String remoteUser = String.valueOf(httpReq.getRemoteUser());
		System.out.println("request URL :::: " + requestUrl);
		System.out.println("query string:::: " + queryString);
		System.out.println("remote User :::: " + remoteUser);
		chain.doFilter(req, wrappedResp);
		
		byte[] bytes = baos.toByteArray();
		String responseStr = new String(bytes);
		if(queryString.contains("user_id_check") || queryString.contains("_ajax")) {
			responseStr = String.valueOf(req.getAttribute("json"));
			System.out.println(responseStr);
			res.getOutputStream().write(responseStr.getBytes());
		}else {
			res.getOutputStream().write(bytes);
		}
		
		System.out.println("=Filter End================================================");
	}
	
	@Override
	public void init(FilterConfig config) throws ServletException {
	}
	
	
	public static class ByteArrayPrintWriter extends PrintWriter {
		public ByteArrayPrintWriter(OutputStream out) {
			super(out);
		}
	}

}