package com.clt.cmm.dao;

import java.util.List;

import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.user.UserVo;
import com.clt.shp.user.dao.UserDao;
import com.clt.shp.user.dao.impl.UserDaoOracle;

public class CommonDaoTest {
	public static void main(String[] args) {
		CommonDaoTest test = new CommonDaoTest();
	      test.insert_test();
//	      test.select_obj_test();
//		test.select_list_test();
	}
	
	public void insert_test() {
		UserDaoOracle userDao = new UserDaoOracle();
		UserVo pvo = new UserVo();
		pvo.setMember_seq(7);
		pvo.setMember_id("g");
		pvo.setMember_email("g@naver.com");;
		pvo.setMember_pwd("1234");
		
		userDao.insertUser(pvo);
	}
	
	public void select_obj_test() {
		UserDaoOracle userDao = new UserDaoOracle();
		UserVo pvo = new UserVo();
		pvo.setMember_seq(1);
		UserVo obj = userDao.selectUser(pvo);
		System.out.println(obj.toString());
	}
	
	public void select_list_test() {
		UserDaoOracle userDao = new UserDaoOracle();
		UserVo pvo = new UserVo();
		List<UserVo> list = userDao.selectListUser(pvo);
		for(UserVo obj : list) {
			System.out.println(obj.toString());
		}
	}
	
//	public void insert_test() {
//		GoodsDaoOracle goodsDao = new GoodsDaoOracle();
//		GoodsVO pvo = new GoodsVO();
//		pvo.setGoodsInfoSeq(8);
//		pvo.setGoodsNm("아우터4");
//		pvo.setGoodsPrc(49000);
//		pvo.setGoodsImg("/images/아우터4.jpg");
//		
//		goodsDao.insertGoods(pvo);
//	}
//	
//	public void select_obj_test() {
//		GoodsDaoOracle goodsDao = new GoodsDaoOracle();
//		GoodsVO pvo = new GoodsVO();
//		GoodsVO obj = goodsDao.selectGoods(pvo);
//		System.out.println(obj.toString());
//	}
//	
//	public void select_list_test() {
//		GoodsDaoOracle goodsDao = new GoodsDaoOracle();
//		GoodsVO pvo = new GoodsVO();
//		List<GoodsVO> list = goodsDao.selectListGoods(pvo);
//		for(GoodsVO obj : list) {
//			System.out.println(obj.toString());
//		}
//	}
}