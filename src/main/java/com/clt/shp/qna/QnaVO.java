package com.clt.shp.qna;

import java.sql.Date;

public class QnaVO {
	private long qnaBoardSeq;
	private String titNm;
	private String cont;
	private String rgstId;
	private String rgstDate;
	private String updtId;
	private String updtDate;
	private String qnaTp;
	private String ansrStat;
	private String useYn;
	private String passYn;
	private String passWd;
	
	public QnaVO() {
		
	}
	
	public QnaVO(long qnaBoardSeq, String titNm, String cont, String rgstId, String rgstDate, String updtId,
			String updtDate, String qnaTp, String ansrStat, String useYn, String passYn, String passWd) {
		super();
		this.qnaBoardSeq = qnaBoardSeq;
		this.titNm = titNm;
		this.cont = cont;
		this.rgstId = rgstId;
		this.rgstDate = rgstDate;
		this.updtId = updtId;
		this.updtDate = updtDate;
		this.qnaTp = qnaTp;
		this.ansrStat = ansrStat;
		this.useYn = useYn;
		this.passYn = passYn;
		this.passWd = passWd;
	}

	public long getQnaBoardSeq() {
		return qnaBoardSeq;
	}

	public void setQnaBoardSeq(long qnaBoardSeq) {
		this.qnaBoardSeq = qnaBoardSeq;
	}

	public String getTitNm() {
		return titNm;
	}

	public void setTitNm(String titNm) {
		this.titNm = titNm;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
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

	public String getQnaTp() {
		return qnaTp;
	}

	public void setQnaTp(String qnaTp) {
		this.qnaTp = qnaTp;
	}

	public String getAnsrStat() {
		return ansrStat;
	}

	public void setAnsrStat(String ansrStat) {
		this.ansrStat = ansrStat;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getPassYn() {
		return passYn;
	}

	public void setPassYn(String passYn) {
		this.passYn = passYn;
	}

	public String getPassWd() {
		return passWd;
	}

	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}

	@Override
	public String toString() {
		return "QnaVO [qnaBoardSeq=" + qnaBoardSeq + ", titNm=" + titNm + ", cont=" + cont + ", rgstId=" + rgstId
				+ ", rgstDate=" + rgstDate + ", updtId=" + updtId + ", updtDate=" + updtDate + ", qnaTp=" + qnaTp
				+ ", ansrStat=" + ansrStat + ", useYn=" + useYn + ", passYn=" + passYn + ", passWd=" + passWd + "]";
	}
}
