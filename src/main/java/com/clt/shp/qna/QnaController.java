package com.clt.shp.qna;

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
import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.main.GoodsDetailVO;
import com.clt.shp.qna.dao.impl.QnaDaoOracle;
import com.clt.shp.qna.service.QnaService;
import com.clt.shp.user.UserVO;
import com.clt.shp.user.dao.impl.UserDaoOracle;

public class QnaController implements Controller {
	private String command = "";
	private QnaService qnaService;
	private CateService cateService;
	private GoodsService goodsService;

	public QnaController(String command) {
		qnaService = new QnaService(new QnaDaoOracle());
		cateService = new CateService(new CateDaoOracle());
		goodsService = new GoodsService(new GoodsDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = req.getSession();
		UserVO loginVo = (UserVO) session.getAttribute("loginInfo");
//		String returnPage = "";
		
		if(loginVo == null) {
			session.setAttribute("message", "로그인을 해주세요.");
			modelAndView.setPath("/DispatcherServlet?command=user_login");
			modelAndView.setRedirect(true);
			return modelAndView;
		}

		CateVO cateVO = new CateVO();
		// 파라미터 셋팅
		QnaVO pvo = qnaService.parameterSetting(req);
		pvo.setRgstId(loginVo.getUsrId());
		
		// 비즈니스 처리
//		if (command.equals(HandlerMapping.QNA)) { //리스트
//			List<QnaVO> list = qnaService.selectQnaList(pvo);
//			req.setAttribute("list", list);
//
//			modelAndView.setPath("/WEB-INF/jsp/shp/qna/qna.jsp");
//			modelAndView.setRedirect(false);
//		}else
		if (command.equals(HandlerMapping.QNA_DETAIL)) { /* 상세페이지 */
			QnaVO rvo = qnaService.selectQnaOne(pvo);
			
			req.setAttribute("pvo", rvo);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/qna/qna_detail.jsp");
			modelAndView.setRedirect(false);
		}else if (command.equals(HandlerMapping.QNA_INSERT)) { /* 입력 화면 호출 */
			//공통 코드 가져오기
			List<CateVO> oneDepthCateList = cateService.selectCateList(cateVO);
			req.setAttribute("oneDepthCateList", oneDepthCateList);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/qna/qna_insert.jsp");
			modelAndView.setRedirect(false);
		}else if (command.equals(HandlerMapping.GOODS_DTL_QNA_INSERT)) { /* 입력 화면 호출 */
			GoodsVO gvo = new GoodsVO();
			gvo.setGoodsCd(pvo.getGoodsCd());
			GoodsDetailVO rvo = goodsService.selectMypgGoodsOne(gvo);
			
			req.setAttribute("rvo", rvo);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/qna/goods_dtl_qna_insert.jsp");
			modelAndView.setRedirect(false);
		}else if (command.equals(HandlerMapping.QNA_INSERT_ACT)) { /* 입력 */
			pvo.setUseYn("Y");
			int result = qnaService.insertQna(pvo);
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=main_qna_list");
			modelAndView.setRedirect(true);
		}else if (command.equals(HandlerMapping.QNA_EDIT)) { /* 수정 화면 호출 */
			QnaVO rvo = qnaService.selectQnaOne(pvo);
			
			req.setAttribute("pvo", rvo);
			
			modelAndView.setPath("/WEB-INF/jsp/shp/qna/qna_edit.jsp");
			modelAndView.setRedirect(false);
		}else if (command.equals(HandlerMapping.QNA_EDIT_ACT)) { /* 수정 */
			pvo.setUpdtId(loginVo.getUsrId());
			int result = qnaService.updateQna(pvo);
			
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=main_qna_list");
			modelAndView.setRedirect(true);
		}else if (command.equals(HandlerMapping.QNA_REMOVE_ACT)) { /* 삭제 */
			int result = qnaService.deleteQna(pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=main_qna_list");
			modelAndView.setRedirect(false);
		}
		
		return modelAndView;
	}
}
