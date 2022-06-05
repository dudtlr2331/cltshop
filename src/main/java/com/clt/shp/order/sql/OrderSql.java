package com.clt.shp.order.sql;

public interface OrderSql{
	String ORD_BASKET_SELECT =
	  "SELECT ORD.SALE_BOARD_SEQ"
	+ "		, SALE.GOODS_PRC"
	+ "		, SALE.GOODS_SALE_PRC"
	+ "		, GOODS.ENTR_NO"
	+ "		, GOODS.GOODS_NM"
	+ "		, GOODS.GOODS_CD"
	+ "		, GOODS.DLV_PRC"
	+ " FROM ORD_BASKET ORD"
	+ " , SALE_BOARD SALE"
	+ " , GOODS_INFO GOODS"
	+ " WHERE 1=1"
	+ " AND ORD.SALE_BOARD_SEQ = SALE.SALE_BOARD_SEQ"
	+ " AND ORD.GOODS_CD = GOODS.GOODS_CD"
	; 
	
	String SEARCH_ID_ORD_LIST =
	  "SELECT BASE.ORD_NO"
	+ "		, BASE.USR_ID"
	+ "		, BASE.ENTR_NO"
	+ "		, BASE.ORD_STAT"
	+ "		, BASE.ORDR_ID"
	+ "		, BASE.ORDR_NM"
	+ "		, BASE.ORDR_PHON"
	+ "		, BASE.ORDR_EMAIL"
	+ "		, BASE.ACQR_PHON"
	+ "		, BASE.ACQR_NM"
	+ "		, BASE.ACQR_ADDR"
	+ "		, BASE.ACQR_ADDR_DTL"
	+ "		, BASE.ACQR_EMAIL"
	+ "		, BASE.PRCL_WAY"
	+ "		, BASE.PACK_WAY"
	+ "		, BASE.PAY_WAY"
	+ "		, BASE.PAY_MNY"
	+ "		, BASE.REQ_MEMO"
	+ "		, BASE.ORD_DATE"
	+ "		, BASE.UPDT_DATE"
	+ "		, BASE.UPDT_ID"
	+ "		, BASE.RGST_DATE"
	+ "		, BASE.RGST_ID"
	+ "		, BASE.BILL_NUM"
	+ "		, DTL.ORD_DTL_NO"
	+ "		, DTL.GOODS_NM"
	+ "		, DTL.GOODS_CD"
	+ "		, DTL.GOODS_QTY"
	+ "		, STD.CODE_NM"
	+ "  FROM ORD_BASE BASE"
	+ "     , ORD_DTL DTL"
	+ "     , STD_CD_BASE STD"
	+ " WHERE 1=1"
	+ " AND BASE.USR_ID = DTL.USR_ID"
	+ " AND BASE.ORD_NO = DTL.ORD_NO"
	+ " AND BASE.ORD_STAT = STD.CODE_VAL"
	+ " AND STD.GRP_CD = 'STD004'"
	+ " AND BASE.USR_ID = ?"
	;
	
	String SEARCH_ORD_NO_LIST =
	  "SELECT BASE.ORD_NO"
	+ "		, BASE.USR_ID"
	+ "		, BASE.ENTR_NO"
	+ "		, BASE.ORD_STAT"
	+ "		, BASE.ORDR_ID"
	+ "		, BASE.ORDR_NM"
	+ "		, BASE.ORDR_PHON"
	+ "		, BASE.ORDR_EMAIL"
	+ "		, BASE.ACQR_PHON"
	+ "		, BASE.ACQR_NM"
	+ "		, BASE.ACQR_ADDR"
	+ "		, BASE.ACQR_ADDR_DTL"
	+ "		, BASE.ACQR_EMAIL"
	+ "		, BASE.PRCL_WAY"
	+ "		, BASE.PACK_WAY"
	+ "		, BASE.PAY_WAY"
	+ "		, BASE.PAY_MNY"
	+ "		, BASE.REQ_MEMO"
	+ "		, BASE.ORD_DATE"
	+ "		, BASE.UPDT_DATE"
	+ "		, BASE.UPDT_ID"
	+ "		, BASE.RGST_DATE"
	+ "		, BASE.RGST_ID"
	+ "		, BASE.BILL_NUM"
	+ "		, DTL.ORD_DTL_NO"
	+ "		, DTL.GOODS_NM"
	+ "		, DTL.GOODS_CD"
	+ "		, DTL.GOODS_QTY"
	+ "		, STD.CODE_NM"
	+ "  FROM ORD_BASE BASE"
	+ "     , ORD_DTL DTL"
	+ "     , STD_CD_BASE STD"
	+ " WHERE 1=1"
	+ " AND BASE.USR_ID = DTL.USR_ID"
	+ " AND BASE.ORD_NO = DTL.ORD_NO"
	+ " AND BASE.ORD_STAT = STD.CODE_VAL"
	+ " AND STD.GRP_CD = 'STD004'"
	+ " AND BASE.ORD_NO = ?"
	;
	
	String SEARCH_ORD_DTL_GOODS =
	  "SELECT GOODS_NM"
	+ "		, GOODS_CD"
	+ "		, GOODS_QTY"
	+ " FROM ORD_DTL"
	+ " WHERE 1=1"
	+ " AND USR_ID = ?"
	;
	
	String ORDER_INSERT = 
	  "INSERT INTO ORD_BASE"
	  + "( ORD_NO"
	  + ", USR_ID"
	  + ", ENTR_NO"
	  + ", ORD_STAT"
	  + ", ORDR_ID"
	  + ", ORDR_NM"
	  + ", ORDR_PHON"
	  + ", ORDR_EMAIL"
	  + ", ACQR_PHON"
	  + ", ACQR_NM"
	  + ", ACQR_ADDR"
	  + ", ACQR_ADDR_DTL"
	  + ", ACQR_EMAIL"
	  + ", PRCL_WAY"
	  + ", PACK_WAY"
	  + ", PAY_WAY"
	  + ", PAY_MNY"
	  + ", REQ_MEMO"
	  + ", ORD_DATE"
	  + ", UPDT_DATE"
	  + ", UPDT_ID"
	  + ", RGST_DATE"
	  + ", RGST_ID"
	  + ", BILL_NUM"
	  + ") VALUES"
	  + "( ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", ?"
	  + ", SYSDATE"
	  + ", SYSDATE"
	  + ", ?"
	  + ", SYSDATE"
	  + ", ?"
	  + ", ?"
	  + ")"
	;
	
	String ORDER_SELECT =
	  "SELECT ORD_NO"
	+ "		, USR_ID"
	+ "		, ENTR_NO"
	+ "		, ORD_STAT"
	+ "		, ORDR_ID"
	+ "		, ORDR_NM"
	+ "		, ORDR_PHON"
	+ "		, ORDR_EMAIL"
	+ "		, ACQR_PHON"
	+ "		, ACQR_NM"
	+ "		, ACQR_ADDR"
	+ "		, ACQR_ADDR_DTL"
	+ "		, ACQR_EMAIL"
	+ "		, PRCL_WAY"
	+ "		, PACK_WAY"
	+ "		, PAY_WAY"
	+ "		, PAY_MNY"
	+ "		, REQ_MEMO"
	+ "		, ORD_DATE"
	+ "		, UPDT_DATE"
	+ "		, UPDT_ID"
	+ "		, RGST_DATE"
	+ "		, RGST_ID"
	+ "		, BILL_NUM"
	+ " FROM  ORD_BASE"
	+ " WHERE 1=1"
	+ " AND ORD_NO = ?"
	;
	
	String ORDER_LIST =
      "SELECT BASE.ORD_NO"
	+ "		, BASE.USR_ID"
	+ "		, BASE.ENTR_NO"
	+ "		, BASE.ORD_STAT"
	+ "		, BASE.ORDR_ID"
	+ "		, BASE.ORDR_NM"
	+ "		, BASE.ORDR_PHON"
	+ "		, BASE.ORDR_EMAIL"
	+ "		, BASE.ACQR_PHON"
	+ "		, BASE.ACQR_NM"
	+ "		, BASE.ACQR_ADDR"
	+ "		, BASE.ACQR_ADDR_DTL"
	+ "		, BASE.ACQR_EMAIL"
	+ "		, BASE.PRCL_WAY"
	+ "		, BASE.PACK_WAY"
	+ "		, BASE.PAY_WAY"
	+ "		, BASE.PAY_MNY"
	+ "		, BASE.REQ_MEMO"
	+ "		, BASE.ORD_DATE"
	+ "		, BASE.UPDT_DATE"
	+ "		, BASE.UPDT_ID"
	+ "		, BASE.RGST_DATE"
	+ "		, BASE.RGST_ID"
	+ "		, BASE.BILL_NUM"
	+ "		, DTL.ORD_DTL_NO"
	+ "		, DTL.GOODS_NM"
	+ "		, DTL.GOODS_CD"
	+ "		, DTL.GOODS_QTY"
	+ "		, STD.CODE_NM"
	+ " FROM  ORD_BASE BASE"
	+ "	    , ORD_DTL DTL"
	+ "     , STD_CD_BASE STD"
	+ " WHERE 1=1"
	+ " AND BASE.ORD_NO = DTL.ORD_NO"
	+ " AND BASE.ORD_STAT = STD.CODE_VAL"
	+ " AND STD.GRP_CD = 'STD004'"
	;
	
	
	String ORDER_UPDATE =
	  "UPDATE ORD_BASE "
	+ "   SET USR_ID  = ?"
	+ "		, ENTR_NO  = ?"
	+ "		, ORD_STAT  = ?"
	+ "		, ORDR_ID  = ?"
	+ "		, ORDR_NM  = ?"
	+ "		, ORDR_PHON  = ?"
	+ "		, ORDR_EMAIL  = ?"
	+ "		, ACQR_PHON  = ?"
	+ "		, ACQR_NM  = ?"
	+ "		, ACQR_ADDR  = ?"
	+ "		, ACQR_ADDR_DTL  = ?"
	+ "		, ACQR_EMAIL  = ?"
	+ "		, PRCL_WAY  = ?"
	+ "		, PACK_WAY  = ?"
	+ "		, PAY_WAY  = ?"
	+ "		, PAY_MNY  = ?"
	+ "		, REQ_MEMO  = ?"
	+ "		, ORD_DATE  = SYSDATE"
	+ "		, UPDT_DATE  = SYSDATE"
	+ "		, UPDT_ID  = ?"
	+ "		, BILL_NUM = ?"
	+ " WHERE 1=1"
	+ " AND ORD_NO = ?"
	;

	String ORDER_DELETE = 
	  "DELETE FROM ORD_BASE"
	+ " WHERE 1=1 "
	+ " AND ORD_NO = ?"
	;
	
	String ORDER_DTL_INSERT = 
	  "INSERT INTO ORD_DTL"
	+ "( ORD_DTL_NO"
	+ ", USR_ID"
	+ ", ORD_NO"
	+ ", GOODS_NM"
	+ ", GOODS_CD"
	+ ", GOODS_QTY"
	+ ", UPDT_DATE"
	+ ", UPDT_ID"
	+ ", RGST_DATE"
	+ ", RGST_ID"
	+ ") VALUES"
	+ "( SQ_ORD_DTL_NO.NEXTVAL"
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
	
	String ORDER_DTL_SELECT =
	  "SELECT ORD_DTL_NO"
	+ "		, USR_ID"
	+ "		, ORD_NO"
	+ "		, GOODS_NM"
	+ "		, GOODS_CD"
	+ "		, GOODS_QTY"
	+ "		, UPDT_DATE"
	+ "		, UPDT_ID"
	+ "		, RGST_DATE"
	+ "		, RGST_ID"
	+ " FROM ORD_DTL"
	+ " WHERE 1=1"
	+ " AND ORD_NO = ?"
	;
	
	String ORDER_DTL_LIST =
	  "SELECT ORD_DTL_NO"
 	+ "		, USR_ID"
	+ "		, ORD_NO"
	+ "		, GOODS_NM"
	+ "		, GOODS_CD"
	+ "		, GOODS_QTY"
	+ "		, UPDT_DATE"
	+ "		, UPDT_ID"
	+ "		, RGST_DATE"
	+ "		, RGST_ID"
	+ " FROM ORD_DTL"
	+ " WHERE 1=1"
	;
	
	String ORDER_DTL_UPDATE =
	  "UPDATE ORD_DTL "
	+ "   SET USR_ID  = ?"
	+ "		, ORD_NO  = ?"
	+ "		, GOODS_NM  = ?"
	+ "		, GOODS_CD  = ?"
	+ "		, GOODS_QTY  = ?"
	+ "		, UPDT_DATE  = SYSDATE"
	+ "		, UPDT_ID  = ?"
	+ " WHERE 1=1"
	+ " AND ORD_DTL_NO = ?"
	;
	
	String ORDER_DTL_DELETE = 
      "DELETE FROM ORD_DTL"
	+ " WHERE 1=1 "
	+ " AND ORD_DTL_NO = ?"
	;

	String BASKET_INSERT =
	  "INSERT INTO ORD_BASKET "
	+ "( ORD_BASKET_SEQ"
	+ ", USR_ID"
	+ ", GOODS_QTY"
    + ", GOODS_CD"
	+ ", ENTR_NO"
	+ ", RGST_DATE"
	+ ", USE_YN"
	+ ", SALE_BOARD_SEQ"
	+ ") VALUES"
	+ "( SQ_ORD_BASKET_SEQ.NEXTVAL"
	+ ", ?"
    + ", ?"
	+ ", ?"
	+ ", ?"
	+ ", SYSDATE"
	+ ", 'Y'"
	+ ", ?"
	+ ")"
	;

	String BASKET_DELETE =
	  "DELETE FROM ORD_BASKET WHERE ORD_BASKET_SEQ = ?"
	;
	
	String BASKET_LIST = 
	 " SELECT BSKT.ORD_BASKET_SEQ"
	+ "     , BSKT.USR_ID"
	+ "     , BSKT.GOODS_QTY"
	+ "     , BSKT.SALE_BOARD_SEQ /*판매게시판시퀀스*/"
	+ "     , GODS.IMG_PATH /*상품이미지경로*/"
	+ "     , GODS.IMG_NM /*상품이미지이름*/"
	+ "     , SALE.BUL_TIT_NM /*제목*/"
	+ "     , SALE.GOODS_CD /*상품 코드*/"
	+ "     , SALE.ENTR_NO /*거래처 번호*/"
	+ "     , SALE.GOODS_PRC /*상품 가격*/"
	+ "     , SALE.GOODS_SALE_PRC /*상품 할인 가격*/"
	+ "     , SALE.SALE_CNT /*판매 수량*/"
	+ "     , SALE.SALE_STAT_CD /*판매 상태 코드*/"
	+ "     , SALE.DESCRIPTION /*설명*/"
	+ "  FROM ORD_BASKET BSKT"
	+ "     , GOODS_INFO GODS"
	+ "	    , SALE_BOARD SALE"
	+ " WHERE 1=1"
	+ "   AND BSKT.GOODS_CD = GODS.GOODS_CD"
	+ "   AND BSKT.SALE_BOARD_SEQ = SALE.SALE_BOARD_SEQ"
	+ "   AND BSKT.USE_YN = 'Y'"
	+ "   AND BSKT.USR_ID = ?"
	;

	String BASKET_UPDATE =
	  "UPDATE ORD_BASKET "
	+ "   SET USE_YN  = 'N'"
	+ " WHERE 1=1"
	+ " AND ORD_BASKET_SEQ = ?"
	;
}