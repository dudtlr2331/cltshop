package com.clt.shp.qna;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.adm.user.AdmUserVO;
import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.user.UserVO;
import com.clt.shp.user.dao.impl.UserDaoOracle;
import com.clt.shp.user.service.UserService;

public class QnaController implements Controller {
private String command = "";
	
	public QnaController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		QnaVo pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.QNA)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/qna/qna.jsp");
			modelAndView.setRedirect(false);
		}
				
		return modelAndView;
	}

	private QnaVo parameterSetting(HttpServletRequest req) {
		QnaVo pvo = new QnaVo();
		return pvo;
	}
}
