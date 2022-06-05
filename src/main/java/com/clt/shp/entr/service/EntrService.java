package com.clt.shp.entr.service;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.clt.cmm.util.DateUtils;
import com.clt.shp.entr.EntrVO;
import com.clt.shp.entr.dao.EntrDao;
import com.clt.shp.user.UserVO;

public class EntrService {
	
	private EntrDao dao;
	
	public EntrService(EntrDao dao) {
		this.dao = dao;
	}
	
	//파라미터 셋팅
	public EntrVO parameterSetting(HttpServletRequest req) {
		long entrNo = req.getParameter("entrNo") == null? 0L : Long.parseLong(req.getParameter("entrNo"));
		String usrId  = req.getParameter("usrId");
		String entrNm  = req.getParameter("entrNm");
		String bmanRegNo  = req.getParameter("bmanRegNo");
		String presNm = req.getParameter("presNm");
		String presTell = req.getParameter("presTell");
		String presEmail = req.getParameter("presEmail");
		String aempNm = req.getParameter("aempNm");
		String aempTell = req.getParameter("aempTell");
		String aempEmail = req.getParameter("aempEmail");
		int score = req.getParameter("score") == null? 0 : Integer.parseInt(req.getParameter("score"));
		String landAddrBase = req.getParameter("landAddrBase");
		String landAddrDtl = req.getParameter("landAddrDtl");
		String landPostNo = req.getParameter("landPostNo");
		String loadAddrBase = req.getParameter("loadAddrBase");
		String loadPostNo = req.getParameter("loadPostNo");
		Date opnDate = DateUtils.stringToSqlDate(req.getParameter("opnDate"));
		Date closeDate = DateUtils.stringToSqlDate(req.getParameter("closeDate"));
		String opnYn = req.getParameter("opnYn");
		String useYn = req.getParameter("useYn");
		
		EntrVO evo = new EntrVO();
		evo.setEntrNo(entrNo);
		evo.setUsrId(usrId);
		evo.setEntrNm(entrNm);
		evo.setBmanRegNo(bmanRegNo);
		evo.setPresNm(presNm);
		evo.setPresTell(presTell);
		evo.setPresEmail(presEmail);
		evo.setAempNm(aempNm);
		evo.setAempTell(aempTell);
		evo.setAempEmail(aempEmail);
		evo.setScore(score);
		evo.setLandAddrBase(landAddrBase);
		evo.setLandAddrDtl(landAddrDtl);
		evo.setLandPostNo(landPostNo);
		evo.setLoadAddrBase(loadAddrBase);
		evo.setLoadPostNo(loadPostNo);
		evo.setOpnDate(opnDate);
		evo.setCloseDate(closeDate);
		evo.setOpnYn(opnYn);
		evo.setUseYn(useYn);

		return evo;
	}
	
	public List<EntrVO> selectEntrList(EntrVO evo){
		return dao.selectEntrList(evo);
	}
	public EntrVO selectEntrOne(EntrVO evo) {
		return dao.selectEntrOne(evo);
	}
	public int insertEntr(EntrVO evo) {
		return dao.insertEntr(evo);
	}
	public int updateEntr(EntrVO evo) {
		return dao.updateEntr(evo);
	}
	public int deleteEntr(EntrVO evo) {
		return dao.deleteEntr(evo);
	}
}
