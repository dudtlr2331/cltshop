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
		GoodsDaoOracle goodsDao = new GoodsDaoOracle();
		GoodsVO pvo = new GoodsVO();
		pvo.setGoodsInfoSeq(5);
		pvo.setGoodsNm("맨투맨5");
		pvo.setGoodsPrc(29000);
		
		goodsDao.insertGoods(pvo);
	}
	
	public void select_obj_test() {
		GoodsDaoOracle goodsDao = new GoodsDaoOracle();
		GoodsVO pvo = new GoodsVO();
		GoodsVO obj = goodsDao.selectGoods(pvo);
		System.out.println(obj.toString());
	}
	
	public void select_list_test() {
		GoodsDaoOracle goodsDao = new GoodsDaoOracle();
		GoodsVO pvo = new GoodsVO();
		List<GoodsVO> list = goodsDao.selectListGoods(pvo);
		for(GoodsVO obj : list) {
			System.out.println(obj.toString());
		}
	}
}