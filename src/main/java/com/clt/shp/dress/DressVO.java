package com.clt.shp.dress;

import java.sql.Date;

public class DressVO {
	private int saleBoardRpySeq;
	private int saleBoardSeq;
	private int goodsCd;
	private int entrNo;
	private String bulTitNm; //제목
	private String bulCont; //내용
	private int rpyLvl; //답글 레벨
	private int parSaleBoardRpySn; //부모답글 번호
	private int qryCnt; //조회수
	private int lkeCnt; //추천수
	private String rgstId;
	private String rgstDate;
	private String updtId;
	private String updtDate;
	private String useYn;
	private String imgPath;
	private String imgNm;
	private String noticeDoc;
	private String ordNo;
	private String usrId;
	private String ordStat;
	private String ordrId;
	private String ordrNm;
	private String ordrPhon;
	private String ordrEmail;
	private String acqrPhon;
	private String acqrNm;
	private String acqrAddr;
	private String acqrAddrDtl;
	private String acqrEmail;
	private String prclWay;
	private String packWay;
	private String payWay;
	private long payMny;
	private String reqMemo;
	private Date ordDate;
	private int billNum;

	private String rvwTag;

	private String selectedSaleRvwItem;

	public DressVO(){
		
	}

	public DressVO(int saleBoardRpySeq, int saleBoardSeq, int goodsCd, int entrNo, String bulTitNm, String bulCont,
			int rpyLvl, int parSaleBoardRpySn, int qryCnt, int lkeCnt, String rgstId, String rgstDate, String updtId,
			String updtDate, String useYn, String imgPath, String imgNm, String rvwTag) {
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
		this.rvwTag = rvwTag;
	}

	public String getPrclWay() {
		return prclWay;
	}

	public void setPrclWay(String prclWay) {
		this.prclWay = prclWay;
	}

	public String getPackWay() {
		return packWay;
	}

	public void setPackWay(String packWay) {
		this.packWay = packWay;
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

	public String getOrdNo() {
		return ordNo;
	}

	public void setOrdNo(String ordNo) {
		this.ordNo = ordNo;
	}

	public String getUsrId() {
		return usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public String getOrdStat() {
		return ordStat;
	}

	public void setOrdStat(String ordStat) {
		this.ordStat = ordStat;
	}

	public String getOrdrId() {
		return ordrId;
	}

	public void setOrdrId(String ordrId) {
		this.ordrId = ordrId;
	}

	public String getOrdrNm() {
		return ordrNm;
	}

	public void setOrdrNm(String ordrNm) {
		this.ordrNm = ordrNm;
	}

	public String getOrdrPhon() {
		return ordrPhon;
	}

	public void setOrdrPhon(String ordrPhon) {
		this.ordrPhon = ordrPhon;
	}

	public String getOrdrEmail() {
		return ordrEmail;
	}

	public void setOrdrEmail(String ordrEmail) {
		this.ordrEmail = ordrEmail;
	}

	public String getAcqrPhon() {
		return acqrPhon;
	}

	public void setAcqrPhon(String acqrPhon) {
		this.acqrPhon = acqrPhon;
	}

	public String getAcqrNm() {
		return acqrNm;
	}

	public void setAcqrNm(String acqrNm) {
		this.acqrNm = acqrNm;
	}

	public String getAcqrAddr() {
		return acqrAddr;
	}

	public void setAcqrAddr(String acqrAddr) {
		this.acqrAddr = acqrAddr;
	}

	public String getAcqrAddrDtl() {
		return acqrAddrDtl;
	}

	public void setAcqrAddrDtl(String acqrAddrDtl) {
		this.acqrAddrDtl = acqrAddrDtl;
	}

	public String getAcqrEmail() {
		return acqrEmail;
	}

	public void setAcqrEmail(String acqrEmail) {
		this.acqrEmail = acqrEmail;
	}

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public long getPayMny() {
		return payMny;
	}

	public void setPayMny(long payMny) {
		this.payMny = payMny;
	}

	public String getReqMemo() {
		return reqMemo;
	}

	public void setReqMemo(String reqMemo) {
		this.reqMemo = reqMemo;
	}

	public Date getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}

	public int getBillNum() {
		return billNum;
	}

	public void setBillNum(int billNum) {
		this.billNum = billNum;
	}

	public String getSelectedSaleRvwItem() {
		return selectedSaleRvwItem;
	}

	public void setSelectedSaleRvwItem(String selectedSaleRvwItem) {
		this.selectedSaleRvwItem = selectedSaleRvwItem;
	}

	public String getRvwTag() {
		return rvwTag;
	}

	public void setRvwTag(String rvwTag) {
		this.rvwTag = rvwTag;
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
