package com.clt.shp.cpn.sql;

public interface CpnSql{
	String CPN_INSERT = 
	  "INSERT INTO COUPON_TBL"
	  + "( COU_INFO_SEQ" /*쿠폰 시퀀스*/
	  + ", COU_NUM" /*쿠폰 코드*/
	  + ", COU_NAME" /*쿠폰 이름*/
	  + ", COU_DISCOUNT" /*쿠폰 할인율*/
	  + ", COU_REGIST_DATE" /*쿠폰 등록 날짜*/
	  + ", COU_END_DATE" /*쿠폰 만료 날짜*/
	  + ", COU_COUNT" /*쿠폰 개수*/
	  + ") VALUES"
	  + "( SQ_COU_INFO_SEQ.NEXTVAL" /*쿠폰 시퀀스*/
	  + ", (SELECT NVL(MAX(COU_NUM),0)+1 FROM COUPON_TBL)" /*쿠폰 코드*/
	  + ", ?" /*쿠폰 이름*/
	  + ", ?" /*쿠폰 할인율*/
	  + ", SYSDATE" /*쿠폰 등록 날짜*/
	  + ", ?" /*쿠폰 만료 날짜*/
	  + ", ?" /*쿠폰 개수*/
	  + ")"
	;
	
	String CPN_SELECT =
		  "SELECT COU_INFO_SEQ" /*쿠폰 시퀀스*/
		+ "	    , COU_NUM" /*쿠폰 코드*/
		+ "     , COU_NAME" /*쿠폰 이름*/
		+ "     , COU_DISCOUNT" /*쿠폰 할인율*/
		+ "     , COU_REGIST_DATE" /*쿠폰 등록 날짜*/
		+ "     , COU_END_DATE" /*쿠폰 만료 날짜*/
		+ "     , COU_COUNT" /*쿠폰 개수*/
		+ "  FROM COUPON_TBL"
		+ " WHERE 1 = 1"
		+ "   AND COU_INFO_SEQ = ?" /*쿠폰 시퀀스*/
		;
	
	String CPN_LIST =
		  "SELECT COU_INFO_SEQ" /*쿠폰 시퀀스*/
		+ "	    , COU_NUM" /*쿠폰 코드*/
		+ "     , COU_NAME" /*쿠폰 이름*/
		+ "     , COU_DISCOUNT" /*쿠폰 할인율*/
		+ "     , COU_REGIST_DATE" /*쿠폰 등록 날짜*/
		+ "     , COU_END_DATE" /*쿠폰 만료 날짜*/
		+ "     , COU_COUNT" /*쿠폰 개수*/
		+ "  FROM COUPON_TBL"
		+ " WHERE 1 = 1"
		+ " ORDER BY COU_INFO_SEQ ASC"
		;
	
	String CPN_UPDATE =
			  "UPDATE COUPON_TBL "
			+ "   SET COU_NAME = ?" /*쿠폰 이름*/
			+ "     , COU_DISCOUNT = ?" /*쿠폰 할인율*/
			+ "     , COU_END_DATE = ?" /*쿠폰 만료 날짜*/
			+ "     , COU_COUNT = ?" /*쿠폰 개수*/
			+ " WHERE 1=1"
			+ "   AND COU_INFO_SEQ = ?"
			;
	
	String CPN_DELETE = 
	  "DELETE FROM COUPON_TBL "
	+ " WHERE 1=1 "
	+ "  AND COU_INFO_SEQ = ?" /*쿠폰 시퀀스*/
	;
	
}