package com.clt.shp.dress.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.clt.shp.dress.DressVO;
import com.clt.shp.dress.dao.DressDao;

public class DressService {

	private DressDao dao;
	
	public DressService(DressDao dao) {
		this.dao = dao;
	}

	//파라미터 셋팅
	public DressVO parameterSetting(HttpServletRequest req) {
		long dressroomInfoSEQ = req.getParameter("dressroomInfoSEQ") == null? 0L : Long.parseLong(req.getParameter("dressroomInfoSEQ"));
		long dressroomId = req.getParameter("dressroomId") == null? 0L : Long.parseLong(req.getParameter("dressroomId"));
		int tagId = req.getParameter("tagId") == null? 0 : Integer.parseInt(req.getParameter("tagId"));
		long userId = req.getParameter("userId") == null? 0L : Long.parseLong(req.getParameter("userId"));
		String dressroomName = req.getParameter("dressroomName");
		String dressroomDescription = req.getParameter("dressroomDescription");
		int dressroomLike = req.getParameter("dressroomLike") == null? 0 : Integer.parseInt(req.getParameter("dressroomLike"));
		
		DressVO pvo = new DressVO();
		pvo.setDressroomInfoSEQ(dressroomInfoSEQ);
		pvo.setDressroomId(dressroomId);
		pvo.setTagId(tagId);
		pvo.setUserId(userId);
		pvo.setDressroomName(dressroomName);
		pvo.setDressroomDescription(dressroomDescription);
		pvo.setDressroomLike(dressroomLike);
		
		return pvo;
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
