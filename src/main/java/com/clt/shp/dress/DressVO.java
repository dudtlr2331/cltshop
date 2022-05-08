package com.clt.shp.dress;

import java.sql.Date;

public class DressVO {
	private long dressroom_id_SEQ;
	private int tag_id;
	private long user_id;
    private String dressroom_name;
	private String dressroom_description;
	private Date dressroom_date;
	private int dressroom_like;
	
	public DressVO() {
		
	}
	
	public DressVO(long dressroom_id_SEQ, int tag_id, long user_id, String dressroom_name, String dressroom_description, Date dressroom_date, int dressroom_like) {
		this.dressroom_id_SEQ = dressroom_id_SEQ;
		this.tag_id = tag_id;
		this.user_id = user_id;
		this.dressroom_name = dressroom_name;
		this.dressroom_description = dressroom_description;
		this.dressroom_date = dressroom_date;
		this.dressroom_like = dressroom_like;
	}
	
	public long getDressroom_id_SEQ() {
		return dressroom_id_SEQ;
	}
	public void setDressroom_id_SEQ(long dressroom_id_SEQ) {
		this.dressroom_id_SEQ = dressroom_id_SEQ;
	}
	public int getTag_id() {
		return tag_id;
	}
	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getDressroom_name() {
		return dressroom_name;
	}
	public void setDressroom_name(String dressroom_name) {
		this.dressroom_name = dressroom_name;
	}
	public String getDressroom_description() {
		return dressroom_description;
	}
	public void setDressroom_description(String dressroom_description) {
		this.dressroom_description = dressroom_description;
	}
	public Date getDressroom_date() {
		return dressroom_date;
	}
	public void setDressroom_date(Date dressroom_date) {
		this.dressroom_date = dressroom_date;
	}
	public int getDressroom_like() {
		return dressroom_like;
	}
	public void setDressroom_like(int dressroom_like) {
		this.dressroom_like = dressroom_like;
	}
	@Override
	public String toString() {
		return "DressVO [dressroom_id_SEQ=" + dressroom_id_SEQ + ", tag_id=" + tag_id + ", user_id=" + user_id + ", dressroom_name=" + dressroom_name + ", dressroom_description=" + dressroom_description + ", dressroom_date=" + dressroom_date + ", dressroom_like=" + dressroom_like + "]";
	}
}
