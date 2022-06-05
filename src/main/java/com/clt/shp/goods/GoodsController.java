package com.clt.shp.goods;

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
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.main.GoodsDetailVO;
import com.clt.shp.sales.dao.impl.SalesDaoOracle;
import com.clt.shp.sales.service.SalesService;

public class GoodsController implements Controller {
	private String command = "";
	private GoodsService goodsService;
	private CateService cateService;

	public GoodsController(String command) {
		goodsService = new GoodsService(new GoodsDaoOracle());
		cateService = new CateService(new CateDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		//세션
		HttpSession session = req.getSession();
//		UserVO sessionVO =
		
		//파라미터 셋팅
		GoodsVO pvo = goodsService.parameterSetting(req);
		
		//공통 코드 가져오기
		CateVO cateVO = new CateVO();
		List<CateVO> oneDepthCateList = cateService.selectCateList(cateVO);

		req.setAttribute("oneDepthCateList", oneDepthCateList);

		//비즈니스 로직 수행후 뷰페이지 리턴
		if(command.equals(HandlerMapping.GOODS_LIST)) { //상품 리스트
			List<GoodsVO> goodsList = goodsService.selectGoodsList(pvo);
			req.setAttribute("goodsList", goodsList);
			modelAndView.setPath("/WEB-INF/jsp/shp/goods/goods_list.jsp");
			modelAndView.setRedirect(false);
		} else if(command.equals(HandlerMapping.GOODS_CATEGORY)) { //카테고리 메인
			List<GoodsVO> goodsList = goodsService.selectGoodsList(pvo);
			req.setAttribute("goodsList", goodsList);
			modelAndView.setPath("/WEB-INF/jsp/shp/goods/goods_category.jsp");
			modelAndView.setRedirect(false);
		} else if(command.equals(HandlerMapping.GOODS_CART_ADD_AJAX)){ //장바구니 담기
//			int result = goodsService.insertGoodsBasket(pvo);
//			if(result > 0){

//			}else{

//			}
//			req.setAttribute("result", result == 1 ? "success":"fail");
			modelAndView.setPath("/WEB-INF/jsp/shp/goods/goods_category.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.GOODS_DETAIL)) { //상품상세
			
			GoodsDetailVO detail = goodsService.selectGoodsDetail(pvo.getSearchSaleBoardSeq());
			
			req.setAttribute("detail", detail);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/goods/goods_detail.jsp");
			modelAndView.setRedirect(false);
		}

		return modelAndView;
	}

}
