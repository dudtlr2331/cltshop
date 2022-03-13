package com.clt.shp.user;

public class UserVo {
	private long member_seq;
	private String member_id;
	private String member_email;
	private String member_pwd;
	private String tel_front;
	private String tel_midle;
	private String tel_back;
	private String birth_yy;
	private String birth_mm;
	private String birth_dd;
	

	public UserVo() {
		
	}

	public UserVo(long member_seq, String member_id, String member_email, String member_pwd, String tel_front, String tel_midle, String tel_back, String birth_yy, String birth_mm, String birth_dd) {
		this.member_seq = member_seq;
		this.member_id = member_id;
		this.member_email = member_email;
		this.member_pwd = member_pwd;
		this.tel_front = tel_front;
		this.tel_midle = tel_midle;
		this.tel_back = tel_back;
		this.birth_yy = birth_yy;
		this.birth_mm = birth_mm;
		this.birth_dd = birth_dd;
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

	public String getTel_front() {
		return tel_front;
	}

	public void setTel_front(String tel_front) {
		this.tel_front = tel_front;
	}

	public String getTel_midle() {
		return tel_midle;
	}

	public void setTel_midle(String tel_midle) {
		this.tel_midle = tel_midle;
	}

	public String getTel_back() {
		return tel_back;
	}

	public void setTel_back(String tel_back) {
		this.tel_back = tel_back;
	}

	public String getBirth_yy() {
		return birth_yy;
	}

	public void setBirth_yy(String birth_yy) {
		this.birth_yy = birth_yy;
	}

	public String getBirth_mm() {
		return birth_mm;
	}

	public void setBirth_mm(String birth_mm) {
		this.birth_mm = birth_mm;
	}

	public String getBirth_dd() {
		return birth_dd;
	}

	public void setBirth_dd(String birth_dd) {
		this.birth_dd = birth_dd;
	}

	@Override
	public String toString() {
		return "UserVo [member_seq=" + member_seq + ", member_id=" + member_id + ", member_email=" + member_email
				+ ", member_pwd=" + member_pwd + ", tel_front=" + tel_front + ", tel_midle=" + tel_midle + ", tel_back="
				+ tel_back + ", birth_yy=" + birth_yy + ", birth_mm=" + birth_mm + ", birth_dd=" + birth_dd + "]";
	}
	
}
