package com.clt.shp.main.dao;

import java.util.List;

import com.clt.shp.main.GoodsDetailVO;

public interface MainDao {
	List<GoodsDetailVO> selectListMainHome(GoodsDetailVO pvo);
	List<GoodsDetailVO> selectListMainCate(GoodsDetailVO pvo);
}