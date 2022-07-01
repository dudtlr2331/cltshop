package com.clt.shp.order.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.cmm.dao.LogPreparedStatement;
import com.clt.shp.main.GoodsDetailVO;
import com.clt.shp.order.OrderVO;
import com.clt.shp.order.dao.OrderDao;
import com.clt.shp.order.sql.OrderSql;
import com.clt.shp.sales.SalesVO;

public class OrderDaoOracle implements OrderDao{
	private CommonDao commonDao;
	
	public OrderDaoOracle() {
		commonDao = new CommonDao();
	}

	@Override
	public List<GoodsDetailVO> ordBasketSelect(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		List<GoodsDetailVO> list = new ArrayList<GoodsDetailVO>();
		GoodsDetailVO rvo = null;
		String sql = OrderSql.ORD_BASKET_SELECT;
		
		try {
			conn = commonDao.getConnection();
			
			sql += " AND ORD_BASKET_SEQ in ("+ pvo.getKey() +")";
			
			ps = new LogPreparedStatement(conn, sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				rvo = new GoodsDetailVO();
				//order
				rvo.getOrder().setSaleBoardSeq(rs.getLong("SALE_BOARD_SEQ"));
				//sale
				rvo.getSale().setGoodsPrc(rs.getInt("GOODS_PRC"));
				rvo.getSale().setGoodsSalePrc(rs.getInt("GOODS_SALE_PRC"));
				//goods
				rvo.getGoods().setEntrNo(rs.getLong("ENTR_NO"));
				rvo.getGoods().setGoodsNm(rs.getString("GOODS_NM"));
				rvo.getGoods().setGoodsCd(rs.getLong("GOODS_CD"));
				rvo.getGoods().setDlvPrc(rs.getInt("DLV_PRC"));
				
				list.add(rvo);
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
	public List<OrderVO> searchIdOrdList(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		List<OrderVO> list = new ArrayList<OrderVO>();
		String sql = OrderSql.SEARCH_ID_ORD_LIST;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getUsrId());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new OrderVO(rs.getString("ORD_NO"), rs.getString("USR_ID")
						, rs.getLong("ENTR_NO"), rs.getString("ORD_STAT"), rs.getString("ORDR_ID")
						, rs.getString("ORDR_NM"), rs.getString("ORDR_PHON"), rs.getString("ORDR_EMAIL")
						, rs.getString("ACQR_PHON"), rs.getString("ACQR_NM"), rs.getString("ACQR_ADDR")
						, rs.getString("ACQR_ADDR_DTL") , rs.getString("ACQR_EMAIL") , rs.getString("PRCL_WAY")
						, rs.getString("PACK_WAY") , rs.getString("PAY_WAY"), rs.getLong("PAY_MNY")
						, rs.getString("REQ_MEMO") , rs.getString("ORD_DATE") , rs.getString("UPDT_DATE")
						, rs.getString("UPDT_ID") , rs.getString("RGST_DATE") , rs.getString("RGST_ID")
						, rs.getLong("BILL_NUM") , rs.getLong("ORD_DTL_NO") , rs.getString("GOODS_NM")
						, rs.getLong("GOODS_CD") , rs.getInt("GOODS_QTY") , rs.getString("CODE_NM")
						, rs.getString("RVW_TAG")
						)
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
		return list;
	}
	

	@Override
	public OrderVO searchOrdNoList(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		OrderVO vo = null;
		String sql = OrderSql.SEARCH_ORD_NO_LIST;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getOrdNo());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new OrderVO(rs.getString("ORD_NO"), rs.getString("USR_ID")
						, rs.getLong("ENTR_NO"), rs.getString("ORD_STAT"), rs.getString("ORDR_ID")
						, rs.getString("ORDR_NM"), rs.getString("ORDR_PHON"), rs.getString("ORDR_EMAIL")
						, rs.getString("ACQR_PHON"), rs.getString("ACQR_NM"), rs.getString("ACQR_ADDR")
						, rs.getString("ACQR_ADDR_DTL") , rs.getString("ACQR_EMAIL") , rs.getString("PRCL_WAY")
						, rs.getString("PACK_WAY") , rs.getString("PAY_WAY"), rs.getLong("PAY_MNY")
						, rs.getString("REQ_MEMO") , rs.getString("ORD_DATE") , rs.getString("UPDT_DATE")
						, rs.getString("UPDT_ID") , rs.getString("RGST_DATE") , rs.getString("RGST_ID")
						, rs.getLong("BILL_NUM") , rs.getLong("ORD_DTL_NO") , rs.getString("GOODS_NM")
						, rs.getLong("GOODS_CD") , rs.getInt("GOODS_QTY") , rs.getString("CODE_NM")
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
	public List<OrderVO> searchOrdDtlGoods(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		OrderVO vo = null;
		List<OrderVO> list = new ArrayList<OrderVO>();
		String sql = OrderSql.SEARCH_ORD_DTL_GOODS;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getUsrId());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				vo = new OrderVO();
				vo.setGoodsNm(rs.getString("GOODS_NM"));
				vo.setGoodsCd(rs.getLong("GOODS_CD"));
				vo.setGoodsQty(rs.getInt("GOODS_QTY"));
				list.add(vo);
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
	public int insertOrd(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		String sql = OrderSql.ORDER_INSERT;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getOrdNo());
			ps.setString(2, pvo.getUsrId());
			ps.setLong(3, pvo.getEntrNo());
			ps.setString(4, pvo.getOrdStat());
			ps.setString(5, pvo.getOrdrId());
			ps.setString(6, pvo.getOrdrNm());
			ps.setString(7, pvo.getOrdrPhon());
			ps.setString(8, pvo.getOrdrEmail());
			ps.setString(9, pvo.getAcqrPhon());
			ps.setString(10, pvo.getAcqrNm());
			ps.setString(11, pvo.getAcqrAddr());
			ps.setString(12, pvo.getAcqrAddrDtl());
			ps.setString(13, pvo.getAcqrEmail());
			ps.setString(14, pvo.getPrclWay());
			ps.setString(15, pvo.getPackWay());
			ps.setString(16, pvo.getPayWay());
			ps.setLong(17, pvo.getPayMny());
			ps.setString(18, pvo.getReqMemo());
			ps.setString(19, pvo.getUpdtId());
			ps.setString(20, pvo.getRgstId());
			ps.setLong(21, pvo.getBillNum());
			ps.setLong(22, pvo.getSaleBoardSeq());
			ps.setLong(23, pvo.getGoodsCd());
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
	public OrderVO selectOrdOne(OrderVO pvo){
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		OrderVO vo = null;
		String sql = OrderSql.ORDER_SELECT;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getOrdNo());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new OrderVO(rs.getString("ORD_NO"), rs.getString("USR_ID")
					, rs.getLong("ENTR_NO"), rs.getString("ORD_STAT"), rs.getString("ORDR_ID")
					, rs.getString("ORDR_NM"), rs.getString("ORDR_PHON"), rs.getString("ORDR_EMAIL")
					, rs.getString("ACQR_PHON"), rs.getString("ACQR_NM"), rs.getString("ACQR_ADDR")
					, rs.getString("ACQR_ADDR_DTL") , rs.getString("ACQR_EMAIL") , rs.getString("PRCL_WAY")
					, rs.getString("PACK_WAY") , rs.getString("PAY_WAY"), rs.getLong("PAY_MNY")
					, rs.getString("REQ_MEMO") , rs.getString("ORD_DATE") , rs.getString("UPDT_DATE")
					, rs.getString("UPDT_ID") , rs.getString("RGST_DATE") , rs.getString("RGST_ID")
					, rs.getLong("BILL_NUM"));
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
	public List<OrderVO> selectOrdBaseList(OrderVO pvo){ //매출관리
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		List<OrderVO> list = new ArrayList<OrderVO>();
		String sql = OrderSql.ORDER_BASE_LIST_SELECT;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new OrderVO(rs.getString("ORD_NO"), rs.getString("USR_ID")
						, rs.getLong("ENTR_NO"), rs.getString("ORD_STAT"), rs.getString("ORDR_ID")
						, rs.getString("ORDR_NM"), rs.getString("ORDR_PHON"), rs.getString("ORDR_EMAIL")
						, rs.getString("ACQR_PHON"), rs.getString("ACQR_NM"), rs.getString("ACQR_ADDR")
						, rs.getString("ACQR_ADDR_DTL") , rs.getString("ACQR_EMAIL") , rs.getString("PRCL_WAY")
						, rs.getString("PACK_WAY") , rs.getString("PAY_WAY"), rs.getLong("PAY_MNY")
						, rs.getString("REQ_MEMO") , rs.getString("ORD_DATE") , rs.getString("UPDT_DATE")
						, rs.getString("UPDT_ID") , rs.getString("RGST_DATE") , rs.getString("RGST_ID")
						, rs.getLong("BILL_NUM")));
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
	public List<OrderVO> selectOrdList(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		List<OrderVO> list = new ArrayList<OrderVO>();
		OrderVO vo = null;
		String sql = OrderSql.ORDER_LIST;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				vo = new OrderVO(rs.getString("ORD_NO"), rs.getString("USR_ID")
						, rs.getLong("ENTR_NO"), rs.getString("ORD_STAT"), rs.getString("ORDR_ID")
						, rs.getString("ORDR_NM"), rs.getString("ORDR_PHON"), rs.getString("ORDR_EMAIL")
						, rs.getString("ACQR_PHON"), rs.getString("ACQR_NM"), rs.getString("ACQR_ADDR")
						, rs.getString("ACQR_ADDR_DTL") , rs.getString("ACQR_EMAIL") , rs.getString("PRCL_WAY")
						, rs.getString("PACK_WAY") , rs.getString("PAY_WAY"), rs.getLong("PAY_MNY")
						, rs.getString("REQ_MEMO") , rs.getString("ORD_DATE") , rs.getString("UPDT_DATE")
						, rs.getString("UPDT_ID") , rs.getString("RGST_DATE") , rs.getString("RGST_ID")
						, rs.getLong("BILL_NUM"));
				vo.setOrdDtlNo(rs.getLong("ORD_DTL_NO"));
				vo.setGoodsNm(rs.getString("GOODS_NM"));
				vo.setGoodsCd(rs.getLong("GOODS_CD"));
				vo.setGoodsQty(rs.getInt("GOODS_QTY"));
				vo.setCodeNm(rs.getString("CODE_NM"));
				list.add(vo);
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
	public int updateOrd(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = OrderSql.ORDER_UPDATE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getUsrId());
			ps.setLong(2, pvo.getEntrNo());
			ps.setString(3, pvo.getOrdStat());
			ps.setString(4, pvo.getOrdrId());
			ps.setString(5, pvo.getOrdrNm());
			ps.setString(6, pvo.getOrdrPhon());
			ps.setString(7, pvo.getOrdrEmail());
			ps.setString(8, pvo.getAcqrPhon());
			ps.setString(9, pvo.getAcqrNm());
			ps.setString(10, pvo.getAcqrAddr());
			ps.setString(11, pvo.getAcqrAddrDtl());
			ps.setString(12, pvo.getAcqrEmail());
			ps.setString(13, pvo.getPrclWay());
			ps.setString(14, pvo.getPackWay());
			ps.setString(15, pvo.getPayWay());
			ps.setLong(16, pvo.getPayMny());
			ps.setString(17, pvo.getReqMemo());
			ps.setString(18, pvo.getUpdtId());
			ps.setLong(19, pvo.getBillNum());
			ps.setString(20, pvo.getOrdNo());
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
	public int deleteOrd(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = OrderSql.ORDER_DELETE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getOrdNo());
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
	
	//-----------------------------------------------------------------주문 상세-----------------------------------------------------------------
	@Override
	public int insertOrdDtl(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		String sql = OrderSql.ORDER_DTL_INSERT;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getUsrId());
			ps.setString(2, pvo.getOrdNo());
			ps.setString(3, pvo.getGoodsNm());
			ps.setLong(4, pvo.getGoodsCd());
			ps.setInt(5, pvo.getGoodsQty());
			ps.setString(6, pvo.getUpdtId());
			ps.setString(7, pvo.getRgstId());
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
	public OrderVO selectOrdDtlOne(OrderVO pvo){
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		OrderVO vo = null;
		String sql = OrderSql.ORDER_DTL_SELECT;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getOrdNo());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new OrderVO(rs.getLong("ORD_DTL_NO"), rs.getString("USR_ID")
					, rs.getString("ORD_NO"), rs.getString("GOODS_NM"), rs.getLong("GOODS_CD")
					, rs.getInt("GOODS_QTY"), rs.getString("UPDT_DATE"), rs.getString("UPDT_ID")
					, rs.getString("RGST_DATE"), rs.getString("RGST_ID"));
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
	public List<OrderVO> selectOrdDtlList(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<OrderVO> list = new ArrayList<OrderVO>();
		String sql = OrderSql.ORDER_DTL_LIST;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add( new OrderVO(rs.getLong("ORD_DTL_NO"), rs.getString("USR_ID")
						, rs.getString("ORD_NO"), rs.getString("GOODS_NM"), rs.getLong("GOODS_CD")
						, rs.getInt("GOODS_QTY"), rs.getString("UPDT_DATE"), rs.getString("UPDT_ID")
						, rs.getString("RGST_DATE"), rs.getString("RGST_ID")));
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
	public int updateOrdDtl(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = OrderSql.ORDER_UPDATE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getUsrId());
			ps.setString(2, pvo.getOrdNo());
			ps.setString(3, pvo.getGoodsNm());
			ps.setLong(4, pvo.getGoodsCd());
			ps.setInt(5, pvo.getGoodsQty());
			ps.setString(6, pvo.getUpdtId());
			ps.setLong(7, pvo.getOrdDtlNo());
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
	public int deleteOrdDtl(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = OrderSql.ORDER_DTL_DELETE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setLong(1, pvo.getOrdDtlNo());
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
	public int insertBasket(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = OrderSql.BASKET_INSERT;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getUsrId());
			ps.setInt(2, pvo.getGoodsQty());
			ps.setLong(3, pvo.getGoodsCd());
			ps.setLong(4, pvo.getEntrNo());
			ps.setLong(5, pvo.getSaleBoardSeq());
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
	public int deleteBasket(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = OrderSql.BASKET_DELETE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setLong(1, pvo.getOrdBasketSeq());
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
	public int updateBasket(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = OrderSql.BASKET_UPDATE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setLong(1, pvo.getOrdBasketSeq());
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
	public List<OrderVO> selectBasketList(OrderVO pvo) {
		Connection conn = null;
		LogPreparedStatement ps = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<OrderVO> list = new ArrayList<OrderVO>();
		String sql = OrderSql.BASKET_LIST;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getUsrId());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new OrderVO(
					rs.getLong(1)
					,rs.getString(2)
					,rs.getInt(3)
					,rs.getLong(4)
					,rs.getString(5)
					,rs.getString(6)
					,rs.getString(7)
					,rs.getLong(8)
					,rs.getLong(9)
					,rs.getInt(10)
					,rs.getInt(11)
					,rs.getInt(12)
					,rs.getString(13)
					,rs.getString(14)
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
	public List<OrderVO> selectCartOrdDtlList(OrderVO pvo){
		Connection conn = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		List<OrderVO> list = new ArrayList<OrderVO>();
		String sql = OrderSql.ORDER_DTL_SELECT;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getOrdNo());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new OrderVO(rs.getLong("ORD_DTL_NO"), rs.getString("USR_ID")
					, rs.getString("ORD_NO"), rs.getString("GOODS_NM"), rs.getLong("GOODS_CD")
					, rs.getInt("GOODS_QTY"), rs.getString("UPDT_DATE"), rs.getString("UPDT_ID")
					, rs.getString("RGST_DATE"), rs.getString("RGST_ID")));
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
