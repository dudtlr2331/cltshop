package com.clt.adm.sales;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.code.CodeVO;
import com.clt.shp.code.dao.impl.CodeDaoOracle;
import com.clt.shp.code.service.CodeService;
import com.clt.shp.entr.EntrVO;
import com.clt.shp.entr.dao.impl.EntrDaoOracle;
import com.clt.shp.entr.service.EntrService;
import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.sales.SalesVO;
import com.clt.shp.sales.dao.impl.SalesDaoOracle;
import com.clt.shp.sales.service.SalesService;
import com.clt.shp.user.UserVO;

public class AdmSalesController implements Controller{
	private String command = "";
	private SalesService salesService;
	private GoodsService goodsService;
	private EntrService entrService;
	private CodeService codeService;
	
	public AdmSalesController(String command) {
		salesService = new SalesService(new SalesDaoOracle());
		entrService = new EntrService(new EntrDaoOracle());
		goodsService = new GoodsService(new GoodsDaoOracle());
		codeService = new CodeService(new CodeDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String leftMenuNav = HandlerMapping.ADM_SALES_LIST;
		
		//세션값 빼기
		HttpSession session = req.getSession();
		UserVO loginInfo = (UserVO) session.getAttribute("loginInfo");

		if(null == loginInfo) {
			modelAndView.setPath("/DispatcherServlet?command=user_login");
			modelAndView.setRedirect(true);
			return modelAndView;
		}

		//파라미터 셋팅
		SalesVO pvo = salesService.parameterSetting(req);

		//업체 리스트
		EntrVO entrVO = new EntrVO();
		entrVO.setUsrId(loginInfo.getUsrId());
		List<EntrVO> entrList = entrService.selectEntrList(entrVO);

		req.setAttribute("entrList", entrList);
		
		//판매상태 공통코드
		CodeVO codeVO = new CodeVO();
		codeVO.setSearchGrpCd("STD001");
		List<CodeVO> saleCodeList = codeService.selectCodeList(codeVO);
		
		req.setAttribute("saleCodeList", saleCodeList);

		//비즈니스 처리
		//어드민 판매게시판 리스트
		if(command.equals(HandlerMapping.ADM_SALES_LIST)) {
			long searchEntrNo = 0L;
			if(null != pvo.getSearchEntrNo() && !"".equals(pvo.getSearchEntrNo())){
				searchEntrNo = Long.parseLong(pvo.getSearchEntrNo());
			}else{
				searchEntrNo = loginInfo.getEntrList().get(0).getEntrNo();
			}

			pvo.setEntrNo(searchEntrNo);

			List<SalesVO> salesList = salesService.selectSalesList(pvo);

			req.setAttribute("salesList", salesList);
			req.setAttribute("searchEntrNo", searchEntrNo);

			modelAndView.setPath("/WEB-INF/jsp/adm/sales/sales_list.jsp");
			modelAndView.setRedirect(false);
		}
		//어드민 판매게시판 등록 화면
		else if(command.equals(HandlerMapping.ADM_SALES_REGISTER)){
			String searchEntrNo = String.valueOf(entrList.get(0).getEntrNo());
			
			//등록가능한 상품 표시
			GoodsVO goodsVO = new GoodsVO();
			goodsVO.setSearchEntrNo(searchEntrNo);
			List<GoodsVO> goodsList = goodsService.selectGoodsList(goodsVO);

			req.setAttribute("goodsList", goodsList);
			req.setAttribute("searchEntrNo", searchEntrNo);

			modelAndView.setPath("/WEB-INF/jsp/adm/sales/sales_register.jsp");
			modelAndView.setRedirect(false);
		}
		//어드민 판매게시판 등록 액션
		else if(command.equals(HandlerMapping.ADM_SALES_REGISTER_ACT)){
			int result = salesService.insertSales(pvo);

			modelAndView.setPath("/DispatcherServlet?command=adm_sales_list");
			modelAndView.setRedirect(true);
		}
		//어드민 판매게시판 수정 화면
		else if(command.equals(HandlerMapping.ADM_SALES_UPDATE)){
			SalesVO detail = salesService.selectSalesOne(pvo);

			//등록가능한 상품 표시
			GoodsVO goodsVO = new GoodsVO();
			goodsVO.setSearchEntrNo(String.valueOf(detail.getEntrNo()));
			List<GoodsVO> goodsList = goodsService.selectGoodsList(goodsVO);

			req.setAttribute("detail", detail);
			req.setAttribute("goodsList", goodsList);

			modelAndView.setPath("/WEB-INF/jsp/adm/sales/sales_edit.jsp");
			modelAndView.setRedirect(false);
		}
		//어드민 판매게시판 수정 액션
		else if(command.equals(HandlerMapping.ADM_SALES_UPDATE_ACT)){
			int result = salesService.updateSales(pvo);

			modelAndView.setPath("/DispatcherServlet?command=adm_sales_list");
			modelAndView.setRedirect(true);
		}
		//어드민 판매게시판 삭제 액션
		else if(command.equals(HandlerMapping.ADM_SALES_REMOVE_ACT)){
			int result = salesService.deleteSales(pvo);

			modelAndView.setPath("/DispatcherServlet?command=adm_sales_list");
			modelAndView.setRedirect(true);
		}

		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", leftMenuNav);

		return modelAndView;
	}
}
