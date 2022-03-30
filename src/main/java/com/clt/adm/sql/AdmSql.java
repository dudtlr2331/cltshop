package com.clt.adm.sql;

public interface AdmSql {
			String ADM_INSERT = 
			  "INSERT INTO COUPON(COU_NUM, COU_NAME, COU_DISCOUNT, COU_TIME, COU_COUNT) "
			+ "VALUES(cou_num.nextval, ?, ?, ?, ?, ?)"
			;
			
			String ADM_SELECT =
			  "SELECT COU_NUM"
			+ "	    , COU_NAME "
			+ "     , COU_DISCOUNT"
			+ "     , COU_TIME"
			+ "     , COU_COUNT"
			+ "  FROM COUPON"
			+ " WHERE 1=1"
			+ "   AND COU_NUM = ?"
			;
			
			String ADM_LIST =
			  "SELECT COU_NUM"
			+ "	    , COU_NAME "
			+ "     , COU_DISCOUNT"
			+ "     , COU_TIME"
			+ "     , COU_COUNT"
			+ "  FROM COUPON"
			+ " WHERE 1=1 "
			+ " ORDER BY COU_NUM DESC"
			;
			
			String ADM_UPDATE =
			  "UPDATE COUPON "
			+ "   SET COU_NAME = ?"
			+ "     , COU_TIME = ?"
			+ " WHERE 1=1"
			+ "   AND COU_NUM = ?"
			;
			
			String ADM_DELETE = 
			  "DELETE FROM COUPON "
			+ " WHERE 1=1 "
			+ "  AND MEMBER_SEQ = ?"
			;
}
