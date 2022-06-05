package com.clt.adm.cate;

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
import com.clt.shp.user.UserVO;

public class AdmCateController implements Controller{
	private String command = "";
	private CateService cateService;
	
	public AdmCateController(String command) {
		cateService = new CateService(new CateDaoOracle());
		this.command = command;
	}
	
	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String leftMenuNav = HandlerMapping.ADM_CATE_LIST;
//		HttpSession session = req.getSession(); // 관리자 로그인 기능 만든 후 사용
//		UserVO loginVo = (UserVO) session.getAttribute("loginInfo"); // 관리자 로그인 기능 만든 후 사용	
		
		//파라미터 셋팅
		CateVO pvo = cateService.parameterSetting(req);
		
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_CATE_LIST)){
			List<CateVO> list = cateService.selectCateList(pvo);
			req.setAttribute("list", list);
			
			List<CateVO> underList = cateService.selectCateUnList(pvo);
			req.setAttribute("underList", underList);
			
			req.setAttribute("upperListSize", list.size());
			req.setAttribute("underListSize", underList.size());
			
			
			modelAndView.setPath("/WEB-INF/jsp/adm/cate/cate_list.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_CATE_LIST_AJAX)) {
			String json = "{\"result\":\"success\", \"dataList\":[";
			try {
				List<CateVO> underList = cateService.selectCateUnList(pvo);
				for(int i=0; i<underList.size(); i++) {
					if(i>0) {
						json += ",";
					}
					json += "{\"catgryCd\":\""+underList.get(i).getCatgryCd()+"\", \"catgryNm\":\""+underList.get(i).getCatgryNm()+"\"}";
				}
			} catch (Exception e) {
				json = "{\"result\":\"fail\"}";
				e.printStackTrace();
			} finally {
				json += "]}";
			}
			req.setAttribute("json", json);
			
			modelAndView.setPath("jsonView.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_CATE_REGISTER_ACT)){
//			pvo.setUpdtId(loginVo.getUsrId()); // 관리자 로그인 기능 만든 후 사용
			int result = cateService.saveCate(pvo);
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_cate_list");
			modelAndView.setRedirect(true);
		}else if(command.equals(HandlerMapping.ADM_CATE_REMOVE_ACT)){
			int result = cateService.deleteCate(pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_cate_list");
			modelAndView.setRedirect(true);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", leftMenuNav);
		return modelAndView;
	}

}
