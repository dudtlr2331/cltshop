package com.clt.shp.dress.dao;

import java.util.List;

import com.clt.shp.dress.DressVO;

public interface DressDao {
	int insertDress(DressVO pvo);
	DressVO selectDressOne(DressVO pvo);
	List<DressVO> selectDressList(DressVO pvo);
	int updateDress(DressVO pvo);
	int deleteDress(DressVO pvo);
	List<DressVO> goodsDtlDressList(DressVO pvo);
	List<DressVO> selectWriteSaleRvw(DressVO pvo);
}