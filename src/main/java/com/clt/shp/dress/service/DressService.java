package com.clt.shp.dress.service;

import java.util.List;

import com.clt.shp.dress.DressVO;
import com.clt.shp.dress.dao.DressDao;

public class DressService {

	private DressDao dao;
	
	public DressService(DressDao dao) {
		this.dao = dao;
	}

	public DressVO selectDressOne(DressVO pvo) {
		return dao.selectDressOne(pvo);
	}

	public List<DressVO> selectDressList(DressVO pvo) {
		return dao.selectDressList(pvo);
	}
	
	public int insertDress(DressVO pvo) {
		return dao.insertDress(pvo);
	}
	
	public int updateDress(DressVO pvo) {
		return dao.updateDress(pvo);
	}
	
	public int deleteDress(DressVO pvo) {
		return dao.deleteDress(pvo);
	}
}
