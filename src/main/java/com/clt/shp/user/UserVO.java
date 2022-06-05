package com.clt.shp.user;

import java.util.ArrayList;
import java.util.List;

import com.clt.shp.entr.EntrVO;

public class UserVO {
	private long usrBaseSeq;
	private String usrId;
	private String usrNm;
	private String passWd;
	private String usrBirth;
	private String emailAddr;
	private String cellNo;
	private String landAddrBase;
	private String landAddrDtl;
	private String landPostNo;
	private String loadAddrBase;
	private String loadAddrDtl;
	private String loadPostNo;
	private String passWdChgDate; //Date -> String으로 받음
	private String lockYn;
	private String rgstId;
	private String rgstDate; //Date -> String으로 받음
	private String updtId;
	private String updtDate; //Date -> String으로 받음
	private String useYn;
	
	private String userSequence; // 리스트 순서
	
	private String searchType;
	private String searchText;
	private String searchGradeUpperType;
	private String searchGradeUnderType;
	private String searchStartRgstDate;
	private String searchEndRgstDate;
	
	private List<EntrVO> entrList = new ArrayList<EntrVO>();
	
	public UserVO() {
		super();
	}
	
	public UserVO(String usrId, String usrNm, String passWd, String usrBirth, String emailAddr, String cellNo,
			String landAddrBase, String landAddrDtl, String landPostNo, String loadAddrBase, String loadAddrDtl,
			String loadPostNo, String rgstId) {
		super();
		this.usrId = usrId;
		this.usrNm = usrNm;
		this.passWd = passWd;
		this.usrBirth = usrBirth;
		this.emailAddr = emailAddr;
		this.cellNo = cellNo;
		this.landAddrBase = landAddrBase;
		this.landAddrDtl = landAddrDtl;
		this.landPostNo = landPostNo;
		this.loadAddrBase = loadAddrBase;
		this.loadAddrDtl = loadAddrDtl;
		this.loadPostNo = loadPostNo;
		this.rgstId = rgstId;
	}

	public UserVO(long usrBaseSeq, String usrId, String usrNm, String passWd, String usrBirth, String emailAddr, String cellNo,
			String landAddrBase, String landAddrDtl, String landPostNo, String loadAddrBase, String loadAddrDtl,
			String loadPostNo, String passWdChgDate, String lockYn, String rgstId, String rgstDate, String updtId,
			String updtDate, String useYn) {
		super();
		this.usrBaseSeq = usrBaseSeq;
		this.usrId = usrId;
		this.usrNm = usrNm;
		this.passWd = passWd;
		this.usrBirth = usrBirth;
		this.emailAddr = emailAddr;
		this.cellNo = cellNo;
		this.landAddrBase = landAddrBase;
		this.landAddrDtl = landAddrDtl;
		this.landPostNo = landPostNo;
		this.loadAddrBase = loadAddrBase;
		this.loadAddrDtl = loadAddrDtl;
		this.loadPostNo = loadPostNo;
		this.passWdChgDate = passWdChgDate;
		this.lockYn = lockYn;
		this.rgstId = rgstId;
		this.rgstDate = rgstDate;
		this.updtId = updtId;
		this.updtDate = updtDate;
		this.useYn = useYn;
	}
	
	
	public long getUsrBaseSeq() {
		return usrBaseSeq;
	}
	public void setUsrBaseSeq(long usrBaseSeq) {
		this.usrBaseSeq = usrBaseSeq;
	}
	public String getUsrId() {
		return usrId;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	public String getUsrNm() {
		return usrNm;
	}
	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}
	public String getPassWd() {
		return passWd;
	}
	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
	public String getUsrBirth() {
		return usrBirth;
	}
	public void setUsrBirth(String usrBirth) {
		this.usrBirth = usrBirth;
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	public String getCellNo() {
		return cellNo;
	}
	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}
	public String getLandAddrBase() {
		return landAddrBase;
	}
	public void setLandAddrBase(String landAddrBase) {
		this.landAddrBase = landAddrBase;
	}
	public String getLandAddrDtl() {
		return landAddrDtl;
	}
	public void setLandAddrDtl(String landAddrDtl) {
		this.landAddrDtl = landAddrDtl;
	}
	public String getLandPostNo() {
		return landPostNo;
	}
	public void setLandPostNo(String landPostNo) {
		this.landPostNo = landPostNo;
	}
	public String getLoadAddrBase() {
		return loadAddrBase;
	}
	public void setLoadAddrBase(String loadAddrBase) {
		this.loadAddrBase = loadAddrBase;
	}
	public String getLoadAddrDtl() {
		return loadAddrDtl;
	}
	public void setLoadAddrDtl(String loadAddrDtl) {
		this.loadAddrDtl = loadAddrDtl;
	}
	public String getLoadPostNo() {
		return loadPostNo;
	}
	public void setLoadPostNo(String loadPostNo) {
		this.loadPostNo = loadPostNo;
	}
	public String getPassWdChgDate() {
		return passWdChgDate;
	}
	public void setPassWdChgDate(String passWdChgDate) {
		this.passWdChgDate = passWdChgDate;
	}
	public String getLockYn() {
		return lockYn;
	}
	public void setLockYn(String lockYn) {
		this.lockYn = lockYn;
	}
	public String getRgstId() {
		return rgstId;
	}
	public void setRgstId(String rgstId) {
		this.rgstId = rgstId;
	}
	public String getRgstDate() {
		return rgstDate;
	}
	public void setRgstDate(String rgstDate) {
		this.rgstDate = rgstDate;
	}
	public String getUpdtId() {
		return updtId;
	}
	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}
	public String getUpdtDate() {
		return updtDate;
	}
	public void setUpdtDate(String updtDate) {
		this.updtDate = updtDate;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public String getUserSequence() {
		return userSequence;
	}
	public void setUserSequence(String userSequence) {
		this.userSequence = userSequence;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchText() {
		return searchText;
	}
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	public String getSearchGradeUpperType() {
		return searchGradeUpperType;
	}
	public void setSearchGradeUpperType(String searchGradeUpperType) {
		this.searchGradeUpperType = searchGradeUpperType;
	}
	public String getSearchGradeUnderType() {
		return searchGradeUnderType;
	}
	public void setSearchGradeUnderType(String searchGradeUnderType) {
		this.searchGradeUnderType = searchGradeUnderType;
	}
	public String getSearchStartRgstDate() {
		return searchStartRgstDate;
	}
	public void setSearchStartRgstDate(String searchStartRgstDate) {
		this.searchStartRgstDate = searchStartRgstDate;
	}
	public String getSearchEndRgstDate() {
		return searchEndRgstDate;
	}
	public void setSearchEndRgstDate(String searchEndRgstDate) {
		this.searchEndRgstDate = searchEndRgstDate;
	}
	public List<EntrVO> getEntrList() {
		return entrList;
	}
	public void setEntrList(List<EntrVO> entrList) {
		this.entrList = entrList;
	}
	@Override
	public String toString() {
		return "UserVO [usrBaseSeq=" + usrBaseSeq + ", usrId=" + usrId + ", usrNm=" + usrNm + ", passWd=" + passWd
				+ ", usrBirth=" + usrBirth + ", emailAddr=" + emailAddr + ", cellNo=" + cellNo + ", landAddrBase="
				+ landAddrBase + ", landAddrDtl=" + landAddrDtl + ", landPostNo=" + landPostNo + ", loadAddrBase="
				+ loadAddrBase + ", loadAddrDtl=" + loadAddrDtl + ", loadPostNo=" + loadPostNo + ", passWdChgDate="
				+ passWdChgDate + ", lockYn=" + lockYn + ", rgstId=" + rgstId + ", rgstDate=" + rgstDate + ", updtId="
				+ updtId + ", updtDate=" + updtDate + ", useYn=" + useYn + ", searchType=" + searchType
				+ ", searchText=" + searchText + ", searchGradeUpperType=" + searchGradeUpperType
				+ ", searchGradeUnderType=" + searchGradeUnderType + ", searchStartRgstDate=" + searchStartRgstDate
				+ ", searchEndRgstDate=" + searchEndRgstDate + "]";
	}
}