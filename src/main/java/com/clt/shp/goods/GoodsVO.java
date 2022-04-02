package com.clt.shp.goods;

public class GoodsVO {
	private long goodsInfoSeq;
	private int goodsCategoryId;
	private int sizeId;
	private int goodsId;
	private int colorId;
	private String goodsName;
	private int goodsPrice;
	private int goodsStock;
	private String goodsDescription;
	private String goodsImg;
	
	public GoodsVO() {
		
	}

	public GoodsVO(long goodsInfoSeq, int goodsCategoryId, int sizeId, int goodsId, int colorId, String goodsName,
			int goodsPrice, int goodsStock, String goodsDescription, String goodsImg) {
		this.goodsInfoSeq = goodsInfoSeq;
		this.goodsCategoryId = goodsCategoryId;
		this.sizeId = sizeId;
		this.goodsId = goodsId;
		this.colorId = colorId;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsStock = goodsStock;
		this.goodsDescription = goodsDescription;
		this.goodsImg = goodsImg;
	}

	public long getGoodsInfoSeq() {
		return goodsInfoSeq;
	}

	public void setGoodsInfoSeq(long goodsInfoSeq) {
		this.goodsInfoSeq = goodsInfoSeq;
	}

	public int getGoodsCategoryId() {
		return goodsCategoryId;
	}

	public void setGoodsCategoryId(int goodsCategoryId) {
		this.goodsCategoryId = goodsCategoryId;
	}

	public int getSizeId() {
		return sizeId;
	}

	public void setSizeId(int sizeId) {
		this.sizeId = sizeId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getColorId() {
		return colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public int getGoodsStock() {
		return goodsStock;
	}

	public void setGoodsStock(int goodsStock) {
		this.goodsStock = goodsStock;
	}

	public String getGoodsDescription() {
		return goodsDescription;
	}

	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}

	public String getGoodsImg() {
		return goodsImg;
	}

	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}

	@Override
	public String toString() {
		return "GoodsVO [goodsInfoSeq=" + goodsInfoSeq + ", goodsCategoryId=" + goodsCategoryId + ", sizeId=" + sizeId
				+ ", goodsId=" + goodsId + ", colorId=" + colorId + ", goodsName=" + goodsName + ", goodsPrice="
				+ goodsPrice + ", goodsStock=" + goodsStock + ", goodsDescription=" + goodsDescription + ", goodsImg="
				+ goodsImg + "]";
	}
	
}
