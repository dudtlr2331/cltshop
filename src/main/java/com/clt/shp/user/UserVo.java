package com.clt.shp.user;

public class UserVo {
	private long member_seq;
	private String member_id;
	private String member_name;
	private String member_pwd;


	public UserVo() {
		
	}

	public UserVo(long member_seq, String member_id, String member_name, String member_pwd) {
		this.member_seq = member_seq;
		this.member_id = member_id;
		this.member_name = member_name;
		this.member_pwd = member_pwd;
	}

	public long getMember_seq() {
		return member_seq;
	}

	public void setMember_seq(long member_seq) {
		this.member_seq = member_seq;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_pwd() {
		return member_pwd;
	}

	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	}
	
	@Override
	public String toString() {
		return "UserVo [member_seq=" + member_seq + ", member_id=" + member_id + ", member_name=" + member_name
				+ ", member_pwd=" + member_pwd + "]";
	}
}
