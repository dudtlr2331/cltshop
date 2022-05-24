package com.clt.shp.cpn.service;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.clt.shp.cpn.CpnVO;
import com.clt.shp.cpn.dao.CpnDao;

public class CpnService {

	private CpnDao dao;
	
	public CpnService(CpnDao dao) {
		this.dao = dao;
	}
	
	private CpnVO parameterSetting(HttpServletRequest req) {
		long couInfoSeq = req.getParameter("couInfoSeq") == null? 0L : Long.parseLong(req.getParameter("couInfoSeq"));
		long couNum = req.getParameter("couNum") == null? 0L : Long.parseLong(req.getParameter("couNum"));
		String couName = req.getParameter("couName");
		int couDiscount = req.getParameter("couDiscount") == null? 0 : Integer.parseInt(req.getParameter("couDiscount"));
		String couEndDate = req.getParameter("couEndDate");
		int couCount = req.getParameter("couCount") == null? 0 : Integer.parseInt(req.getParameter("couCount"));

		CpnVO pvo = new CpnVO();
		pvo.setCouInfoSeq(couInfoSeq);
		pvo.setCouNum(couNum);
		pvo.setCouName(couName);
		pvo.setCouDiscount(couDiscount);
		pvo.setCouEndDate(couEndDate);
		pvo.setCouCount(couCount);
		
		return pvo;
	}

	public CpnVO selectCpnOne(CpnVO pvo) {
		return dao.selectCpnOne(pvo);
	}

	public List<CpnVO> selectCpnList(CpnVO pvo) {
		return dao.selectCpnList(pvo);
	}
	
	public int insertCpn(CpnVO pvo) {
		return dao.insertCpn(pvo);
	}
	
	public int updateCpn(CpnVO pvo) {
		return dao.updateCpn(pvo);
	}
	
	public int deleteCpn(CpnVO pvo) {
		return dao.deleteCpn(pvo);
	}
}
