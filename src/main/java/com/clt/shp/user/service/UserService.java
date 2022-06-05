package com.clt.shp.user.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.clt.shp.entr.EntrVO;
import com.clt.shp.entr.dao.EntrDao;
import com.clt.shp.user.UserVO;
import com.clt.shp.user.dao.UserDao;
import com.clt.shp.user.dao.impl.UserDaoOracle;

public class UserService {

	private UserDao userDao;
	private EntrDao entrDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void setEntrDao(EntrDao entrDao) {
		this.entrDao = entrDao;
	}


	public UserVO parameterSetting(HttpServletRequest req) {
		UserVO pvo = new UserVO();
		// 파라미터 셋팅
		long usrBaseSeq = req.getParameter("usrBaseSeq") == null? 0L : Long.parseLong(req.getParameter("usrBaseSeq"));
		String usrId = req.getParameter("usrId");
		String usrNm = req.getParameter("usrNm");
		String passWd = req.getParameter("passWd");
		String usrBirth = req.getParameter("usrBirth");
		String emailAddr = req.getParameter("emailAddr");
		String cellNo = req.getParameter("cellNo");
		String landAddrBase = req.getParameter("landAddrBase");
		String landAddrDtl = req.getParameter("landAddrDtl");
		String landPostNo = req.getParameter("landPostNo");
		String loadAddrBase = req.getParameter("loadAddrBase");
		String loadAddrDtl = req.getParameter("loadAddrDtl");
		String loadPostNo = req.getParameter("loadPostNo");
		String passWdChgDate = req.getParameter("passWdChgDate");
		String lockYn = req.getParameter("lockYn");
		String rgstId = req.getParameter("rgstId");
		String rgstDate = req.getParameter("rgstDate");
		String updtId = req.getParameter("updtId");
		String updtDate = req.getParameter("updtDate");
		String useYn = req.getParameter("useYn");
		
		String userSequence = req.getParameter("userSequence") == null ? "" : req.getParameter("userSequence");

		String searchType = req.getParameter("searchType");
		String searchText = req.getParameter("searchText");
		String searchGradeUpperType = req.getParameter("searchGradeUpperType");
		String searchGradeUnderType = req.getParameter("searchGradeUnderType");
		String searchStartRgstDate = req.getParameter("searchStartRgstDate");
		String searchEndRgstDate = req.getParameter("searchEndRgstDate");

		pvo.setUsrBaseSeq(usrBaseSeq);
		pvo.setUsrId(usrId);
		pvo.setUsrNm(usrNm);
		pvo.setPassWd(passWd);
		pvo.setUsrBirth(usrBirth);
		pvo.setEmailAddr(emailAddr);
		pvo.setCellNo(cellNo);
		pvo.setLandAddrBase(landAddrBase);
		pvo.setLandAddrDtl(landAddrDtl);
		pvo.setLandPostNo(landPostNo);
		pvo.setLoadAddrBase(loadAddrBase);
		pvo.setLoadAddrDtl(loadAddrDtl);
		pvo.setLoadPostNo(loadPostNo);
		pvo.setPassWdChgDate(passWdChgDate);
		pvo.setLockYn(lockYn);
		pvo.setRgstId(rgstId);
		pvo.setRgstDate(rgstDate);
		pvo.setUpdtId(updtId);
		pvo.setUpdtDate(updtDate);
		pvo.setUseYn(useYn);
		pvo.setSearchType(searchType);
		pvo.setSearchText(searchText);
		pvo.setSearchGradeUpperType(searchGradeUpperType);
		pvo.setSearchGradeUnderType(searchGradeUnderType);
		pvo.setSearchStartRgstDate(searchStartRgstDate);
		pvo.setSearchEndRgstDate(searchEndRgstDate);
		pvo.setUserSequence(userSequence);
		
		return pvo;
	}
	

	public UserVO selectUserOne(UserVO pvo) {
		return userDao.selectUser(pvo);
	}

	public List<UserVO> selectUserList(UserVO param) {
		return userDao.selectListUser(param);
	}
	public int insertUser(UserVO pvo) {
		return userDao.insertUser(pvo);
	}
	
	public int updateUser(UserVO pvo) {
		return userDao.updateUser(pvo);
	}
	
	public int deleteUser(UserVO pvo) {
		return userDao.deleteUser(pvo);
	}
	public UserVO userLogin(UserVO pvo) {
		EntrVO entrPvo = new EntrVO();
		entrPvo.setUsrId(pvo.getUsrId());
		
		UserVO sessionVO = userDao.userLogin(pvo);
		List<EntrVO> entrList = null;
		if(null != sessionVO) {
			entrList = entrDao.selectEntrList(entrPvo);
			sessionVO.setEntrList(entrList);
		}
		return sessionVO;
	}
}
