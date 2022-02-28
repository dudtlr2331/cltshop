package com.clt.cmm.dao;

import java.util.Arrays;
import java.util.List;

import com.clt.shp.main.MainVO;
import com.clt.shp.main.dao.impl.MainDaoOracle;

public class CommonDaoTest {
	public static void main(String[] args) {
		
	}
	
	public void insert_test() {
		MainDaoOracle mainDao = new MainDaoOracle();
		MainVO pvo = new MainVO();
		pvo.setMainBoardSn(1);
		pvo.setImgPath("test..");
		
		mainDao.insertMain(pvo);
	}
	
	public void select_obj_test() {
		MainDaoOracle mainDao = new MainDaoOracle();
		MainVO pvo = new MainVO();
		MainVO obj = mainDao.selectMain(pvo);
		System.out.println(obj.toString());
	}
	
	public void select_list_test() {
		MainDaoOracle mainDao = new MainDaoOracle();
		MainVO pvo = new MainVO();
		List<MainVO> list = mainDao.selectListMain(pvo);
		for(MainVO obj : list) {
			System.out.println(obj.toString());
		}
	}
}
