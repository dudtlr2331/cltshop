package com.clt.shp.main.service;

import java.util.List;

import com.clt.shp.main.GoodsDetailVO;
import com.clt.shp.main.dao.MainDao;

public class MainService {
	private MainDao mainDao;
	public MainService(MainDao mainDao) {
		this.mainDao = mainDao;
	}
	
	public List<GoodsDetailVO> selectListMainHome(GoodsDetailVO pvo){
		return mainDao.selectListMainHome(pvo);
	}
	
	public List<GoodsDetailVO> selectListMainCate(GoodsDetailVO pvo){
		return mainDao.selectListMainCate(pvo);
	}

}
