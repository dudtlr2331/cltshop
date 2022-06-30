CREATE TABLE "ENTR_BASE" (
                             "ENTR_NO"	NUMBER(12)		NOT NULL,
                             "USR_ID"	VARCHAR2(20)		NOT NULL,
                             "ENTR_NM"	VARCHAR2(100)		NULL,
                             "BMAN_REG_NO"	VARCHAR2(10)		NULL,
                             "PRES_NM"	VARCHAR2(100)		NULL,
                             "PRES_TELL"	VARCHAR2(20)		NULL,
                             "PRES_EMAIL"	VARCHAR2(200)		NULL,
                             "AEMP_NM"	VARCHAR2(100)		NULL,
                             "AEMP_TELL"	VARCHAR2(20)		NULL,
                             "AEMP_EMAIL"	VARCHAR2(200)		NULL,
                             "SCORE"	NUMBER(5)		NULL,
                             "LAND_ADDR_BASE"	VARCHAR2(1000)		NULL,
                             "LAND_ADDR_DTL"	VARCHAR2(1000)		NULL,
                             "LAND_POST_NO"	VARCHAR2(10)		NULL,
                             "LOAD_ADDR_BASE"	VARCHAR2(1000)		NULL,
                             "LOAD_POST_NO"	VARCHAR2(100)		NULL,
                             "OPN_DATE"	DATE		NULL,
                             "CLOSE_DATE"	DATE		NULL,
                             "OPN_YN"	VARCHAR2(1)		NULL,
                             "USE_YN"	VARCHAR2(1)		NULL,
                             "RGST_ID"	VARCHAR2(20)		NULL,
                             "RGST_DATE"	DATE		NULL,
                             "UPDT_ID"	VARCHAR2(20)		NULL,
                             "UPDT_DATE"	DATE		NULL
);

CREATE TABLE "GOODS_INFO" (
                              "GOODS_CD"	NUMBER(12)		NOT NULL,
                              "ENTR_NO"	NUMBER(12)		NOT NULL,
                              "GOODS_NM"	VARCHAR2(400)		NULL,
                              "GOODS_PRC"	NUMBER(12)		NULL,
                              "INY_QTY"	NUMBER(14)		NULL,
                              "DLV_PRC"	NUMBER(20)		NULL,
                              "GOODS_SIZE"	VARCHAR2(200)		NULL,
                              "GOODS_CLR"	VARCHAR2(200)		NULL,
                              "IMG_PATH"	VARCHAR2(500)		NULL,
                              "IMG_NM"	VARCHAR2(300)		NULL,
                              "GOODS_INTR"	VARCHAR2(4000)		NULL,
                              "SALE_STAT_CD"	VARCHAR2(10)		NULL,
                              "USE_YN"	VARCHAR2(1)		NULL,
                              "RGST_ID"	VARCHAR2(200)		NULL,
                              "RGST_DATE"	DATE		NULL,
                              "UPDT_ID"	VARCHAR2(200)		NULL,
                              "UPDT_DATE"	DATE		NULL,
                              "CATGRY_CD"	VARCHAR2(20)		NOT NULL,
                              "CATGRY_CD2"	VARCHAR2(20)		NOT NULL
);

CREATE TABLE "GOODS_CATA" (
                              "CATGRY_CD"	VARCHAR2(20)		NOT NULL,
                              "CATGRY_NM"	VARCHAR2(400)		NULL,
                              "NOTE_CONT"	VARCHAR2(4000)		NULL,
                              "CLASS_LVL_CD"	VARCHAR2(20)		NULL,
                              "UPR_CLASS_CD"	VARCHAR2(20)		NULL,
                              "RGST_ID"	VARCHAR2(200)		NULL,
                              "RGST_DATE"	DATE		NULL,
                              "UPDT_ID"	VARCHAR2(200)		NULL,
                              "UPDT_DATE"	DATE		NULL,
                              "USE_YN"	VARCHAR2(1)		NULL
);

CREATE TABLE "GOODS_CHG_HIST" (
                                  "GOODS_CHG_HIST_SEQ"	NUMBER(20)		NOT NULL,
                                  "GOODS_CD2"	NUMBER(12)		NOT NULL,
                                  "ENTR_NO2"	NUMBER(12)		NOT NULL,
                                  "GOODS_CD"	NUMBER(12)		NULL,
                                  "CHG_ITEM"	VARCHAR2(400)		NULL,
                                  "CHG_VAL"	VARCHAR2(400)		NULL,
                                  "CHG_CAUS_DESC"	VARCHAR2(500)		NULL,
                                  "RGST_ID"	VARCHAR2(20)		NULL,
                                  "RGST_DATE"	DATE		NULL,
                                  "GOODS_NM"	VARCHAR2(400)		NULL
);

CREATE TABLE "ORD_BASE" (
                            "PIN_NO"	VARCHAR2(200)		NOT NULL,
                            "USR_ID"	VARCHAR2(200)		NOT NULL,
                            "USR_ID2"	VARCHAR2(200)		NOT NULL,
                            "ORD_NO"	VARCHAR2(200)		NULL,
                            "ENTR_NO"	NUMBER(12)		NULL,
                            "ORD_STAT"	VARCHAR2(8)		NULL,
                            "ORDR_ID"	VARCHAR2(200)		NULL,
                            "ORDR_NM"	VARCHAR2(200)		NULL,
                            "ORDR_PHON"	VARCHAR2(20)		NULL,
                            "ORDR_EMAIL"	VARCHAR2(200)		NULL,
                            "ACQR_PHON"	VARCHAR2(20)		NULL,
                            "ACQR_NM"	VARCHAR2(200)		NULL,
                            "ACQR_ADDR"	VARCHAR2(1000)		NULL,
                            "ACQR_ADDR_DTL"	VARCHAR2(500)		NULL,
                            "ACQR_EMAIL"	VARCHAR2(200)		NULL,
                            "PRCL_WAY"	VARCHAR2(100)		NULL,
                            "PACK_WAY"	VARCHAR2(100)		NULL,
                            "PAY_WAY"	VARCHAR2(100)		NULL,
                            "PAY_MNY"	NUMBER(12)		NULL,
                            "REQ_MEMO"	VARCHAR2(500)		NULL,
                            "ORD_DATE"	DATE		NULL,
                            "UPDT_DATE"	DATE		NULL,
                            "UPDT_ID"	VARCHAR2(200)		NULL,
                            "RGST_DATE"	DATE		NULL,
                            "RGST_ID"	VARCHAR2(200)		NULL
);

CREATE TABLE "ORD_DTL" (
                           "PIN_NO"	VARCHAR2(200)		NOT NULL,
                           "USR_ID"	VARCHAR2(20)		NOT NULL,
                           "USR_ID2"	VARCHAR2(200)		NOT NULL,
                           "ORD_NO"	VARCHAR2(200)		NULL,
                           "ORD_DTL_NO"	NUMBER(12)		NULL,
                           "GOODS_NM"	VARCHAR2(200)		NULL,
                           "GOODS_CD"	NUMBER(12)		NULL,
                           "GOODS_QTY"	NUMBER		NULL,
                           "UPDT_DATE"	DATE		NULL,
                           "UPDT_ID"	VARCHAR2(200)		NULL,
                           "RGST_DATE"	DATE		NULL,
                           "RGST_ID"	VARCHAR2(20)		NULL
);

CREATE TABLE "ORD_BASKET" (
                              "ORD_BASKET_SEQ"	NUMBER(20)		NOT NULL,
                              "USR_BASE_SEQ"	VARCHAR2(200)		NOT NULL,
                              "USR_ID"	VARCHAR2(200)		NOT NULL,
                              "GOODS_CD"	NUMBER(12)		NULL,
                              "GOODS_QTY"	NUMBER(12)		NULL,
                              "PRCL_WAY"	VARCHAR2(100)		NULL,
                              "PACK_WAY"	VARCHAR2(100)		NULL,
                              "RGST_DATE"	DATE		NULL,
                              "USE_YN"	VARCHAR2(1)		NULL
);

CREATE TABLE "ORD_HIST" (
                            "ORD_HIST_SEQ"	NUMBER(12)		NOT NULL,
                            "PIN_NO2"	VARCHAR2(200)		NOT NULL,
                            "USR_ID"	VARCHAR2(200)		NOT NULL,
                            "USR_ID2"	VARCHAR2(200)		NOT NULL,
                            "LINK_SN"	NUMBER		NULL,
                            "LINK_INFO"	VARCHAR2(200)		NULL,
                            "LINK_RSLT_CD"	VARCHAR2(20)		NULL,
                            "ORD_STAT"	VARCHAR2(8)		NULL,
                            "PROC_DATE"	DATE		NULL,
                            "RGST_ID"	VARCHAR2(200)		NULL,
                            "RGST_DATE"	DATE		NULL,
                            "HIST_MEMO"	VARCHAR2(2000)		NULL
);

CREATE TABLE "SALE_BOARD" (
                              "SALE_BOARD_SEQ"	NUMBER(20)		NOT NULL,
                              "ENTR_NO"	NUMBER(12)		NOT NULL,
                              "GOODS_CD"	NUMBER(12)		NOT NULL,
                              "SALE_STAT_CD"	VARCHAR2(2)		NULL,
                              "BUL_TIT_NM"	VARCHAR2(100)		NULL,
                              "BUL_STRT_DT"	DATE		NULL,
                              "BUL_END_DT"	DATE		NULL,
                              "BUL_YN"	VARCHAR2(2)		NULL,
                              "NTC_SCT_CD"	VARCHAR2(2)		NULL,
                              "BUL_CONT"	CLOB		NULL,
                              "QRY_CNT"	NUMBER(14)		NULL,
                              "LKE_CNT"	NUMBER(14)		NULL,
                              "GOODS_PRC"	NUMBER(12)		NULL,
                              "GOODS_SALE_PRC"	NUMBER(12)		NULL,
                              "PRCL_WAY"	VARCHAR2(100)		NULL,
                              "SALE_CNT"	NUMBER(12)		NULL,
                              "RGST_ID"	VARCHAR2(200)		NULL,
                              "RGST_DATE"	DATE		NULL,
                              "UPDT_ID"	VARCHAR2(200)		NULL,
                              "UPDT_DATE"	DATE		NULL,
                              "USE_YN"	VARCHAR2(1)		NULL,
                              "DESCRIPTION"	VARCHAR2(100)		NULL
);

CREATE TABLE "SALE_BOARD_RPY" (
                                  "SALE_BOARD_SN2"	NUMBER(12)		NOT NULL,
                                  "GOODS_CD2"	NUMBER(12)		NOT NULL,
                                  "ENTR_NO2"	NUMBER(12)		NOT NULL,
                                  "SALE_BOARD_SN"	NUMBER(12)		NULL,
                                  "BUL_CONT"	VARCHAR2(500)		NULL,
                                  "RPY_LVL"	NUMBER(3)		NULL,
                                  "PAR_SALE_BOARD_RPY_SN"	NUMBER(12)		NULL,
                                  "QRY_CNT"	NUMBER(14)		NULL,
                                  "LKE_CNT"	NUMBER(14)		NULL,
                                  "RGST_ID"	VARCHAR2(200)		NULL,
                                  "RGST_DATE"	DATE		NULL,
                                  "UPDT_ID"	VARCHAR2(200)		NULL,
                                  "UPDT_DATE"	DATE		NULL,
                                  "USE_YN"	VARCHAR2(1)		NULL
);

CREATE TABLE "FILE_INFO" (
                             "FILE_INFO_SN"	NUMBER(20)		NOT NULL,
                             "QNA_BOARD_SEQ"	NUMBER(20)		NOT NULL,
                             "CUST_BOARD_SEQ"	NUMBER(20)		NOT NULL,
                             "SALE_BOARD_SN"	NUMBER(20)		NOT NULL,
                             "GOODS_CD2"	NUMBER(12)		NOT NULL,
                             "ENTR_NO2"	NUMBER(12)		NOT NULL,
                             "GRP_CD"	NUMBER(12)		NULL,
                             "BOARD_SN"	NUMBER(12)		NULL,
                             "FILE_NM"	VARCHAR2(200)		NULL,
                             "FILE_PATH"	VARCHAR2(200)		NULL,
                             "FILE_EXP"	VARCHAR2(200)		NULL,
                             "FILE_SIZE"	NUMBER(20)		NULL,
                             "ORG_FILE_NM"	VARCHAR2(200)		NULL,
                             "RGST_ID"	VARCHAR2(200)		NULL,
                             "RGST_DATE"	DATE		NULL,
                             "UPDT_ID"	VARCHAR2(200)		NULL,
                             "UPDT_DATE"	DATE		NULL,
                             "USE_YN"	VARCHAR2(1)		NULL,
                             "DEL_YN"	VARCHAR2(1)		NULL
);

CREATE TABLE "CUST_BOARD" (
                              "CUST_BOARD_SEQ"	NUMBER(20)		NOT NULL,
                              "TIT_NM"	VARCHAR2(1000)		NULL,
                              "CONT"	CLOB		NULL,
                              "RGST_ID"	VARCHAR2(200)		NULL,
                              "RGST_DATE"	DATE		NULL,
                              "UPDT_ID"	VARCHAR2(200)		NULL,
                              "UPDT_DATE"	DATE		NULL,
                              "USE_YN"	VARCHAR2(1)		NULL
);

CREATE TABLE "USR_BASE" (
                            "USR_BASE_SEQ"	NUMBER(20)		NOT NULL,
                            "USR_ID"	VARCHAR2(200)		NOT NULL,
                            "USR_NM"	VARCHAR2(200)		NULL,
                            "PASS_WD"	VARCHAR2(200)		NULL,
                            "USR_BIRTH"	VARCHAR2(200)		NULL,
                            "EMAIL_ADDR"	VARCHAR2(200)		NULL,
                            "CELL_NO"	VARCHAR2(100)		NULL,
                            "LAND_ADDR_BASE"	VARCHAR2(1000)		NULL,
                            "LAND_ADDR_DTL"	VARCHAR2(1000)		NULL,
                            "LAND_POST_NO"	VARCHAR2(10)		NULL,
                            "LOAD_ADDR_BASE"	VARCHAR2(1000)		NULL,
                            "LOAD_ADDR_DTL"	VARCHAR2(1000)		NULL,
                            "LOAD_POST_NO"	VARCHAR2(100)		NULL,
                            "PASS_WD_CHG_DATE"	DATE		NULL,
                            "LOCK_YN"	VARCHAR2(1)		NULL,
                            "RGST_ID"	VARCHAR2(200)		NULL,
                            "RGST_DATE"	DATE		NULL,
                            "UPDT_ID"	VARCHAR2(200)		NULL,
                            "UPDT_DATE"	DATE		NULL,
                            "USE_YN"	VARCHAR2(1)		NULL,
                            "USR_GRDE"	VARCHAR2(20)		NULL,
                            "ADM_GRDE"	VARCHAR2(20)		NULL
);

COMMENT ON COLUMN "USR_BASE"."USR_GRDE" IS 'ORD002 / 회원등급';

COMMENT ON COLUMN "USR_BASE"."ADM_GRDE" IS 'ORD003 /  관리자등급';

CREATE TABLE "LOGIN_LOG" (
                             "LOGIN_LOG_SEQ"	NUMBER(20)		NOT NULL,
                             "USR_BASE_SEQ"	VARCHAR2(200)		NOT NULL,
                             "USR_ID"	VARCHAR2(200)		NOT NULL,
                             "PROC_DTIME"	DATE		NULL,
                             "TYPE_NM"	VARCHAR2(20)		NULL,
                             "IP_ADDR"	VARCHAR2(200)		NULL,
                             "RGST_ID"	VARCHAR2(200)		NULL,
                             "RGST_DATE"	DATE		NULL,
                             "HIST_MEMO"	VARCHAR2(2000)		NULL
);

CREATE TABLE "USR_GRP_REL_INFO" (
                                    "RT_GRP_NO"	NUMBER(14)		NOT NULL,
                                    "USR_BASE_SEQ"	VARCHAR2(200)		NOT NULL,
                                    "USR_ID"	VARCHAR2(200)		NOT NULL,
                                    "NOTE_CONT"	VARCHAR2(4000)		NULL,
                                    "RGST_ID"	VARCHAR2(20)		NULL,
                                    "RGST_DATE"	DATE		NULL,
                                    "UPDT_ID"	VARCHAR2(200)		NULL,
                                    "UPDT_DATE"	DATE		NULL,
                                    "USE_YN"	VARCHAR2(1)		NULL
);

CREATE TABLE "USR_GRP_INFO" (
                                "RT_GRP_NO"	NUMBER(14)		NOT NULL,
                                "RT_GRP_NM"	VARCHAR2(100)		NULL,
                                "RT_DESC"	VARCHAR2(400)		NULL,
                                "RGST_ID"	VARCHAR2(200)		NULL,
                                "RGST_DATE"	DATE		NULL,
                                "UPDT_ID"	VARCHAR2(200)		NULL,
                                "UPDT_DATE"	DATE		NULL,
                                "USE_YN"	VARCHAR2(1)		NULL
);

CREATE TABLE "USR_GRP_RT_INFO" (
                                   "RT_GRP_NO"	NUMBER(14)		NOT NULL,
                                   "MENU_NO"	NUMBER(14)		NULL,
                                   "REG_RT_USE_YN"	VARCHAR2(1)		NULL,
                                   "MOD_RT_USE_YN"	VARCHAR2(1)		NULL,
                                   "DEL_RT_USE_YN"	VARCHAR2(1)		NULL,
                                   "PRSN_INFO_RT_USE_YN"	VARCHAR2(1)		NULL,
                                   "RGST_ID"	VARCHAR2(200)		NULL,
                                   "RGST_DATE"	DATE		NULL,
                                   "UPDT_ID"	VARCHAR2(200)		NULL,
                                   "UPDT_DATE"	DATE		NULL
);

CREATE TABLE "MENU_BASE" (
                             "MENU_NO"	NUMBER(14)		NOT NULL,
                             "MENU_NM"	VARCHAR2(100)		NULL,
                             "MENU_GRP_NO"	NUMBER(14)		NULL,
                             "MENU_LVL_CD"	VARCHAR2(10)		NULL,
                             "MRK_RNK"	NUMBER(14)		NULL,
                             "SCRN_URL_ADDR"	VARCHAR2(300)		NULL,
                             "NOTE_CONT"	VARCHAR2(4000)		NULL,
                             "RGST_ID"	VARCHAR2(200)		NULL,
                             "RGST_DATE"	DATE		NULL,
                             "UPDT_ID"	VARCHAR2(200)		NULL,
                             "UPDT_DATE"	DATE		NULL,
                             "USE_YN"	VARCHAR2(1)		NULL
);

CREATE TABLE "QNA_BOARD" (
                             "QNA_BOARD_SEQ"	NUMBER(20)		NOT NULL,
                             "TIT_NM"	VARCHAR2(1000)		NULL,
                             "CONT"	CLOB		NULL,
                             "RGST_ID"	VARCHAR2(200)		NULL,
                             "RGST_DATE"	DATE		NULL,
                             "UPDT_ID"	VARCHAR2(200)		NULL,
                             "UPDT_DATE"	DATE		NULL,
                             "QNA_TP"	VARCHAR(20)		NULL,
                             "ANSR_STAT"	VARCHAR2(8)		NULL,
                             "USE_YN"	VARCHAR2(1)		NULL,
                             "PASS_YN"	VARCHAR2(1)		NULL,
                             "PASS_WD"	VARCHAR(200)		NULL
);

CREATE TABLE "STD_CD_BASE" (
                               "STD_CD_BASE_SEQ"	VARCHAR(255)		NOT NULL,
                               "CODE_NM"	VARCHAR2(200)		NOT NULL,
                               "CODE_VAL"	VARCHAR2(200)		NOT NULL,
                               "CODE_DESC"	VARCHAR2(2000)		NULL,
                               "GRP_CD"	VARCHAR2(200)		NULL,
                               "GRP_ORDR"	NUMBER(8)		NULL,
                               "USE_YN"	VARCHAR2(1)		NULL,
                               "RGST_ID"	VARCHAR2(200)		NULL,
                               "RGST_DATE"	DATE		NULL,
                               "UPDT_ID"	VARCHAR2(200)		NULL,
                               "UPDT_DATE"	DATE		NULL
);

CREATE TABLE "GOODS_OPTS" (
                              "GOODS_OPTS_SEQ"	NUMBER(20)		NOT NULL,
                              "OPTS_CD"	VARCHAR2(400)		NOT NULL,
                              "OPTS_NM"	VARCHAR2(400)		NULL,
                              "OPTS_VAL"	VARCHAR2(400)		NULL,
                              "USE_YN"	VARCHAR2(1)		NULL,
                              "RGST_ID"	VARCHAR2(200)		NULL,
                              "RGST_DATE"	DATE		NULL,
                              "UPDT_ID"	VARCHAR2(200)		NULL,
                              "UPDT_DATE"	DATE		NULL
);

CREATE TABLE "GOODS_OPTS_REL" (
                                  "OPTS_CD"	VARCHAR2(400)		NOT NULL,
                                  "GOODS_CD"	NUMBER(12)		NOT NULL,
                                  "ENTR_NO2"	NUMBER(12)		NOT NULL
);

CREATE TABLE "POINT_HIST" (
                              "POINT_HIST_SEQ"	NUMBER(20)		NOT NULL,
                              "USR_BASE_SEQ"	VARCHAR2(200)		NOT NULL,
                              "USR_ID"	VARCHAR2(200)		NOT NULL,
                              "POINT_AMT"	NUMBER(20)		NULL,
                              "POINT_TYPE"	VARCHAR2(20)		NULL,
                              "RGST_ID"	VARCHAR2(200)		NULL,
                              "RGST_DATE"	DATE		NULL,
                              "HIST_MEMO"	VARCHAR2(2000)		NULL
);

CREATE TABLE "ORD_BASKET_HIST" (
                                   "ORD_BASKET_HIST_SEQ"	NUMBER(20)		NOT NULL,
                                   "ORD_BASKET_SEQ"	NUMBER(20)		NOT NULL,
                                   "USR_BASE_SEQ"	VARCHAR2(200)		NOT NULL,
                                   "USR_ID"	VARCHAR2(200)		NOT NULL,
                                   "GOODS_CD"	NUMBER(12)		NULL,
                                   "GOODS_QTY"	NUMBER(12)		NULL,
                                   "RGST_ID"	VARCHAR2(200)		NULL,
                                   "RGST_DATE"	DATE		NULL,
                                   "HIST_MEMO"	VARCHAR2(2000)		NULL
);

CREATE TABLE "USR_INFO_CHG_HIST" (
                                     "PASS_CHG_HIST_SEQ"	NUMBER(20)		NOT NULL,
                                     "USR_BASE_SEQ"	VARCHAR2(200)		NOT NULL,
                                     "USR_ID"	VARCHAR2(200)		NOT NULL,
                                     "CHG_INFO"	VARCHAR2(400)		NULL,
                                     "BEFORE_DATA"	VARCHAR2(2000)		NULL,
                                     "AFTER_DATA"	VARCHAR2(2000)		NULL,
                                     "CHG_DATE"	DATE		NULL,
                                     "RGST_ID"	VARCHAR2(200)		NULL,
                                     "RGST_DATE"	DATE		NULL,
                                     "HIST_MEMO"	VARCHAR2(2000)		NULL
);


