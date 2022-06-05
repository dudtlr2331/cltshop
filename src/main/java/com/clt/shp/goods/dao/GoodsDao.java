package com.clt.shp.goods.dao;

import java.util.List;

import com.clt.shp.goods.GoodsVO;
import com.clt.shp.main.GoodsDetailVO;

public interface GoodsDao {
	int insertGoods(GoodsVO pvo);
	GoodsVO selectGoodsOne(GoodsVO pvo);
	List<GoodsDetailVO> selectMypgGoodsList(GoodsVO pvo);
	GoodsDetailVO selectMypgGoodsOne(GoodsVO pvo);
	GoodsDetailVO selectGoodsDetail(String seq);
	List<GoodsVO> selectGoodsList(GoodsVO pvo);
	int updateGoods(GoodsVO pvo);
	int deleteGoods(GoodsVO pvo);
	int deleteGoodsAll();
	int dropSeq();
	int createSeq();
}