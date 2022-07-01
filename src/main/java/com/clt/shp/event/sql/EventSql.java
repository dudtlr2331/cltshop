package com.clt.shp.event.sql;

public interface EventSql{
	String EVENT_INSERT = 
	  "INSERT INTO EVENT_TBL"
	+ "( EVENT_INFO_SEQ" /*이벤트 시퀀스*/
	+ ", EVENT_NUM" /*이벤트 코드*/
	+ ", EVENT_NAME" /*이벤트 이름*/
	+ ", IMG_PATH" /*이미지경로*/
	+ ", IMG_NM" /*이미지이름*/
	+ ", EVENT_REGIST_DATE" /*이벤트 등록 날짜*/
	+ ", EVENT_END_DATE" /*이벤트 만료 날짜*/
	+ ") VALUES"
	+ "( SQ_EVENT_INFO_SEQ.NEXTVAL" /*이벤트 시퀀스*/
	+ ", (SELECT NVL(MAX(EVENT_NUM),0)+1 FROM EVENT_TBL)" /*이벤트 코드*/
	+ ", ?" /*이벤트 이름*/
	+ ", ?" /*이미지경로*/
	+ ", ?" /*이미지이름*/
	+ ", SYSDATE" /*쿠폰 등록 날짜*/
	+ ", ?" /*쿠폰 만료 날짜*/
	+ ")"
	;
	
	String EVENT_SELECT =
	  "SELECT EVENT_INFO_SEQ" /*이벤트 시퀀스*/
	+ "	    , EVENT_NUM" /*이벤트 코드*/
	+ "     , EVENT_NAME" /*이벤트 이름*/
	+ "     , IMG_PATH" /*이미지경로*/
	+ "     , IMG_NM" /*이미지이름*/
	+ "     , EVENT_REGIST_DATE" /*이벤트 등록 날짜*/
	+ "     , EVENT_END_DATE" /*이벤트 만료 날짜*/
	+ "  FROM EVENT_TBL"
	+ " WHERE 1 = 1"
	+ "   AND EVENT_INFO_SEQ = ?" /*이벤트 시퀀스*/
	;
	
	String EVENT_LIST =
	  "SELECT EVENT_INFO_SEQ" /*이벤트 시퀀스*/
	+ "	    , EVENT_NUM" /*이벤트 코드*/
	+ "     , EVENT_NAME" /*이벤트 이름*/
	+ "     , IMG_PATH" /*이미지경로*/
	+ "     , IMG_NM" /*이미지이름*/
	+ "     , EVENT_REGIST_DATE" /*이벤트 등록 날짜*/
	+ "     , EVENT_END_DATE" /*이벤트 만료 날짜*/
	+ "  FROM EVENT_TBL"
	+ " WHERE 1 = 1"
	+ " ORDER BY EVENT_INFO_SEQ ASC"
	;
	
	String EVENT_UPDATE =
	  "UPDATE EVENT_TBL "
	+ "   SET EVENT_NAME = ?" /*이벤트 이름*/
	+ "     , IMG_PATH = ?" /*이미지경로*/
	+ "     , IMG_NM = ?" /*이미지이름*/
	+ "     , EVENT_END_DATE = ?" /*이벤트 만료 날짜*/
	+ " WHERE 1=1"
	+ "   AND EVENT_INFO_SEQ = ?"
	;
	
	String EVENT_DELETE = 
	  "DELETE FROM EVENT_TBL "
	+ " WHERE 1=1 "
	+ "  AND EVENT_INFO_SEQ = ?" /*이벤트 시퀀스*/
	;
	
	String EVENT_DELETE_ALL =
	"DELETE FROM EVENT_TBL "
	;
	
	String EVENT_SEQ_DROP = 
	"DROP SEQUENCE SQ_EVENT_INFO_SEQ"
	;
	
	String EVENT_SEQ_CREATE = 
	"CREATE SEQUENCE SQ_EVENT_INFO_SEQ"
	;
}