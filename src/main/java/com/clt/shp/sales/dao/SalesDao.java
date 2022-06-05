package com.clt.shp.sales.dao;

import com.clt.shp.sales.SalesVO;

import java.util.List;

public interface SalesDao {
    int insertSales(SalesVO pvo);
    int deleteSales(SalesVO pvo);
    int deleteSalesAll();
    int updateSales(SalesVO pvo);
    List<SalesVO> selectSalesList(SalesVO pvo);
    SalesVO selectSalesOne(SalesVO pvo);
    int dropSeq();
    int createSeq();
}
