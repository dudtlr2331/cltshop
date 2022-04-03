package com.clt.shp.goods.dao;

import java.util.List;

import com.clt.shp.goods.GoodsVO;

public interface GoodsDao {
	int insertGoods(GoodsVO pvo);
	GoodsVO selectGoodsOne(GoodsVO pvo);
	List<GoodsVO> selectGoodsList(GoodsVO pvo);
	int updateGoods(GoodsVO pvo);
	int deleteGoods(GoodsVO pvo);
}