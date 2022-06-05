package com.clt.shp.code.sql;

public interface CodeSql{
	String CODE_INSERT = 
	  "INSERT INTO STD_CD_BASE"
    + "( STD_CD_BASE_SEQ" /*시퀀스*/
    + ", CODE_NM" /*코드 이름*/
    + ", CODE_VAL" /*코드 값*/
    + ", CODE_DESC" /*설명*/
    + ", GRP_CD" /*코드 그룹*/
    + ", GRP_ORDR" /*그룹 순번*/
    + ", USE_YN" /*사용 여부*/
    + ", RGST_ID" /*등록 아이디*/
    + ", RGST_DATE" /*등록일*/
    + ", UPDT_ID" /*수정 아이디*/
    + ", UPDT_DATE" /*수정일*/
    + ") VALUES"
    + "( SQ_STD_CD_BASE_SEQ.nextval"
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
    + ")"
	;
	
	String CODE_SELECT =
	  "SELECT STD_CD_BASE_SEQ"
	+ "	    , CODE_NM "
	+ "     , CODE_VAL"
	+ "     , CODE_DESC"
	+ "     , GRP_CD"
	+ "     , GRP_ORDR"
	+ "     , USE_YN"
	+ "     , RGST_ID"
	+ "     , RGST_DATE"
	+ "     , UPDT_ID"
	+ "     , UPDT_DATE"
	+ " FROM STD_CD_BASE"
	+ " WHERE 1=1"
	+ " AND STD_CD_BASE_SEQ = ?"
	;
	
	String CODE_LIST =
	  "SELECT STD_CD_BASE_SEQ"
    + "	    , CODE_NM "
	+ "     , CODE_VAL"
	+ "     , CODE_DESC"
	+ "     , GRP_CD"
	+ "     , GRP_ORDR"
	+ "     , USE_YN"
	+ "     , RGST_ID"
	+ "     , RGST_DATE"
	+ "     , UPDT_ID"
	+ "     , UPDT_DATE"
	+ " FROM STD_CD_BASE"
	+ " WHERE 1=1 "
	;
	
	String SALESTAT_CODE_LIST =
	  "SELECT STD_CD_BASE_SEQ"
	+ "	    , CODE_NM "
	+ "     , CODE_VAL"
	+ "     , CODE_DESC"
	+ "     , GRP_CD"
	+ "     , GRP_ORDR"
	+ "     , USE_YN"
	+ "     , RGST_ID"
	+ "     , RGST_DATE"
	+ "     , UPDT_ID"
	+ "     , UPDT_DATE"
	+ " FROM STD_CD_BASE"
	+ " WHERE 1=1 "
	+ " AND GRP_CD = 'STD001' "
	+ " ORDER BY STD_CD_BASE_SEQ ASC"
	;
	
	String USR_CODE_LIST =
	  "SELECT STD_CD_BASE_SEQ"
	+ "	    , CODE_NM "
	+ "     , CODE_VAL"
	+ "     , CODE_DESC"
	+ "     , GRP_CD"
	+ "     , GRP_ORDR"
	+ "     , USE_YN"
	+ "     , RGST_ID"
	+ "     , RGST_DATE"
	+ "     , UPDT_ID"
	+ "     , UPDT_DATE"
	+ " FROM STD_CD_BASE"
	+ " WHERE 1=1 "
	+ " AND GRP_CD = 'STD002' "
	+ " ORDER BY STD_CD_BASE_SEQ ASC"
	;
	
	String ADM_CODE_LIST =
	  "SELECT STD_CD_BASE_SEQ"
	+ "	    , CODE_NM "
	+ "     , CODE_VAL"
	+ "     , CODE_DESC"
	+ "     , GRP_CD"
	+ "     , GRP_ORDR"
	+ "     , USE_YN"
	+ "     , RGST_ID"
	+ "     , RGST_DATE"
	+ "     , UPDT_ID"
	+ "     , UPDT_DATE"
	+ " FROM STD_CD_BASE"
	+ " WHERE 1=1 "
	+ " AND GRP_CD = 'STD003' "
	+ " ORDER BY STD_CD_BASE_SEQ ASC"
	;
	
	String ORD_CODE_LIST =
	  "SELECT STD_CD_BASE_SEQ"
	+ "	    , CODE_NM "
	+ "     , CODE_VAL"
	+ "     , CODE_DESC"
	+ "     , GRP_CD"
	+ "     , GRP_ORDR"
	+ "     , USE_YN"
	+ "     , RGST_ID"
	+ "     , RGST_DATE"
	+ "     , UPDT_ID"
	+ "     , UPDT_DATE"
	+ " FROM STD_CD_BASE"
	+ " WHERE 1=1 "
	+ " AND GRP_CD = 'STD004' "
	+ " ORDER BY STD_CD_BASE_SEQ ASC"
	;
	
	String CODE_UPDATE =
	  "UPDATE STD_CD_BASE "
    + "	  SET CODE_NM  = ?" /*코드 이름*/
	+ "     , CODE_VAL  = ?" /*코드 값*/
	+ "     , CODE_DESC  = ?" /*설명*/
	+ "     , GRP_CD  = ?" /*코드 그룹*/
	+ "     , GRP_ORDR  = ?" /*그룹 순번*/
	+ "     , USE_YN  = ?" /*사용 여부*/
	+ "     , UPDT_ID  = ?" /*수정 아이디*/
	+ "     , UPDT_DATE  = ?" /*수정일*/
	+ " WHERE 1=1"
	+ "   AND STD_CD_BASE_SEQ = ?"
	;
	
	String CODE_DELETE = 
	  "DELETE FROM STD_CD_BASE "
	+ " WHERE 1=1 "
	+ "  AND STD_CD_BASE_SEQ = ?"
	;

	String CODE_DELETE_ALL =
	"DELETE FROM STD_CD_BASE "
	;
	
	String CODE_SEQ_DROP = 
	"DROP SEQUENCE SQ_STD_CD_BASE_SEQ"
	;
	
	String CODE_SEQ_CREATE = 
	"CREATE SEQUENCE SQ_STD_CD_BASE_SEQ"
	;
}