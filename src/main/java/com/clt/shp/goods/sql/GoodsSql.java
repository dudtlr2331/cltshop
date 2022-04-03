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
	+ " ORDER BY GOODS_INFO_SEQ ASC"
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
	
	String GOODS_DELETE = 
	  "DELETE FROM GOODS_INFO "
	+ " WHERE 1=1 "
	+ "  AND GOODS_INFO_SEQ = ?" /*상품 시퀀스*/
	;
	
}