package com.clt.shp.dress;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.dress.dao.impl.DressDaoOracle;
import com.clt.shp.dress.service.DressService;
import com.clt.shp.user.UserVO;

public class DressController implements Controller {
	private String command = "";
	private DressService dressService;
	
	public DressController(String command) {
		dressService = new DressService(new DressDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = req.getSession();
		UserVO loginVo = (UserVO) session.getAttribute("loginInfo");
		
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
			
			modelAndView.setPath("/WEB-INF/jsp/shp/dress/dress_register.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.DRESS_REGISTER_ACT)) {
			int result = dressService.insertDress(pvo);
			
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=dress_main");
			modelAndView.setRedirect(false);
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
