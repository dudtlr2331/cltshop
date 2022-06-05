package com.clt.adm.goods;

import java.util.ArrayList;
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
import com.clt.shp.code.CodeVO;
import com.clt.shp.code.dao.impl.CodeDaoOracle;
import com.clt.shp.code.service.CodeService;
import com.clt.shp.entr.EntrVO;
import com.clt.shp.entr.dao.impl.EntrDaoOracle;
import com.clt.shp.entr.service.EntrService;
import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.user.UserVO;

public class AdmGoodsController implements Controller{
	private String command = "";
	private GoodsService goodsService;
	private EntrService entrService;
	private CateService cateService;
	private CodeService codeService;
	
	public AdmGoodsController(String command) {
		goodsService = new GoodsService(new GoodsDaoOracle());
		entrService = new EntrService(new EntrDaoOracle());
		cateService = new CateService(new CateDaoOracle());
		codeService = new CodeService(new CodeDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String leftMenuNav = HandlerMapping.ADM_GOODS_LIST;
		
		//세션
		HttpSession session = req.getSession();
		UserVO loginInfo = (UserVO) session.getAttribute("loginInfo");
		
		if(null == loginInfo) {
			modelAndView.setPath("/DispatcherServlet?command=user_login");
			modelAndView.setRedirect(true);
			return modelAndView;
		}
		
		//파라미터 셋팅
		GoodsVO pvo = goodsService.parameterSetting(req);
		
		//비즈니스 처리
		//상품 리스트 화면
		if(command.equals(HandlerMapping.ADM_GOODS_LIST)) {
			//검색 조건
			String searchEntrNo = pvo.getSearchEntrNo();
			
			//업체 리스트
			EntrVO entrVO = new EntrVO();
			entrVO.setUsrId(loginInfo.getUsrId());
			List<EntrVO> entrList = entrService.selectEntrList(entrVO);
			
			//판매 상태 공통코드
			CodeVO codeVo = new CodeVO();
			codeVo.setRgstId(loginInfo.getUsrId());
			List<CodeVO> codeList = codeService.selectSaleStatCdList(codeVo);
			
			//상품 리스트
			List<GoodsVO> goodsList = null;
			if(entrList.size() > 0) {
				if(null == searchEntrNo || "".equals(searchEntrNo) || "null".equals(searchEntrNo)) {
					pvo.setEntrNo(entrList.get(0).getEntrNo());
					searchEntrNo = "";
				}else {
					pvo.setEntrNo(Long.parseLong(searchEntrNo));
					goodsList = goodsService.selectGoodsList(pvo);
				}
			}
			
			req.setAttribute("codeList", codeList);
			req.setAttribute("entrList", entrList);
			req.setAttribute("goodsList", goodsList);
			req.setAttribute("searchEntrNo", searchEntrNo);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/goods/goods_list.jsp");
			modelAndView.setRedirect(false);
		}
		//상품 리스트 Ajax
		else if(command.equals(HandlerMapping.ADM_GOODS_LIST_AJAX)) {
			String searchEntrNo = pvo.getSearchEntrNo();
			pvo.setEntrNo(Long.parseLong(searchEntrNo));
			List<GoodsVO> goodsList = goodsService.selectGoodsList(pvo);
			
			String json = "";
			
			try {
				json = "{\"result\":\"success\",\"dataList\":[";
				for(int i=0; i<goodsList.size(); i++) {
					if(i>0) {
						json += ",";
					}
					json += "{\"goodsCd\":\"" + goodsList.get(i).getGoodsCd() + "\",\"goodsNm\":\"" + goodsList.get(i).getGoodsNm() + "\"}";
				}
				json += "]}";
			} catch (Exception e) {
				json = "{\"result\":\"fail\"}";
				e.printStackTrace();
			}
			
			req.setAttribute("json", json);
			
			modelAndView.setPath("jsonView.jsp");
			modelAndView.setRedirect(false);
		}
		//상품 등록 화면
		else if(command.equals(HandlerMapping.ADM_GOODS_REGISTER)) {
			//업체 리스트
			EntrVO entrVO = new EntrVO();
			entrVO.setUsrId(loginInfo.getUsrId());
			List<EntrVO> entrList = entrService.selectEntrList(entrVO);
			
			//카테고리 리스트
			CateVO cateVO = new CateVO();
			List<CateVO> upperCodeList = cateService.selectCateList(cateVO);
			cateVO.setCatgryCd(upperCodeList.get(0).getCatgryCd());
			List<CateVO> underCodeList = cateService.selectCateUnList(cateVO);
			
			//공통 코드 - 판매 상태 리스트
			CodeVO codeVo = new CodeVO();
			codeVo.setRgstId(loginInfo.getUsrId());
			List<CodeVO> codeList = codeService.selectSaleStatCdList(codeVo);
			
			req.setAttribute("codeList", codeList);
			req.setAttribute("entrList", entrList);
			req.setAttribute("upperCodeList", upperCodeList);
			req.setAttribute("underCodeList", underCodeList);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/goods/goods_register.jsp");
			modelAndView.setRedirect(false);
		}
		//상품 등록 엑션
		else if(command.equals(HandlerMapping.ADM_GOODS_REGISTER_ACT)) {
			int result = goodsService.insertGoods(pvo);
			
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_goods_list");
			modelAndView.setRedirect(true);
		}
		//상품 수정 화면
		else if(command.equals(HandlerMapping.ADM_GOODS_EDIT)) {
			GoodsVO rvo = goodsService.selectGoodsOne(pvo);
			
			//업체 리스트
			EntrVO entrVO = new EntrVO();
			entrVO.setUsrId(loginInfo.getUsrId());
			List<EntrVO> entrList = entrService.selectEntrList(entrVO);
			
			//카테고리 리스트
			CateVO cateVO = new CateVO();
			List<CateVO> upperCodeList = cateService.selectCateList(cateVO);
			cateVO.setCatgryCd(rvo.getCatgryCd());
			List<CateVO> underCodeList = cateService.selectCateUnList(cateVO);
			
			//공통 코드 - 판매 상태 리스트
			CodeVO codeVo = new CodeVO();
			codeVo.setRgstId(loginInfo.getUsrId());
			List<CodeVO> codeList = codeService.selectCodeList(codeVo);
			
			req.setAttribute("pvo", rvo);
			req.setAttribute("codeList", codeList);
			req.setAttribute("entrList", entrList);
			req.setAttribute("upperCodeList", upperCodeList);
			req.setAttribute("underCodeList", underCodeList);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/goods/goods_edit.jsp");
			modelAndView.setRedirect(false);
		}
		//상품 수정 엑션
		else if(command.equals(HandlerMapping.ADM_GOODS_EDIT_ACT)) {
			int result = goodsService.updateGoods(pvo);
			
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_goods_list");
			modelAndView.setRedirect(true);
		}
		//상품 삭제 엑션
		else if(command.equals(HandlerMapping.ADM_GOODS_REMOVE_ACT)) {
			int result = goodsService.deleteGoods(pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_goods_list");
			modelAndView.setRedirect(true);
		}
		//상품 문의 화면
		else if(command.equals(HandlerMapping.ADM_GOODS_QNA)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/goods/goods_qna.jsp");
			modelAndView.setRedirect(false);
			leftMenuNav = HandlerMapping.ADM_GOODS_QNA;
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", leftMenuNav);
		
		return modelAndView;
	}
}
