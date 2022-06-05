package com.clt.shp.dress;

import java.sql.Date;

public class DressVO {
	int saleBoardRpySeq;
	int saleBoardSeq;
	int goodsCd;
	int entrNo;
	String bulTitNm; //제목
	String bulCont; //내용
	int rpyLvl; //답글 레벨
	int parSaleBoardRpySn; //부모답글 번호
	int qryCnt; //조회수
	int lkeCnt; //추천수
	String rgstId;
	String rgstDate;
	String updtId;
	String updtDate;
	String useYn;
	String imgPath;
	String imgNm;
	String noticeDoc;
	
	public DressVO(){
		
	}

	public DressVO(int saleBoardRpySeq, int saleBoardSeq, int goodsCd, int entrNo, String bulTitNm, String bulCont,
			int rpyLvl, int parSaleBoardRpySn, int qryCnt, int lkeCnt, String rgstId, String rgstDate, String updtId,
			String updtDate, String useYn, String imgPath, String imgNm) {
		super();
		this.saleBoardRpySeq = saleBoardRpySeq;
		this.saleBoardSeq = saleBoardSeq;
		this.goodsCd = goodsCd;
		this.entrNo = entrNo;
		this.bulTitNm = bulTitNm;
		this.bulCont = bulCont;
		this.rpyLvl = rpyLvl;
		this.parSaleBoardRpySn = parSaleBoardRpySn;
		this.qryCnt = qryCnt;
		this.lkeCnt = lkeCnt;
		this.rgstId = rgstId;
		this.rgstDate = rgstDate;
		this.updtId = updtId;
		this.updtDate = updtDate;
		this.useYn = useYn;
		this.imgPath = imgPath;
		this.imgNm = imgNm;
	}

	public String getNoticeDoc() {
		return noticeDoc;
	}

	public void setNoticeDoc(String noticeDoc) {
		this.noticeDoc = noticeDoc;
	}

	public int getSaleBoardRpySeq() {
		return saleBoardRpySeq;
	}

	public void setSaleBoardRpySeq(int saleBoardRpySeq) {
		this.saleBoardRpySeq = saleBoardRpySeq;
	}

	public int getSaleBoardSeq() {
		return saleBoardSeq;
	}

	public void setSaleBoardSeq(int saleBoardSeq) {
		this.saleBoardSeq = saleBoardSeq;
	}

	public int getGoodsCd() {
		return goodsCd;
	}

	public void setGoodsCd(int goodsCd) {
		this.goodsCd = goodsCd;
	}

	public int getEntrNo() {
		return entrNo;
	}

	public void setEntrNo(int entrNo) {
		this.entrNo = entrNo;
	}

	public String getBulTitNm() {
		return bulTitNm;
	}

	public void setBulTitNm(String bulTitNm) {
		this.bulTitNm = bulTitNm;
	}

	public String getBulCont() {
		return bulCont;
	}

	public void setBulCont(String bulCont) {
		this.bulCont = bulCont;
	}

	public int getRpyLvl() {
		return rpyLvl;
	}

	public void setRpyLvl(int rpyLvl) {
		this.rpyLvl = rpyLvl;
	}

	public int getParSaleBoardRpySn() {
		return parSaleBoardRpySn;
	}

	public void setParSaleBoardRpySn(int parSaleBoardRpySn) {
		this.parSaleBoardRpySn = parSaleBoardRpySn;
	}

	public int getQryCnt() {
		return qryCnt;
	}

	public void setQryCnt(int qryCnt) {
		this.qryCnt = qryCnt;
	}

	public int getLkeCnt() {
		return lkeCnt;
	}

	public void setLkeCnt(int lkeCnt) {
		this.lkeCnt = lkeCnt;
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

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getImgNm() {
		return imgNm;
	}

	public void setImgNm(String imgNm) {
		this.imgNm = imgNm;
	}

	@Override
	public String toString() {
		return "DressVO [saleBoardRpySeq=" + saleBoardRpySeq + ", saleBoardSeq=" + saleBoardSeq + ", goodsCd=" + goodsCd
				+ ", entrNo=" + entrNo + ", bulTitNm=" + bulTitNm + ", bulCont=" + bulCont + ", rpyLvl=" + rpyLvl
				+ ", parSaleBoardRpySn=" + parSaleBoardRpySn + ", qryCnt=" + qryCnt + ", lkeCnt=" + lkeCnt + ", rgstId="
				+ rgstId + ", rgstDate=" + rgstDate + ", updtId=" + updtId + ", updtDate=" + updtDate + ", useYn="
				+ useYn + ", imgPath=" + imgPath + ", imgNm=" + imgNm + "]";
	}

}
