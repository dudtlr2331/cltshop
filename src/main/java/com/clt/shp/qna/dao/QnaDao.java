package com.clt.shp.qna.dao;

import java.util.List;

import com.clt.shp.qna.QnaVO;

public interface QnaDao {
	int insertQna(QnaVO pvo);
	QnaVO selectQnaOne(QnaVO pvo);
	List<QnaVO> selectQnaList(QnaVO pvo);
	int updateQna(QnaVO pvo);
	int deleteQna(QnaVO pvo);
}