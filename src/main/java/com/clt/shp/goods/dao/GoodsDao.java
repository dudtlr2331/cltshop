package com.clt.shp.goods.dao;

import java.util.List;

import com.clt.shp.goods.GoodsVO;

public interface GoodsDao {
	int insertGoods(GoodsVO pvo);
	GoodsVO selectGoods(GoodsVO pvo);
	List<GoodsVO> selectListGoods(GoodsVO pvo);
	int updateGoods(GoodsVO pvo);
	int deleteGoods(GoodsVO pvo);
}