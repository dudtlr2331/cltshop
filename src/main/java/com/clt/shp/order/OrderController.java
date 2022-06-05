package com.clt.shp.order;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.cate.CateVO;
import com.clt.shp.cate.dao.impl.CateDaoOracle;
import com.clt.shp.cate.service.CateService;
import com.clt.shp.code.dao.impl.CodeDaoOracle;
import com.clt.shp.code.service.CodeService;
import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.main.GoodsDetailVO;
import com.clt.shp.order.dao.impl.OrderDaoOracle;
import com.clt.shp.order.service.OrderService;
import com.clt.shp.sales.SalesVO;
import com.clt.shp.sales.dao.impl.SalesDaoOracle;
import com.clt.shp.sales.service.SalesService;
import com.clt.shp.user.UserVO;

public class OrderController implements Controller {
	private String command = "";
	private OrderService orderService;
	private GoodsService goodsService;
	private CodeService codeService;
	private SalesService salsesService;
	private CateService cateService;

	public OrderController(String command) {
		this.orderService = new OrderService(new OrderDaoOracle());
		this.goodsService = new GoodsService(new GoodsDaoOracle());
		this.codeService = new CodeService(new CodeDaoOracle());
		this.salsesService = new SalesService(new SalesDaoOracle());
		this.cateService = new CateService(new CateDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = req.getSession();
		UserVO loginVo = (UserVO) session.getAttribute("loginInfo");
		
		if(loginVo == null) {
			session.setAttribute("message", "로그인을 해주세요.");
			modelAndView.setPath("/DispatcherServlet?command=user_login");
			modelAndView.setRedirect(true);
			return modelAndView;
		}
		
		//파라미터 셋팅
		OrderVO pvo = orderService.parameterSetting(req);
		GoodsVO goodsPvo = goodsService.parameterSetting(req);
		pvo.setUsrId(loginVo.getUsrId());

		//공통 코드 가져오기
		CateVO cateVO = new CateVO();
		List<CateVO> oneDepthCateList = cateService.selectCateList(cateVO);

		req.setAttribute("oneDepthCateList", oneDepthCateList);
		
		//비즈니스 로직
		if(command.equals(HandlerMapping.ORDER)) { //상품 리스트
			GoodsDetailVO detail = goodsService.selectGoodsDetail(goodsPvo.getSearchSaleBoardSeq());
			req.setAttribute("detail", detail);
			
			List<OrderVO> orderList = orderService.selectOrdList(pvo);
			req.setAttribute("orderList", orderList);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/order/order.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ORDER_REGISTER)) { //주문 생성
			pvo.setOrdStat("02"); //주문 상태 - 결제 완료
			orderService.insertOrd(pvo);
			orderService.insertOrdDtl(pvo);
			
			OrderVO orderOne = orderService.selectOrdOne(pvo);
			OrderVO orderDtlOne = orderService.selectOrdDtlOne(pvo);
			
			req.setAttribute("orderOne", orderOne);
			req.setAttribute("orderDtlOne", orderDtlOne);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/order/order_confirm.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ORDER_LIST)) { //주문 리스트
			List<OrderVO> orderList = orderService.selectOrdList(pvo);
			req.setAttribute("orderList", orderList);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/order/order_list.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ORDER_CART_LIST)) { //카테고리리스트
			modelAndView.setPath("/WEB-INF/jsp/shp/order/order_cart.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ORDER_CART_LIST_AJAX)) { //장바구니 리스트
			List<OrderVO> basketList = orderService.selectBasketList(pvo);
			
			String json = "{\"result\":\"success\", \"data\":[";
			for(int i=0; i<basketList.size(); i++) {
				json += "{\"ordBasketSeq\":\""+basketList.get(i).getOrdBasketSeq()+"\","
				+ "\"usrId\":\""+basketList.get(i).getUsrId()+"\","
				+ "\"goodsQty\":\""+basketList.get(i).getGoodsQty()+"\","
				+ "\"saleBoardSeq\":\""+basketList.get(i).getSaleBoardSeq()+"\","
				+ "\"imgPath\":\""+basketList.get(i).getImgPath()+"\","
				+ "\"imgNm\":\""+basketList.get(i).getImgNm()+"\","
				+ "\"bulTitNm\":\""+basketList.get(i).getBulTitNm()+"\","
				+ "\"goodsCd\":\""+basketList.get(i).getGoodsCd()+"\","
				+ "\"entrNo\":\""+basketList.get(i).getEntrNo()+"\","
				+ "\"goodsPrc\":\""+basketList.get(i).getGoodsPrc()+"\","
				+ "\"goodsSalePrc\":\""+basketList.get(i).getGoodsSalePrc()+"\","
				+ "\"saleCnt\":\""+basketList.get(i).getSaleCnt()+"\","
				+ "\"saleStatCd\":\""+basketList.get(i).getSaleStatCd()+"\","
				+ "\"description\":\""+basketList.get(i).getDescription()+"\""
				+ "}"
				;
				if(i < basketList.size()-1) {
					json +=",";
				}
			}
			json += "]}";
			
			req.setAttribute("json", json);

			modelAndView.setPath("jsonView.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ORDER_CART_INSERT_AJAX)) { //장바구니 담기
			String json = "";
			try {
				SalesVO pSaleVO = new SalesVO();
				pSaleVO.setSaleBoardSeq(Long.parseLong(pvo.getSearchSaleBoardSeq()));
				SalesVO saleVO = salsesService.selectSalesOne(pSaleVO);
				pvo.setGoodsCd(Long.parseLong(String.valueOf(saleVO.getGoodsCd())));
				pvo.setEntrNo(saleVO.getEntrNo());
				pvo.setSaleBoardSeq(Long.parseLong(pvo.getSearchSaleBoardSeq()));
				if(pvo.getGoodsQty() == 0) {
					pvo.setGoodsQty(1);
				}
				int result = orderService.insertBasket(pvo);
				if(result <1){
					json = "{\"result\":\"fail\"}";
				}else{
					json = "{\"result\":\"success\"}";
				}
			} catch (Exception e) {
				json = "{\"result\":\"fail\"}";
				e.printStackTrace();
			}
			req.setAttribute("json", json);

			modelAndView.setPath("jsonView.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ORDER_CART_DELETE_AJAX)) { //장바구니 삭제
			String seq = pvo.getCheckedList();
			String[] seqs = seq.split(",");
			String json = "";
			int result = 0;
			
			try {
				for(int i = 0; i < seqs.length; i++) {
					pvo.setOrdBasketSeq(Long.parseLong(seqs[i]));
					result = orderService.deleteBasket(pvo);
				}
				
				if(result < 1){
					json = "{\"result\":\"fail\"}";
				}else{
					json = "{\"result\":\"success\"}";
				}
			} catch (Exception e) {
				json = "{\"result\":\"fail\"}";
				e.printStackTrace();
			}
			req.setAttribute("json", json);

			modelAndView.setPath("jsonView.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ORDER_CART_REGISTER)){ //장바구니 구매
		   String seq = pvo.getCheckedList();
		   String key = seq.substring(0,seq.length()-1);
		   pvo.setKey(key);
		   
		   List<GoodsDetailVO> detail = orderService.ordBasketSelect(pvo);
		   Long totalPayment = (long) (detail.get(0).getGoods().getDlvPrc());
		   Long totalDlvPrc = (long) (detail.get(0).getGoods().getDlvPrc());
		   Long totalGoodsPrc = 0L;
		   
		   for(int i = 0; i < detail.size(); i++) {
			   totalPayment += (long) (detail.get(i).getSale().getGoodsPrc() - detail.get(i).getSale().getGoodsSalePrc());
			   totalGoodsPrc += (long) (detail.get(i).getSale().getGoodsPrc() - detail.get(i).getSale().getGoodsSalePrc());
		   }
		   
		   req.setAttribute("detail", detail);
		   req.setAttribute("totalPayment", totalPayment);
		   req.setAttribute("totalDlvPrc", totalDlvPrc);
		   req.setAttribute("totalGoodsPrc", totalGoodsPrc);
		   req.setAttribute("key", key);
			
		   modelAndView.setPath("/WEB-INF/jsp/shp/order/order_basket.jsp");
		   modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ORDER_CART_REGISTER_ACT)) { //장바구니 구매 액션 (주문테이블에 넣기)order_cart_register_act
			String seq = pvo.getCheckedList();
			String[] seqs = seq.split(",");
			
			pvo.setOrdStat("02"); //주문 상태 - 결제 완료
			orderService.insertOrd(pvo);
			orderService.insertCartOrdDtl(pvo);
			
			for(int i = 0; i < seqs.length; i++) {
				pvo.setOrdBasketSeq(Long.parseLong(seqs[i]));
				orderService.updateBasket(pvo);
			}
			OrderVO orderOne = orderService.selectOrdOne(pvo);
			List<OrderVO> orderDtlOne = orderService.selectCartOrdDtlList(pvo);
			
			req.setAttribute("orderOne", orderOne);
			req.setAttribute("orderDtlOne", orderDtlOne);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/order/order_basket_confirm.jsp");
			modelAndView.setRedirect(false);
		}

		return modelAndView;
	}

}
