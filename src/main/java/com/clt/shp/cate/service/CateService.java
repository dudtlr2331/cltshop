package com.clt.shp.cate.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.clt.shp.cate.CateVO;
import com.clt.shp.cate.dao.CateDao;

public class CateService {

	private CateDao dao;
	int upperTxtCnt = 0;
	int underTxtCnt = 0;
	
	
	public CateService(CateDao dao) {
		this.dao = dao;
	}

	//파라미터 셋팅
	public CateVO parameterSetting(HttpServletRequest req) {
//		int upperTxtCnt = req.getParameter("upperTxtCnt") == null? 0 : Integer.parseInt(req.getParameter("upperTxtCnt"));
//		int underTxtCnt = req.getParameter("underTxtCnt") == null? 0 : Integer.parseInt(req.getParameter("underTxtCnt"));
		upperTxtCnt = req.getParameter("upperTxtCnt") == null? 0 : Integer.parseInt(req.getParameter("upperTxtCnt"));
		underTxtCnt = req.getParameter("underTxtCnt") == null? 0 : Integer.parseInt(req.getParameter("underTxtCnt"));
		
		long goodsCataSeq = req.getParameter("goodsCataSeq") == null? 0L : Long.parseLong(req.getParameter("goodsCataSeq"));
		int goodsCd = req.getParameter("goodsCd") == null? 0 : Integer.parseInt(req.getParameter("goodsCd"));
		String catgryCd = req.getParameter("catgryCd");
		String uprClassCd = req.getParameter("uprClassCd");
		String rgstId = req.getParameter("rgstId");
		String rgstDate = req.getParameter("rgstDate");
		String updtId = req.getParameter("updtId");
		String updtDate = req.getParameter("updtDate");
//		String classLvlCd = req.getParameter("classLvlCd") == null ? "" : req.getParameter("classLvlCd");
		String[] upCatgryCdArr = new String[upperTxtCnt + 1];
		String[] unCatgryCdArr = new String[underTxtCnt + 1];
		String[] upCatgryNmArr = new String[upperTxtCnt + 1];
		String[] unCatgryNmArr = new String[underTxtCnt + 1];
		String[] upNoteContArr = new String[upperTxtCnt + 1];
		String[] unNoteContArr = new String[underTxtCnt + 1];
		String[] upUseYnArr = new String[upperTxtCnt + 1];
		String[] unUseYnArr = new String[underTxtCnt + 1];
		String[] upClassLvlCdArr = new String[upperTxtCnt+ 1];
		String[] unClassLvlCdArr = new String[underTxtCnt + 1];
		String[] upCateType = new String[upperTxtCnt + 1];
		String[] unCateType = new String[underTxtCnt + 1];
		long[] upGoodsCataSeq = new long[upperTxtCnt + 1];
		long[] unGoodsCataSeq = new long[underTxtCnt + 1];
		
		for(int i = 0; i <= upperTxtCnt; i++) {
			upCatgryCdArr[i] = req.getParameter("upCatgryCd"+i);
			upCatgryNmArr[i] = req.getParameter("upCatgryNm"+i);
			upNoteContArr[i] = req.getParameter("upNoteCont"+i);
			upUseYnArr[i] = req.getParameter("upUseYn"+i);
			upClassLvlCdArr[i] = req.getParameter("upClassLvlCd"+i);
			upCateType[i] = req.getParameter("upCateType"+i);
			upGoodsCataSeq[i] = req.getParameter("upGoodsCataSeq"+i) == null? 0L : Long.parseLong(req.getParameter("upGoodsCataSeq"+i));
		}
		for(int i = 0; i <= underTxtCnt; i++) {
			unCatgryCdArr[i] = req.getParameter("unCatgryCd"+i);
			unCatgryNmArr[i] = req.getParameter("unCatgryNm"+i);
			unNoteContArr[i] = req.getParameter("unNoteCont"+i);
			unUseYnArr[i] = req.getParameter("unUseYn"+i);
			unClassLvlCdArr[i] = req.getParameter("unClassLvlCd"+i);
			unCateType[i] = req.getParameter("unCateType"+i);
			unGoodsCataSeq[i] = req.getParameter("unGoodsCataSeq"+i) == null? 0L : Long.parseLong(req.getParameter("unGoodsCataSeq"+i));
		}
		
		
		CateVO pvo = new CateVO();
		pvo.setCatgryCd(catgryCd);
		pvo.setGoodsCataSeq(goodsCataSeq);
		pvo.setUpCatgryCdArr(upCatgryCdArr);
		pvo.setUnCatgryCdArr(unCatgryCdArr);
		pvo.setUpCatgryNmArr(upCatgryNmArr);
		pvo.setUnCatgryNmArr(unCatgryNmArr);
		pvo.setUpNoteContArr(upNoteContArr);
		pvo.setUnNoteContArr(unNoteContArr);
		pvo.setUpUseYnArr(upUseYnArr);
		pvo.setUnUseYnArr(unUseYnArr);		
		pvo.setGoodsCd(goodsCd);
		pvo.setUprClassCd(uprClassCd);
		pvo.setRgstId(rgstId);
		pvo.setRgstDate(rgstDate);
		pvo.setUpdtId(updtId);
		pvo.setUpdtDate(updtDate);
		pvo.setUpClassLvlCdArr(upClassLvlCdArr);
		pvo.setUnClassLvlCdArr(unClassLvlCdArr);
		pvo.setUpCateType(upCateType);
		pvo.setUnCateType(unCateType);
		pvo.setUpGoodsCataSeq(upGoodsCataSeq);
		pvo.setUnGoodsCataSeq(unGoodsCataSeq);
		
		return pvo;
	}
	
	public CateVO selectCateOne(CateVO pvo) {
		return dao.selectCateOne(pvo);
	}

	public List<CateVO> selectCateList(CateVO pvo) {
		//upper
		List<CateVO> upperList = dao.selectCateList(pvo);
		return upperList;
	}
	public List<CateVO> selectCateUnList(CateVO pvo) {
		//under
		List<CateVO> underList = dao.selectCateUnList(pvo);
		return underList;
	}
	
	public int saveCate(CateVO pvo) {
		int result = 1;
//		int upperCnt = pvo.get
//		int underCnt = pvo.get
		String[] upCatgryCd = pvo.getUpCatgryCdArr();
		String[] unCatgryCd = pvo.getUnCatgryCdArr();
		String[] upCatgryNm = pvo.getUpCatgryNmArr();
		String[] unCatgryNm = pvo.getUnCatgryNmArr();
		String[] upNoteCont = pvo.getUpNoteContArr();
		String[] unNoteCont = pvo.getUnNoteContArr();
		String[] upUseYn = pvo.getUpUseYnArr();
		String[] unUseYn = pvo.getUnUseYnArr();
		String[] upClassLvlCd = pvo.getUpClassLvlCdArr();
		String[] unClassLvlCd = pvo.getUnClassLvlCdArr();
		String[] upCateType = pvo.getUpCateType();
		String[] unCateType = pvo.getUnCateType();
		long[] upGoodsCataSeq = pvo.getUpGoodsCataSeq();
		long[] unGoodsCataSeq = pvo.getUnGoodsCataSeq();
		
		try {
			for (int i = 0; i < upperTxtCnt; i++) {//pvo.getUpCatgryCdArr().length-1
				pvo.setCatgryCd(upCatgryCd[i]);
				pvo.setCatgryNm(upCatgryNm[i]);
				pvo.setNoteCont(upNoteCont[i]);
				pvo.setUseYn(upUseYn[i]);
				pvo.setClassLvlCd(upClassLvlCd[i]);
				pvo.setUprClassCd(upCatgryCd[i]);
				pvo.setGoodsCataSeq(upGoodsCataSeq[i]);
//				pvo.setCateType(upCateType[i]);
				if(upCateType[i].equals("cateInsert")) {
					dao.insertCate(pvo);
				}
				else {//if(upCateType[i].equals("cateUpdate")) 
					dao.updateCate(pvo);
					
				}
			}
			for (int i = 0; i < underTxtCnt; i++) {//pvo.getUnCatgryCdArr().length-1
				pvo.setCatgryCd(unCatgryCd[i]);
				pvo.setCatgryNm(unCatgryNm[i]);
				pvo.setNoteCont(unNoteCont[i]);
				pvo.setUseYn(unUseYn[i]);
				pvo.setClassLvlCd(unClassLvlCd[i]);
				pvo.setUprClassCd(unCatgryCd[i].substring(0, 4));
				pvo.setGoodsCataSeq(unGoodsCataSeq[i]);
				dao.updateCate(pvo);
				if(unCateType[i].equals("cateInsert")) {
					dao.insertCate(pvo);
				}else{// if(unCateType[i].equals("cateUpdate"))
					dao.updateCate(pvo);
				}
			}
		} catch (Exception e) {
			result = 0;
		}
		
		return result;
	}
	
	public int updateCate(CateVO pvo) {
		return dao.updateCate(pvo);
	}
	
	public int deleteCate(CateVO pvo) {
		return dao.deleteCate(pvo);
	}
}
