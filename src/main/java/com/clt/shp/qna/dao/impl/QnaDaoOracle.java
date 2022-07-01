package com.clt.shp.qna.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.sql.GoodsSql;
import com.clt.shp.qna.QnaVO;
import com.clt.shp.qna.dao.QnaDao;
import com.clt.shp.qna.sql.QnaSql;

public class QnaDaoOracle implements QnaDao{
	private CommonDao commonDao;
	
	public QnaDaoOracle() {
		commonDao = new CommonDao();
	}
	
	@Override
	public int insertQna(QnaVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(QnaSql.QNA_INSERT);
			ps.setString(1, pvo.getTitNm());
			ps.setString(2, pvo.getCont());
			ps.setString(3, pvo.getRgstId());
			ps.setString(4, pvo.getUpdtId());
			ps.setString(5, pvo.getQnaTp());
			ps.setString(6, pvo.getAnsrStat());
			ps.setString(7, pvo.getUseYn());
			ps.setString(8, pvo.getPassYn());
			ps.setString(9, pvo.getPassWd());
			ps.setLong(10, pvo.getGoodsCd());
			ps.setString(11, pvo.getAnswer());

			row = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return row;
	}

	@Override
	public QnaVO selectQnaOne(QnaVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		QnaVO vo = null;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(QnaSql.QNA_SELECT);
			ps.setLong(1, pvo.getQnaBoardSeq());
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new QnaVO(rs.getLong("QNA_BOARD_SEQ"), rs.getString("TIT_NM") , rs.getString("CONT")
					, rs.getString("RGST_ID"), rs.getString("RGST_DATE"), rs.getString("UPDT_ID")
					, rs.getString("UPDT_DATE"), rs.getString("QNA_TP"), rs.getString("ANSR_STAT") 
					, rs.getString("USE_YN") , rs.getString("PASS_YN") , rs.getString("PASS_WD"), rs.getLong("GOODS_CD"), rs.getString("ANSWER"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vo;
	}

	@Override
	public List<QnaVO> selectQnaList(QnaVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<QnaVO> list = new ArrayList<QnaVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(QnaSql.QNA_LIST);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new QnaVO(rs.getLong("QNA_BOARD_SEQ"), rs.getString("TIT_NM") , rs.getString("CONT")
						, rs.getString("RGST_ID"), rs.getString("RGST_DATE"), rs.getString("UPDT_ID")
						, rs.getString("UPDT_DATE"), rs.getString("QNA_TP"), rs.getString("ANSR_STAT") 
						, rs.getString("USE_YN") , rs.getString("PASS_YN") , rs.getString("PASS_WD"), rs.getLong("GOODS_CD"), rs.getString("ANSWER")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public int updateQna(QnaVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(QnaSql.QNA_UPDATE);
			ps.setString(1, pvo.getTitNm());
			ps.setString(2, pvo.getCont());
			ps.setString(3, pvo.getUpdtId());
			ps.setString(4, pvo.getUpdtDate());
			ps.setString(5, pvo.getQnaTp());
			ps.setString(6, pvo.getAnsrStat());
			ps.setString(7, pvo.getUseYn());
			ps.setString(8, pvo.getPassYn());
			ps.setString(9, pvo.getPassWd());
			ps.setLong(10, pvo.getQnaBoardSeq());

			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}

	@Override
	public int deleteQna(QnaVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(QnaSql.QNA_DELETE);
			ps.setLong(1, pvo.getQnaBoardSeq());
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}

	@Override
	public List<QnaVO> searchIdQnaList(QnaVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<QnaVO> list = new ArrayList<QnaVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(QnaSql.SEARCH_ID_QNA_LIST);
			ps.setString(1, pvo.getRgstId());
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new QnaVO(rs.getLong("QNA_BOARD_SEQ"), rs.getString("TIT_NM") , rs.getString("CONT")
						, rs.getString("RGST_ID"), rs.getString("RGST_DATE"), rs.getString("UPDT_ID")
						, rs.getString("UPDT_DATE"), rs.getString("QNA_TP"), rs.getString("ANSR_STAT") 
						, rs.getString("USE_YN") , rs.getString("PASS_YN") , rs.getString("PASS_WD")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	@Override
	public List<QnaVO> searchGoodsCdQna(QnaVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<QnaVO> list = new ArrayList<QnaVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(QnaSql.SEARCH_GOODS_CD_QNA);
			ps.setLong(1, pvo.getGoodsCd());
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new QnaVO(rs.getLong("QNA_BOARD_SEQ"), rs.getString("TIT_NM") , rs.getString("CONT")
						, rs.getString("RGST_ID"), rs.getString("RGST_DATE"), rs.getString("UPDT_ID")
						, rs.getString("UPDT_DATE"), rs.getString("QNA_TP"), rs.getString("ANSR_STAT") 
						, rs.getString("USE_YN") , rs.getString("PASS_YN") , rs.getString("PASS_WD"), rs.getLong("GOODS_CD"), rs.getString("ANSWER")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	@Override
	public List<QnaVO> unansweredQnaList(QnaVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<QnaVO> list = new ArrayList<QnaVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(QnaSql.UNANSWERED_QNA_LIST);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new QnaVO(rs.getLong("QNA_BOARD_SEQ"), rs.getString("TIT_NM") , rs.getString("CONT")
						, rs.getString("RGST_ID"), rs.getString("RGST_DATE"), rs.getString("UPDT_ID")
						, rs.getString("UPDT_DATE"), rs.getString("QNA_TP"), rs.getString("ANSR_STAT") 
						, rs.getString("USE_YN") , rs.getString("PASS_YN") , rs.getString("PASS_WD"), rs.getLong("GOODS_CD"), rs.getString("ANSWER")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	@Override
	public int updateAnswerQna(QnaVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(QnaSql.QNA_ANSWER_UPDATE);
			ps.setString(1, pvo.getAnswer());
			ps.setLong(2, pvo.getQnaBoardSeq());

			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}
}
