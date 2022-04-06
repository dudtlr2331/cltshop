package com.clt.shp.dress.sql;

public interface DressSql{
	String DRESS_INSERT = 
	  "INSERT INTO DRESS_INFO"
	  + "( DRESSROOM_INFO_SEQ" /*드레스룸 시퀀스*/
      + ", DRESSROOM_ID" /*드레스룸 번호*/
	  + ", TAG_ID" /*태그 번호*/
	  + ", USER_ID" /*회원 아이디*/
	  + ", DRESSROOM_NAME" /*드레스룸 제목*/
	  + ", DRESSROOM_DESCRIPTION" /*드레스룸 내용*/
	  + ", DRESSROOM_DATE" /*드레스룸 작성일자*/
	  + ", DRESSROOM_LIKE" /*드레스룸 좋아요 수*/
	  + ") VALUES"
	  + "( DRESSROOM_INFO_SEQ.NEXTVAL" /*드레스룸 시퀀스*/
	  + ", (SELECT NVL(MAX(DRESSROOM_ID), 0) + 1 FROM DRESS_INFO)" /*드레스룸 번호*/
	  + ", ?" /*태그 번호*/
	  + ", ?" /*회원 아이디*/
	  + ", ?" /*드레스룸 제목*/
	  + ", ?" /*드레스룸 내용*/
	  + ", ?" /*드레스룸 작성일자*/
	  + ", ?" /*드레스룸 좋아요 수*/
	  + ")"
	;
	
	String DRESS_SELECT =
	  "SELECT DRESS_INFO_SEQ" /*드레스룸 시퀀스*/
	+ "	    , DRESSROOM_ID" /*드레스룸 번호*/
	+ "     , TAG_ID" /*태그 번호*/
	+ "     , USER_ID" /*회원 아이디*/
	+ "     , DRESSROOM_NAME" /*드레스룸 제목*/
	+ "     , DRESSROOM_DESCRIPTION" /*드레스룸 내용*/
	+ "     , DRESSROOM_DATE" /*드레스룸 작성일자*/
	+ "     , DRESSROOM_LIKE" /*드레스룸 좋아요 수*/
	+ "  FROM DRESS_INFO"
	+ " WHERE 1 = 1"
	+ "   AND DRESS_INFO_SEQ = ?" /*드레스룸 시퀀스*/
	;
	
	String DRESS_LIST =
	  "SELECT DRESS_INFO_SEQ" /*드레스룸 시퀀스*/
	+ "	    , DRESSROOM_ID" /*드레스룸 번호*/
	+ "     , TAG_ID" /*태그 번호*/
	+ "     , USER_ID" /*회원 아이디*/
	+ "     , DRESSROOM_NAME" /*드레스룸 제목*/
	+ "     , DRESSROOM_DESCRIPTION" /*드레스룸 내용*/
	+ "     , DRESSROOM_DATE" /*드레스룸 작성일자*/
	+ "     , DRESSROOM_LIKE" /*드레스룸 좋아요 수*/
	+ "  FROM DRESS_INFO"
	+ " WHERE 1 = 1"
	+ " ORDER BY DRESS_INFO_SEQ ASC"
	;
	
	String DRESS_UPDATE =
	  "UPDATE GOODS_INFO "
	+ "   SET DRESS_INFO_SEQ = ?" /*드레스룸 시퀀스*/
	+ "	    , DRESSROOM_ID = ?" /*드레스룸 번호*/
	+ "     , TAG_ID = ?" /*태그 번호*/
	+ "     , USER_ID = ?" /*회원 아이디*/
	+ "     , DRESSROOM_NAME = ?" /*드레스룸 제목*/
	+ "     , DRESSROOM_DESCRIPTION = ?" /*드레스룸 내용*/
	+ "     , DRESSROOM_DATE = ?" /*드레스룸 작성일자*/
	+ "     , DRESSROOM_LIKE = ?" /*드레스룸 좋아요 수*/
	+ " WHERE 1=1"
	+ "   AND DRESS_INFO_SEQ = ?"
	;
	
	String DRESS_DELETE = 
	  "DELETE FROM DRESS_INFO "
	+ " WHERE 1=1 "
	+ "  AND DRESS_INFO_SEQ = ?" /*드레스룸 시퀀스*/
	;
	
}