package com.clt.shp.entr;

import java.sql.Date;

public class EntrVO {
	private long entrNo;
	private String usrId;
	private String entrNm;
	private String bmanRegNo;
	private String presNm;
	private String presTell;
	private String presEmail;
	private String aempNm;
	private String aempTell;
	private String aempEmail;
	private int score;
	private String landAddrBase;
	private String landAddrDtl;
	private String landPostNo;
	private String loadAddrBase;
	private String loadPostNo;
	private Date opnDate;
	private Date closeDate;
	private String opnYn;
	private String useYn;
	private String rgstId;
	private Date rgstDate;
	private String updtId;
	private Date updtDate;
	
	public EntrVO() {}

	public EntrVO(String usrId, String entrNm, String bmanRegNo, String presNm, String presTell, String presEmail,
			String aempNm, String aempTell, String aempEmail, int score, String landAddrBase, String landAddrDtl,
			String landPostNo, String loadAddrBase, String loadPostNo, Date opnDate, Date closeDate, String opnYn,
			String useYn, String rgstId, String updtId) {
		super();
		this.usrId = usrId;
		this.entrNm = entrNm;
		this.bmanRegNo = bmanRegNo;
		this.presNm = presNm;
		this.presTell = presTell;
		this.presEmail = presEmail;
		this.aempNm = aempNm;
		this.aempTell = aempTell;
		this.aempEmail = aempEmail;
		this.score = score;
		this.landAddrBase = landAddrBase;
		this.landAddrDtl = landAddrDtl;
		this.landPostNo = landPostNo;
		this.loadAddrBase = loadAddrBase;
		this.loadPostNo = loadPostNo;
		this.opnDate = opnDate;
		this.closeDate = closeDate;
		this.opnYn = opnYn;
		this.useYn = useYn;
		this.rgstId = rgstId;
		this.updtId = updtId;
	}

	public EntrVO(long entrNo, String usrId, String entrNm, String bmanRegNo, String presNm, String presTell,
			String presEmail, String aempNm, String aempTell, String aempEmail, int score, String landAddrBase,
			String landAddrDtl, String landPostNo, String loadAddrBase, String loadPostNo, Date opnDate, Date closeDate,
			String opnYn, String useYn, String rgstId, Date rgstDate, String updtId, Date updtDate) {
		super();
		this.entrNo = entrNo;
		this.usrId = usrId;
		this.entrNm = entrNm;
		this.bmanRegNo = bmanRegNo;
		this.presNm = presNm;
		this.presTell = presTell;
		this.presEmail = presEmail;
		this.aempNm = aempNm;
		this.aempTell = aempTell;
		this.aempEmail = aempEmail;
		this.score = score;
		this.landAddrBase = landAddrBase;
		this.landAddrDtl = landAddrDtl;
		this.landPostNo = landPostNo;
		this.loadAddrBase = loadAddrBase;
		this.loadPostNo = loadPostNo;
		this.opnDate = opnDate;
		this.closeDate = closeDate;
		this.opnYn = opnYn;
		this.useYn = useYn;
		this.rgstId = rgstId;
		this.rgstDate = rgstDate;
		this.updtId = updtId;
		this.updtDate = updtDate;
	}

	public long getEntrNo() {
		return entrNo;
	}

	public void setEntrNo(long entrNo) {
		this.entrNo = entrNo;
	}

	public String getUsrId() {
		return usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public String getEntrNm() {
		return entrNm;
	}

	public void setEntrNm(String entrNm) {
		this.entrNm = entrNm;
	}

	public String getBmanRegNo() {
		return bmanRegNo;
	}

	public void setBmanRegNo(String bmanRegNo) {
		this.bmanRegNo = bmanRegNo;
	}

	public String getPresNm() {
		return presNm;
	}

	public void setPresNm(String presNm) {
		this.presNm = presNm;
	}

	public String getPresTell() {
		return presTell;
	}

	public void setPresTell(String presTell) {
		this.presTell = presTell;
	}

	public String getPresEmail() {
		return presEmail;
	}

	public void setPresEmail(String presEmail) {
		this.presEmail = presEmail;
	}

	public String getAempNm() {
		return aempNm;
	}

	public void setAempNm(String aempNm) {
		this.aempNm = aempNm;
	}

	public String getAempTell() {
		return aempTell;
	}

	public void setAempTell(String aempTell) {
		this.aempTell = aempTell;
	}

	public String getAempEmail() {
		return aempEmail;
	}

	public void setAempEmail(String aempEmail) {
		this.aempEmail = aempEmail;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
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

	public String getLoadPostNo() {
		return loadPostNo;
	}

	public void setLoadPostNo(String loadPostNo) {
		this.loadPostNo = loadPostNo;
	}

	public Date getOpnDate() {
		return opnDate;
	}

	public void setOpnDate(Date opnDate) {
		this.opnDate = opnDate;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public String getOpnYn() {
		return opnYn;
	}

	public void setOpnYn(String opnYn) {
		this.opnYn = opnYn;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getRgstId() {
		return rgstId;
	}

	public void setRgstId(String rgstId) {
		this.rgstId = rgstId;
	}

	public Date getRgstDate() {
		return rgstDate;
	}

	public void setRgstDate(Date rgstDate) {
		this.rgstDate = rgstDate;
	}

	public String getUpdtId() {
		return updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public Date getUpdtDate() {
		return updtDate;
	}

	public void setUpdtDate(Date updtDate) {
		this.updtDate = updtDate;
	}

	@Override
	public String toString() {
		return "EntrVO [entrNo=" + entrNo + ", usrId=" + usrId + ", entrNm=" + entrNm + ", bmanRegNo=" + bmanRegNo
				+ ", presNm=" + presNm + ", presTell=" + presTell + ", presEmail=" + presEmail + ", aempNm=" + aempNm
				+ ", aempTell=" + aempTell + ", aempEmail=" + aempEmail + ", score=" + score + ", landAddrBase="
				+ landAddrBase + ", landAddrDtl=" + landAddrDtl + ", landPostNo=" + landPostNo + ", loadAddrBase="
				+ loadAddrBase + ", loadPostNo=" + loadPostNo + ", opnDate=" + opnDate + ", closeDate=" + closeDate
				+ ", opnYn=" + opnYn + ", useYn=" + useYn + ", rgstId=" + rgstId + ", rgstDate=" + rgstDate
				+ ", updtId=" + updtId + ", updtDate=" + updtDate + "]";
	}
}