package com.clt.shp.entr.sql;

public interface EntrSql {
	String ENTR_INSERT = 
	  "INSERT INTO ENTR_BASE"
	+ "( ENTR_NO"			/*거래처 번호*/
	+ ", USR_ID" 			/*유저 아이디*/
	+ ", ENTR_NM" 			/*거래처명*/
	+ ", BMAN_REG_NO" 		/*사업자등록번호*/
	+ ", PRES_NM" 			/*대표자명*/
	+ ", PRES_TELL" 		/*대표자번호*/
	+ ", PRES_EMAIL" 		/*대표자메일*/
	+ ", AEMP_NM" 			/*담당자명*/
	+ ", AEMP_TELL" 		/*담당자번호*/
	+ ", AEMP_EMAIL" 		/*담당자메일*/
	+ ", SCORE" 			/*평점*/
	+ ", LAND_ADDR_BASE" 	/*지번 주소 기본*/
	+ ", LAND_ADDR_DTL" 	/*지번 주소 상세*/
	+ ", LAND_POST_NO" 		/*지번 우편 번호*/
	+ ", LOAD_ADDR_BASE" 	/*도로 주소 기본*/
	+ ", LOAD_POST_NO" 		/*도로 우편 번호*/
	+ ", OPN_DATE" 			/*개점일*/
	+ ", CLOSE_DATE" 		/*폐점일*/
	+ ", OPN_YN" 			/*오픈여부*/
	+ ", USE_YN" 			/*사용 여부*/
	+ ", RGST_ID" 			/*등록 아이디*/
	+ ", RGST_DATE" 		/*등록 일자*/
	+ ", UPDT_ID" 			/*수정 아이디*/
	+ ", UPDT_DATE" 		/*수정 일자*/
	+ ") VALUES"
	+ "( SQ_ENTR_BASE_SEQ.NEXTVAL" 	/*거래처 번호*/
	+ ", ?"				 			/*유저명*/
	+ ", ?"				 			/*거래처명*/
	+ ", ?" 						/*사업자등록번호*/
	+ ", ?" 						/*대표자명*/
	+ ", ?" 						/*대표자번호*/
	+ ", ?" 						/*대표자메일*/
	+ ", ?" 						/*담당자명*/
	+ ", ?" 						/*담당자번호*/
	+ ", ?" 						/*담당자메일*/
	+ ", ?" 						/*평점*/
	+ ", ?" 						/*지번 주소 기본*/
	+ ", ?" 						/*지번 주소 상세*/
	+ ", ?" 						/*지번 우편 번호*/
	+ ", ?" 						/*도로 주소 기본*/
	+ ", ?" 						/*도로 우편 번호*/
	+ ", ?" 						/*개점일*/
	+ ", ?" 						/*폐점일*/
	+ ", ?" 						/*오픈여부*/
	+ ", ?" 						/*사용 여부*/
	+ ", ?" 						/*등록 아이디*/
	+ ", SYSDATE" 					/*등록 일자*/
	+ ", ?" 						/*수정 아이디*/
	+ ", SYSDATE" 					/*수정 일자*/
	+ ")"
	;
	
	String ENTR_SELECT =
	  "SELECT ENTR_NO" 			/*거래처 번호*/
	+ "     , USR_ID" 			/*유저명*/
	+ "     , ENTR_NM" 			/*거래처명*/
	+ "     , BMAN_REG_NO" 		/*사업자등록번호*/
	+ "     , PRES_NM" 			/*대표자명*/
	+ "     , PRES_TELL" 		/*대표자번호*/
	+ "     , PRES_EMAIL" 		/*대표자메일*/
	+ "     , AEMP_NM" 			/*담당자명*/
	+ "     , AEMP_TELL"	 	/*담당자번호*/
	+ "     , AEMP_EMAIL" 		/*담당자메일*/
	+ "     , SCORE" 			/*평점*/
	+ "     , LAND_ADDR_BASE" 	/*지번 주소 기본*/
	+ "     , LAND_ADDR_DTL" 	/*지번 주소 상세*/
	+ "     , LAND_POST_NO" 	/*지번 우편 번호*/
	+ "     , LOAD_ADDR_BASE" 	/*도로 주소 기본*/
	+ "     , LOAD_POST_NO" 	/*도로 우편 번호*/
	+ "     , OPN_DATE" 		/*개점일*/
	+ "     , CLOSE_DATE" 		/*폐점일*/
	+ "     , OPN_YN" 			/*오픈여부*/
	+ "     , USE_YN" 			/*사용 여부*/
	+ "     , RGST_ID" 			/*등록 아이디*/
	+ "     , RGST_DATE" 		/*등록 일자*/
	+ "     , UPDT_ID" 			/*수정 아이디*/
	+ "     , UPDT_DATE" 		/*수정 일자*/
	+ "  FROM ENTR_BASE"
	+ " WHERE 1=1"
	+ "   AND ENTR_NO = ?"
	;
	
	String ENTR_SELECT_LIST =
	  "SELECT ENTR_NO" 			/*거래처 번호*/
	+ "     , USR_ID" 			/*유저명*/
	+ "     , ENTR_NM" 			/*거래처명*/
	+ "     , BMAN_REG_NO" 		/*사업자등록번호*/
	+ "     , PRES_NM" 			/*대표자명*/
	+ "     , PRES_TELL" 		/*대표자번호*/
	+ "     , PRES_EMAIL" 		/*대표자메일*/
	+ "     , AEMP_NM" 			/*담당자명*/
	+ "     , AEMP_TELL"		/*담당자번호*/
	+ "     , AEMP_EMAIL" 		/*담당자메일*/
	+ "     , SCORE" 			/*평점*/
	+ "     , LAND_ADDR_BASE" 	/*지번 주소 기본*/
	+ "     , LAND_ADDR_DTL" 	/*지번 주소 상세*/
	+ "     , LAND_POST_NO" 	/*지번 우편 번호*/
	+ "     , LOAD_ADDR_BASE" 	/*도로 주소 기본*/
	+ "     , LOAD_POST_NO" 	/*도로 우편 번호*/
	+ "     , OPN_DATE" 		/*개점일*/
	+ "     , CLOSE_DATE" 		/*폐점일*/
	+ "     , OPN_YN" 			/*오픈여부*/
	+ "     , USE_YN" 			/*사용 여부*/
	+ "     , RGST_ID" 			/*등록 아이디*/
	+ "     , RGST_DATE" 		/*등록 일자*/
	+ "     , UPDT_ID" 			/*수정 아이디*/
	+ "     , UPDT_DATE" 		/*수정 일자*/
	+ "  FROM ENTR_BASE"
	+ " WHERE 1=1"
	;
	
	String ENTR_UPDATE = 
	 "UPDATE ENTR_BASE"
	+ "  SET USR_ID = ?" 			/*유저명*/
	+ "    , ENTR_NM = ?" 			/*거래처명*/
	+ "    , BMAN_REG_NO = ?" 		/*사업자등록번호*/
	+ "    , PRES_NM = ?" 			/*대표자명*/
	+ "    , PRES_TELL = ?" 		/*대표자번호*/
	+ "    , PRES_EMAIL = ?" 		/*대표자메일*/
	+ "    , AEMP_NM = ?" 			/*담당자명*/
	+ "    , AEMP_TELL = ?" 		/*담당자번호*/
	+ "    , AEMP_EMAIL = ?" 		/*담당자메일*/
	+ "    , SCORE = ?" 			/*평점*/
	+ "    , LAND_ADDR_BASE = ?" 	/*지번 주소 기본*/
	+ "    , LAND_ADDR_DTL = ?" 	/*지번 주소 상세*/
	+ "    , LAND_POST_NO = ?" 		/*지번 우편 번호*/
	+ "    , LOAD_ADDR_BASE = ?" 	/*도로 주소 기본*/
	+ "    , LOAD_POST_NO = ?" 		/*도로 우편 번호*/
	+ "    , OPN_DATE = ?" 			/*개점일*/
	+ "    , CLOSE_DATE = ?" 		/*폐점일*/
	+ "    , OPN_YN = ?" 			/*오픈여부*/
	+ "    , USE_YN = ?" 			/*사용 여부*/
	+ "    , UPDT_ID = ?" 			/*수정 아이디*/
	+ "    , UPDT_DATE = SYSDATE " 	/*수정 일자*/
	+ "WHERE 1=1"
	+ "  AND ENTR_NO = ?" 	/*업체 시퀀스*/
	;
	
	String ENTR_DELETE = 
	 "DELETE FROM ENTR_BASE "
	+ "WHERE 1=1"
	+ " AND ENTR_NO = ?" /*업체 시퀀스*/
	;
	
	String ENTR_DELETE_ALL = 
	 "DELETE FROM ENTR_BASE "
	;
	
	String ENTR_DROP_SEQ =
	"DROP SEQUENCE SQ_ENTR_BASE_SEQ"
	;
	
	String ENTR_CREATE_SEQ =
	"CREATE SEQUENCE SQ_ENTR_BASE_SEQ"
	;
}
