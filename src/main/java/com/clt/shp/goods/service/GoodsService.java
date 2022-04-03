package com.clt.shp.goods.service;

import java.util.List;

import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.GoodsDao;

public class GoodsService {

	private GoodsDao dao;
	
	public GoodsService(GoodsDao dao) {
		this.dao = dao;
	}

	public GoodsVO selectGoodsOne(GoodsVO pvo) {
		return dao.selectGoodsOne(pvo);
	}

	public List<GoodsVO> selectGoodsList(GoodsVO pvo) {
		return dao.selectGoodsList(pvo);
	}
	
	public int insertGoods(GoodsVO pvo) {
		return dao.insertGoods(pvo);
	}
	
	public int updateGoods(GoodsVO pvo) {
		return dao.updateGoods(pvo);
	}
}
