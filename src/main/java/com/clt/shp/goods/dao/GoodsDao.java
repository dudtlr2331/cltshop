package com.clt.shp.goods.dao;

import java.util.List;

import com.clt.shp.goods.GoodsVO;

public interface GoodsDao {
	int insertMain(GoodsVO pvo);
	GoodsVO selectMain(GoodsVO pvo);
	List<GoodsVO> selectListMain(GoodsVO pvo);
	int updateMain(GoodsVO pvo);
	int deleteMain(GoodsVO pvo);
}