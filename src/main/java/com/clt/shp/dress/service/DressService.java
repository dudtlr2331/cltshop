package com.clt.shp.dress.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.clt.shp.dress.DressVO;
import com.clt.shp.dress.dao.DressDao;

public class DressService {

	private DressDao dao;
	

	public DressVO parameterSetting(HttpServletRequest req) {
		int saleBoardRpySeq = req.getParameter("saleBoardRpySeq") == null? 0 : Integer.parseInt(req.getParameter("saleBoardRpySeq"));
		int saleBoardSeq = req.getParameter("saleBoardSeq") == null? 0 : Integer.parseInt(req.getParameter("saleBoardSeq"));
		int goodsCd = req.getParameter("goodsCd") == null? 0 : Integer.parseInt(req.getParameter("goodsCd"));
		int entrNo = req.getParameter("entrNo") == null? 0 : Integer.parseInt(req.getParameter("entrNo"));
		String bulTitNm = req.getParameter("bulTitNm");
		String bulCont = req.getParameter("bulCont");
		int rpyLvl = req.getParameter("rpyLvl") == null? 0 : Integer.parseInt(req.getParameter("rpyLvl"));
		int parSaleBoardRpySn = req.getParameter("parSaleBoardRpySn") == null? 0 : Integer.parseInt(req.getParameter("parSaleBoardRpySn"));
		int qryCnt = req.getParameter("qryCnt") == null? 0 : Integer.parseInt(req.getParameter("qryCnt"));
		int lkeCnt = req.getParameter("lkeCnt") == null? 0 : Integer.parseInt(req.getParameter("lkeCnt"));
		String rgstId = req.getParameter("rgstId");
		String rgstDate = req.getParameter("rgstDate");
		String updtId = req.getParameter("updtId");
		String updtDate = req.getParameter("updtDate");
		String useYn = req.getParameter("useYn");

		String noticeDoc = req.getParameter("noticeDoc");

		DressVO pvo = new DressVO();
		
		pvo.setSaleBoardRpySeq(saleBoardRpySeq);
		pvo.setSaleBoardSeq(saleBoardSeq);
		pvo.setGoodsCd(goodsCd);
		pvo.setEntrNo(entrNo);
		pvo.setBulTitNm(bulTitNm);
		pvo.setBulCont(bulCont);
		pvo.setRpyLvl(rpyLvl);
		pvo.setParSaleBoardRpySn(parSaleBoardRpySn);
		pvo.setQryCnt(qryCnt);
		pvo.setLkeCnt(lkeCnt);
		pvo.setRgstId(rgstId);
		pvo.setRgstDate(rgstDate);
		pvo.setUpdtId(updtId);
		pvo.setUpdtDate(updtDate);
		pvo.setUseYn(useYn);
		pvo.setNoticeDoc(noticeDoc);
		
		//첨부파일 있으면 셋팅
		String imgPath = (String) req.getAttribute("imgPath");
		if(null == imgPath || "".equals(imgPath)) {
			imgPath = req.getParameter("imgPath");
		}
		String imgNm = (String) req.getAttribute("imgNm");
		if(null == imgNm || "".equals(imgNm)) {
			imgNm = req.getParameter("imgNm");
		}
		
		if(null != imgPath && !"".equals(imgPath)) {
			pvo.setImgPath(imgPath);
		}
		if(null != imgNm && !"".equals(imgNm)) {
			pvo.setImgNm(imgNm);
		}

		return pvo;
	}
	
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
