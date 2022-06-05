package com.clt.shp.main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.cate.CateVO;
import com.clt.shp.cate.dao.impl.CateDaoOracle;
import com.clt.shp.cate.service.CateService;
import com.clt.shp.dress.DressVO;
import com.clt.shp.dress.dao.impl.DressDaoOracle;
import com.clt.shp.dress.service.DressService;
import com.clt.shp.main.dao.impl.MainDaoOracle;
import com.clt.shp.main.service.MainService;
import com.clt.shp.qna.QnaVO;
import com.clt.shp.qna.dao.impl.QnaDaoOracle;
import com.clt.shp.qna.service.QnaService;

public class MainController implements Controller{
	private String command = "";
	private MainService mainService;
	private CateService cateService;
	private QnaService qnaService;
	private DressService dressService;
	
	public MainController(String command) {
		this.mainService = new MainService(new MainDaoOracle());
		this.cateService = new CateService(new CateDaoOracle());
		this.qnaService = new QnaService(new QnaDaoOracle());
		this.dressService = new DressService(new DressDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();

		//공통 코드 가져오기
		CateVO cateVO = new CateVO();
		List<CateVO> oneDepthCateList = cateService.selectCateList(cateVO);

		req.setAttribute("oneDepthCateList", oneDepthCateList);
		
		if(command.equals(HandlerMapping.MAIN_HOME_LIST)) {
			GoodsDetailVO mainVO = new GoodsDetailVO();
			List<GoodsDetailVO> mainHomeList = mainService.selectListMainHome(mainVO);
			
			req.setAttribute("mainHomeList", mainHomeList);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/main/main_home.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.MAIN_CATA_LIST)) {
			//2depth 카테고리
			String searchType = req.getParameter("searchType");
			String searchCatgryCd = req.getParameter("searchCatgryCd");
			String searchCatgryCd2 = req.getParameter("searchCatgryCd2");

			GoodsDetailVO mainVO = new GoodsDetailVO();
			if(null == searchCatgryCd || "".equals(searchCatgryCd)){
				searchCatgryCd = oneDepthCateList.get(0).getCatgryCd();
			}
			cateVO.setCatgryCd(searchCatgryCd);

			List<CateVO> twoDepthCateList = cateService.selectCateUnList(cateVO);

			if(null == searchCatgryCd2 || "".equals(searchCatgryCd2)){
				searchCatgryCd2 = twoDepthCateList.get(0).getCatgryCd();
			}
			cateVO.setCatgryCd2(searchCatgryCd2);

			if(!"all".equals(searchType)){
				mainVO.setSearchCatgryCd(searchCatgryCd);
				mainVO.setSearchCatgryCd2(searchCatgryCd2);
			}

			List<GoodsDetailVO> mainCateList = mainService.selectListMainCate(mainVO);

			req.setAttribute("searchType", searchType);
			req.setAttribute("mainCateList", mainCateList);
			req.setAttribute("twoDepthCateList", twoDepthCateList);
			req.setAttribute("selectedOneDepthCate", searchCatgryCd);
			req.setAttribute("selectedTwoDepthCate", searchCatgryCd2);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/main/main_category.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.MAIN_QNA_LIST)){
			QnaVO qnaVO = new QnaVO();
			List<QnaVO> list = qnaService.selectQnaList(qnaVO);
			req.setAttribute("list", list);

			modelAndView.setPath("/WEB-INF/jsp/shp/qna/qna.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.MAIN_DRSS_LIST)){
			DressVO dressVO = new DressVO();
			List<DressVO> list = dressService.selectDressList(dressVO);
			req.setAttribute("list", list);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/dress/dress_main.jsp");
			modelAndView.setRedirect(false);
		}
		
		return modelAndView;
	}

}
