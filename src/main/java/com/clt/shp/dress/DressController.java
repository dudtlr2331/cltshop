package com.clt.shp.dress;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.user.UserVo;
import com.clt.shp.user.dao.impl.UserDaoOracle;
import com.clt.shp.user.service.UserService;

public class DressController implements Controller {
	private ModelAndView modelAndView;
	private UserService userService;
	private String command = "";
	private UserVo pvo;

	public DressController(String command) {
	      userService = new UserService(new UserDaoOracle());
	      modelAndView = new ModelAndView();
	      modelAndView.setPath("/error.jsp");
	      modelAndView.setRedirect(false);
	      this.command = command;
	   }

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// 비즈니스로직 호출
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
		} else if (command.equals(HandlerMapping.USER_UPDATE)) {
			modelAndView = userUpdate(req, res);
		}

		// 화면 반환
		return modelAndView;
	}

}
