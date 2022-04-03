package com.clt.adm.goods.dao.impl;

import java.sql.Date;
import java.text.SimpleDateFormat;

import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.GoodsDao;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;

public class AdmGoodsDaoOracleTest {
	public static void main(String[] args) {
//		인설트테스트();
		업데이트테스트();
		샐렉트테스트();
		딜리트테스트();
	}
	
	private static void 딜리트테스트() {
		GoodsVO pvo = new GoodsVO();
		GoodsDao dao = new GoodsDaoOracle();
		
		pvo.setGoodsInfoSeq(2);
		dao.deleteGoods(pvo);
	}
	
	private static void 업데이트테스트() {
		GoodsVO pvo = new GoodsVO();
		GoodsDao dao = new GoodsDaoOracle();
		
		//날짜지정
		java.util.Date utilDate = new java.util.Date();
		System.out.println("기본 생성(오늘 날짜):" + utilDate);

		//1970년 1월 1일 0시 0분 0초부터 결과한 잘짜와 시간을 long으로 표현
		long sysCurTime = System.currentTimeMillis();
		System.out.println("sysCurTime:"+sysCurTime);

		//currentTimeMillis로 Date객체를 만들수 있다.(현재날짜)
		java.util.Date utilDate2 = new Date(System.currentTimeMillis());
		System.out.println("오늘 날짜:" + utilDate2);
		
		//날짜설정
		utilDate.setYear(2022 - 1900); //Date의 Year 기본값이 1900으로 되어있어 빼줘야한다.
		utilDate.setMonth(6 - 1); //월은 0~11 로 셋팅되어있음
		utilDate.setDate(15);
		
		utilDate.setHours(12);
		utilDate.setMinutes(59);
		utilDate.setSeconds(59);
		
		System.out.println("지정된 날짜:" + utilDate);
		
		/**
		 * 날짜 포맺맞춰서 출력
		 * HH : 0 -23 
		 * kk : 1 - 24 
		 * KK : 0 -11 
		 * hh : 1 - 12 
		 */
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String strDate = format.format(utilDate);
		System.out.println("SimepleDateFormat 설정 :" + strDate);
		
		//sqlDate로 변환하여 쿼리에 넣기
		long mtime = utilDate.getTime();
		java.sql.Date sqlDate = new java.sql.Date(mtime);
		
		pvo.setGoodsInfoSeq(2);
		pvo.setGoodsCd(1);
		pvo.setEntrNo(1);
		pvo.setGoodsNm("흰색 반팔티");
		pvo.setGoodsPrc(5000);
		pvo.setCatgryCd("A01");
		pvo.setCatgryCd2("B01");
		pvo.setInyQty(10);
		pvo.setDlvPrc(2000);
		pvo.setGoodsSize("XL");
		pvo.setGoodsClr("WHITE");
		pvo.setImgPath("");
		pvo.setImgNm("");
		pvo.setGoodsIntr("흰색 반팔티 입니다.\n싸고 좋아요 마음대로 입어보세요.");
		pvo.setSaleStatCd("01");
		pvo.setUseYn("Y");
		pvo.setRgstId("SYSTEM");
		pvo.setRgstDate(sqlDate);
		pvo.setUpdtId("SYSTEM");
		pvo.setUpdtDate(sqlDate);
		
		int result = dao.updateGoods(pvo);
		
		if(result <= 0) {
			System.out.println("에러..");
		}else {
			System.out.println("성공..");
		}
	}
	
	private static void 샐렉트테스트() {
		GoodsVO pvo = new GoodsVO();
		GoodsDao dao = new GoodsDaoOracle();
		pvo.setGoodsInfoSeq(2);
		
		GoodsVO rvo = dao.selectGoodsOne(pvo);
		
		System.out.println(rvo.toString());
		
	}

	public static void 인설트테스트() {
		GoodsVO pvo = new GoodsVO();
		GoodsDao dao = new GoodsDaoOracle();
		
		pvo.setEntrNo(1);
		pvo.setGoodsNm("흰색 반팔티");
		pvo.setGoodsPrc(5000);
		pvo.setCatgryCd("A01");
		pvo.setCatgryCd2("B01");
		pvo.setInyQty(10);
		pvo.setDlvPrc(2000);
		pvo.setGoodsSize("XL");
		pvo.setGoodsClr("WHITE");
		pvo.setImgPath("");
		pvo.setImgNm("");
		pvo.setGoodsIntr("흰색 반팔티 입니다.\n싸고 좋아요 마음대로 입어보세요.");
		pvo.setSaleStatCd("01");
		pvo.setUseYn("Y");
		pvo.setRgstId("SYSTEM");
		pvo.setRgstDate(new Date(20221231235959L));
		pvo.setUpdtId("SYSTEM");
		pvo.setUpdtDate(new Date(20221231235959L));
		
		int result = dao.insertGoods(pvo);
		if(result <= 0) {
			System.out.println("에러..");
		}else {
			System.out.println("성공..");
		}
	}
	
}
