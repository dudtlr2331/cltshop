package com.clt.shp.user.sql;

public interface UserSql {
			String USER_INSERT = 
			  "INSERT INTO MEMBER(MEMBER_SEQ, MEMBER_ID, MEMBER_NAME, MEMBER_PWD) "
			+ "VALUES(?, ?, ?, ?)"
			;
			
			String USER_SELECT =
			  "SELECT MEMBER_SEQ"
			+ "	    , MEMBER_ID "
			+ "     , MEMBER_NAME"
			+ "     , MEMBER_PWD"
			+ "  FROM MEMBER"
			+ " WHERE 1=1"
			+ "   AND MEMBER_SEQ = ?"
			;
			
			String USER_LIST =
			  "SELECT MEMBER_SEQ"
			+ "	    , MEMBER_ID "
			+ "     , MEMBER_NAME"
			+ "     , MEMBER_PWD"
			+ "  FROM MEMBER"
			+ " WHERE 1=1 "
			+ " ORDER BY MEMBER_SEQ DESC"
			;
			
			String USER_UPDATE =
			  "UPDATE MEMBER "
			+ "   SET MEMBER_ID = ?"
			+ "     , MEMBER_PWD = ?"
			+ " WHERE 1=1"
			+ "   AND MEMBER_SEQ = ?"
			;
			
			String USER_DELETE = 
			  "DELETE FROM MEMBER "
			+ " WHERE 1=1 "
//			+ "  AND GOODS_INFO_SEQ = ?"
			+ "  AND MEMBER_SEQ = ?"
			;
}
