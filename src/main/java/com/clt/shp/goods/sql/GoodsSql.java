package com.clt.shp.goods.sql;

public interface GoodsSql{
	String GOODS_INSERT = 
	  "INSERT INTO GOODS_INFO(GOODS_INFO_SEQ, GOODS_NM, GOODS_PRC) "
	+ "VALUES(?, ?, ?)"
	;
	
	String GOODS_SELECT =
	  "SELECT GOODS_INFO_SEQ"
	+ "	    , GOODS_NM "
	+ "     , GOODS_PRC"
	+ "  FROM GOODS_INFO"
	+ " WHERE 1=1"
	+ "   AND GOODS_INFO_SEQ = ?"
	;
	
	String GOODS_LIST =
	  "SELECT GOODS_INFO_SEQ"
	+ "	    , GOODS_NM "
	+ "	    , GOODS_PRC "
	+ "  FROM GOODS_INFO"
	+ " WHERE 1=1 "
	+ " ORDER BY GOODS_INFO_SEQ DESC"
	;
	
	String GOODS_UPDATE =
	  "UPDATE GOODS_INFO "
	+ "   SET GOODS_NM = ?"
	+ "     , GOODS_PRC = ?"
	+ " WHERE 1=1"
	+ "   AND GOODS_INFO_SEQ = ?"
	;
	
	String GOODS_DELETE = 
	  "DELETE FROM GOODS_INFO "
	+ " WHERE 1=1 "
//	+ "  AND GOODS_INFO_SEQ = ?"
	+ "  AND GOODS_INFO_SEQ = ?"
	;
	
}