package com.clt.shp.dress;

import java.sql.Date;

public class DressVO {
	private long dressroomInfoSEQ;
	private long dressroomId;
	private int tagId;
	private long userId;
    private String dressroomName;
	private String dressroomDescription;
	private Date dressroomDate;
	private int dressroomLike;
	
	public DressVO() {
		
	}
	
	public DressVO(long dressroomInfoSEQ, long dressroomId, int tagId, long userId, String dressroomName, String dressroomDescription, Date dressroomDate, int dressroomLike) {
		this.dressroomInfoSEQ = dressroomInfoSEQ;
		this.dressroomId = dressroomId;
		this.tagId = tagId;
		this.userId = userId;
		this.dressroomName = dressroomName;
		this.dressroomDescription = dressroomDescription;
		this.dressroomDate = dressroomDate;
		this.dressroomLike = dressroomLike;
	}
	
	public long getDressroomInfoSEQ() {
		return dressroomInfoSEQ;
	}
	public void setDressroomInfoSEQ(long dressroomInfoSEQ) {
		this.dressroomInfoSEQ = dressroomInfoSEQ;
	}
	public long getDressroomId() {
		return dressroomId;
	}
	public void setDressroomId(long dressroomId) {
		this.dressroomId = dressroomId;
	}
	public int getTagId() {
		return tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getDressroomName() {
		return dressroomName;
	}
	public void setDressroomName(String dressroomName) {
		this.dressroomName = dressroomName;
	}
	public String getDressroomDescription() {
		return dressroomDescription;
	}
	public void setDressroomDescription(String dressroomDescription) {
		this.dressroomDescription = dressroomDescription;
	}
	public Date getDressroomDate() {
		return dressroomDate;
	}
	public void setDressroomDate(Date dressroomDate) {
		this.dressroomDate = dressroomDate;
	}
	public int getDressroomLike() {
		return dressroomLike;
	}
	public void setDressroomLike(int dressroomLike) {
		this.dressroomLike = dressroomLike;
	}
	@Override
	public String toString() {
		return "DressVO [dressroomInfoSEQ=" + dressroomInfoSEQ + ", dressroomId=" + dressroomId + ", tagId=" + tagId + ", userId=" + userId + ", dressroomName=" + dressroomName + ", dressroomDescription=" + dressroomDescription + ", dressroomDate=" + dressroomDate + ", dressroomLike=" + dressroomLike + "]";
	}
}
