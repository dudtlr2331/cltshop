package com.clt.shp.user.sql;

public interface UserSql {
	String USER_INSERT = 
	  "INSERT INTO USR_BASE "
	+ "( USR_BASE_SEQ /*유저기본시퀀스*/"
	+ ", USR_ID /*사용자 아이디*/"
	+ ", USR_NM /*사용자 이름*/"
	+ ", PASS_WD /*비밀번호*/"
	+ ", USR_BIRTH /*생년월일*/"
	+ ", EMAIL_ADDR /*이메일주소*/"
	+ ", CELL_NO /*휴대폰번호*/"
	+ ", LAND_ADDR_BASE /*지번 주소 기본*/"
	+ ", LAND_ADDR_DTL /*지번 주소 상세*/"
	+ ", LAND_POST_NO /*지번 우편 번호*/"
	+ ", LOAD_ADDR_BASE /*도로 주소 기본*/"
	+ ", LOAD_ADDR_DTL /*도로 주소 상세*/"
	+ ", LOAD_POST_NO /*도로 우편 번호*/"
	+ ", PASS_WD_CHG_DATE /*비밀번호변경일시*/"
	+ ", LOCK_YN /*정지유무*/"
	+ ", RGST_ID /*등록 아이디*/"
	+ ", RGST_DATE /*등록 일자*/"
	+ ", UPDT_ID /*수정 아이디*/"
	+ ", UPDT_DATE /*수정 일자*/"
	+ ", USE_YN /*사용 여부*/"
	+ ") VALUES"
	+ "( SQ_USR_BASE_SEQ.NEXTVAL /*유저기본시퀀스*/"
	+ ", ? /*사용자 아이디*/"
	+ ", ? /*사용자 이름*/"
	+ ", ? /*비밀번호*/"
	+ ", ? /*생년월일*/"
	+ ", ? /*이메일주소*/"
	+ ", ? /*휴대폰번호*/"
	+ ", ? /*지번 주소 기본*/"
	+ ", ? /*지번 주소 상세*/"
	+ ", ? /*지번 우편 번호*/"
	+ ", ? /*도로 주소 기본*/"
	+ ", ? /*도로 주소 상세*/"
	+ ", ? /*도로 우편 번호*/"
	+ ", NULL /*비밀번호변경일시*/"
	+ ", 'N' /*정지유무*/"
	+ ", ? /*등록 아이디*/"
	+ ", SYSDATE /*등록 일자*/"
	+ ", NULL /*수정 아이디*/"
	+ ", NULL /*수정 일자*/"
	+ ", 'Y' /*사용 여부*/"
	+ ")"
	;
	
	String USER_SELECT =
	  "SELECT USR_BASE_SEQ /*유저기본시퀀스*/"
	+ "	    , USR_ID /*사용자 아이디*/"
	+ "     , USR_NM /*사용자 이름*/"
	+ "     , PASS_WD /*비밀번호*/"
	+ "     , USR_BIRTH /*생년월일*/"
	+ "     , EMAIL_ADDR /*이메일주소*/"
	+ "     , CELL_NO /*휴대폰번호*/"
	+ "     , LAND_ADDR_BASE /*지번 주소 기본*/"
	+ "     , LAND_ADDR_DTL /*지번 주소 상세*/"
	+ "     , LAND_POST_NO /*지번 우편 번호*/"
	+ "     , LOAD_ADDR_BASE /*도로 주소 기본*/"
	+ "     , LOAD_ADDR_DTL /*도로 주소 상세*/"
	+ "     , LOAD_POST_NO /*도로 우편 번호*/"
	+ "     , PASS_WD_CHG_DATE /*비밀번호변경일시*/"
	+ "     , LOCK_YN /*정지유무*/"
	+ "     , RGST_ID /*등록 아이디*/"
	+ "     , RGST_DATE /*등록 일자*/"
	+ "     , UPDT_ID /*수정 아이디*/"
	+ "     , UPDT_DATE /*수정 일자*/"
	+ "     , USE_YN /*사용 여부*/"
	+ "  FROM USR_BASE"
	+ " WHERE 1=1"
	+ "   AND USR_BASE_SEQ = ?"
	;
	
	String USER_LIST =
	  "SELECT USR_BASE_SEQ /*유저기본시퀀스*/"
	+ "	    , USR_ID /*사용자 아이디*/"
	+ "     , USR_NM /*사용자 이름*/"
	+ "     , PASS_WD /*비밀번호*/"
	+ "     , USR_BIRTH /*생년월일*/"
	+ "     , EMAIL_ADDR /*이메일주소*/"
	+ "     , CELL_NO /*휴대폰번호*/"
	+ "     , LAND_ADDR_BASE /*지번 주소 기본*/"
	+ "     , LAND_ADDR_DTL /*지번 주소 상세*/"
	+ "     , LAND_POST_NO /*지번 우편 번호*/"
	+ "     , LOAD_ADDR_BASE /*도로 주소 기본*/"
	+ "     , LOAD_ADDR_DTL /*도로 주소 상세*/"
	+ "     , LOAD_POST_NO /*도로 우편 번호*/"
	+ "     , PASS_WD_CHG_DATE /*비밀번호변경일시*/"
	+ "     , LOCK_YN /*정지유무*/"
	+ "     , RGST_ID /*등록 아이디*/"
	+ "     , RGST_DATE /*등록 일자*/"
	+ "     , UPDT_ID /*수정 아이디*/"
	+ "     , UPDT_DATE /*수정 일자*/"
	+ "     , USE_YN /*사용 여부*/"
	+ "  FROM USR_BASE"
	+ " WHERE 1=1 "
//	+ " ORDER BY USR_BASE_SEQ ASC"
	;
	
	String USER_UPDATE =
	  "UPDATE USR_BASE "
	+ "   SET USR_NM = ? /*사용자 이름*/"
	+ "     , PASS_WD = ? /*비밀번호*/"
	+ "     , USR_BIRTH = ? /*생년월일*/"
	+ "     , EMAIL_ADDR = ? /*이메일주소*/"
	+ "     , CELL_NO = ? /*휴대폰번호*/"
	+ "     , LAND_ADDR_BASE = ? /*지번 주소 기본*/"
	+ "     , LAND_ADDR_DTL = ? /*지번 주소 상세*/"
	+ "     , LAND_POST_NO = ? /*지번 우편 번호*/"
	+ "     , LOAD_ADDR_BASE = ? /*도로 주소 기본*/"
	+ "     , LOAD_ADDR_DTL = ? /*도로 주소 상세*/"
	+ "     , LOAD_POST_NO = ? /*도로 우편 번호*/"
	+ "     , PASS_WD_CHG_DATE = ? /*비밀번호변경일시*/"
	+ "     , LOCK_YN = ? /*정지유무*/"
	+ "     , UPDT_ID = ? /*수정 아이디*/"
	+ "     , UPDT_DATE = ? /*수정 일자*/"
	+ "     , USE_YN = ? /*사용 여부*/"
	+ " WHERE 1=1"
	+ "   AND USR_BASE_SEQ = ?"
	;
	
	String USER_DELETE = 
	  "DELETE FROM USR_BASE"
	+ " WHERE 1=1 "
	+ "   AND USR_BASE_SEQ = ?"
	;
	
	String USER_DELETE_ALL = 
	  "DELETE FROM USR_BASE"
	;
	
	String USER_LOGIN =
	  "SELECT USR_BASE_SEQ /*유저기본시퀀스*/"
	+ "	    , USR_ID /*사용자 아이디*/"
	+ "     , USR_NM /*사용자 이름*/"
	+ "     , PASS_WD /*비밀번호*/"
	+ "     , USR_BIRTH /*생년월일*/"
	+ "     , EMAIL_ADDR /*이메일주소*/"
	+ "     , CELL_NO /*휴대폰번호*/"
	+ "     , LAND_ADDR_BASE /*지번 주소 기본*/"
	+ "     , LAND_ADDR_DTL /*지번 주소 상세*/"
	+ "     , LAND_POST_NO /*지번 우편 번호*/"
	+ "     , LOAD_ADDR_BASE /*도로 주소 기본*/"
	+ "     , LOAD_ADDR_DTL /*도로 주소 상세*/"
	+ "     , LOAD_POST_NO /*도로 우편 번호*/"
	+ "     , PASS_WD_CHG_DATE /*비밀번호변경일시*/"
	+ "     , LOCK_YN /*정지유무*/"
	+ "     , RGST_ID /*등록 아이디*/"
	+ "     , RGST_DATE /*등록 일자*/"
	+ "     , UPDT_ID /*수정 아이디*/"
	+ "     , UPDT_DATE /*수정 일자*/"
	+ "     , USE_YN /*사용 여부*/"
	+ "  FROM USR_BASE"
	+ " WHERE 1=1"
	+ "   AND USR_ID = ?"
	;
	
	String USER_DROP_SEQ = "DROP SEQUENCE SQ_USR_BASE_SEQ";
	
	String USER_CREATE_SEQ = "CREATE SEQUENCE SQ_USR_BASE_SEQ";
}
