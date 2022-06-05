package com.clt.shp.qna.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.clt.shp.qna.QnaVO;
import com.clt.shp.qna.dao.QnaDao;

public class QnaService {

	private QnaDao dao;
	
	public QnaService(QnaDao dao) {
		this.dao = dao;
	}

	//파라미터 셋팅
	public QnaVO parameterSetting(HttpServletRequest req) {
		long qnaBoardSeq = req.getParameter("qnaBoardSeq") == null? 0L : Long.parseLong(req.getParameter("qnaBoardSeq"));
		String titNm = req.getParameter("titNm");
		String cont= req.getParameter("cont");
		String rgstId = req.getParameter("rgstId");
		String rgstDate = req.getParameter("rgstDate");
		String updtId = req.getParameter("updtId");
		String updtDate = req.getParameter("updtDate");
		String qnaTp = req.getParameter("qnaTp");
		String ansrStat = req.getParameter("ansrStat");
		String useYn = req.getParameter("useYn");
		String passYn = req.getParameter("passYn");
		String passWd = req.getParameter("passWd");
		
		QnaVO pvo = new QnaVO();
		
		pvo.setQnaBoardSeq(qnaBoardSeq);
		pvo.setTitNm(titNm);
		pvo.setCont(cont);
		pvo.setRgstId(rgstId);
		pvo.setRgstDate(rgstDate);
		pvo.setUpdtId(updtId);
		pvo.setUpdtDate(updtDate);
		pvo.setQnaTp(qnaTp);
		pvo.setAnsrStat(ansrStat);
		pvo.setUseYn(useYn);
		pvo.setPassYn(passYn);
		pvo.setPassWd(passWd);
		
		return pvo;
	}
	
	public QnaVO selectQnaOne(QnaVO pvo) {
		return dao.selectQnaOne(pvo);
	}

	public List<QnaVO> selectQnaList(QnaVO pvo) {
		return dao.selectQnaList(pvo);
	}
	
	public int insertQna(QnaVO pvo) {
		return dao.insertQna(pvo);
	}
	
	public int updateQna(QnaVO pvo) {
		return dao.updateQna(pvo);
	}
	
	public int deleteQna(QnaVO pvo) {
		return dao.deleteQna(pvo);
	}
	
	public List<QnaVO> searchIdQnaList(QnaVO pvo) {
		return dao.searchIdQnaList(pvo);
	}
}
