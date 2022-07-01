package com.clt.shp.dress.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.cmm.dao.LogPreparedStatement;
import com.clt.shp.dress.DressVO;
import com.clt.shp.dress.dao.DressDao;
import com.clt.shp.dress.sql.DressSql;

public class DressDaoOracle implements DressDao{
	private CommonDao commonDao;
	
	public DressDaoOracle() {
		commonDao = new CommonDao();
	}

	@Override
	public int insertDress(DressVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		String sql = DressSql.DRESS_INSERT;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setInt(1, pvo.getSaleBoardSeq());
			ps.setInt(2, pvo.getGoodsCd());
			ps.setInt(3, pvo.getEntrNo());
			ps.setString(4, pvo.getBulTitNm());
			ps.setString(5, pvo.getBulCont());
			ps.setInt(6, pvo.getRpyLvl());
			ps.setInt(7, pvo.getParSaleBoardRpySn());
			ps.setInt(8, pvo.getQryCnt());
			ps.setInt(9, pvo.getLkeCnt());
			ps.setString(10, pvo.getRgstId());
			ps.setString(11, pvo.getUpdtId());
			ps.setString(12, pvo.getImgPath());
			ps.setString(13, pvo.getImgNm());
			ps.setString(14, pvo.getOrdNo());
			ps.setString(15, pvo.getRvwTag());

			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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
	public DressVO selectDressOne(DressVO pvo){
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		DressVO vo = null;
		String sql = DressSql.DRESS_SELECT;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setLong(1, pvo.getSaleBoardRpySeq());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new DressVO(
                      rs.getInt("SALE_BOARD_RPY_SEQ")
                    , rs.getInt("SALE_BOARD_SEQ")
			        , rs.getInt("GOODS_CD")
                    , rs.getInt("ENTR_NO")
			        , rs.getString("BUL_TIT_NM")
			        , rs.getString("BUL_CONT")
			        , rs.getInt("RPY_LVL")
			        , rs.getInt("PAR_SALE_BOARD_RPY_SN")
			        , rs.getInt("QRY_CNT")
			        , rs.getInt("LKE_CNT")
			        , rs.getString("RGST_ID")
			        , rs.getString("RGST_DATE")
			        , rs.getString("UPDT_ID")
			        , rs.getString("UPDT_DATE")
			        , rs.getString("USE_YN")
			        , rs.getString("IMG_PATH")
			        , rs.getString("IMG_NM")
					, rs.getString("RVW_TAG")
                );
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
	public List<DressVO> selectDressList(DressVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		List<DressVO> list = new ArrayList<DressVO>();
		String sql = DressSql.DRESS_LIST;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);

			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new DressVO(
					  rs.getInt("SALE_BOARD_RPY_SEQ")
					, rs.getInt("SALE_BOARD_SEQ")
					, rs.getInt("GOODS_CD")
					, rs.getInt("ENTR_NO")
					, rs.getString("BUL_TIT_NM")
					, rs.getString("BUL_CONT")
					, rs.getInt("RPY_LVL")
					, rs.getInt("PAR_SALE_BOARD_RPY_SN")
					, rs.getInt("QRY_CNT")
					, rs.getInt("LKE_CNT")
					, rs.getString("RGST_ID")
					, rs.getString("RGST_DATE")
					, rs.getString("UPDT_ID")
					, rs.getString("UPDT_DATE")
					, rs.getString("USE_YN")
					, rs.getString("IMG_PATH")
					, rs.getString("IMG_NM")
					, rs.getString("RVW_TAG")
				));
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
	public int updateDress(DressVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = DressSql.DRESS_UPDATE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getBulTitNm());
			ps.setString(2, pvo.getBulCont());
			ps.setString(3, pvo.getUseYn());
			ps.setString(4, pvo.getImgPath());
			ps.setString(5, pvo.getImgNm());
			ps.setString(6, pvo.getRvwTag());
			ps.setInt(7, pvo.getSaleBoardRpySeq());

			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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
	public int deleteDress(DressVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = DressSql.DRESS_DELETE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setInt(1, pvo.getSaleBoardRpySeq());

			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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
	public List<DressVO> goodsDtlDressList(DressVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<DressVO> list = new ArrayList<DressVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(DressSql.GOODS_DTL_DRESS_LIST); // DressSql
			ps.setLong(1, pvo.getGoodsCd());
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new DressVO(
						rs.getInt("SALE_BOARD_RPY_SEQ")
						, rs.getInt("SALE_BOARD_SEQ")
						, rs.getInt("GOODS_CD")
						, rs.getInt("ENTR_NO")
						, rs.getString("BUL_TIT_NM")
						, rs.getString("BUL_CONT")
						, rs.getInt("RPY_LVL")
						, rs.getInt("PAR_SALE_BOARD_RPY_SN")
						, rs.getInt("QRY_CNT")
						, rs.getInt("LKE_CNT")
						, rs.getString("RGST_ID")
						, rs.getString("RGST_DATE")
						, rs.getString("UPDT_ID")
						, rs.getString("UPDT_DATE")
						, rs.getString("USE_YN")
						, rs.getString("IMG_PATH")
						, rs.getString("IMG_NM")
						, rs.getString("RVW_TAG")));
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
	public List<DressVO> selectWriteSaleRvw(DressVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		List<DressVO> list = new ArrayList<DressVO>();
		String sql = DressSql.SELECT_WRITE_SALE_RVW;
		DressVO rsvo = null;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getUsrId());

			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				rsvo = new DressVO();
				rsvo.setOrdNo(rs.getString(1));
				rsvo.setUsrId(rs.getString(2));
				rsvo.setEntrNo(rs.getInt(3));
				rsvo.setOrdStat(rs.getString(4));
				rsvo.setOrdrId(rs.getString(5));
				rsvo.setOrdrNm(rs.getString(6));
				rsvo.setOrdrPhon(rs.getString(7));
				rsvo.setOrdrEmail(rs.getString(8));
				rsvo.setAcqrPhon(rs.getString(9));
				rsvo.setAcqrNm(rs.getString(10));
				rsvo.setAcqrAddr(rs.getString(11));
				rsvo.setAcqrAddrDtl(rs.getString(12));
				rsvo.setAcqrEmail(rs.getString(13));
				rsvo.setPrclWay(rs.getString(14));
				rsvo.setPackWay(rs.getString(15));
				rsvo.setPayMny(rs.getInt(16));
				rsvo.setReqMemo(rs.getString(17));
				rsvo.setOrdDate(rs.getDate(18));
				rsvo.setUpdtDate(rs.getString(19));
				rsvo.setUpdtId(rs.getString(20));
				rsvo.setRgstDate(rs.getString(21));
				rsvo.setRgstId(rs.getString(22));
				rsvo.setBillNum(rs.getInt(23));
				rsvo.setSaleBoardRpySeq(rs.getInt(24));
				rsvo.setSaleBoardSeq(rs.getInt(25));
				rsvo.setGoodsCd(rs.getInt(26));
				rsvo.setRpyLvl(rs.getInt(27));
				rsvo.setParSaleBoardRpySn(rs.getInt(28));
				rsvo.setQryCnt(rs.getInt(29));
				rsvo.setLkeCnt(rs.getInt(30));
				rsvo.setUseYn(rs.getString(31));
				rsvo.setImgPath(rs.getString(32));
				rsvo.setImgNm(rs.getString(33));
				rsvo.setBulTitNm(rs.getString(34));
				rsvo.setBulCont(rs.getString(35));
				list.add(rsvo);
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

}
