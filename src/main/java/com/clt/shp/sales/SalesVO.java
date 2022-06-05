package com.clt.shp.sales;

import java.sql.Date;

public class SalesVO {
    private long saleBoardSeq;
    private int goodsCd;
    private long entrNo;
    private String ntcSctCd;
    private String bulYn;
    private Date bulStrtDt;
    private Date bulEndDt;
    private String bulTitNm;
    private String bulCont;
    private int qryCnt;
    private long lkeCnt;
    private int goodsPrc;
    private int goodsSalePrc;
    private String prclWay;
    private int saleCnt;
    private String rgstId;
    private Date rgstDate;
    private String updtId;
    private Date updtDate;
    private String saleStatCd;
    private String useYn;
    private String description;

    private String searchEntrNo;

    public SalesVO() {
    }

    public SalesVO(int goodsCd, long entrNo, String ntcSctCd, String bulYn, Date bulStrtDt, Date bulEndDt,
			String bulTitNm, String bulCont, int qryCnt, long lkeCnt, int goodsPrc, int goodsSalePrc, String prclWay,
			int saleCnt, String rgstId, String updtId, String saleStatCd, String description) {
		super();
		this.goodsCd = goodsCd;
		this.entrNo = entrNo;
		this.ntcSctCd = ntcSctCd;
		this.bulYn = bulYn;
		this.bulStrtDt = bulStrtDt;
		this.bulEndDt = bulEndDt;
		this.bulTitNm = bulTitNm;
		this.bulCont = bulCont;
		this.qryCnt = qryCnt;
		this.lkeCnt = lkeCnt;
		this.goodsPrc = goodsPrc;
		this.goodsSalePrc = goodsSalePrc;
		this.prclWay = prclWay;
		this.saleCnt = saleCnt;
		this.rgstId = rgstId;
		this.updtId = updtId;
		this.saleStatCd = saleStatCd;
		this.description = description;
	}

	public SalesVO(long saleBoardSeq, int goodsCd, int entrNo, String ntcSctCd, String bulYn, Date bulStrtDt, Date bulEndDt, String bulTitNm, String bulCont, int qryCnt, long lkeCnt, int goodsPrc, int goodsSalePrc, String prclWay, int saleCnt, String rgstId, Date rgstDate, String updtId, Date updtDate, String saleStatCd, String useYn, String description) {
        this.saleBoardSeq = saleBoardSeq;
        this.goodsCd = goodsCd;
        this.entrNo = entrNo;
        this.ntcSctCd = ntcSctCd;
        this.bulYn = bulYn;
        this.bulStrtDt = bulStrtDt;
        this.bulEndDt = bulEndDt;
        this.bulTitNm = bulTitNm;
        this.bulCont = bulCont;
        this.qryCnt = qryCnt;
        this.lkeCnt = lkeCnt;
        this.goodsPrc = goodsPrc;
        this.goodsSalePrc = goodsSalePrc;
        this.prclWay = prclWay;
        this.saleCnt = saleCnt;
        this.rgstId = rgstId;
        this.rgstDate = rgstDate;
        this.updtId = updtId;
        this.updtDate = updtDate;
        this.saleStatCd = saleStatCd;
        this.useYn = useYn;
        this.description = description;
    }

    public long getSaleBoardSeq() {
        return saleBoardSeq;
    }

    public void setSaleBoardSeq(long saleBoardSeq) {
        this.saleBoardSeq = saleBoardSeq;
    }

    public String getNtcSctCd() {
        return ntcSctCd;
    }

    public void setNtcSctCd(String ntcSctCd) {
        this.ntcSctCd = ntcSctCd;
    }

    public String getBulYn() {
        return bulYn;
    }

    public void setBulYn(String bulYn) {
        this.bulYn = bulYn;
    }

    public Date getBulStrtDt() {
        return bulStrtDt;
    }

    public void setBulStrtDt(Date bulStrtDt) {
        this.bulStrtDt = bulStrtDt;
    }

    public Date getBulEndDt() {
        return bulEndDt;
    }

    public void setBulEndDt(Date bulEndDt) {
        this.bulEndDt = bulEndDt;
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

    public int getQryCnt() {
        return qryCnt;
    }

    public void setQryCnt(int qryCnt) {
        this.qryCnt = qryCnt;
    }

    public long getLkeCnt() {
        return lkeCnt;
    }

    public void setLkeCnt(long lkeCnt) {
        this.lkeCnt = lkeCnt;
    }

    public int getGoodsCd() {
        return goodsCd;
    }

    public void setGoodsCd(int goodsCd) {
        this.goodsCd = goodsCd;
    }

    public int getGoodsPrc() {
        return goodsPrc;
    }

    public void setGoodsPrc(int goodsPrc) {
        this.goodsPrc = goodsPrc;
    }

    public int getGoodsSalePrc() {
        return goodsSalePrc;
    }

    public void setGoodsSalePrc(int goodsSalePrc) {
        this.goodsSalePrc = goodsSalePrc;
    }

    public String getPrclWay() {
        return prclWay;
    }

    public void setPrclWay(String prclWay) {
        this.prclWay = prclWay;
    }

    public int getSaleCnt() {
        return saleCnt;
    }

    public void setSaleCnt(int saleCnt) {
        this.saleCnt = saleCnt;
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

    public String getSaleStatCd() {
        return saleStatCd;
    }

    public void setSaleStatCd(String saleStatCd) {
        this.saleStatCd = saleStatCd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }

    public long getEntrNo() {
        return entrNo;
    }

    public void setEntrNo(long entrNo) {
        this.entrNo = entrNo;
    }

    public String getSearchEntrNo() {
        return searchEntrNo;
    }

    public void setSearchEntrNo(String searchEntrNo) {
        this.searchEntrNo = searchEntrNo;
    }

    @Override
    public String toString() {
        return "SalesVO{" +
                "saleBoardSeq=" + saleBoardSeq +
                ", ntcSctCd='" + ntcSctCd + '\'' +
                ", bulYn='" + bulYn + '\'' +
                ", bulStrtDt=" + bulStrtDt +
                ", bulEndDt=" + bulEndDt +
                ", bulTitNm='" + bulTitNm + '\'' +
                ", bulCont='" + bulCont + '\'' +
                ", qryCnt=" + qryCnt +
                ", lkeCnt=" + lkeCnt +
                ", goodsCd=" + goodsCd +
                ", goodsPrc=" + goodsPrc +
                ", goodsSalePrc=" + goodsSalePrc +
                ", prclWay='" + prclWay + '\'' +
                ", saleCnt=" + saleCnt +
                ", rgstId='" + rgstId + '\'' +
                ", rgstDate=" + rgstDate +
                ", updtId='" + updtId + '\'' +
                ", updtDate=" + updtDate +
                ", saleStatCd='" + saleStatCd + '\'' +
                ", description='" + description + '\'' +
                ", useYn='" + useYn + '\'' +
                ", entrNo=" + entrNo +
                '}';
    }
}
