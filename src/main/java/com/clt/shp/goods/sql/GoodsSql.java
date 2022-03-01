package com.clt.shp.goods.sql;

public interface GoodsSql{
	String MAIN_INSERT = 
	  "INSERT INTO MAIN_BOARD(MAIN_BOARD_SN, IMG_PATH) "
	+ "VALUES(?, ?)"
	;
	
	String MAIN_SELECT =
	  "SELECT MAIN_BOARD_SN"
	+ "	    , IMG_PATH "
	+ "  FROM MAIN_BOARD"
	+ " WHERE 1=1"
	+ "   AND MAIN_BOARD_SN = ?"
	;
	
	String MAIN_LIST =
	  "SELECT MAIN_BOARD_SN"
	+ "	    , IMG_PATH "
	+ "  FROM MAIN_BOARD"
	+ " WHERE 1=1"
	;
	
	String MAIN_UPDATE =
	  "UPDATE MAIN_BOARD "
	+ "   SET IMG_PATH = ?"
	+ " WHERE 1=1"
	+ " MAIN_BOARD_SN = ?"
	;
	
	String MAIN_DELETE = 
	  "DELETE FROM MAIN_BOARD "
	+ " WHERE 1=1 AND MAIN_BOARD_SN = ?"
	;
	
}