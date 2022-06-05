package com.clt.shp.sales.service;

import com.clt.cmm.util.DateUtils;
import com.clt.cmm.util.StringUtils;
import com.clt.shp.sales.SalesVO;
import com.clt.shp.sales.dao.SalesDao;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.List;

public class SalesService {
    private SalesDao dao;
    public SalesService(SalesDao dao){
        this.dao = dao;
    }

    //파라미터 셋팅
    public SalesVO parameterSetting(HttpServletRequest req){
        long saleBoardSeq = StringUtils.nullToLong(req.getParameter("saleBoardSeq"));
        int goodsCd = StringUtils.nullToInt(req.getParameter("goodsCd"));
        int entrNo = StringUtils.nullToInt(req.getParameter("entrNo"));
        String ntcSctCd = StringUtils.nullToStr(req.getParameter("ntcSctCd"));
        String bulYn = StringUtils.nullToStr(req.getParameter("bulYn"));;
        Date bulStrtDt = DateUtils.stringToSqlDate(req.getParameter("bulStrtDt"));;
        Date bulEndDt = DateUtils.stringToSqlDate(req.getParameter("bulEndDt"));;
        String bulTitNm = StringUtils.nullToStr(req.getParameter("bulTitNm"));;
        String bulCont = StringUtils.nullToStr(req.getParameter("bulCont"));;
        int qryCnt = StringUtils.nullToInt(req.getParameter("qryCnt"));;
        long lkeCnt = StringUtils.nullToLong(req.getParameter("lkeCnt"));;
        int goodsPrc = StringUtils.nullToInt(req.getParameter("goodsPrc"));;
        int goodsSalePrc = StringUtils.nullToInt(req.getParameter("goodsSalePrc"));;
        String prclWay = StringUtils.nullToStr(req.getParameter("prclWay"));;
        int saleCnt = StringUtils.nullToInt(req.getParameter("saleCnt"));;
        String rgstId = StringUtils.nullToStr(req.getParameter("rgstId"));;
        Date rgstDate = DateUtils.stringToSqlDate(req.getParameter("rgstDate"));;
        String updtId = StringUtils.nullToStr(req.getParameter("updtId"));;
        Date updtDate = DateUtils.stringToSqlDate(req.getParameter("updtDate"));;
        String saleStatCd = StringUtils.nullToStr(req.getParameter("saleStatCd"));;
        String useYn = StringUtils.nullToStr(req.getParameter("useYn"));;
        String description = StringUtils.nullToStr(req.getParameter("description"));;

        String searchEntrNo = StringUtils.nullToStr(req.getParameter("searchEntrNo"));

        SalesVO pvo = new SalesVO();
        pvo.setSaleBoardSeq(saleBoardSeq);
        pvo.setGoodsCd(goodsCd);
        pvo.setEntrNo(entrNo);
        pvo.setNtcSctCd(ntcSctCd);
        pvo.setBulYn(bulYn);
        pvo.setBulStrtDt(bulStrtDt);
        pvo.setBulEndDt(bulEndDt);
        pvo.setBulTitNm(bulTitNm);
        pvo.setBulCont(bulCont);
        pvo.setQryCnt(qryCnt);
        pvo.setLkeCnt(lkeCnt);
        pvo.setGoodsPrc(goodsPrc);
        pvo.setGoodsSalePrc(goodsSalePrc);
        pvo.setPrclWay(prclWay);
        pvo.setSaleCnt(saleCnt);
        pvo.setRgstId(rgstId);
        pvo.setRgstDate(rgstDate);
        pvo.setUpdtId(updtId);
        pvo.setUpdtDate(updtDate);
        pvo.setSaleStatCd(saleStatCd);
        pvo.setUseYn(useYn);
        pvo.setDescription(description);
        pvo.setSearchEntrNo(searchEntrNo);

        return pvo;
    }

    public SalesVO selectSalesOne(SalesVO pvo){
        return dao.selectSalesOne(pvo);
    }

    public List<SalesVO> selectSalesList(SalesVO pvo){
        return dao.selectSalesList(pvo);
    }

    public int insertSales(SalesVO pvo){
        return dao.insertSales(pvo);
    }

    public int updateSales(SalesVO pvo){
        return dao.updateSales(pvo);
    }

    public int deleteSales(SalesVO pvo){
        return dao.deleteSales(pvo);
    }
}
