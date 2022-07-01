package com.clt.shp.mypage;

public class MypgVO {
    private String ordNo; /*주문번호*/
    private String rgstDate; /*주문일자*/
    private String ordrId; /*주문자 아이디*/
    private String ordrNm; /*주문자 이름*/
    private String ordrPhon; /*주문자 폰번호*/
    private long payMny; /*결제금액*/
    private String imgPath; /*이미지 경로*/
    private String imgNm; /*이미지 이름*/
    private String bulTitNm; /*판매게시판 제목*/
    private int goodsQty; /*수량*/
    private long goodsPrc; /*상품금액*/
    private String ordStat; /*주문상태코드*/
    private String codeNm; /*주문상태코드이름*/
    private String payWay; /*결제수단*/
    private long dlvPrc; /*배송비*/
    private String acqrNm; /*수령자 이름*/
    private String acqrPhon; /*수령자 휴대폰*/
    private String acqrAddr; /*수령지 주소*/
    private String acqrAddrDtl; /*수령지 상세 주소*/
    private String reqMemo; /*배송메모*/

    private String usrId;

    private long saleBoardRpySeq;
    public MypgVO(){}

    public MypgVO(String ordNo, String rgstDate, String ordrId, String ordrNm, String ordrPhon, long payMny, String imgPath, String imgNm, String bulTitNm, int goodsQty, long goodsPrc, String ordStat, String codeNm, String payWay, long dlvPrc, String acqrNm, String acqrPhon, String acqrAddr, String acqrAddrDtl, String reqMemo, long saleBoardRpySeq) {
        this.ordNo = ordNo;
        this.rgstDate = rgstDate;
        this.ordrId = ordrId;
        this.ordrNm = ordrNm;
        this.ordrPhon = ordrPhon;
        this.payMny = payMny;
        this.imgPath = imgPath;
        this.imgNm = imgNm;
        this.bulTitNm = bulTitNm;
        this.goodsQty = goodsQty;
        this.goodsPrc = goodsPrc;
        this.ordStat = ordStat;
        this.codeNm = codeNm;
        this.payWay = payWay;
        this.dlvPrc = dlvPrc;
        this.acqrNm = acqrNm;
        this.acqrPhon = acqrPhon;
        this.acqrAddr = acqrAddr;
        this.acqrAddrDtl = acqrAddrDtl;
        this.reqMemo = reqMemo;
        this.saleBoardRpySeq = saleBoardRpySeq;
    }

    public String getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(String ordNo) {
        this.ordNo = ordNo;
    }

    public String getRgstDate() {
        return rgstDate;
    }

    public void setRgstDate(String rgstDate) {
        this.rgstDate = rgstDate;
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

    public long getPayMny() {
        return payMny;
    }

    public void setPayMny(long payMny) {
        this.payMny = payMny;
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

    public String getBulTitNm() {
        return bulTitNm;
    }

    public void setBulTitNm(String bulTitNm) {
        this.bulTitNm = bulTitNm;
    }

    public int getGoodsQty() {
        return goodsQty;
    }

    public void setGoodsQty(int goodsQty) {
        this.goodsQty = goodsQty;
    }

    public long getGoodsPrc() {
        return goodsPrc;
    }

    public void setGoodsPrc(long goodsPrc) {
        this.goodsPrc = goodsPrc;
    }

    public String getOrdStat() {
        return ordStat;
    }

    public void setOrdStat(String ordStat) {
        this.ordStat = ordStat;
    }

    public String getCodeNm() {
        return codeNm;
    }

    public void setCodeNm(String codeNm) {
        this.codeNm = codeNm;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public long getDlvPrc() {
        return dlvPrc;
    }

    public void setDlvPrc(long dlvPrc) {
        this.dlvPrc = dlvPrc;
    }

    public String getAcqrNm() {
        return acqrNm;
    }

    public void setAcqrNm(String acqrNm) {
        this.acqrNm = acqrNm;
    }

    public String getAcqrPhon() {
        return acqrPhon;
    }

    public void setAcqrPhon(String acqrPhon) {
        this.acqrPhon = acqrPhon;
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

    public String getReqMemo() {
        return reqMemo;
    }

    public void setReqMemo(String reqMemo) {
        this.reqMemo = reqMemo;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public long getSaleBoardRpySeq() {
        return saleBoardRpySeq;
    }

    public void setSaleBoardRpySeq(long saleBoardRpySeq) {
        this.saleBoardRpySeq = saleBoardRpySeq;
    }

    @Override
    public String toString() {
        return "MypgVO{" +
                "ordNo='" + ordNo + '\'' +
                ", rgstDate='" + rgstDate + '\'' +
                ", ordrId='" + ordrId + '\'' +
                ", ordrNm='" + ordrNm + '\'' +
                ", ordrPhon='" + ordrPhon + '\'' +
                ", payMny=" + payMny +
                ", imgPath='" + imgPath + '\'' +
                ", imgNm='" + imgNm + '\'' +
                ", bulTitNm='" + bulTitNm + '\'' +
                ", goodsQty=" + goodsQty +
                ", goodsPrc=" + goodsPrc +
                ", ordStat='" + ordStat + '\'' +
                ", codeNm='" + codeNm + '\'' +
                ", payWay='" + payWay + '\'' +
                ", dlvPrc=" + dlvPrc +
                ", acqrNm='" + acqrNm + '\'' +
                ", acqrPhon='" + acqrPhon + '\'' +
                ", acqrAddr='" + acqrAddr + '\'' +
                ", acqrAddrDtl='" + acqrAddrDtl + '\'' +
                ", reqMemo='" + reqMemo + '\'' +
                '}';
    }
}
