package com.clt.shp.main;

import com.clt.shp.goods.GoodsVO;
import com.clt.shp.order.OrderVO;
import com.clt.shp.sales.SalesVO;

public class GoodsDetailVO {
	private SalesVO sale = new SalesVO();
	private GoodsVO goods = new GoodsVO();
	private OrderVO order = new OrderVO();

	private String searchCatgryCd;
	private String searchCatgryCd2;
	private String searchGoodsCd;

	public GoodsDetailVO() {}

	public SalesVO getSale() {
		return sale;
	}
	public void setSale(SalesVO sale) {
		this.sale = sale;
	}
	public GoodsVO getGoods() {
		return goods;
	}
	public void setGoods(GoodsVO goods) {
		this.goods = goods;
	}

	public String getSearchCatgryCd() {
		return searchCatgryCd;
	}

	public void setSearchCatgryCd(String searchCatgryCd) {
		this.searchCatgryCd = searchCatgryCd;
	}

	public String getSearchCatgryCd2() {
		return searchCatgryCd2;
	}

	public void setSearchCatgryCd2(String searchCatgryCd2) {
		this.searchCatgryCd2 = searchCatgryCd2;
	}

	public String getSearchGoodsCd() {
		return searchGoodsCd;
	}

	public void setSearchGoodsCd(String searchGoodsCd) {
		this.searchGoodsCd = searchGoodsCd;
	}

	
	public OrderVO getOrder() {
		return order;
	}

	public void setOrder(OrderVO order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "GoodsDetailVO [sale=" + sale + ", goods=" + goods + ", order=" + order + ", searchCatgryCd="
				+ searchCatgryCd + ", searchCatgryCd2=" + searchCatgryCd2 + ", searchGoodsCd=" + searchGoodsCd + "]";
	}

}
