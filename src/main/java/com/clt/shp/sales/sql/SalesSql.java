package com.clt.shp.sales.sql;

public interface SalesSql {

    String SALE_INSERT = "" +
    "INSERT INTO SALE_BOARD" +
    "( SALE_BOARD_SEQ /*판매게시판시퀀스*/" +
    ", GOODS_CD /*상품 코드*/" +
    ", ENTR_NO /*거래처 번호*/" +
    ", NTC_SCT_CD /*공지구분코드*/" +
    ", BUL_YN /*게시여부*/" +
    ", BUL_STRT_DT /*게시시작일자*/" +
    ", BUL_END_DT /*게시종료일자*/" +
    ", BUL_TIT_NM /*게시글 제목명*/" +
    ", BUL_CONT /*게시글 내용*/" +
    ", QRY_CNT /*조회수*/" +
    ", LKE_CNT /*추천수*/" +
    ", GOODS_PRC /*상품 가격*/" +
    ", GOODS_SALE_PRC /*상품 할인 가격*/" +
    ", PRCL_WAY /*배송 방법*/" +
    ", SALE_CNT /*판매 수량*/" +
    ", RGST_ID /*등록 아이디*/" +
    ", RGST_DATE /*등록 일자*/" +
    ", UPDT_ID /*수정 아이디*/" +
    ", UPDT_DATE /*수정 일자*/" +
    ", SALE_STAT_CD /*판매 상태 코드*/" +
    ", USE_YN /*사용 여부*/" +
    ", DESCRIPTION /*설명*/" +
    ") VALUES" +
    "( SQ_SALE_BOARD_SEQ.NEXTVAL /*판매게시판시퀀스*/" +
    ", ? /*상품 코드*/" +
    ", ? /*거래처 번호*/" +
    ", ? /*공지구분코드*/" +
    ", ? /*게시여부*/" +
    ", ? /*게시시작일자*/" +
    ", ? /*게시종료일자*/" +
    ", ? /*게시글 제목명*/" +
    ", ? /*게시글 내용*/" +
    ", ? /*조회수*/" +
    ", ? /*추천수*/" +
    ", ? /*상품 가격*/" +
    ", ? /*상품 할인 가격*/" +
    ", ? /*배송 방법*/" +
    ", ? /*판매 수량*/" +
    ", ? /*등록 아이디*/" +
    ", SYSDATE /*등록 일자*/" +
    ", ? /*수정 아이디*/" +
    ", SYSDATE /*수정 일자*/" +
    ", ? /*판매 상태 코드*/" +
    ", 'Y' /*사용 여부*/" +
    ", ? /*설명*/" +
    ")";

    String SALE_SELECT = "" +
    "SELECT SALE_BOARD_SEQ /*판매게시판시퀀스*/" +
    "     , GOODS_CD /*상품 코드*/" +
    "     , ENTR_NO /*거래처 번호*/" +
    "     , NTC_SCT_CD /*공지구분코드*/" +
    "     , BUL_YN /*게시여부*/" +
    "     , BUL_STRT_DT /*게시시작일자*/" +
    "     , BUL_END_DT /*게시종료일자*/" +
    "     , BUL_TIT_NM /*게시글 제목명*/" +
    "     , BUL_CONT /*게시글 내용*/" +
    "     , QRY_CNT /*조회수*/" +
    "     , LKE_CNT /*추천수*/" +
    "     , GOODS_PRC /*상품 가격*/" +
    "     , GOODS_SALE_PRC /*상품 할인 가격*/" +
    "     , PRCL_WAY /*배송 방법*/" +
    "     , SALE_CNT /*판매 수량*/" +
    "     , RGST_ID /*등록 아이디*/" +
    "     , RGST_DATE /*등록 일자*/" +
    "     , UPDT_ID /*수정 아이디*/" +
    "     , UPDT_DATE /*수정 일자*/" +
    "     , SALE_STAT_CD /*판매 상태 코드*/" +
    "     , USE_YN /*사용 여부*/" +
    "     , DESCRIPTION /*설명*/" +
    "  FROM SALE_BOARD" +
    " WHERE 1=1 " +
    "   AND SALE_BOARD_SEQ = ? "
    ;

    String SALE_SELECT_LIST = "" +
    "SELECT SALE_BOARD_SEQ /*판매게시판시퀀스*/" +
    "     , GOODS_CD /*상품 코드*/" +
    "     , ENTR_NO /*거래처 번호*/" +
    "     , NTC_SCT_CD /*공지구분코드*/" +
    "     , BUL_YN /*게시여부*/" +
    "     , BUL_STRT_DT /*게시시작일자*/" +
    "     , BUL_END_DT /*게시종료일자*/" +
    "     , BUL_TIT_NM /*게시글 제목명*/" +
    "     , BUL_CONT /*게시글 내용*/" +
    "     , QRY_CNT /*조회수*/" +
    "     , LKE_CNT /*추천수*/" +
    "     , GOODS_PRC /*상품 가격*/" +
    "     , GOODS_SALE_PRC /*상품 할인 가격*/" +
    "     , PRCL_WAY /*배송 방법*/" +
    "     , SALE_CNT /*판매 수량*/" +
    "     , RGST_ID /*등록 아이디*/" +
    "     , RGST_DATE /*등록 일자*/" +
    "     , UPDT_ID /*수정 아이디*/" +
    "     , UPDT_DATE /*수정 일자*/" +
    "     , SALE_STAT_CD /*판매 상태 코드*/" +
    "     , USE_YN /*사용 여부*/" +
    "     , DESCRIPTION /*설명*/" +
    "  FROM SALE_BOARD" +
    " WHERE 1=1 "
    ;

    String SALE_UPDATE = "" +
    "UPDATE SALE_BOARD" +
    "   SET GOODS_CD = ? /*상품 코드*/" +
    "     , ENTR_NO = ? /*거래처 번호*/" +
    "     , NTC_SCT_CD = ? /*공지구분코드*/" +
    "     , BUL_YN = ? /*게시여부*/" +
    "     , BUL_STRT_DT = ? /*게시시작일자*/" +
    "     , BUL_END_DT = ? /*게시종료일자*/" +
    "     , BUL_TIT_NM = ? /*게시글 제목명*/" +
    "     , BUL_CONT = ? /*게시글 내용*/" +
    "     , QRY_CNT = ? /*조회수*/" +
    "     , LKE_CNT = ? /*추천수*/" +
    "     , GOODS_PRC = ? /*상품 가격*/" +
    "     , GOODS_SALE_PRC = ? /*상품 할인 가격*/" +
    "     , PRCL_WAY = ? /*배송 방법*/" +
    "     , SALE_CNT = ? /*판매 수량*/" +
    "     , UPDT_ID = ? /*수정 아이디*/" +
    "     , UPDT_DATE = SYSDATE /*수정 일자*/" +
    "     , SALE_STAT_CD = ? /*판매 상태 코드*/" +
    "     , USE_YN = ? /*사용 여부*/" +
    "     , DESCRIPTION = ? /*설명*/" +
    " WHERE 1=1" +
    "   AND SALE_BOARD_SEQ = ?"
    ;

    String SALE_DELETE = "" +
    "DELETE FROM SALE_BOARD WHERE SALE_BOARD_SEQ = ?";

    String SALE_DELETE_ALL = "" +
    "DELETE FROM SALE_BOARD";
    
    String SALE_DROP_SEQ =
	"DROP SEQUENCE SQ_SALE_BOARD_SEQ"
	;
    
    String SALE_CREATE_SEQ =
	"CREATE SEQUENCE SQ_SALE_BOARD_SEQ"
	;
}
