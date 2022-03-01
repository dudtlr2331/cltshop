package com.clt.cmm.dao;

import java.util.List;

import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;

public class CommonDaoTest {
	public static void main(String[] args) {
		CommonDaoTest test = new CommonDaoTest();
	      test.insert_test();
	}
	
	public void insert_test() {
		GoodsDaoOracle mainDao = new GoodsDaoOracle();
		GoodsVO pvo = new GoodsVO();
		pvo.setMainBoardSn(1);
		pvo.setImgPath("test..");
		
		mainDao.insertMain(pvo);
	}
	
	public void select_obj_test() {
		GoodsDaoOracle mainDao = new GoodsDaoOracle();
		GoodsVO pvo = new GoodsVO();
		GoodsVO obj = mainDao.selectMain(pvo);
		System.out.println(obj.toString());
	}
	
	public void select_list_test() {
		GoodsDaoOracle mainDao = new GoodsDaoOracle();
		GoodsVO pvo = new GoodsVO();
		List<GoodsVO> list = mainDao.selectListMain(pvo);
		for(GoodsVO obj : list) {
			System.out.println(obj.toString());
		}
	}
}
