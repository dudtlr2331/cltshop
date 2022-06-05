package com.clt.shp.dress.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
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
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(DressSql.DRESS_INSERT); //DressSql
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
			ps.setString(12, pvo.getUseYn());
			ps.setString(13, pvo.getImgPath());
			ps.setString(14, pvo.getImgNm());

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
		PreparedStatement ps = null;
		ResultSet rs = null;
		DressVO vo = null;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(DressSql.DRESS_SELECT); //DressSql
			ps.setLong(1, pvo.getSaleBoardRpySeq());
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
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<DressVO> list = new ArrayList<DressVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(DressSql.DRESS_LIST); //DressSql
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
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(DressSql.DRESS_UPDATE); //DressSql
			ps.setString(1, pvo.getBulTitNm());
			ps.setString(2, pvo.getBulCont());
			ps.setString(3, pvo.getUseYn());
			ps.setInt(4, pvo.getSaleBoardRpySeq());
			ps.setString(5, pvo.getImgPath());
			ps.setString(6, pvo.getImgNm());

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
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(DressSql.DRESS_DELETE); //DressSql
			ps.setInt(1, pvo.getSaleBoardRpySeq());

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
