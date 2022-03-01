package com.clt.shp.goods;

public class GoodsVO {
	private long goodsInfoSeq;
	private String goodsNm;
	private int goodsPrc;
	
	public GoodsVO() {
		
	}
	public GoodsVO(long goodsInfoSeq, String goodsNm, int goodsPrc) {
		this.goodsInfoSeq = goodsInfoSeq;
		this.goodsNm = goodsNm;
		this.goodsPrc = goodsPrc;
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
		return "GoodsVO [goodsInfoSeq=" + goodsInfoSeq + ", goodsNm=" + goodsNm + ", goodsPrc=" + goodsPrc + "]";
	}
}
