package com.clt.shp.dress;

public class DressVo {
    private String dressroom_name;
	private long dressroom_description;
	private int dressroom_like;
	
	public DressVO() {
		
	}
	
	public DressVO(String dressroom_name, long dressroom_description, int dressroom_like) {
		this.dressroom_name = dressroom_name;
		this.dressroom_description = dressroom_description;
		this.dressroom_like = dressroom_like;
	}
	
	public String getDressroom_name() {
		return dressroom_name;
	}
	public void setDressroom_name(String dressroom_name) {
		this.dressroom_name = dressroom_name;
	}
	public long getDressroom_description() {
		return dressroom_description;
	}
	public void setDressroom_description(long dressroom_description) {
		this.dressroom_description = dressroom_description;
	}
	public int getDressroom_like() {
		return dressroom_like;
	}
	public void setDressroom_like(String dressroom_like) {
		this.dressroom_like = dressroom_like;
	}
	@Override
	public String toString() {
		return "DressVO [dressroom_name=" + dressroom_name + ", dressroom_description=" + dressroom_description + ", dressroom_like=" + dressroom_like + "]";
	}
}
