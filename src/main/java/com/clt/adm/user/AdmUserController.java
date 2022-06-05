package com.clt.adm.user;

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
import com.clt.shp.qna.QnaVO;
import com.clt.shp.user.UserVO;
import com.clt.shp.user.dao.impl.UserDaoOracle;
import com.clt.shp.user.service.UserService;

public class AdmUserController implements Controller{
	private String command = "";
	private UserService userService;
	private CodeService codeService;
	
	public AdmUserController(String command) {
		userService = new UserService();
		userService.setUserDao(new UserDaoOracle());
		userService.setEntrDao(new EntrDaoOracle());
		codeService = new CodeService(new CodeDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//세션
		HttpSession session = req.getSession();
		UserVO loginInfo = (UserVO) session.getAttribute("loginInfo");
		
		//파라미터 셋팅
		UserVO pvo = userService.parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_USER_LIST)) {
			List<UserVO> list = userService.selectUserList(pvo);
			
			//판매 상태 공통코드
			CodeVO codeVo = new CodeVO();
			codeVo.setRgstId(loginInfo.getUsrId());
			List<CodeVO> codeList = codeService.selectCodeList(codeVo);
			
			req.setAttribute("list", list);
			req.setAttribute("codeList", codeList);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/user/user_list.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.ADM_USER_DETAIL)) {
			UserVO rvo = userService.selectUserOne(pvo);
			req.setAttribute("pvo", rvo);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/user/user_detail.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.ADM_USER_SEARCH)) {
			List<UserVO> list = userService.selectUserList(pvo);
			req.setAttribute("list", list);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/user/user_list.jsp");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_USER_LIST);
				
		return modelAndView;
	}
}
