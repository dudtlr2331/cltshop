package com.clt.shp.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.user.dao.impl.UserDaoOracle;
import com.clt.shp.user.service.UserService;

import javafx.scene.control.Alert;

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
      
//      UserVo param = new UserVo();
//      param.setGoodsInfoSeq(1);
//      GoodsVO goodsInfo = goodsService.selectGoodsOne(param);
//      req.setAttribute("goodsInfo", goodsInfo);
      
//      List<UserVo> userList = userService.selectUserList(param);
      
//      req.setAttribute("userList", userList);
      
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
      
      //값셋팅...
      UserDaoOracle userDao = new UserDaoOracle();
      UserVo pvo = new UserVo();
      
      pvo.setMember_seq(1);
      pvo.setMember_id(id);
      pvo.setMember_email(email);;
      pvo.setMember_pwd(pwd);
      pvo.setTel_front(telFront);
      pvo.setTel_midle(telMidle);
      pvo.setTel_back(telBack)	;
      pvo.setBirth_yy(birthYy);
      pvo.setBirth_mm(birthMm);
      pvo.setBirth_dd(birthDd);
		
      userDao.insertUser(pvo);
      
      modelAndView.setPath("/WEB-INF/jsp/shp/user/login.jsp");
      
      return modelAndView;
   }

}