package com.clt.shp.mypage;

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
import com.clt.shp.code.dao.impl.CodeDaoOracle;
import com.clt.shp.code.service.CodeService;
import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.main.GoodsDetailVO;
import com.clt.shp.main.dao.impl.MainDaoOracle;
import com.clt.shp.main.service.MainService;
import com.clt.shp.mypage.dao.impl.MypgDaoOracle;
import com.clt.shp.mypage.service.MypgService;
import com.clt.shp.order.OrderVO;
import com.clt.shp.order.dao.impl.OrderDaoOracle;
import com.clt.shp.order.service.OrderService;
import com.clt.shp.qna.QnaVO;
import com.clt.shp.qna.dao.impl.QnaDaoOracle;
import com.clt.shp.qna.service.QnaService;
import com.clt.shp.user.UserVO;

public class MypgController implements Controller {
	private String command = "";
	private OrderService orderService;
	private MainService mainService;
	private GoodsService goodsService;
	private CodeService codeService;
	private QnaService qnaService;
	private MypgService mypgService;
	private CateService cateService;
	
	public MypgController(String command) {
		this.orderService = new OrderService(new OrderDaoOracle());
		this.mainService = new MainService(new MainDaoOracle());
		this.goodsService = new GoodsService(new GoodsDaoOracle());
		this.codeService = new CodeService(new CodeDaoOracle());
		this.qnaService = new QnaService(new QnaDaoOracle());
		this.mypgService = new MypgService(new MypgDaoOracle());
		this.cateService = new CateService(new CateDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		HttpSession session = req.getSession();
		UserVO loginVo = (UserVO) session.getAttribute("loginInfo");
		
		if(loginVo == null) {
			session.setAttribute("message", "로그인을 해주세요.");
			modelAndView.setPath("/DispatcherServlet?command=user_login");
			modelAndView.setRedirect(true);
			return modelAndView;
		}
		
		//공통 코드 가져오기
		CateVO cateVO = new CateVO();
		List<CateVO> oneDepthCateList = cateService.selectCateList(cateVO);

		req.setAttribute("oneDepthCateList", oneDepthCateList);
		
		//파라미터 셋팅
//		parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.MYPAGE)) {
			MypgVO mypgVO = new MypgVO();
			mypgVO.setUsrId(loginVo.getUsrId());
			List<MypgVO> mypgList = mypgService.selectMypageList(mypgVO);

			req.setAttribute("mypgList", mypgList);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/mypage/mypage.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.MYPAGE_COUPON)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/mypage/mypage_coupon.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.MYPAGE_DETAIL)) {
			OrderVO ordVo = new OrderVO();
			ordVo.setOrdNo(req.getParameter("ordNo"));
			OrderVO ordList = orderService.searchOrdNoList(ordVo);
			
			ordVo.setUsrId(loginVo.getUsrId());
			GoodsVO goodsVo = new GoodsVO();
			List<OrderVO> ordGoodsList = orderService.searchOrdDtlGoods(ordVo);
			
			goodsVo.setGoodsCd(ordGoodsList.get(0).getGoodsCd());
			GoodsDetailVO searchGoods = goodsService.selectMypgGoodsOne(goodsVo);
			
			req.setAttribute("ordList", ordList);
			req.setAttribute("searchGoods", searchGoods);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/mypage/mypage_detail.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.MYPAGE_POINT)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/mypage/mypage_point.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.MYPAGE_QNA)) {
			QnaVO qnaVO = new QnaVO();
			qnaVO.setRgstId(loginVo.getUsrId());
			List<QnaVO> qnaList = qnaService.searchIdQnaList(qnaVO);
			
			req.setAttribute("qnaList", qnaList);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/mypage/mypage_qna.jsp");
			modelAndView.setRedirect(false);
		}
				
		return modelAndView;
	}
}
