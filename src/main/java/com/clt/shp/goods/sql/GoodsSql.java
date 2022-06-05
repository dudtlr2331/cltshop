package com.clt.shp.goods.sql;

public interface GoodsSql{
	String GOODS_INSERT = 
	  "INSERT INTO GOODS_INFO"
	  + "( GOODS_INFO_SEQ" /*상품 시퀀스*/
	  + ", GOODS_CD" /*상품 코드*/
	  + ", ENTR_NO" /*거래처 번호*/
	  + ", GOODS_NM" /*상품이름*/
	  + ", GOODS_PRC" /*상품가격*/
	  + ", CATGRY_CD" /*대분류*/
	  + ", CATGRY_CD2" /*소분류*/
	  + ", INY_QTY" /*재고수량*/
	  + ", DLV_PRC" /*배송비*/
	  + ", GOODS_SIZE" /*상품싸이즈*/
	  + ", GOODS_CLR" /*상품컬러*/
	  + ", IMG_PATH" /*이미지경로*/
	  + ", IMG_NM" /*이미지이름*/
	  + ", GOODS_INTR" /*상품소개*/
	  + ", SALE_STAT_CD" /*판매상태*/
	  + ", USE_YN" /*사용여부*/
	  + ", RGST_ID" /*등록자*/
	  + ", RGST_DATE" /*등록일*/
	  + ", UPDT_ID" /*수정자*/
	  + ", UPDT_DATE" /*수정일*/
	  + ") VALUES"
	  + "( SQ_GOODS_INFO_SEQ.NEXTVAL" /*상품 시퀀스*/
	  + ", (SELECT NVL(MAX(GOODS_CD),0)+1 FROM GOODS_INFO)" /*상품 코드*/
	  + ", ?" /*거래처 번호*/
	  + ", ?" /*상품이름*/
	  + ", ?" /*상품가격*/
	  + ", ?" /*대분류*/
	  + ", ?" /*소분류*/
	  + ", ?" /*재고수량*/
	  + ", ?" /*배송비*/
	  + ", ?" /*상품싸이즈*/
	  + ", ?" /*상품컬러*/
	  + ", ?" /*이미지경로*/
	  + ", ?" /*이미지이름*/
	  + ", ?" /*상품소개*/
	  + ", ?" /*판매상태*/
	  + ", ?" /*사용여부*/
	  + ", ?" /*등록자*/
	  + ", ?" /*등록일*/
	  + ", ?" /*수정자*/
	  + ", ?" /*수정일*/
	  + ")"
	;
	
	String GOODS_SELECT =
	  "SELECT GOODS_INFO_SEQ" /*상품 시퀀스*/
	+ "	    , GOODS_CD" /*상품 코드*/
	+ "	    , ENTR_NO" /*거래처 번호*/
	+ "	    , GOODS_NM" /*상품이름*/
	+ "	    , GOODS_PRC" /*상품가격*/
	+ "	    , CATGRY_CD" /*대분류*/
	+ "	    , CATGRY_CD2" /*소분류*/
	+ "	    , INY_QTY" /*재고수량*/
	+ "	    , DLV_PRC" /*배송비*/
	+ "	    , GOODS_SIZE" /*상품싸이즈*/
	+ "	    , GOODS_CLR" /*상품컬러*/
	+ "	    , IMG_PATH" /*이미지경로*/
	+ "	    , IMG_NM" /*이미지이름*/
	+ "	    , GOODS_INTR" /*상품소개*/
	+ "	    , SALE_STAT_CD" /*판매상태*/
	+ "	    , USE_YN" /*사용여부*/
	+ "	    , RGST_ID" /*등록자*/
	+ "	    , RGST_DATE" /*등록일*/
	+ "	    , UPDT_ID" /*수정자*/
	+ "	    , UPDT_DATE" /*수정일*/
	+ "  FROM GOODS_INFO"
	+ " WHERE 1=1"
	+ "   AND GOODS_INFO_SEQ = ?"
	;
	
	String GOODS_LIST =
	  "SELECT GOODS_INFO_SEQ" /*상품 시퀀스*/
	+ "	    , GOODS_CD" /*상품 코드*/
	+ "	    , ENTR_NO" /*거래처 번호*/
	+ "	    , GOODS_NM" /*상품이름*/
	+ "	    , GOODS_PRC" /*상품가격*/
	+ "	    , CATGRY_CD" /*대분류*/
	+ "	    , CATGRY_CD2" /*소분류*/
	+ "	    , INY_QTY" /*재고수량*/
	+ "	    , DLV_PRC" /*배송비*/
	+ "	    , GOODS_SIZE" /*상품싸이즈*/
	+ "	    , GOODS_CLR" /*상품컬러*/
	+ "	    , IMG_PATH" /*이미지경로*/
	+ "	    , IMG_NM" /*이미지이름*/
	+ "	    , GOODS_INTR" /*상품소개*/
	+ "	    , SALE_STAT_CD" /*판매상태*/
	+ "	    , USE_YN" /*사용여부*/
	+ "	    , RGST_ID" /*등록자*/
	+ "	    , RGST_DATE" /*등록일*/
	+ "	    , UPDT_ID" /*수정자*/
	+ "	    , UPDT_DATE" /*수정일*/
	+ "  FROM GOODS_INFO"
	+ " WHERE 1=1"
	;
	
	String GOODS_UPDATE =
	  "UPDATE GOODS_INFO "
	+ "   SET GOODS_CD = ?" /*상품 코드*/
	+ "     , ENTR_NO = ?" /*거래처 번호*/
	+ "     , GOODS_NM = ?" /*상품이름*/
	+ "     , GOODS_PRC = ?" /*상품가격*/
	+ "     , CATGRY_CD = ?" /*대분류*/
	+ "     , CATGRY_CD2 = ?" /*소분류*/
	+ "     , INY_QTY = ?" /*재고수량*/
	+ "     , DLV_PRC = ?" /*배송비*/
	+ "     , GOODS_SIZE = ?" /*상품싸이즈*/
	+ "     , GOODS_CLR = ?" /*상품컬러*/
	+ "     , IMG_PATH = ?" /*이미지경로*/
	+ "     , IMG_NM = ?" /*이미지이름*/
	+ "     , GOODS_INTR = ?" /*상품소개*/
	+ "     , SALE_STAT_CD = ?" /*판매상태*/
	+ "     , USE_YN = ?" /*사용여부*/
	+ "     , RGST_ID = ?" /*등록자*/
	+ "     , RGST_DATE = ?" /*등록일*/
	+ "     , UPDT_ID = ?" /*수정자*/
	+ "     , UPDT_DATE = ?" /*수정일*/
	+ " WHERE 1=1"
	+ "   AND GOODS_INFO_SEQ = ?"
	;
	
	String GOODS_DETAIL_ONE =
	 "SELECT GOODS.GOODS_CD"
	+"     , GOODS.ENTR_NO"
	+"     , GOODS.GOODS_NM"
	+"     , GOODS.GOODS_PRC"
	+"     , GOODS.INY_QTY"
	+"     , GOODS.DLV_PRC"
	+"     , GOODS.GOODS_SIZE"
	+"     , GOODS.GOODS_CLR"
	+"     , GOODS.IMG_PATH"
	+"     , GOODS.IMG_NM"
	+"     , GOODS.GOODS_INTR"
	+"     , GOODS.SALE_STAT_CD"
	+"     , GOODS.USE_YN"
	+"     , GOODS.RGST_ID"
	+"     , GOODS.RGST_DATE"
	+"     , GOODS.UPDT_ID"
	+"     , GOODS.UPDT_DATE"
	+"     , SALE.SALE_BOARD_SEQ"
	+"     , SALE.SALE_STAT_CD"
	+"     , SALE.BUL_TIT_NM"
	+"     , SALE.BUL_STRT_DT"
	+"     , SALE.BUL_END_DT"
	+"     , SALE.BUL_YN"
	+"     , SALE.NTC_SCT_CD"
	+"     , SALE.BUL_CONT"
	+"     , SALE.QRY_CNT"
	+"     , SALE.LKE_CNT"
	+"     , SALE.GOODS_PRC"
	+"     , SALE.GOODS_SALE_PRC"
	+"     , SALE.PRCL_WAY"
	+"     , SALE.SALE_CNT"
	+"     , SALE.RGST_ID"
	+"     , SALE.RGST_DATE"
	+"     , SALE.UPDT_ID"
	+"     , SALE.UPDT_DATE"
	+"     , SALE.USE_YN"
	+"     , SALE.DESCRIPTION"
	+"  FROM SALE_BOARD SALE"
	+"     , GOODS_INFO GOODS"
	+" WHERE 1=1"
	+"   AND SALE.GOODS_CD = GOODS.GOODS_CD"
	+"   AND SALE.ENTR_NO = GOODS.ENTR_NO"
	+"   AND SALE.SALE_BOARD_SEQ = ?"
	;
	
	String SELECT_MYPAGE_GOODS_ONE =
	 "SELECT GOODS.GOODS_CD"
	+"     , GOODS.ENTR_NO"
	+"     , GOODS.GOODS_NM"
	+"     , GOODS.GOODS_PRC"
	+"     , GOODS.INY_QTY"
	+"     , GOODS.DLV_PRC"
	+"     , GOODS.GOODS_SIZE"
	+"     , GOODS.GOODS_CLR"
	+"     , GOODS.IMG_PATH"
	+"     , GOODS.IMG_NM"
	+"     , GOODS.GOODS_INTR"
	+"     , GOODS.SALE_STAT_CD"
	+"     , GOODS.USE_YN"
	+"     , GOODS.RGST_ID"
	+"     , GOODS.RGST_DATE"
	+"     , GOODS.UPDT_ID"
	+"     , GOODS.UPDT_DATE"
	+"     , SALE.SALE_BOARD_SEQ"
	+"     , SALE.SALE_STAT_CD"
	+"     , SALE.BUL_TIT_NM"
	+"     , SALE.BUL_STRT_DT"
	+"     , SALE.BUL_END_DT"
	+"     , SALE.BUL_YN"
	+"     , SALE.NTC_SCT_CD"
	+"     , SALE.BUL_CONT"
	+"     , SALE.QRY_CNT"
	+"     , SALE.LKE_CNT"
	+"     , SALE.GOODS_PRC"
	+"     , SALE.GOODS_SALE_PRC"
	+"     , SALE.PRCL_WAY"
	+"     , SALE.SALE_CNT"
	+"     , SALE.RGST_ID"
	+"     , SALE.RGST_DATE"
	+"     , SALE.UPDT_ID"
	+"     , SALE.UPDT_DATE"
	+"     , SALE.USE_YN"
	+"     , SALE.DESCRIPTION"
	+"  FROM SALE_BOARD SALE"
	+"     , GOODS_INFO GOODS"
	+" WHERE 1=1"
	+"   AND SALE.GOODS_CD = GOODS.GOODS_CD"
	+"   AND SALE.ENTR_NO = GOODS.ENTR_NO"
	+"   AND SALE.GOODS_CD = ?"
	;

	String GOODS_DELETE =
	"DELETE FROM GOODS_INFO "
	+ " WHERE 1=1 "
	+ "  AND GOODS_INFO_SEQ = ?" /*상품 시퀀스*/
	;

	String GOODS_DELETE_ALL =
	"DELETE FROM GOODS_INFO "
	;
	
	String GOODS_DROP_SEQ =
	"DROP SEQUENCE SQ_GOODS_INFO_SEQ"
	;
	
	String GOODS_CREATE_SEQ =
	"CREATE SEQUENCE SQ_GOODS_INFO_SEQ"
	;
}