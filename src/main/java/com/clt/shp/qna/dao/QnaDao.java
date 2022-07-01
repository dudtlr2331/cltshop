package com.clt.shp.qna.dao;

import java.util.List;

import com.clt.shp.qna.QnaVO;

public interface QnaDao {
	int insertQna(QnaVO pvo);
	QnaVO selectQnaOne(QnaVO pvo);
	List<QnaVO> selectQnaList(QnaVO pvo);
	int updateQna(QnaVO pvo);
	int deleteQna(QnaVO pvo);
	List<QnaVO> searchIdQnaList(QnaVO pvo);
	List<QnaVO> searchGoodsCdQna(QnaVO pvo);
	List<QnaVO> unansweredQnaList(QnaVO pvo);
	int updateAnswerQna(QnaVO pvo);
}