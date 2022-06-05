package com.clt.shp.code.dao;

import java.util.List;

import com.clt.shp.code.CodeVO;

public interface CodeDao {
	int insertCode(CodeVO pvo);
	CodeVO selectCodeOne(CodeVO pvo);
	List<CodeVO> selectCodeList(CodeVO pvo);
	List<CodeVO> selectSaleStatCdList(CodeVO pvo);
	List<CodeVO> selectOrdCdList(CodeVO pvo);
	List<CodeVO> selectUsrCdList(CodeVO pvo);
	List<CodeVO> selectAdmCdList(CodeVO pvo);
	int updateCode(CodeVO pvo);
	int deleteCode(CodeVO pvo);
	int deleteCodeAll();
	
	int dropSeq();
	int createSeq();
}