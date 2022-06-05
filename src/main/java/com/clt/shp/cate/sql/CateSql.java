package com.clt.shp.cate.sql;

public interface CateSql{
	String CATE_INSERT = 
	  "INSERT INTO GOODS_CATA"
	+ "( GOODS_CATA_SEQ" /*시퀀스*/
	+ ", CATGRY_CD" /*분류 코드*/
	+ ", GOODS_CD" /*상품 코드*/
	+ ", CATGRY_NM" /*분류 명*/
	+ ", NOTE_CONT" /*비고 내용*/
	+ ", CLASS_LVL_CD" /*분류 레벨 코드*/
	+ ", UPR_CLASS_CD" /*상위 분류 코드*/
	+ ", RGST_ID" /*등록아이디*/
	+ ", RGST_DATE" /*등록일자*/
	+ ", UPDT_ID" /*수정 아이디*/
	+ ", UPDT_DATE" /*수정 일자*/
	+ ", USE_YN" /*사용 여부*/
	+ ") VALUES"
	+ "( SQ_GOODS_CATA_SEQ.nextval"
	+ ", ?"
	+ ", ?"
	+ ", ?"
	+ ", ?"
	+ ", ?"
	+ ", ?"
	+ ", ?"
	+ ", SYSDATE"
	+ ", ?"
	+ ", SYSDATE"
	+ ", ?"
	+ ")"
	;

	String CATE_SELECT =
	  "SELECT GOODS_CATA_SEQ"
	+ "	    , CATGRY_CD "
	+ "     , GOODS_CD"
	+ "     , CATGRY_NM"
	+ "     , NOTE_CONT"
	+ "     , CLASS_LVL_CD"
	+ "     , UPR_CLASS_CD"
	+ "     , RGST_ID"
	+ "     , RGST_DATE"
	+ "     , UPDT_ID"
	+ "     , UPDT_DATE"
	+ "     , USE_YN"
	+ " FROM GOODS_CATA"
	+ " WHERE 1=1"
	+ " AND GOODS_CATA_SEQ = ?"
	;

	String CATE_LIST =
	  "SELECT GOODS_CATA_SEQ"
	+ "	    , CATGRY_CD "
	+ "     , GOODS_CD"
	+ "     , CATGRY_NM"
	+ "     , NOTE_CONT"
	+ "     , CLASS_LVL_CD"
	+ "     , UPR_CLASS_CD"
	+ "     , RGST_ID"
	+ "     , RGST_DATE"
	+ "     , UPDT_ID"
	+ "     , UPDT_DATE"
	+ "     , USE_YN"
	+ " FROM GOODS_CATA"
	+ " WHERE 1=1 "
	+ " AND CLASS_LVL_CD = '1' "
	+ " ORDER BY GOODS_CATA_SEQ ASC"
	;

	String CATE_UNDER_LIST =
	  "SELECT GOODS_CATA_SEQ"
	+ "	    , CATGRY_CD "
	+ "     , GOODS_CD"
	+ "     , CATGRY_NM"
	+ "     , NOTE_CONT"
	+ "     , CLASS_LVL_CD"
	+ "     , UPR_CLASS_CD"
	+ "     , RGST_ID"
	+ "     , RGST_DATE"
	+ "     , UPDT_ID"
	+ "     , UPDT_DATE"
	+ "     , USE_YN"
	+ " FROM GOODS_CATA"
	+ " WHERE UPR_CLASS_CD = ? "
	+ " AND CLASS_LVL_CD = '2' "
	+ " ORDER BY GOODS_CATA_SEQ ASC"
	;

	String CATE_UPDATE =
	  "UPDATE GOODS_CATA "
	+ "	  SET CATGRY_CD  = ?"
	+ "     , CATGRY_NM  = ?"
	+ "     , NOTE_CONT  = ?"
	+ "     , USE_YN  = ?"
	+ "     , UPDT_ID  = ?"
	+ "     , UPDT_DATE  = ?"
	+ " WHERE 1=1"
	+ "   AND GOODS_CATA_SEQ = ?"
	;

	String CATE_DELETE =
	  "DELETE FROM GOODS_CATA "
	+ " WHERE 1=1 "
	+ "  AND GOODS_CATA_SEQ = ?"
	;

	String CATE_DELETE_ALL =
	"DELETE FROM GOODS_CATA "
	;
	
	String CATE_DROP_SEQ =
	"DROP SEQUENCE SQ_GOODS_CATA_SEQ"
	;
	
	String CATE_CREATE_SEQ =
	"CREATE SEQUENCE SQ_GOODS_CATA_SEQ"
	;
}