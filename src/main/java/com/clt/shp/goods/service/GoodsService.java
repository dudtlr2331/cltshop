package com.clt.shp.goods.service;

import java.util.List;

import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.GoodsDao;

public class GoodsService {

	private GoodsDao service;
	
	public GoodsService(GoodsDao service) {
		this.service = service;
	}

	public GoodsVO selectGoodsOne(GoodsVO pvo) {
		return service.selectGoods(pvo);
	}

	public List<GoodsVO> selectGoodsList(GoodsVO param) {
		return service.selectListGoods(param);
	}
}
