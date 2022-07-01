package com.clt.shp.mypage.sql;

public interface MypgSql {
    String SELECT_LIST_MYPG =
    "SELECT ordb.ORD_NO /*주문번호*/"
	+"    , ordb.RGST_DATE /*주문일자*/"
    +"    , ordb.ORDR_ID /*주문자 아이디*/"
    +"    , ordb.ORDR_NM /*주문자 이름*/"
    +"    , ordb.ORDR_PHON /*주문자 폰번호*/"
    +"    , ordb.PAY_MNY /*결제금액*/"
    +"    , good.IMG_PATH /*이미지 경로*/"
    +"    , good.IMG_NM /*이미지 이름*/"
    +"    , sale.BUL_TIT_NM /*판매게시판 제목*/"
    +"    , ordt.GOODS_QTY /*수량*/"
    +"    , good.GOODS_PRC /*상품금액*/"
    +"    , ordb.ORD_STAT /*주문상태코드*/"
    +"    , std004.CODE_NM /*주문상태코드이름*/"
    +"    , ordb.PAY_WAY /*결제수단*/"
    +"    , good.DLV_PRC /*배송비*/"
    +"    , ordb.ACQR_NM /*수령자 이름*/"
    +"    , ordb.ACQR_PHON /*수령자 휴대폰*/"
    +"    , ordb.ACQR_ADDR /*수령지 주소*/"
    +"    , ordb.ACQR_ADDR_DTL /*수령지 상세 주소*/"
    +"    , ordb.REQ_MEMO /*배송메모*/"
    +"    , SALERVW.SALE_BOARD_RPY_SEQ /*리뷰시퀀스*/"
    +" FROM ORD_BASE ordb"
    +" INNER JOIN ORD_DTL ORDT ON ORDB.ORD_NO = ORDT.ORD_NO"
    +" INNER JOIN GOODS_INFO GOOD ON ORDT.GOODS_CD = GOOD.GOODS_CD"
    +" INNER JOIN STD_CD_BASE STD004 ON ORDB.ORD_STAT = STD004.CODE_VAL"
    +" INNER JOIN SALE_BOARD SALE ON ORDB.SALE_BOARD_SEQ = SALE.SALE_BOARD_SEQ"
    +" LEFT OUTER JOIN SALE_BOARD_RVW SALERVW ON ORDT.ORD_NO = SALERVW.ORD_NO"
    +" WHERE 1=1"
    +"   AND ordt.GOODS_CD = sale.GOODS_CD"
    +"   AND std004.GRP_CD = 'STD004'"
    +"   AND ordb.USR_ID = ?"
    +" ORDER BY ordb.ORD_NO DESC"
    ;
}