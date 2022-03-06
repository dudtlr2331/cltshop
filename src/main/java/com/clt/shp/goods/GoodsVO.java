package com.clt.shp.goods;

public class GoodsVO {
	private long goodsInfoSeq;
	private String goodsNm;
	private int goodsPrc;
	private String goodsImg;
	
	public GoodsVO() {
		
	}
	public GoodsVO(long goodsInfoSeq, String goodsNm, int goodsPrc, String goodsImg) {
		this.goodsInfoSeq = goodsInfoSeq;
		this.goodsNm = goodsNm;
		this.goodsPrc = goodsPrc;
		this.goodsImg = goodsImg;
	}
	
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	public long getGoodsInfoSeq() {
		return goodsInfoSeq;
	}
	public void setGoodsInfoSeq(long goodsInfoSeq) {
		this.goodsInfoSeq = goodsInfoSeq;
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
	@Override
	public String toString() {
		return "GoodsVO [goodsInfoSeq=" + goodsInfoSeq + ", goodsNm=" + goodsNm + ", goodsPrc=" + goodsPrc
				+ ", goodsImg=" + goodsImg + "]";
	}
}
