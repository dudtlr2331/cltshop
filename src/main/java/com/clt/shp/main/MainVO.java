package com.clt.shp.main;

public class MainVO {
	private long mainBoardSn;
	private String imgPath;
	
	public MainVO() {}
	public MainVO (long mainBoardSn, String imgPath) {
		this.mainBoardSn = mainBoardSn;
		this.imgPath = imgPath;
	}
	
	public long getMainBoardSn() {
		return mainBoardSn;
	}
	public void setMainBoardSn(long mainBoardSn) {
		this.mainBoardSn = mainBoardSn;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	@Override
	public String toString() {
		return "MainVO [mainBoardSn=" + mainBoardSn + ", imgPath=" + imgPath + "]";
	}
}
