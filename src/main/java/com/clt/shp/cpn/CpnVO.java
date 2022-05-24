package com.clt.shp.cpn;

public class CpnVO {
	private long couInfoSeq;/*쿠폰 시퀀스*/
	private long couNum;/*쿠폰 코드*/
	private String couName;/*쿠폰 이름*/
	private int couDiscount;/*쿠폰 할인율*/
	private String couRegistDate;/*쿠폰 등록 날짜*/
	private String couEndDate;/*쿠폰 만료 날짜*/
	private int couCount;/*쿠폰 개수*/
	
	public CpnVO() {
	}
	
	public CpnVO(long couInfoSeq, long couNum, String couName, int couDiscount, String couRegistDate, String couEndDate, int couCount) {
		this.couInfoSeq = couInfoSeq;
		this.couNum = couNum;
		this.couName = couName;
		this.couDiscount = couDiscount;
		this.couRegistDate = couRegistDate;
		this.couEndDate = couEndDate;
		this.couCount = couCount;
	}
	
	public long getCouInfoSeq() {
		return couInfoSeq;
	}
	public void setCouInfoSeq(long couInfoSeq) {
		this.couInfoSeq = couInfoSeq;
	}
	public long getCouNum() {
		return couNum;
	}
	public void setCouNum(long couNum) {
		this.couNum = couNum;
	}
	public String getCouName() {
		return couName;
	}
	public void setCouName(String couName) {
		this.couName = couName;
	}
	public int getCouDiscount() {
		return couDiscount;
	}
	public void setCouDiscount(int couDiscount) {
		this.couDiscount = couDiscount;
	}
	public String getCouRegistDate() {
		return couRegistDate;
	}
	public void setCouRegistDate(String couRegistDate) {
		this.couRegistDate = couRegistDate;
	}
	public String getCouEndDate() {
		return couEndDate;
	}
	public void setCouEndDate(String couEndDate) {
		this.couEndDate = couEndDate;
	}
	public int getCouCount() {
		return couCount;
	}
	public void setCouCount(int couCount) {
		this.couCount = couCount;
	}
	
	@Override
	public String toString() {
		return "CpnVO [couInfoSeq=" + couInfoSeq + ", couNum=" + couNum + ", couName=" + couName + ", couDiscount=" + couDiscount + ", couRegistDate=" + couRegistDate + ", couEndDate=" + couEndDate + ", couCount=" + couCount + "]";
	}
}