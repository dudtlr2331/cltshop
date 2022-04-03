package com.clt.shp.goods;

import java.sql.Date;

public class GoodsVO {
	private long goodsSeq;/*상품 시퀀스*/
	private long goodsCd;/*상품 코드*/
	private long entrNo;/*거래처 번호*/
	private String goodsNm;/*상품이름*/
	private int goodsPrc;/*상품가격*/
	private String catgryCd;/*대분류*/
	private String catgryCd2;/*소분류*/
	private int inyQty;/*재고수량*/
	private int dlvPrc;/*배송비*/
	private String goodsSize;/*상품싸이즈*/
	private String goodsClr;/*상품컬러*/
	private String imgPath;/*이미지경로*/
	private String imgNm;/*이미지이름*/
	private String goodsIntr;/*상품소개*/
	private String saleStatCd;/*판매상태*/
	private String useYn;/*사용여부*/
	private String rgstId;/*등록자*/
	private Date rgstDate;/*등록일*/
	private String updtId;/*수정자*/
	private Date updtDate;/*수정일*/
	
	public GoodsVO() {
	}
	public GoodsVO(long goodsSeq, long goodsCd, long entrNo, String goodsNm, int goodsPrc, String catgryCd, String catgryCd2,
			int inyQty, int dlvPrc, String goodsSize, String goodsClr, String imgPath, String imgNm, String goodsIntr,
			String saleStatCd, String useYn, String rgstId, Date rgstDate, String updtId, Date updtDate) {
		this.goodsSeq = goodsSeq;
		this.goodsCd = goodsCd;
		this.entrNo = entrNo;
		this.goodsNm = goodsNm;
		this.goodsPrc = goodsPrc;
		this.catgryCd = catgryCd;
		this.catgryCd2 = catgryCd2;
		this.inyQty = inyQty;
		this.dlvPrc = dlvPrc;
		this.goodsSize = goodsSize;
		this.goodsClr = goodsClr;
		this.imgPath = imgPath;
		this.imgNm = imgNm;
		this.goodsIntr = goodsIntr;
		this.saleStatCd = saleStatCd;
		this.useYn = useYn;
		this.rgstId = rgstId;
		this.rgstDate = rgstDate;
		this.updtId = updtId;
		this.updtDate = updtDate;
	}
	
	public long getGoodsSeq() {
		return goodsSeq;
	}
	public void setGoodsSeq(long goodsSeq) {
		this.goodsSeq = goodsSeq;
	}
	public long getGoodsCd() {
		return goodsCd;
	}
	public void setGoodsCd(long goodsCd) {
		this.goodsCd = goodsCd;
	}
	public long getEntrNo() {
		return entrNo;
	}
	public void setEntrNo(long entrNo) {
		this.entrNo = entrNo;
	}
	public String getGoodsNm() {
		return goodsNm;
	}
	public void setGoodsNm(String goodsNm) {
		this.goodsNm = goodsNm;
	}
	public int getGoodsPrc() {
		return goodsPrc;
	}
	public void setGoodsPrc(int goodsPrc) {
		this.goodsPrc = goodsPrc;
	}
	public String getCatgryCd() {
		return catgryCd;
	}
	public void setCatgryCd(String catgryCd) {
		this.catgryCd = catgryCd;
	}
	public String getCatgryCd2() {
		return catgryCd2;
	}
	public void setCatgryCd2(String catgryCd2) {
		this.catgryCd2 = catgryCd2;
	}
	public int getInyQty() {
		return inyQty;
	}
	public void setInyQty(int inyQty) {
		this.inyQty = inyQty;
	}
	public int getDlvPrc() {
		return dlvPrc;
	}
	public void setDlvPrc(int dlvPrc) {
		this.dlvPrc = dlvPrc;
	}
	public String getGoodsSize() {
		return goodsSize;
	}
	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	public String getGoodsClr() {
		return goodsClr;
	}
	public void setGoodsClr(String goodsClr) {
		this.goodsClr = goodsClr;
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
	public String getGoodsIntr() {
		return goodsIntr;
	}
	public void setGoodsIntr(String goodsIntr) {
		this.goodsIntr = goodsIntr;
	}
	public String getSaleStatCd() {
		return saleStatCd;
	}
	public void setSaleStatCd(String saleStatCd) {
		this.saleStatCd = saleStatCd;
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
		return "AdmGoodsVO [goodsCd=" + goodsCd + ", entrNo=" + entrNo + ", goodsNm=" + goodsNm + ", goodsPrc="
				+ goodsPrc + ", catgryCd=" + catgryCd + ", catgryCd2=" + catgryCd2 + ", inyQty=" + inyQty + ", dlvPrc="
				+ dlvPrc + ", goodsSize=" + goodsSize + ", goodsClr=" + goodsClr + ", imgPath=" + imgPath + ", imgNm="
				+ imgNm + ", goodsIntr=" + goodsIntr + ", saleStatCd=" + saleStatCd + ", useYn=" + useYn + ", rgstId="
				+ rgstId + ", rgstDate=" + rgstDate + ", updtId=" + updtId + ", updtDate=" + updtDate + "]";
	}
}