package com.clt.cmm.servlet;

public class ModelAndView {
	private String path;
	private boolean isRedirect;

	public ModelAndView(String path, boolean isRedirect) {
		this.path = path;
		this.isRedirect = isRedirect;
	}

	public ModelAndView(String path) {
		this.path = path;
	}

	public ModelAndView() {
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isRedirect() {
		return isRedirect;
	}

	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
}
