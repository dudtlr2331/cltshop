package com.clt.shp.qna.sql;

public interface QnaSql {
			String QNA_INSERT = 
			  "INSERT INTO QNA_BOARD"
		    + "( QNA_BOARD_SEQ /*시퀀스*/"
		    + ", TIT_NM"
		    + ", CONT"
		    + ", RGST_ID"
		    + ", RGST_DATE"
		    + ", UPDT_ID"
		    + ", UPDT_DATE"
		    + ", QNA_TP"
		    + ", ANSR_STAT"
		    + ", USE_YN"
		    + ", PASS_YN "
		    + ", PASS_WD"
		    + ") VALUES"
		    + "( SQ_QNA_BOARD_SEQ.nextval /*시퀀스*/"
		    + ", ?"
		    + ", ?"
		    + ", ?"
		    + ", SYSDATE"
		    + ", ?"
		    + ", SYSDATE"
		    + ", ?"
		    + ", ?"
		    + ", ?"
		    + ", ?"
		    + ", ?"
		    + ")"
			;
			
			String QNA_SELECT =
			  "SELECT QNA_BOARD_SEQ"
			+ "	    , TIT_NM "
			+ "     , CONT"
			+ "     , RGST_ID"
			+ "     , RGST_DATE"
			+ "     , UPDT_ID"
			+ "     , UPDT_DATE"
			+ "     , QNA_TP"
			+ "     , ANSR_STAT"
			+ "     , USE_YN"
			+ "     , PASS_YN"
			+ "     , PASS_WD"
			+ " FROM QNA_BOARD"
			+ " WHERE 1=1"
			+ " AND QNA_BOARD_SEQ = ?"
			;
			
			String QNA_LIST =
			  "SELECT QNA_BOARD_SEQ"
			+ "	    , TIT_NM "
			+ "     , CONT"
			+ "     , RGST_ID"
			+ "     , RGST_DATE"
			+ "     , UPDT_ID"
			+ "     , UPDT_DATE"
			+ "     , QNA_TP"
			+ "     , ANSR_STAT"
			+ "     , USE_YN"
			+ "     , PASS_YN"
			+ "     , PASS_WD"
			+ " FROM QNA_BOARD"
			+ " WHERE 1=1 "
			+ " ORDER BY QNA_BOARD_SEQ ASC"
			;
			
			String QNA_UPDATE =
			  "UPDATE QNA_BOARD "
			+ "   SET TIT_NM = ?"
			+ "     , CONT = ?"
			+ "     , UPDT_ID = ?"
			+ "     , UPDT_DATE = ?"
			+ "     , QNA_TP = ?"
			+ "     , ANSR_STAT = ?"
			+ "     , USE_YN = ?"
			+ "     , PASS_YN = ?"
			+ "     , PASS_WD = ?"
			+ " WHERE 1=1"
			+ "   AND QNA_BOARD_SEQ = ?"
			;
			
			String QNA_DELETE = 
			  "DELETE FROM QNA_BOARD "
			+ " WHERE 1=1 "
			+ "  AND QNA_BOARD_SEQ = ?"
			;
}
