package com.clt.shp.entr.dao;

import java.util.List;

import com.clt.shp.entr.EntrVO;

public interface EntrDao {
	int insertEntr(EntrVO pvo);
	EntrVO selectEntrOne(EntrVO pvo);
	List<EntrVO> selectEntrList(EntrVO pvo);
	int updateEntr(EntrVO pvo);
	int deleteEntr(EntrVO pvo);
	int deleteEntrAll();
	int dropSeq();
	int createSeq();
}
