package com.clt.shp.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.user.dao.impl.UserDaoOracle;
import com.clt.shp.user.service.UserService;

import javafx.scene.control.Alert;
import jdk.nashorn.internal.parser.JSONParser;

public class UserController implements Controller{
   
   private ModelAndView modelAndView;
   private UserService userService;
   private String command = "";
   
   public UserController(String command) {
      userService = new UserService(new UserDaoOracle());
      modelAndView = new ModelAndView();
      modelAndView.setPath("/error.jsp");
      modelAndView.setRedirect(false);
      this.command = command;
   }

   @Override
   public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
      if(command.equals(HandlerMapping.USER_JOIN)) {
         modelAndView = userJoin(req, res);
      }
      else if(command.equals(HandlerMapping.USER_JOIN_INSERT)) {
         modelAndView = userJoinService(req, res);
      }
      else if(command.equals(HandlerMapping.USER_LOGIN)) {
         modelAndView = userLogin(req, res);
         
      }
      else if(command.equals(HandlerMapping.USER_LOGIN_INSERT)) {
    	  modelAndView = userLoginService(req, res);
    	  
      }
      else if(command.equals(HandlerMapping.USER_ID_CHECK)) {
    	  modelAndView = userIdCheck(req, res);
    	  
      }
      
//      UserVo param = new UserVo();
//      param.setGoodsInfoSeq(1);
//      GoodsVO goodsInfo = goodsService.selectGoodsOne(param);
//      req.setAttribute("goodsInfo", goodsInfo);
      
//      List<UserVo> userList = userService.selectUserList(param);
      
//      req.setAttribute("userList", userList);
      
      return modelAndView;
   }
   
   // 회원가입 시 회원 아이디 중복 체크
	private ModelAndView userIdCheck(HttpServletRequest req, HttpServletResponse res) {
		modelAndView.setPath("jsonView.jsp");
		modelAndView.setRedirect(false);
		String json = "";
		String id = req.getParameter("id");
		
		UserDaoOracle userDao = new UserDaoOracle();
		UserVo pvo = new UserVo();

		pvo.setMember_id(id);
		UserVo sessionVO = userDao.userLogin(pvo);
		
		if(id.equals(sessionVO.getMember_id())) {
			json = "{\"result\":\"fail\"}";
		}else {
			json = "{\"result\":\"success\"}";
		}
		
		req.setAttribute("json", json);
		return modelAndView;
	}

//로그인 화면 호출
	
	private ModelAndView userLoginService(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String returnPage = "";

		UserDaoOracle userDao = new UserDaoOracle();
		UserVo pvo = new UserVo();

		pvo.setMember_id(id);
		UserVo sessionVO = userDao.userLogin(pvo);
		
		
		if (null == sessionVO) {
			session.setAttribute("message", "아이디/비밀번호를 입력해 주세요.");
			returnPage = "DispatcherServlet?command=user_login";
		}else if(id.equals(sessionVO.getMember_id()) && pwd.equals(sessionVO.getMember_pwd())) {
			session.setAttribute("loginInfo", sessionVO);
			returnPage = "DispatcherServlet?command=goods_list";
		}else {
			session.setAttribute("message", "아이디/비밀번호를 확인해 주세요.");
			returnPage = "DispatcherServlet?command=user_login";
		}

		modelAndView.setRedirect(true);
		modelAndView.setPath(returnPage);
		return modelAndView;
	}
	 
   
   //로그인 화면 호출
   private ModelAndView userLogin(HttpServletRequest req, HttpServletResponse res) {
      modelAndView.setPath("/WEB-INF/jsp/shp/user/login.jsp");
      modelAndView.setRedirect(false);
      return modelAndView;
   }

   //회원 가입 화면 호출
   private ModelAndView userJoin(HttpServletRequest req, HttpServletResponse res) {
      //화면 셋팅
      List<String> birthYyList = new ArrayList<String>();
      List<String> birthMmList = new ArrayList<String>();
      List<String> birthDdList = new ArrayList<String>();
      
      for(int i=1950; i<=2022; i++) {
         birthYyList.add(String.valueOf(i));
      }
      for(int i=1; i<=12; i++) {
         birthMmList.add(String.valueOf(i));
      }
      for(int i=1; i<=31; i++) {
         birthDdList.add(String.valueOf(i));
      }
      
      //셋팅값 request에 넣기
      req.setAttribute("birthYyList", birthYyList);
      req.setAttribute("birthMmList", birthMmList);
      req.setAttribute("birthDdList", birthDdList);
      
      //호출될 화면 정의
      modelAndView.setPath("/WEB-INF/jsp/shp/user/join.jsp");
      modelAndView.setRedirect(false);
      return modelAndView;
   }

   //회원 가입 백단 로직 실행
   private ModelAndView userJoinService(HttpServletRequest req, HttpServletResponse res) {
      //파라미터 셋팅
      String id = req.getParameter("id");
      String email = req.getParameter("email");
      String pwd = req.getParameter("pwd");
      String telFront = req.getParameter("tel_front");
      String telMidle = req.getParameter("tel_midle");
      String telBack = req.getParameter("tel_back");
      String birthYy = req.getParameter("birth_yy");
      String birthMm = req.getParameter("birth_mm");
      String birthDd = req.getParameter("birth_dd");
      
      String member_tel = telFront + telMidle + telBack;
      String birth = birthYy + birthMm + birthDd;
      
      //값셋팅...
      UserDaoOracle userDao = new UserDaoOracle();
      UserVo pvo = new UserVo();
      
      pvo.setMember_id(id);
      pvo.setMember_email(email);;
      pvo.setMember_pwd(pwd);
      pvo.setMember_tel(member_tel);
      pvo.setBirth(birth);
		
      userDao.insertUser(pvo);
      
      modelAndView.setPath("/WEB-INF/jsp/shp/user/login.jsp");
      
      return modelAndView;
   }

}