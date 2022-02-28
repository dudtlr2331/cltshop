package com.clt.shp.main.dao;

import java.util.List;

import com.clt.shp.main.MainVO;

public interface MainDao {
	int insertMain(MainVO pvo);
	MainVO selectMain(MainVO pvo);
	List<MainVO> selectListMain(MainVO pvo);
	int updateMain(MainVO pvo);
	int deleteMain(MainVO pvo);
}