package com.clt.shp.order;

import oracle.sql.DATE;

public class OrderVO {
	//주문 기본
	private String ordNo;
	private String usrId;
	private Long entrNo;
	private String ordStat;
	private String ordrId;
	private String ordrNm;
	private String ordrPhon;
	private String ordrEmail;
	private String acqrPhon;
	private String acqrNm;
	private String acqrAddr;
	private String acqrAddrDtl;
	private String acqrEmail;
	private String prclWay;
	private String packWay;
	private String payWay;
	private Long payMny;
	private String reqMemo;
	private String ordDate;
	private String updtDate;
	private String updtId;
	private String rgstDate;
	private String rgstId;
	private Long billNum;
	
	//주문 상세
	private Long ordDtlNo;
	private String goodsNm;
	private Long goodsCd;
	private int goodsQty;
	private String codeNm;
	

	//장바구니
	private Long ordBasketSeq;
	private String useYn;
	private Long saleBoardSeq;
	private String imgPath;
	private String imgNm;
	private String bulTitNm;
	private int goodsPrc;/*상품가격*/
	private int goodsSalePrc;
	private int saleCnt;
	private String saleStatCd;
	private String description;
	private String checkedList;
	private String key;
	
	String[] goodsNmArry;
	Long[] goodsCdArry;
	int[] goodsQtyArry;

	//파라미터
	private String searchSaleBoardSeq;
	
	public OrderVO() {
		
	}
	
	public OrderVO(Long ordBasketSeq, String usrId, int goodsQty, String prclWay, String packWay,
			String rgstDate, String useYn, Long saleBoardSeq, Long goodsCd, Long entrNo) {
		this.usrId = usrId;
		this.goodsQty = goodsQty;
		this.prclWay = prclWay;
		this.packWay = packWay;
		this.rgstDate = rgstDate;
		this.useYn = useYn;
		this.saleBoardSeq = saleBoardSeq;
		this.goodsCd = goodsCd;
		this.entrNo = entrNo;
	}
	
	public OrderVO(String ordNo, String usrId, Long entrNo, String ordStat, String ordrId, String ordrNm,
			String ordrPhon, String ordrEmail, String acqrPhon, String acqrNm, String acqrAddr, String acqrAddrDtl,
			String acqrEmail, String prclWay, String packWay, String payWay, Long payMny, String reqMemo,
			String ordDate, String updtDate, String updtId, String rgstDate, String rgstId, Long billNum) {
		super();
		this.ordNo = ordNo;
		this.usrId = usrId;
		this.entrNo = entrNo;
		this.ordStat = ordStat;
		this.ordrId = ordrId;
		this.ordrNm = ordrNm;
		this.ordrPhon = ordrPhon;
		this.ordrEmail = ordrEmail;
		this.acqrPhon = acqrPhon;
		this.acqrNm = acqrNm;
		this.acqrAddr = acqrAddr;
		this.acqrAddrDtl = acqrAddrDtl;
		this.acqrEmail = acqrEmail;
		this.prclWay = prclWay;
		this.packWay = packWay;
		this.payWay = payWay;
		this.payMny = payMny;
		this.reqMemo = reqMemo;
		this.ordDate = ordDate;
		this.updtDate = updtDate;
		this.updtId = updtId;
		this.rgstDate = rgstDate;
		this.rgstId = rgstId;
		this.billNum = billNum;
	}
	
	public OrderVO(Long ordDtlNo, String usrId, String ordNo, String goodsNm, Long goodsCd, int goodsQty,
			String updtDate, String updtId, String rgstDate, String rgstId) {
		super();
		this.ordDtlNo = ordDtlNo;
		this.usrId = usrId;
		this.ordNo = ordNo;
		this.goodsNm = goodsNm;
		this.goodsCd = goodsCd;
		this.goodsQty = goodsQty;
		this.updtDate = updtDate;
		this.updtId = updtId;
		this.rgstDate = rgstDate;
		this.rgstId = rgstId;
	}
	
	public OrderVO(String ordNo, String usrId, Long entrNo, String ordStat, String ordrId, String ordrNm,
			String ordrPhon, String ordrEmail, String acqrPhon, String acqrNm, String acqrAddr, String acqrAddrDtl,
			String acqrEmail, String prclWay, String packWay, String payWay, Long payMny, String reqMemo,
			String ordDate, String updtDate, String updtId, String rgstDate, String rgstId, Long billNum, Long ordDtlNo,
			String goodsNm, Long goodsCd, int goodsQty, String codeNm) {
		super();
		this.ordNo = ordNo;
		this.usrId = usrId;
		this.entrNo = entrNo;
		this.ordStat = ordStat;
		this.ordrId = ordrId;
		this.ordrNm = ordrNm;
		this.ordrPhon = ordrPhon;
		this.ordrEmail = ordrEmail;
		this.acqrPhon = acqrPhon;
		this.acqrNm = acqrNm;
		this.acqrAddr = acqrAddr;
		this.acqrAddrDtl = acqrAddrDtl;
		this.acqrEmail = acqrEmail;
		this.prclWay = prclWay;
		this.packWay = packWay;
		this.payWay = payWay;
		this.payMny = payMny;
		this.reqMemo = reqMemo;
		this.ordDate = ordDate;
		this.updtDate = updtDate;
		this.updtId = updtId;
		this.rgstDate = rgstDate;
		this.rgstId = rgstId;
		this.billNum = billNum;
		this.ordDtlNo = ordDtlNo;
		this.goodsNm = goodsNm;
		this.goodsCd = goodsCd;
		this.goodsQty = goodsQty;
		this.codeNm = codeNm;
	}

	public OrderVO(Long ordBasketSeq
			, String usrId
			, int goodsQty
			, Long saleBoardSeq
			, String imgPath
			, String imgNm
			, String bulTitNm
			, Long goodsCd
			, Long entrNo
			, int goodsPrc
			, int goodsSalePrc
			, int saleCnt
			, String saleStatCd
			, String description) {
		super();
		this.ordBasketSeq = ordBasketSeq;
		this.usrId = usrId;
		this.goodsQty = goodsQty;
		this.saleBoardSeq = saleBoardSeq;
		this.imgPath = imgPath;
		this.imgNm = imgNm;
		this.bulTitNm = bulTitNm;
		this.goodsCd = goodsCd;
		this.entrNo = entrNo;
		this.goodsPrc = goodsPrc;
		this.goodsSalePrc = goodsSalePrc;
		this.saleCnt = saleCnt;
		this.saleStatCd = saleStatCd;
		this.description = description;
	}

	public String getOrdNo() {
		return ordNo;
	}

	public void setOrdNo(String ordNo) {
		this.ordNo = ordNo;
	}

	public String getUsrId() {
		return usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public Long getEntrNo() {
		return entrNo;
	}

	public void setEntrNo(Long entrNo) {
		this.entrNo = entrNo;
	}

	public String getOrdStat() {
		return ordStat;
	}

	public void setOrdStat(String ordStat) {
		this.ordStat = ordStat;
	}

	public String getOrdrId() {
		return ordrId;
	}

	public void setOrdrId(String ordrId) {
		this.ordrId = ordrId;
	}

	public String getOrdrNm() {
		return ordrNm;
	}

	public void setOrdrNm(String ordrNm) {
		this.ordrNm = ordrNm;
	}

	public String getOrdrPhon() {
		return ordrPhon;
	}

	public void setOrdrPhon(String ordrPhon) {
		this.ordrPhon = ordrPhon;
	}

	public String getOrdrEmail() {
		return ordrEmail;
	}

	public void setOrdrEmail(String ordrEmail) {
		this.ordrEmail = ordrEmail;
	}

	public String getAcqrPhon() {
		return acqrPhon;
	}

	public void setAcqrPhon(String acqrPhon) {
		this.acqrPhon = acqrPhon;
	}

	public String getAcqrNm() {
		return acqrNm;
	}

	public void setAcqrNm(String acqrNm) {
		this.acqrNm = acqrNm;
	}

	public String getAcqrAddr() {
		return acqrAddr;
	}

	public void setAcqrAddr(String acqrAddr) {
		this.acqrAddr = acqrAddr;
	}

	public String getAcqrAddrDtl() {
		return acqrAddrDtl;
	}

	public void setAcqrAddrDtl(String acqrAddrDtl) {
		this.acqrAddrDtl = acqrAddrDtl;
	}

	public String getAcqrEmail() {
		return acqrEmail;
	}

	public void setAcqrEmail(String acqrEmail) {
		this.acqrEmail = acqrEmail;
	}

	public String getPrclWay() {
		return prclWay;
	}

	public void setPrclWay(String prclWay) {
		this.prclWay = prclWay;
	}

	public String getPackWay() {
		return packWay;
	}

	public void setPackWay(String packWay) {
		this.packWay = packWay;
	}

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public Long getPayMny() {
		return payMny;
	}

	public void setPayMny(Long payMny) {
		this.payMny = payMny;
	}

	public String getReqMemo() {
		return reqMemo;
	}

	public void setReqMemo(String reqMemo) {
		this.reqMemo = reqMemo;
	}

	public String getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(String ordDate) {
		this.ordDate = ordDate;
	}

	public String getUpdtDate() {
		return updtDate;
	}

	public void setUpdtDate(String updtDate) {
		this.updtDate = updtDate;
	}

	public String getUpdtId() {
		return updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public String getRgstDate() {
		return rgstDate;
	}

	public void setRgstDate(String rgstDate) {
		this.rgstDate = rgstDate;
	}

	public String getRgstId() {
		return rgstId;
	}

	public void setRgstId(String rgstId) {
		this.rgstId = rgstId;
	}

	public Long getBillNum() {
		return billNum;
	}

	public void setBillNum(Long billNum) {
		this.billNum = billNum;
	}

	public Long getOrdDtlNo() {
		return ordDtlNo;
	}

	public void setOrdDtlNo(Long ordDtlNo) {
		this.ordDtlNo = ordDtlNo;
	}

	public String getGoodsNm() {
		return goodsNm;
	}

	public void setGoodsNm(String goodsNm) {
		this.goodsNm = goodsNm;
	}

	public Long getGoodsCd() {
		return goodsCd;
	}

	public void setGoodsCd(Long goodsCd) {
		this.goodsCd = goodsCd;
	}

	public int getGoodsQty() {
		return goodsQty;
	}

	public void setGoodsQty(int goodsQty) {
		this.goodsQty = goodsQty;
	}

	public Long getOrdBasketSeq() {
		return ordBasketSeq;
	}

	public void setOrdBasketSeq(Long ordBasketSeq) {
		this.ordBasketSeq = ordBasketSeq;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public Long getSaleBoardSeq() {
		return saleBoardSeq;
	}

	public void setSaleBoardSeq(Long saleBoardSeq) {
		this.saleBoardSeq = saleBoardSeq;
	}

	public String getSearchSaleBoardSeq() {
		return searchSaleBoardSeq;
	}

	public void setSearchSaleBoardSeq(String searchSaleBoardSeq) {
		this.searchSaleBoardSeq = searchSaleBoardSeq;
	}
	

	public int getGoodsPrc() {
		return goodsPrc;
	}

	public void setGoodsPrc(int goodsPrc) {
		this.goodsPrc = goodsPrc;
	}

	public int getGoodsSalePrc() {
		return goodsSalePrc;
	}

	public void setGoodsSalePrc(int goodsSalePrc) {
		this.goodsSalePrc = goodsSalePrc;
	}

	public int getSaleCnt() {
		return saleCnt;
	}

	public void setSaleCnt(int saleCnt) {
		this.saleCnt = saleCnt;
	}

	public String getSaleStatCd() {
		return saleStatCd;
	}

	public void setSaleStatCd(String saleStatCd) {
		this.saleStatCd = saleStatCd;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getImgNm() {
		return imgNm;
	}

	public void setImgNm(String imgNm) {
		this.imgNm = imgNm;
	}

	public String getBulTitNm() {
		return bulTitNm;
	}

	public void setBulTitNm(String bulTitNm) {
		this.bulTitNm = bulTitNm;
	}

	public String getCodeNm() {
		return codeNm;
	}

	public void setCodeNm(String codeNm) {
		this.codeNm = codeNm;
	}


	public String getCheckedList() {
		return checkedList;
	}

	public void setCheckedList(String checkedList) {
		this.checkedList = checkedList;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String[] getGoodsNmArry() {
		return goodsNmArry;
	}

	public void setGoodsNmArry(String[] goodsNmArry) {
		this.goodsNmArry = goodsNmArry;
	}

	public Long[] getGoodsCdArry() {
		return goodsCdArry;
	}

	public void setGoodsCdArry(Long[] goodsCdArry) {
		this.goodsCdArry = goodsCdArry;
	}

	public int[] getGoodsQtyArry() {
		return goodsQtyArry;
	}

	public void setGoodsQtyArry(int[] goodsQtyArry) {
		this.goodsQtyArry = goodsQtyArry;
	}

	@Override
	public String toString() {
		return "OrderVO [ordNo=" + ordNo + ", usrId=" + usrId + ", entrNo=" + entrNo + ", ordStat=" + ordStat
				+ ", ordrId=" + ordrId + ", ordrNm=" + ordrNm + ", ordrPhon=" + ordrPhon + ", ordrEmail=" + ordrEmail
				+ ", acqrPhon=" + acqrPhon + ", acqrNm=" + acqrNm + ", acqrAddr=" + acqrAddr + ", acqrAddrDtl="
				+ acqrAddrDtl + ", acqrEmail=" + acqrEmail + ", prclWay=" + prclWay + ", packWay=" + packWay
				+ ", payWay=" + payWay + ", payMny=" + payMny + ", reqMemo=" + reqMemo + ", ordDate=" + ordDate
				+ ", updtDate=" + updtDate + ", updtId=" + updtId + ", rgstDate=" + rgstDate + ", rgstId=" + rgstId
				+ ", billNum=" + billNum + ", ordDtlNo=" + ordDtlNo + ", goodsNm=" + goodsNm + ", goodsCd=" + goodsCd
				+ ", goodsQty=" + goodsQty + "]";
	}
	
}