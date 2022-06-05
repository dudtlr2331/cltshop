package com.clt.adm.entr;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.entr.EntrVO;
import com.clt.shp.entr.dao.impl.EntrDaoOracle;
import com.clt.shp.entr.service.EntrService;
import com.clt.shp.user.UserVO;
import com.clt.shp.user.dao.impl.UserDaoOracle;
import com.clt.shp.user.service.UserService;

public class AdmEntrController implements Controller{
	private String command = "";
	private EntrService entrService;
	private UserService userService;
	
	public AdmEntrController(String command) {
		entrService = new EntrService(new EntrDaoOracle());	//db 객체 생성
		userService = new UserService();
		userService.setUserDao(new UserDaoOracle());
		this.command = command;
	}
	
	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String leftMenuNav = HandlerMapping.ADM_ENTR_LIST;
		
		//파라미터 셋팅
		EntrVO evo = entrService.parameterSetting(req);
		
		//비지니스 로직 수행후 뷰페이지 리턴
		// 업체 리스트
		if(command.equals(HandlerMapping.ADM_ENTR_LIST)) {
			List<EntrVO> entrList = entrService.selectEntrList(evo);
			
			req.setAttribute("entrList", entrList);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/entr/entr_list.jsp");
			modelAndView.setRedirect(false);
		// 업체 등록 화면
		}else if(command.equals(HandlerMapping.ADM_ENTR_REGISTER)) {
			UserVO userVO = new UserVO();
			
			List<UserVO> userList = userService.selectUserList(userVO);
			
			req.setAttribute("userList", userList);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/entr/entr_register.jsp");
			modelAndView.setRedirect(false);
		// 업체 등록 엑션
		}else if(command.equals(HandlerMapping.ADM_ENTR_REGISTER_ACT)) {
			int result = entrService.insertEntr(evo);
			req.setAttribute("evo", evo);
			modelAndView.setPath("/WEB-INF/jsp/adm/entr/entr_edit.jsp");
			modelAndView.setRedirect(false);
		// 업체 수정 화면
		}else if(command.equals(HandlerMapping.ADM_ENTR_EDIT)) {
			UserVO userVO = new UserVO();
			
			EntrVO rvo = entrService.selectEntrOne(evo);
			req.setAttribute("evo", rvo);
			
			List<UserVO> userList = userService.selectUserList(userVO);
			
			req.setAttribute("userList", userList);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/entr/entr_edit.jsp");
			modelAndView.setRedirect(false);
		// 업체 수정 엑션
		}else if(command.equals(HandlerMapping.ADM_ENTR_EDIT_ACT)) { 
			int result = entrService.updateEntr(evo);
			req.setAttribute("evo", evo);
			modelAndView.setPath("/WEB-INF/jsp/adm/entr/entr_edit.jsp");
			modelAndView.setRedirect(false);
		// 업체 삭제 액션
		}else if(command.equals(HandlerMapping.ADM_ENTR_REMOVE_ACT)) {
			int result = entrService.deleteEntr(evo);
			modelAndView.setPath("/DispatcherServlet?command=adm_entr_list");
			modelAndView.setRedirect(true);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", leftMenuNav);
		
		return modelAndView;
	}

}
