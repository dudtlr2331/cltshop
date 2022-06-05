package com.clt.shp.dress;

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
import com.clt.shp.dress.dao.impl.DressDaoOracle;
import com.clt.shp.dress.service.DressService;
import com.clt.shp.entr.EntrVO;
import com.clt.shp.main.GoodsDetailVO;
import com.clt.shp.main.dao.impl.MainDaoOracle;
import com.clt.shp.main.service.MainService;
import com.clt.shp.sales.SalesVO;
import com.clt.shp.sales.dao.impl.SalesDaoOracle;
import com.clt.shp.sales.service.SalesService;
import com.clt.shp.user.UserVO;

public class DressController implements Controller {
	private String command = "";
	private DressService dressService;
	private CateService cateService;
	private MainService mainService;
	
	public DressController(String command) {
		this.cateService = new CateService(new CateDaoOracle());
		this.dressService = new DressService(new DressDaoOracle());
		this.mainService = new MainService(new MainDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = req.getSession();
		UserVO loginVo = (UserVO) session.getAttribute("loginInfo");
		
		CateVO cateVO = new CateVO();
		GoodsDetailVO mainVO = new GoodsDetailVO();
		
		//파라미터 셋팅
		DressVO pvo = dressService.parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.DRESS_MAIN)) {
			List<DressVO> list = dressService.selectDressList(pvo);
			req.setAttribute("list", list);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/dress/dress_main.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.DRESS_REGISTER)) {
			if(loginVo == null) {
				session.setAttribute("message", "로그인을 해주세요.");
				modelAndView.setPath("/DispatcherServlet?command=user_login");
				modelAndView.setRedirect(true);
				return modelAndView;
			}
			//공통 코드 가져오기
			List<CateVO> oneDepthCateList = cateService.selectCateList(cateVO);
			req.setAttribute("oneDepthCateList", oneDepthCateList);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/dress/dress_register.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.DRESS_CATE_AJAX)){
			String oneDepthCate = req.getParameter("oneDepthCateList");
			String json = "{\"result\":\"success\", \"dataList\":[";
			try {
				cateVO.setCatgryCd(oneDepthCate);

				List<CateVO> twoDepthCateList = cateService.selectCateUnList(cateVO);
				
				if(twoDepthCateList != null) {
					for(int i=0; i<twoDepthCateList.size(); i++) {
						if(i>0) {
							json += ",";
						}
						json += "{\"catgryCd\":\""+twoDepthCateList.get(i).getCatgryCd()+"\", \"catgryNm\":\""+twoDepthCateList.get(i).getCatgryNm()+"\"}";
					}
					json += "]}";
				}else {
					json = "{\"result\":\"fail\"}";
				}
			} catch (Exception e) {
				json = "{\"result\":\"fail\"}";
				e.printStackTrace();
			}
			req.setAttribute("json", json);
			
			modelAndView.setPath("jsonView.jsp");
			modelAndView.setRedirect(true);
		}
		else if(command.equals(HandlerMapping.DRESS_CATE_AJAX2)){
			String oneDepthCate = req.getParameter("oneDepthCateList");
			String twoDepthCateList = req.getParameter("twoDepthCateList");
			String json = "{\"result\":\"success\", \"dataList\":[";
			try {
				mainVO.setSearchCatgryCd(oneDepthCate);
				mainVO.setSearchCatgryCd2(twoDepthCateList);
				
				List<GoodsDetailVO> searchGoodsList = mainService.selectListMainCate(mainVO);
				
				if(searchGoodsList != null) {
					for(int i=0; i<searchGoodsList.size(); i++) {
						if(i>0) {
							json += ",";
						}
						json += "{\"goodsNm\":\""+searchGoodsList.get(i).getGoods().getGoodsNm()+"\", \"goodsCd\":\""+searchGoodsList.get(i).getGoods().getGoodsCd()+"\"}";
					}
					json += "]}";
				}else {
					json = "{\"result\":\"fail\"}";
				}
			} catch (Exception e) {
				json = "{\"result\":\"fail\"}";
				e.printStackTrace();
			}
			req.setAttribute("json", json);
			
			modelAndView.setPath("jsonView.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.DRESS_CATE_AJAX3)){
			String searchGoodsCd = req.getParameter("searchGoodsList");
			String json = "{\"result\":\"success\", \"dataList\":[";
			try {
				mainVO.setSearchGoodsCd(searchGoodsCd);
				
				List<GoodsDetailVO> searchGoods = mainService.selectListMainCate(mainVO);
				
				if(searchGoods != null) {
					for(int i=0; i<searchGoods.size(); i++) {
						if(i>0) {
							json += ",";
						}
						json += "{\"imgPath\":\""+searchGoods.get(i).getGoods().getImgPath()+"\", \"imgNm\":\""+searchGoods.get(i).getGoods().getImgNm()+"\"}";
					}
					json += "]}";
				}else {
					json = "{\"result\":\"fail\"}";
				}
			} catch (Exception e) {
				json = "{\"result\":\"fail\"}";
				e.printStackTrace();
			}
			req.setAttribute("json", json);
			
			modelAndView.setPath("jsonView.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.DRESS_REGISTER_ACT)) {
			pvo.setRgstId(loginVo.getUsrId());
			pvo.setBulCont(pvo.getNoticeDoc());
			int result = dressService.insertDress(pvo);
			
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=dress_main");
			modelAndView.setRedirect(true);
		}
		else if (command.equals(HandlerMapping.DRESS_EDIT)) {
			if(loginVo == null) {
				session.setAttribute("message", "로그인을 해주세요.");
				modelAndView.setPath("/DispatcherServlet?command=user_login");
				modelAndView.setRedirect(true);
				return modelAndView;
			}
			
			DressVO rvo = dressService.selectDressOne(pvo);
			
			req.setAttribute("pvo", rvo);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/dress/dress_edit.jsp");
			modelAndView.setRedirect(false);		
		}
		else if(command.equals(HandlerMapping.DRESS_EDIT_ACT)) {
			pvo.setUpdtId(loginVo.getUsrId());
			int result = dressService.updateDress(pvo);
			
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=dress_main");
			modelAndView.setRedirect(false);
		}
		else if (command.equals(HandlerMapping.DRESS_DETAIL)) {
			DressVO rvo = dressService.selectDressOne(pvo);
			
			req.setAttribute("pvo", rvo);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/dress/dress_detail.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.DRESS_REMOVE_ACT)) {
			int result = dressService.deleteDress(pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=dress_main");
			modelAndView.setRedirect(false);
		}
		
		return modelAndView;
	}
}
