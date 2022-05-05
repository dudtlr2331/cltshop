package com.clt.adm.cpn.sql;

public interface AdmCpnSql {
			String CPN_INSERT = 
			  "INSERT INTO COUPON(COU_NUM, COU_NAME, COU_DISCOUNT, COU_TIME, COU_COUNT) "
			+ "VALUES(cou_num.nextval, ?, ?, ?, ?, ?)"
			;
			
			String CPN_SELECT =
			  "SELECT COU_NUM"
			+ "	    , COU_NAME "
			+ "     , COU_DISCOUNT"
			+ "     , COU_TIME"
			+ "     , COU_COUNT"
			+ "  FROM COUPON"
			+ " WHERE 1=1"
			+ "   AND COU_NUM = ?"
			;
			
			String CPN_LIST =
			  "SELECT COU_NUM"
			+ "	    , COU_NAME "
			+ "     , COU_DISCOUNT"
			+ "     , COU_TIME"
			+ "     , COU_COUNT"
			+ "  FROM COUPON"
			+ " WHERE 1=1 "
			+ " ORDER BY COU_NUM DESC"
			;
			
			String CPN_UPDATE =
			  "UPDATE COUPON "
			+ "   SET COU_NAME = ?"
			+ "     , COU_TIME = ?"
			+ " WHERE 1=1"
			+ "   AND COU_NUM = ?"
			;
			
			String CPN_DELETE = 
			  "DELETE FROM COUPON "
			+ " WHERE 1=1 "
			+ "  AND MEMBER_SEQ = ?"
			;
}
