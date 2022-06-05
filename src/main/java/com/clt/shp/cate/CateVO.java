package com.clt.shp.cate;

import java.util.Arrays;

public class CateVO {
	private long goodsCataSeq;
	private String catgryCd;
	private String catgryCd2;
	private int goodsCd;
	private String catgryNm;
	private String noteCont;
	private String classLvlCd;
	private String uprClassCd;
	private String rgstId;
	private String rgstDate;
	private String updtId;
	private String updtDate;
	private String useYn;
	private String cateType;
	
	private String[] upCateType;
	private String[] unCateType;
	private String[] upCatgryCdArr;
	private String[] unCatgryCdArr;
	private String[] upCatgryNmArr;
	private String[] unCatgryNmArr;
	private String[] upNoteContArr;
	private String[] unNoteContArr;
	private String[] upUseYnArr;
	private String[] unUseYnArr;
	private String[] upClassLvlCdArr;
	private String[] unClassLvlCdArr;
	private long[] upGoodsCataSeq;
	private long[] unGoodsCataSeq;
	
	public CateVO(){
		
	}

	public CateVO(long goodsCataSeq, String catgryCd, int goodsCd, String catgryNm, String noteCont, String classLvlCd,
			String uprClassCd, String rgstId, String rgstDate, String updtId, String updtDate, String useYn) {
		super();
		this.goodsCataSeq = goodsCataSeq;
		this.catgryCd = catgryCd;
		this.goodsCd = goodsCd;
		this.catgryNm = catgryNm;
		this.noteCont = noteCont;
		this.classLvlCd = classLvlCd;
		this.uprClassCd = uprClassCd;
		this.rgstId = rgstId;
		this.rgstDate = rgstDate;
		this.updtId = updtId;
		this.updtDate = updtDate;
		this.useYn = useYn;
	}

	public CateVO(String catgryCd, int goodsCd, String catgryNm, String noteCont, String classLvlCd, String uprClassCd, String rgstId, String updtId, String useYn) {
		this.catgryCd = catgryCd;
		this.goodsCd = goodsCd;
		this.catgryNm = catgryNm;
		this.noteCont = noteCont;
		this.classLvlCd = classLvlCd;
		this.uprClassCd = uprClassCd;
		this.rgstId = rgstId;
		this.updtId = updtId;
		this.useYn = useYn;
	}

	public long getGoodsCataSeq() {
		return goodsCataSeq;
	}

	public void setGoodsCataSeq(long goodsCataSeq) {
		this.goodsCataSeq = goodsCataSeq;
	}

	public String getCatgryCd() {
		return catgryCd;
	}

	public void setCatgryCd(String catgryCd) {
		this.catgryCd = catgryCd;
	}

	public int getGoodsCd() {
		return goodsCd;
	}

	public void setGoodsCd(int goodsCd) {
		this.goodsCd = goodsCd;
	}

	public String getCatgryNm() {
		return catgryNm;
	}

	public void setCatgryNm(String catgryNm) {
		this.catgryNm = catgryNm;
	}

	public String getNoteCont() {
		return noteCont;
	}

	public void setNoteCont(String noteCont) {
		this.noteCont = noteCont;
	}

	public String getClassLvlCd() {
		return classLvlCd;
	}

	public void setClassLvlCd(String classLvlCd) {
		this.classLvlCd = classLvlCd;
	}

	public String getUprClassCd() {
		return uprClassCd;
	}

	public void setUprClassCd(String uprClassCd) {
		this.uprClassCd = uprClassCd;
	}

	public String getRgstId() {
		return rgstId;
	}

	public void setRgstId(String rgstId) {
		this.rgstId = rgstId;
	}

	public String getRgstDate() {
		return rgstDate;
	}

	public void setRgstDate(String rgstDate) {
		this.rgstDate = rgstDate;
	}

	public String getUpdtId() {
		return updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public String getUpdtDate() {
		return updtDate;
	}

	public void setUpdtDate(String updtDate) {
		this.updtDate = updtDate;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getCateType() {
		return cateType;
	}

	public void setCateType(String cateType) {
		this.cateType = cateType;
	}

	public String[] getUpCateType() {
		return upCateType;
	}

	public void setUpCateType(String[] upCateType) {
		this.upCateType = upCateType;
	}

	public String[] getUnCateType() {
		return unCateType;
	}

	public void setUnCateType(String[] unCateType) {
		this.unCateType = unCateType;
	}

	public String[] getUpCatgryCdArr() {
		return upCatgryCdArr;
	}

	public void setUpCatgryCdArr(String[] upCatgryCdArr) {
		this.upCatgryCdArr = upCatgryCdArr;
	}

	public String[] getUnCatgryCdArr() {
		return unCatgryCdArr;
	}

	public void setUnCatgryCdArr(String[] unCatgryCdArr) {
		this.unCatgryCdArr = unCatgryCdArr;
	}

	public String[] getUpCatgryNmArr() {
		return upCatgryNmArr;
	}

	public void setUpCatgryNmArr(String[] upCatgryNmArr) {
		this.upCatgryNmArr = upCatgryNmArr;
	}

	public String[] getUnCatgryNmArr() {
		return unCatgryNmArr;
	}

	public void setUnCatgryNmArr(String[] unCatgryNmArr) {
		this.unCatgryNmArr = unCatgryNmArr;
	}

	public String[] getUpNoteContArr() {
		return upNoteContArr;
	}

	public void setUpNoteContArr(String[] upNoteContArr) {
		this.upNoteContArr = upNoteContArr;
	}

	public String[] getUnNoteContArr() {
		return unNoteContArr;
	}

	public void setUnNoteContArr(String[] unNoteContArr) {
		this.unNoteContArr = unNoteContArr;
	}

	public String[] getUpUseYnArr() {
		return upUseYnArr;
	}

	public void setUpUseYnArr(String[] upUseYnArr) {
		this.upUseYnArr = upUseYnArr;
	}

	public String[] getUnUseYnArr() {
		return unUseYnArr;
	}

	public void setUnUseYnArr(String[] unUseYnArr) {
		this.unUseYnArr = unUseYnArr;
	}

	public String[] getUpClassLvlCdArr() {
		return upClassLvlCdArr;
	}

	public void setUpClassLvlCdArr(String[] upClassLvlCdArr) {
		this.upClassLvlCdArr = upClassLvlCdArr;
	}

	public String[] getUnClassLvlCdArr() {
		return unClassLvlCdArr;
	}

	public void setUnClassLvlCdArr(String[] unClassLvlCdArr) {
		this.unClassLvlCdArr = unClassLvlCdArr;
	}

	public long[] getUpGoodsCataSeq() {
		return upGoodsCataSeq;
	}

	public void setUpGoodsCataSeq(long[] upGoodsCataSeq) {
		this.upGoodsCataSeq = upGoodsCataSeq;
	}

	public long[] getUnGoodsCataSeq() {
		return unGoodsCataSeq;
	}

	public void setUnGoodsCataSeq(long[] unGoodsCataSeq) {
		this.unGoodsCataSeq = unGoodsCataSeq;
	}

	public String getCatgryCd2() {
		return catgryCd2;
	}

	public void setCatgryCd2(String catgryCd2) {
		this.catgryCd2 = catgryCd2;
	}

	@Override
	public String toString() {
		return "CateVO [goodsCataSeq=" + goodsCataSeq + ", catgryCd=" + catgryCd + ", goodsCd=" + goodsCd
				+ ", catgryNm=" + catgryNm + ", noteCont=" + noteCont + ", classLvlCd=" + classLvlCd + ", uprClassCd="
				+ uprClassCd + ", rgstId=" + rgstId + ", rgstDate=" + rgstDate + ", updtId=" + updtId + ", updtDate="
				+ updtDate + ", useYn=" + useYn + ", cateType=" + cateType + ", upCateType="
				+ Arrays.toString(upCateType) + ", unCateType=" + Arrays.toString(unCateType) + ", upCatgryCdArr="
				+ Arrays.toString(upCatgryCdArr) + ", unCatgryCdArr=" + Arrays.toString(unCatgryCdArr)
				+ ", upCatgryNmArr=" + Arrays.toString(upCatgryNmArr) + ", unCatgryNmArr="
				+ Arrays.toString(unCatgryNmArr) + ", upNoteContArr=" + Arrays.toString(upNoteContArr)
				+ ", unNoteContArr=" + Arrays.toString(unNoteContArr) + ", upUseYnArr=" + Arrays.toString(upUseYnArr)
				+ ", unUseYnArr=" + Arrays.toString(unUseYnArr) + ", upClassLvlCdArr="
				+ Arrays.toString(upClassLvlCdArr) + ", unClassLvlCdArr=" + Arrays.toString(unClassLvlCdArr)
				+ ", upGoodsCataSeq=" + Arrays.toString(upGoodsCataSeq) + ", unGoodsCataSeq="
				+ Arrays.toString(unGoodsCataSeq) + "]";
	}

}
