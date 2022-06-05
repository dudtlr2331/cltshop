package com.clt.shp.sales.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.cmm.dao.LogPreparedStatement;
import com.clt.shp.sales.SalesVO;
import com.clt.shp.sales.dao.SalesDao;
import com.clt.shp.sales.sql.SalesSql;

public class SalesDaoOracle implements SalesDao {
    private CommonDao commonDao;

    public SalesDaoOracle(){
        commonDao = new CommonDao();
    }

    @Override
    public int insertSales(SalesVO pvo) {
        Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
        ResultSet rs = null;
        int row = 0;
        String sql = SalesSql.SALE_INSERT;

        try{
            conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
            ps.setInt(1, pvo.getGoodsCd());
            ps.setLong(2, pvo.getEntrNo());
            ps.setString(3, pvo.getNtcSctCd());
            ps.setString(4, pvo.getBulYn());
            ps.setDate(5, pvo.getBulStrtDt());
            ps.setDate(6, pvo.getBulEndDt());
            ps.setString(7, pvo.getBulTitNm());
            ps.setString(8, pvo.getBulCont());
            ps.setInt(9, pvo.getQryCnt());
            ps.setLong(10, pvo.getLkeCnt());
            ps.setInt(11, pvo.getGoodsPrc());
            ps.setInt(12, pvo.getGoodsSalePrc());
            ps.setString(13, pvo.getPrclWay());
            ps.setInt(14, pvo.getSaleCnt());
            ps.setString(15, pvo.getRgstId());
            ps.setString(16, pvo.getUpdtId());
            ps.setString(17, pvo.getSaleStatCd());
            ps.setString(18, pvo.getDescription());
            System.out.println("=SQL=======================================================");
            System.out.println(ps);
            System.out.println("===========================================================");
            row = ps.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try {
                commonDao.closeAll(rs, ps, conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return row;
    }

    @Override
    public SalesVO selectSalesOne(SalesVO pvo) {
        Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
        ResultSet rs = null;
        SalesVO vo = null;
        String sql = SalesSql.SALE_SELECT;
        try{
            conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
            ps.setLong(1, pvo.getSaleBoardSeq());
            System.out.println("=SQL=======================================================");
            System.out.println(ps);
            System.out.println("===========================================================");
            rs = ps.executeQuery();
            if(rs.next()){
                vo = new SalesVO(
                     rs.getLong("SALE_BOARD_SEQ")
                    ,rs.getInt("GOODS_CD")
                    ,rs.getInt("ENTR_NO")
                    ,rs.getString("NTC_SCT_CD")
                    ,rs.getString("BUL_YN")
                    ,rs.getDate("BUL_STRT_DT")
                    ,rs.getDate("BUL_END_DT")
                    ,rs.getString("BUL_TIT_NM")
                    ,rs.getString("BUL_CONT")
                    ,rs.getInt("QRY_CNT")
                    ,rs.getLong("LKE_CNT")
                    ,rs.getInt("GOODS_PRC")
                    ,rs.getInt("GOODS_SALE_PRC")
                    ,rs.getString("PRCL_WAY")
                    ,rs.getInt("SALE_CNT")
                    ,rs.getString("RGST_ID")
                    ,rs.getDate("RGST_DATE")
                    ,rs.getString("UPDT_ID")
                    ,rs.getDate("UPDT_DATE")
                    ,rs.getString("SALE_STAT_CD")
                    ,rs.getString("USE_YN")
                    ,rs.getString("DESCRIPTION")
                );
            }
        } catch(SQLException e){
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
    public List<SalesVO> selectSalesList(SalesVO pvo) {
        Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
        ResultSet rs = null;
        List<SalesVO> list = new ArrayList<SalesVO>();
        String sql = SalesSql.SALE_SELECT_LIST;
        try{
            conn = commonDao.getConnection();

            if(!"".equals(pvo.getEntrNo())){
                sql += " AND ENTR_NO = " + pvo.getEntrNo() + " ";
            }else{
                sql += " AND ENTR_NO = -1";
            }

			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
            System.out.println("=SQL=======================================================");
            System.out.println(ps);
            System.out.println("===========================================================");
            rs = ps.executeQuery();
            while (rs.next()){
                list.add(new SalesVO(
                     rs.getLong("SALE_BOARD_SEQ")
                    ,rs.getInt("GOODS_CD")
                    ,rs.getInt("ENTR_NO")
                    ,rs.getString("NTC_SCT_CD")
                    ,rs.getString("BUL_YN")
                    ,rs.getDate("BUL_STRT_DT")
                    ,rs.getDate("BUL_END_DT")
                    ,rs.getString("BUL_TIT_NM")
                    ,rs.getString("BUL_CONT")
                    ,rs.getInt("QRY_CNT")
                    ,rs.getLong("LKE_CNT")
                    ,rs.getInt("GOODS_PRC")
                    ,rs.getInt("GOODS_SALE_PRC")
                    ,rs.getString("PRCL_WAY")
                    ,rs.getInt("SALE_CNT")
                    ,rs.getString("RGST_ID")
                    ,rs.getDate("RGST_DATE")
                    ,rs.getString("UPDT_ID")
                    ,rs.getDate("UPDT_DATE")
                    ,rs.getString("SALE_STAT_CD")
                    ,rs.getString("USE_YN")
                    ,rs.getString("DESCRIPTION")
                ));
            }
        } catch(SQLException e){
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
    public int updateSales(SalesVO pvo) {
        Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
        int row = 0;
        String sql = SalesSql.SALE_UPDATE;
        try{
            conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
            ps.setInt(1, pvo.getGoodsCd());
            ps.setLong(2, pvo.getEntrNo());
            ps.setString(3, pvo.getNtcSctCd());
            ps.setString(4, pvo.getBulYn());
            ps.setDate(5, pvo.getBulStrtDt());
            ps.setDate(6, pvo.getBulEndDt());
            ps.setString(7, pvo.getBulTitNm());
            ps.setString(8, pvo.getBulCont());
            ps.setInt(9, pvo.getQryCnt());
            ps.setLong(10, pvo.getLkeCnt());
            ps.setInt(11, pvo.getGoodsPrc());
            ps.setInt(12, pvo.getGoodsSalePrc());
            ps.setString(13, pvo.getPrclWay());
            ps.setInt(14, pvo.getSaleCnt());
            ps.setString(15, pvo.getUpdtId());
            ps.setString(16, pvo.getSaleStatCd());
            ps.setString(17, pvo.getUseYn());
            ps.setString(18, pvo.getDescription());
            ps.setLong(19, pvo.getSaleBoardSeq());
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
    public int deleteSales(SalesVO pvo) {
        Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
        int row = 0;
        String sql = SalesSql.SALE_DELETE;
        try{
            conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
            ps.setLong(1, pvo.getSaleBoardSeq());
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
    public int deleteSalesAll() {
        Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
        int row = 0;
        String sql = SalesSql.SALE_DELETE_ALL;
        try{
            conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);
            
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
	public int dropSeq() {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = SalesSql.SALE_DROP_SEQ;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);

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
	public int createSeq() {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		int row = 0;
		String sql = SalesSql.SALE_CREATE_SEQ;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
//			ps = conn.prepareStatement(sql);

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

}
