package com.clt.shp.user.sql;

public interface UserSql {
			String USER_INSERT = 
			  "INSERT INTO MEMBER(MEMBER_SEQ, MEMBER_ID, MEMBER_NAME, MEMBER_PWD, MEMBER_TEL, "
			+ "BIRTH, GENDER,  EMAIL, CREATED_AT, GRADE, DEL_FLAG, DEL_DATE, COUPON, ACCUMULATED_MONEY) "
			+ "VALUES(member_seq.nextval, ?, ?, ?, ?, ?, ? ,? ,?, ?, ?, ?, ?, ?)"
			;
			
			String USER_SELECT =
			  "SELECT MEMBER_SEQ"
			+ "	    , MEMBER_ID "
			+ "     , MEMBER_NAME"
			+ "     , MEMBER_PWD"
			+ "     , MEMBER_TEL"
			+ "     , BIRTH"
			+ "     , GENDER"
			+ "     , EMAIL"
			+ "     , CREATED_AT"
			+ "     , GRADE"
			+ "     , DEL_FLAG"
			+ "     , DEL_DATE"
			+ "     , COUPON"
			+ "     , ACCUMULATED_MONEY"
			+ "  FROM MEMBER"
			+ " WHERE 1=1"
			+ "   AND MEMBER_SEQ = ?"
			;
			
			String USER_LIST =
			  "SELECT MEMBER_SEQ"
			+ "	    , MEMBER_ID "
			+ "     , MEMBER_NAME"
			+ "     , MEMBER_PWD"
			+ "     , MEMBER_TEL"
			+ "     , BIRTH"
			+ "     , GENDER"
			+ "     , EMAIL"
			+ "     , CREATED_AT"
			+ "     , GRADE"
			+ "     , DEL_FLAG"
			+ "     , DEL_DATE"
			+ "     , COUPON"
			+ "     , ACCUMULATED_MONEY"
			+ "  FROM MEMBER"
			+ " WHERE 1=1 "
			+ " ORDER BY MEMBER_SEQ DESC"
			;
			
			String USER_UPDATE =
			  "UPDATE MEMBER "
			+ "   SET MEMBER_NAME = ?"
			+ "     , MEMBER_PWD = ?"
			+ "     , MEMBER_TEL = ?"
			+ "     , BIRTH = ?"
			+ "     , GENDER = ?"
			+ "     , EMAIL = ?"
			+ "     , CREATED_AT = ?"
			+ "     , GRADE = ?"
			+ "     , DEL_FLAG = ?"
			+ "     , DEL_DATE = ?"
			+ "     , COUPON = ?"
			+ "     , ACCUMULATED_MONEY = ?"
			+ " WHERE 1=1"
			+ "   AND MEMBER_SEQ = ?"
			;
			
			String USER_DELETE = 
			  "DELETE FROM MEMBER "
			+ " WHERE 1=1 "
			+ "  AND MEMBER_SEQ = ?"
			;
			
			String USER_LOGIN =
			  "SELECT MEMBER_SEQ"
			+ "	    , MEMBER_ID "
			+ "     , MEMBER_NAME"
			+ "     , MEMBER_PWD"
			+ "     , MEMBER_TEL"
			+ "     , BIRTH"
			+ "     , GENDER"
			+ "     , EMAIL"
			+ "     , CREATED_AT"
			+ "     , GRADE"
			+ "     , DEL_FLAG"
			+ "     , DEL_DATE"
			+ "     , COUPON"
			+ "     , ACCUMULATED_MONEY"
			+ "  FROM MEMBER"
			+ " WHERE 1=1"
			+ "   AND MEMBER_ID = ?"
			;
}
