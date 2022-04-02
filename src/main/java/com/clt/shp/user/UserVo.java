package com.clt.shp.user;

public class UserVo {
   private long memberSeq;
   private String memberId;
   private String memberName;
   private String memberPwd;
   private String memberTel;
   private String birth;
   private String gender;
   private String email;
   private String createdAt;
   private String grade;
   private String delFlag;
   private String delDate;
   private String coupon;
   private String accumulatedMoney;

   public UserVo() {
      super();
   }

public UserVo(long memberSeq, String memberId, String memberName, String memberPwd, String memberTel, String birth,
		String gender, String email, String createdAt, String grade, String delFlag, String delDate, String coupon,
		String accumulatedMoney) {
	this.memberSeq = memberSeq;
	this.memberId = memberId;
	this.memberName = memberName;
	this.memberPwd = memberPwd;
	this.memberTel = memberTel;
	this.birth = birth;
	this.gender = gender;
	this.email = email;
	this.createdAt = createdAt;
	this.grade = grade;
	this.delFlag = delFlag;
	this.delDate = delDate;
	this.coupon = coupon;
	this.accumulatedMoney = accumulatedMoney;
}

public long getMemberSeq() {
	return memberSeq;
}

public void setMemberSeq(long memberSeq) {
	this.memberSeq = memberSeq;
}

public String getMemberId() {
	return memberId;
}

public void setMemberId(String memberId) {
	this.memberId = memberId;
}

public String getMemberName() {
	return memberName;
}

public void setMemberName(String memberName) {
	this.memberName = memberName;
}

public String getMemberPwd() {
	return memberPwd;
}

public void setMemberPwd(String memberPwd) {
	this.memberPwd = memberPwd;
}

public String getMemberTel() {
	return memberTel;
}

public void setMemberTel(String memberTel) {
	this.memberTel = memberTel;
}

public String getBirth() {
	return birth;
}

public void setBirth(String birth) {
	this.birth = birth;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
}

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}

public String getDelFlag() {
	return delFlag;
}

public void setDelFlag(String delFlag) {
	this.delFlag = delFlag;
}

public String getDelDate() {
	return delDate;
}

public void setDelDate(String delDate) {
	this.delDate = delDate;
}

public String getCoupon() {
	return coupon;
}

public void setCoupon(String coupon) {
	this.coupon = coupon;
}

public String getAccumulatedMoney() {
	return accumulatedMoney;
}

public void setAccumulatedMoney(String accumulatedMoney) {
	this.accumulatedMoney = accumulatedMoney;
}

@Override
public String toString() {
	return "UserVo [memberSeq=" + memberSeq + ", memberId=" + memberId + ", memberName=" + memberName + ", memberPwd="
			+ memberPwd + ", memberTel=" + memberTel + ", birth=" + birth + ", gender=" + gender + ", email=" + email
			+ ", createdAt=" + createdAt + ", grade=" + grade + ", delFlag=" + delFlag + ", delDate=" + delDate
			+ ", coupon=" + coupon + ", accumulatedMoney=" + accumulatedMoney + "]";
}

}