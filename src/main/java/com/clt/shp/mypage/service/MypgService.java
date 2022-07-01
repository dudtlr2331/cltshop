package com.clt.shp.mypage.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.clt.shp.mypage.MypgVO;
import com.clt.shp.mypage.dao.MypgDao;
import com.clt.shp.qna.QnaVO;
import com.clt.shp.qna.dao.QnaDao;

public class MypgService {
	private MypgDao mypgDao;

	public MypgService(MypgDao mypgDao){
		this.mypgDao = mypgDao;
	}
	
	public MypgVO parameterSetting(HttpServletRequest req) {
		String ordNo = req.getParameter("ordNo");
		String rgstDate = req.getParameter("rgstDate");
		String ordrId = req.getParameter("ordrId");
		String ordrNm = req.getParameter("ordrNm");
		String ordrPhon = req.getParameter("ordrPhon");
		long payMny = Long.parseLong(req.getParameter("payMny"));
		String imgPath = req.getParameter("imgPath");
		String imgNm = req.getParameter("imgNm");
		String bulTitNm = req.getParameter("bulTitNm");
		int goodsQty = Integer.parseInt(req.getParameter("goodsQty"));
		long goodsPrc = Long.parseLong(req.getParameter("goodsPrc"));
		String ordStat = req.getParameter("ordStat");
		String codeNm = req.getParameter("codeNm");
		String payWay = req.getParameter("payWay");
		long dlvPrc = Long.parseLong(req.getParameter("dlvPrc"));
		String acqrNm = req.getParameter("acqrNm");
		String acqrPhon = req.getParameter("acqrPhon");
		String acqrAddr = req.getParameter("acqrAddr");
		String acqrAddrDtl = req.getParameter("acqrAddrDtl");
		String reqMemo = req.getParameter("reqMemo");
		long saleBoardRpySeq = req.getParameter("saleBoardRpySeq") == null ? 0 : Long.parseLong(req.getParameter("saleBoardRpySeq"));

		String usrId = req.getParameter("usrId");

		MypgVO pvo = new MypgVO();
		pvo.setOrdNo(ordNo);
		pvo.setRgstDate(rgstDate);
		pvo.setOrdrId(ordrId);
		pvo.setOrdrNm(ordrNm);
		pvo.setOrdrPhon(ordrPhon);
		pvo.setPayMny(payMny);
		pvo.setImgPath(imgPath);
		pvo.setImgNm(imgNm);
		pvo.setBulTitNm(bulTitNm);
		pvo.setGoodsQty(goodsQty);
		pvo.setGoodsPrc(goodsPrc);
		pvo.setOrdStat(ordStat);
		pvo.setCodeNm(codeNm);
		pvo.setPayWay(payWay);
		pvo.setDlvPrc(dlvPrc);
		pvo.setAcqrNm(acqrNm);
		pvo.setAcqrPhon(acqrPhon);
		pvo.setAcqrAddr(acqrAddr);
		pvo.setAcqrAddrDtl(acqrAddrDtl);
		pvo.setReqMemo(reqMemo);
		pvo.setSaleBoardRpySeq(saleBoardRpySeq);
		pvo.setUsrId(usrId);
		return pvo;
	}

	public List<MypgVO> selectMypageList(MypgVO pvo){
		return mypgDao.selectMypageList(pvo);
	}
}
