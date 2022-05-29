package com.clt.shp.event;

public class EventVO {
	private long eventInfoSeq;/*이벤트 시퀀스*/
	private long eventNum;/*이벤트 코드*/
	private String eventName;/*이벤트 이름*/
	private String imgPath;/*이미지경로*/
	private String imgNm;/*이미지이름*/
	private String eventRegistDate;/*이벤트 등록 날짜*/
	private String eventEndDate;/*이벤트 만료 날짜*/
	
	public EventVO() {
	}
	
	public EventVO(long eventInfoSeq, long eventNum, String eventName, String imgPath, String imgNm, String eventRegistDate, String eventEndDate) {
		this.eventInfoSeq = eventInfoSeq;
		this.eventNum = eventNum;
		this.eventName = eventName;
		this.imgPath = imgPath;
		this.imgNm = imgNm;
		this.eventRegistDate = eventRegistDate;
		this.eventEndDate = eventEndDate;
	}
	
	public long getEventInfoSeq() {
		return eventInfoSeq;
	}
	public void setEventInfoSeq(long eventInfoSeq) {
		this.eventInfoSeq = eventInfoSeq;
	}
	public long getEventNum() {
		return eventNum;
	}
	public void setEventNum(long eventNum) {
		this.eventNum = eventNum;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getImgNm() {
		return imgNm;
	}
	public void setImgNm(String imgNm) {
		this.imgNm = imgNm;
	}
	public String getEventRegistDate() {
		return eventRegistDate;
	}
	public void setEventRegistDate(String eventRegistDate) {
		this.eventRegistDate = eventRegistDate;
	}
	public String getEventEndDate() {
		return eventEndDate;
	}
	public void setEventEndDate(String eventEndDate) {
		this.eventEndDate = eventEndDate;
	}
	
	@Override
	public String toString() {
		return "EventVO [eventInfoSeq=" + eventInfoSeq + ", eventNum=" + eventNum + ", eventName=" + eventName + ", imgPath=" + imgPath + ", imgNm=" + imgNm + ", eventRegistDate=" + eventRegistDate + ", eventEndDate=" + eventEndDate + "]";
	}
}