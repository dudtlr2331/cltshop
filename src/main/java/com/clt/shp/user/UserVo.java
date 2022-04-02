package com.clt.shp.user;

public class UserVo {
   private long memberSeq;
   private String memberId;
   private String memberEmail;
   private String memberPwd;
   private String memberTel;
   private String birth;

   public UserVo() {
      super();
   }

   public UserVo(long memberSeq, String memberId, String memberEmail, String memberPwd, String memberTel,
         String birth) {
      this.memberSeq = memberSeq;
      this.memberId = memberId;
      this.memberEmail = memberEmail;
      this.memberPwd = memberPwd;
      this.memberTel = memberTel;
      this.birth = birth;
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

   public String getMemberEmail() {
      return memberEmail;
   }

   public void setMemberEmail(String memberEmail) {
      this.memberEmail = memberEmail;
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

   @Override
   public String toString() {
      return "UserVo [memberSeq=" + memberSeq + ", memberId=" + memberId + ", memberEmail=" + memberEmail
            + ", memberPwd=" + memberPwd + ", memberTel=" + memberTel + ", birth=" + birth + "]";
   }

}