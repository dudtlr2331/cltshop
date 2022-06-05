package com.clt.shp.cate.dao;

import java.util.List;

import com.clt.shp.cate.CateVO;

public interface CateDao {
	int insertCate(CateVO pvo);
	CateVO selectCateOne(CateVO pvo);
	List<CateVO> selectCateList(CateVO pvo);
	List<CateVO> selectCateUnList(CateVO pvo);
	int updateCate(CateVO pvo);
	int deleteCate(CateVO pvo);
	int deleteCateAll();
	int dropSeq();
	int createSeq();
}