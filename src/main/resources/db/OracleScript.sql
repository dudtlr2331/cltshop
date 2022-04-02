/*유저 삭제*/
drop user hangang;

/*유저생성*/
CREATE USER hangang IDENTIFIED BY victory123;

/*권한 주기*/
GRANT CONNECT, RESOURCE TO hangang;

/*** HANGANG 으로 접속 후 생성 ***/
/* 테이블 생성 */
CREATE TABLE MAIN_BOARD(
    MAIN_BOARD_SN NUMBER,
    IMG_PATH VARCHAR2(20 BYTE)
);