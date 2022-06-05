package com.clt.shp.code.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.clt.shp.code.CodeVO;
import com.clt.shp.code.dao.CodeDao;

public class CodeService {

	private CodeDao dao;
	
	public CodeService(CodeDao dao) {
		this.dao = dao;
	}

	//파라미터 셋팅
	public CodeVO parameterSetting(HttpServletRequest req) {
		long stdCdBaseSeq = req.getParameter("stdCdBaseSeq") == null? 0L : Long.parseLong(req.getParameter("stdCdBaseSeq"));
		String codeNm = req.getParameter("codeNm");
		String codeVal = req.getParameter("codeVal");
		String codeDesc = req.getParameter("codeDesc");
		String grpCd = req.getParameter("grpCd");
		int grpOrdr = req.getParameter("grpOrdr") == null? 0 : Integer.parseInt(req.getParameter("grpOrdr"));
		String useYn = req.getParameter("useYn");
		String rgstId = req.getParameter("rgstId");
		String rgstDate = req.getParameter("rgstDate");
		String updtId = req.getParameter("updtId");
		String updtDate = req.getParameter("updtDate");
		
		CodeVO pvo = new CodeVO();
		
		pvo.setStdCdBaseSeq(stdCdBaseSeq);
		pvo.setCodeNm(codeNm);
		pvo.setCodeVal(codeVal);
		pvo.setCodeDesc(codeDesc);
		pvo.setGrpCd(grpCd);
		pvo.setGrpOrdr(grpOrdr);
		pvo.setUseYn(useYn);
		pvo.setRgstId(rgstId);
		pvo.setRgstDate(rgstDate);
		pvo.setUpdtId(updtId);
		pvo.setUpdtDate(updtDate);
		
		return pvo;
	}
	
	public CodeVO selectCodeOne(CodeVO pvo) {
		return dao.selectCodeOne(pvo);
	}

	public List<CodeVO> selectCodeList(CodeVO pvo) {
		return dao.selectCodeList(pvo);
	}

	public List<CodeVO> selectSaleStatCdList(CodeVO pvo) {
		return dao.selectSaleStatCdList(pvo);
	}
	public List<CodeVO> selectOrdCdList(CodeVO pvo) {
		return dao.selectOrdCdList(pvo);
	}
	public List<CodeVO> selectUsrCdList(CodeVO pvo) {
		return dao.selectUsrCdList(pvo);
	}
	public List<CodeVO> selectAdmCdList(CodeVO pvo) {
		return dao.selectAdmCdList(pvo);
	}
	
	public int insertCode(CodeVO pvo) {
		return dao.insertCode(pvo);
	}
	
	public int updateCode(CodeVO pvo) {
		return dao.updateCode(pvo);
	}
	
	public int deleteCode(CodeVO pvo) {
		return dao.deleteCode(pvo);
	}
}
