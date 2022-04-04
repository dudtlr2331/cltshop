package com.clt.shp.mypage;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.adm.user.AdmUserVO;
import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.user.UserVo;
import com.clt.shp.user.dao.impl.UserDaoOracle;
import com.clt.shp.user.service.UserService;

public class MypageController implements Controller {
private String command = "";
	
	public MypageController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		MypageVo pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.MYPAGE)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/mypage/mypage.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.MYPAGE_COUPON)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/mypage/mypage_coupon.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.MYPAGE_DETAIL)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/mypage/mypage_detail.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.MYPAGE_POINT)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/mypage/mypage_point.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.MYPAGE_QNA)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/mypage/mypage_qna.jsp");
			modelAndView.setRedirect(false);
		}
				
		return modelAndView;
	}

	private MypageVo parameterSetting(HttpServletRequest req) {
		MypageVo pvo = new MypageVo();
		return pvo;
	}
}
