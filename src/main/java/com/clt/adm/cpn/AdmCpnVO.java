package com.clt.adm.cpn;

public class AdmCpnVO {
	private String cou_name;
	private long cou_discount;
	private String cou_time;
	private long cou_count;
	

	public AdmCpnVo() {
		super();
	}

	public void AdmCpnVo(String cou_name, long cou_discount, String cou_time, long cou_count) {
		this.cou_name = cou_name;
		this.cou_discount = cou_discount;
		this.cou_time = cou_time;
		this.cou_count = cou_count;
	}
	
	public void setCou_name(String cou_name) {
		this.cou_name = cou_name;
	}

	
	public long getCou_discount() {
		return cou_discount;
	}

	public void setCou_discount(long cou_discount) {
		this.cou_discount = cou_discount;
	}


	public void setCou_time(String cou_time) {
		this.cou_time = cou_time;
	}

	public long getCou_count() {
		return cou_count;
	}

	public void setCou_count(long cou_count) {
		this.cou_count = cou_count;
	}


	@Override
	public String toString() {
		return "AdmVo [cou_num=cou_num.nextval, cou_name=" + cou_name + ", cou_discount=" + cou_discount + ", cou_time=" 
	+ cou_time + ", cou_count=" + cou_count + "]";
	}
}
