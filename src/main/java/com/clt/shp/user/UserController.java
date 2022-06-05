package com.clt.shp.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.entr.dao.impl.EntrDaoOracle;
import com.clt.shp.user.dao.impl.UserDaoOracle;
import com.clt.shp.user.service.UserService;

public class UserController implements Controller {

   private ModelAndView modelAndView;
   private UserService userService;
   private String command = "";
   UserVO pvo;

   public UserController(String command) {
      userService = new UserService();
      userService.setUserDao(new UserDaoOracle());
      userService.setEntrDao(new EntrDaoOracle());
      
      modelAndView = new ModelAndView();
      modelAndView.setPath("/error.jsp");
      modelAndView.setRedirect(false);
      this.command = command;
   }

   @Override
   public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
	// 파라미터 셋팅
	  pvo = userService.parameterSetting(req);

      //비즈니스로직 호출
      if (command.equals(HandlerMapping.USER_JOIN)) {
         modelAndView = userJoin(req, res);
      } else if (command.equals(HandlerMapping.USER_JOIN_INSERT)) {
         modelAndView = userJoinService(req, res);
      } else if (command.equals(HandlerMapping.USER_LOGIN)) {
         modelAndView = userLogin(req, res);
      } else if (command.equals(HandlerMapping.USER_LOGIN_INSERT)) {
         modelAndView = userLoginService(req, res);
      } else if (command.equals(HandlerMapping.USER_ID_CHECK)) {
         modelAndView = userIdCheck(req, res);
      } else if (command.equals(HandlerMapping.USER_EDIT)) {
         modelAndView = userEdit(req, res);
      } else if (command.equals(HandlerMapping.USER_EDIT_ACT)) {
          modelAndView = userEditAct(req, res);
      } else if (command.equals(HandlerMapping.USER_LOGOUT)) {
          modelAndView = userLogout(req, res);
      }

      //화면 반환
      return modelAndView;
   }

   // 회원 정보 수정 화면
	private ModelAndView userEdit(HttpServletRequest req, HttpServletResponse res) {
		pvo = userService.selectUserOne(pvo);
		
		req.setAttribute("pvo", pvo);
		
		modelAndView.setPath("/WEB-INF/jsp/shp/user/user_edit.jsp");
		modelAndView.setRedirect(false);
		
		return modelAndView;
	}
	
	// 회원 정보 수정
	private ModelAndView userEditAct(HttpServletRequest req, HttpServletResponse res) {
		int result = userService.updateUser(pvo);
		
		req.setAttribute("pvo", pvo);
		
		modelAndView.setPath("/WEB-INF/jsp/shp/user/user_edit.jsp");
		modelAndView.setRedirect(false);
		return modelAndView;
	}

   // 회원가입 시 회원 아이디 중복 체크
   private ModelAndView userIdCheck(HttpServletRequest req, HttpServletResponse res) {
      modelAndView.setPath("jsonView.jsp");
      modelAndView.setRedirect(false);
      String json = "";

//      UserDaoOracle userDao = new UserDaoOracle();

      UserVO sessionVO = userService.userLogin(pvo);

      try {
         if (null == sessionVO) {
            json = "{\"result\":\"success\"}";
         } else {
            json = "{\"result\":\"fail\"}";
         }
      } catch (Exception e) {
         json = "{\"result\":\"fail\"}";
         e.printStackTrace();
      }

      req.setAttribute("json", json);
      return modelAndView;
   }

   // 로그인 - 아이디, 비밀번호 입력 시 호출
   private ModelAndView userLoginService(HttpServletRequest req, HttpServletResponse res) {
      HttpSession session = req.getSession();

      String returnPage = "";

//      UserDaoOracle userDao = new UserDaoOracle();

      UserVO sessionVO = userService.userLogin(pvo);

      if (null == sessionVO) {
         session.setAttribute("message", "아이디/비밀번호를 입력해 주세요.");
         returnPage = "DispatcherServlet?command=user_login";
      } else if (pvo.getUsrId().equals(sessionVO.getUsrId()) && pvo.getPassWd().equals(sessionVO.getPassWd())) {
         session.setAttribute("loginInfo", sessionVO);
         returnPage = "DispatcherServlet?command=main_home_list";
      } else {
         session.setAttribute("message", "아이디/비밀번호를 확인해 주세요.");
         returnPage = "DispatcherServlet?command=user_login";
      }

      modelAndView.setRedirect(true);
      modelAndView.setPath(returnPage);
      return modelAndView;
   }

   // 로그인 화면 호출
   private ModelAndView userLogin(HttpServletRequest req, HttpServletResponse res) {
      modelAndView.setPath("/WEB-INF/jsp/shp/user/login.jsp");
      modelAndView.setRedirect(false);
      return modelAndView;
   }

   // 회원 가입 화면 호출
   private ModelAndView userJoin(HttpServletRequest req, HttpServletResponse res) {
      // 화면 셋팅
      List<String> birthYyList = new ArrayList<String>();
      List<String> birthMmList = new ArrayList<String>();
      List<String> birthDdList = new ArrayList<String>();

      for (int i = 1950; i <= 2022; i++) {
         birthYyList.add(String.valueOf(i));
      }
      for (int i = 1; i <= 12; i++) {
         birthMmList.add(String.valueOf(i));
      }
      for (int i = 1; i <= 31; i++) {
         birthDdList.add(String.valueOf(i));
      }

      // 셋팅값 request에 넣기
      req.setAttribute("birthYyList", birthYyList);
      req.setAttribute("birthMmList", birthMmList);
      req.setAttribute("birthDdList", birthDdList);

      // 호출될 화면 정의
      modelAndView.setPath("/WEB-INF/jsp/shp/user/join.jsp");
      modelAndView.setRedirect(false);
      return modelAndView;
   }

   // 회원 가입 백단 로직 실행
   private ModelAndView userJoinService(HttpServletRequest req, HttpServletResponse res) {
      // 값셋팅...
//      UserDaoOracle userDao = new UserDaoOracle();
      
	   userService.insertUser(pvo);

      req.setAttribute("message", "회원가입을 환영합니다!");
      modelAndView.setPath("/WEB-INF/jsp/shp/user/login.jsp");

      return modelAndView;
   }

   	// 로그아웃
	private ModelAndView userLogout(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		session.invalidate();
		
		modelAndView.setRedirect(true);
		modelAndView.setPath("DispatcherServlet?command=main_home_list");
		
		return modelAndView;
	}
}