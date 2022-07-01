package com.clt.adm.qna;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.qna.QnaVO;
import com.clt.shp.qna.dao.QnaDao;
import com.clt.shp.qna.dao.impl.QnaDaoOracle;
import com.clt.shp.qna.service.QnaService;

public class AdmQnaController implements Controller{
	private String command = "";
	private QnaService qnaService;
	
	public AdmQnaController(String command) {
		qnaService = new QnaService(new QnaDaoOracle());
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
//		AdmQnaVO pvo = parameterSetting(req);
		QnaVO pvo = qnaService.parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_QNA_LIST)) {
			List<QnaVO> rvo = qnaService.unansweredQnaList(pvo);
			
			req.setAttribute("rvo", rvo);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/qna/qna_list.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_QNA_ANSWER)) {
			QnaVO rvo = qnaService.selectQnaOne(pvo);
			
			req.setAttribute("pvo", rvo);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/qna/qna_answer.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_QNA_ANSWER_ACT)) {
			int result = qnaService.updateAnswerQna(pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_qna_list");
			modelAndView.setRedirect(true);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_QNA_LIST);
				
		return modelAndView;
	}
}
