package com.clt.shp.user;

public class UserVo {
	private long member_seq;
	private String member_id;
	private String member_email;
	private String member_pwd;


	public UserVo() {
		
	}

	public UserVo(long member_seq, String member_id, String member_email, String member_pwd) {
		this.member_seq = member_seq;
		this.member_id = member_id;
		this.member_email = member_email;
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

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_pwd() {
		return member_pwd;
	}

	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	}

	@Override
	public String toString() {
		return "UserVo [member_seq=" + member_seq + ", member_id=" + member_id + ", member_email=" + member_email
				+ ", member_pwd=" + member_pwd + "]";
	}
	
}
