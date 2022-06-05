package com.clt.shp.order.dao;

import java.util.List;

import com.clt.shp.main.GoodsDetailVO;
import com.clt.shp.order.OrderVO;

public interface OrderDao {
	//주문 기본
	int insertOrd(OrderVO pvo);
	OrderVO selectOrdOne(OrderVO pvo);
	List<OrderVO> selectOrdList(OrderVO pvo);
	int updateOrd(OrderVO pvo);
	int deleteOrd(OrderVO pvo);
	//주문 상세
	int insertOrdDtl(OrderVO pvo);
	OrderVO selectOrdDtlOne(OrderVO pvo);
	List<OrderVO> selectOrdDtlList(OrderVO pvo);
	int updateOrdDtl(OrderVO pvo);
	int deleteOrdDtl(OrderVO pvo);
	
	List<OrderVO> searchIdOrdList(OrderVO pvo);
	OrderVO searchOrdNoList(OrderVO pvo);
	List<OrderVO> searchOrdDtlGoods(OrderVO pvo);
	
	//장바구니
	int insertBasket(OrderVO pvo);
	int deleteBasket(OrderVO pvo);
	int updateBasket(OrderVO pvo);
	List<OrderVO> selectBasketList(OrderVO pvo);
	List<GoodsDetailVO> ordBasketSelect(OrderVO pvo);
	List<OrderVO> selectCartOrdDtlList(OrderVO pvo);
}