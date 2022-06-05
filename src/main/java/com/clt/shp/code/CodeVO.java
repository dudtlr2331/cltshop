package com.clt.shp.code;

public class CodeVO {
	private long stdCdBaseSeq; /*시퀀스*/
	private String codeNm; /*코드 이름*/
	private String codeVal; /*코드 값*/
	private String codeDesc; /*설명*/
	private String grpCd; /*코드 그룹*/
	private int grpOrdr; /*그룹 순번*/
	private String useYn; /*사용 여부*/
	private String rgstId; /*등록 아이디*/
	private String rgstDate; /*등록일*/
	private String updtId; /*수정 아이디*/
	private String updtDate; /*수정일*/
	
	private String searchGrpCd;
	
	public CodeVO() {
		
	}

	public CodeVO(String codeNm, String codeVal, String codeDesc, String grpCd, int grpOrdr, String useYn, String rgstId, String updtId) {
		this.codeNm = codeNm;
		this.codeVal = codeVal;
		this.codeDesc = codeDesc;
		this.grpCd = grpCd;
		this.grpOrdr = grpOrdr;
		this.useYn = useYn;
		this.rgstId = rgstId;
		this.updtId = updtId;
	}

	public CodeVO(long stdCdBaseSeq, String codeNm, String codeVal, String codeDesc, String grpCd, int grpOrdr,
				  String useYn, String rgstId, String rgstDate, String updtId, String updtDate) {
		super();
		this.stdCdBaseSeq = stdCdBaseSeq;
		this.codeNm = codeNm;
		this.codeVal = codeVal;
		this.codeDesc = codeDesc;
		this.grpCd = grpCd;
		this.grpOrdr = grpOrdr;
		this.useYn = useYn;
		this.rgstId = rgstId;
		this.rgstDate = rgstDate;
		this.updtId = updtId;
		this.updtDate = updtDate;
	}

	public long getStdCdBaseSeq() {
		return stdCdBaseSeq;
	}

	public void setStdCdBaseSeq(long stdCdBaseSeq) {
		this.stdCdBaseSeq = stdCdBaseSeq;
	}

	public String getCodeNm() {
		return codeNm;
	}

	public void setCodeNm(String codeNm) {
		this.codeNm = codeNm;
	}

	public String getCodeVal() {
		return codeVal;
	}

	public void setCodeVal(String codeVal) {
		this.codeVal = codeVal;
	}

	public String getCodeDesc() {
		return codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public String getGrpCd() {
		return grpCd;
	}

	public void setGrpCd(String grpCd) {
		this.grpCd = grpCd;
	}

	public int getGrpOrdr() {
		return grpOrdr;
	}

	public void setGrpOrdr(int grpOrdr) {
		this.grpOrdr = grpOrdr;
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
	public String getSearchGrpCd() {
		return searchGrpCd;
	}
	public void setSearchGrpCd(String searchGrpCd) {
		this.searchGrpCd = searchGrpCd;
	}

	@Override
	public String toString() {
		return "CodeVO [stdCdBaseSeq=" + stdCdBaseSeq + ", codeNm=" + codeNm + ", codeVal=" + codeVal + ", codeDesc="
				+ codeDesc + ", grpCd=" + grpCd + ", grpOrdr=" + grpOrdr + ", useYn=" + useYn + ", rgstId=" + rgstId
				+ ", rgstDate=" + rgstDate + ", updtId=" + updtId + ", updtDate=" + updtDate + "]";
	}
}
