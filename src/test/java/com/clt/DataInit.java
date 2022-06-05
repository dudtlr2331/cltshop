package com.clt;

import com.clt.cmm.util.DateUtils;
import com.clt.shp.cate.CateVO;
import com.clt.shp.cate.dao.impl.CateDaoOracle;
import com.clt.shp.code.CodeVO;
import com.clt.shp.code.dao.impl.CodeDaoOracle;
import com.clt.shp.entr.EntrVO;
import com.clt.shp.entr.dao.impl.EntrDaoOracle;
import com.clt.shp.goods.GoodsVO;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.sales.SalesVO;
import com.clt.shp.sales.dao.impl.SalesDaoOracle;
import com.clt.shp.user.UserVO;
import com.clt.shp.user.dao.impl.UserDaoOracle;

public class DataInit {
	public static void main(String[] args) {
		// 공통코드 데이터
		CodeVO[] codeList = {
			  new CodeVO("판매중","01","판매상태","STD001",1,"Y","system","system")
			, new CodeVO("판매중지","02","판매상태","STD001",2,"Y","system","system")
			, new CodeVO("품절","03","판매상태","STD001",3,"Y","system","system")
			, new CodeVO("재고부족","04","판매상태","STD001",4,"Y","system","system")
			, new CodeVO("일반회원","01","회원등급","STD002",1,"Y","system","system")
			, new CodeVO("VIP","02","회원등급","STD002",2,"Y","system","system")
			, new CodeVO("VVIP","03","회원등급","STD002",3,"Y","system","system")
			, new CodeVO("업체관리자","01","관리자등급","STD003",1,"Y","system","system")
			, new CodeVO("운영관리자","02","관리자등급","STD003",2,"Y","system","system")
			, new CodeVO("슈퍼관리자","03","관리자등급","STD003",3,"Y","system","system")
			, new CodeVO("결제대기","01","주문상태","STD004",1,"Y","system","system")
			, new CodeVO("결제완료","02","주문상태","STD004",1,"Y","system","system")
			, new CodeVO("상품준비중","03","주문상태","STD004",1,"Y","system","system")
			, new CodeVO("배송중","04","주문상태","STD004",1,"Y","system","system")
			, new CodeVO("배송완료","05","주문상태","STD004",1,"Y","system","system")
			, new CodeVO("수취완료","06","주문상태","STD004",1,"Y","system","system")
			, new CodeVO("반품신청","07","주문상태","STD004",1,"Y","system","system")
			, new CodeVO("반품완료","08","주문상태","STD004",1,"Y","system","system")
			, new CodeVO("취소신청","09","주문상태","STD004",1,"Y","system","system")
			, new CodeVO("취소완료","10","주문상태","STD004",1,"Y","system","system")

		};

		// 카테고리 데이터
		CateVO[] cateList = {
			 new CateVO("CT01", 0, "가방", "가방", "1", "CT01", "system", "system", "Y")
			,new CateVO("CT0101", 0, "백팩", "백팩", "2", "CT01", "system", "system", "Y")
			,new CateVO("CT02", 0, "하의", "하의", "1", "CT02", "system", "system", "Y")
			,new CateVO("CT0201", 0, "청바지", "청바지", "2", "CT02", "system", "system", "Y")
			,new CateVO("CT0202", 0, "래깅스", "래깅스", "2", "CT02", "system", "system", "Y")
			,new CateVO("CT0203", 0, "긴바지", "긴바지", "2", "CT02", "system", "system", "Y")
			,new CateVO("CT0204", 0, "반바지", "반바지", "2", "CT02", "system", "system", "Y")
			,new CateVO("CT03", 0, "원피스", "원피스", "1", "CT03", "system", "system", "Y")
			,new CateVO("CT0301", 0, "원피스", "원피스", "2", "CT03", "system", "system", "Y")
			,new CateVO("CT04", 0, "아우터", "아우터", "1", "CT04", "system", "system", "Y")
			,new CateVO("CT0401", 0, "블레이저", "블레이저", "2", "CT04", "system", "system", "Y")
			,new CateVO("CT0402", 0, "가디건", "가디건", "2", "CT04", "system", "system", "Y")
			,new CateVO("CT0403", 0, "코트", "코트", "2", "CT04", "system", "system", "Y")
			,new CateVO("CT0404", 0, "자켓", "자켓", "2", "CT04", "system", "system", "Y")
			,new CateVO("CT0405", 0, "점퍼", "점퍼", "2", "CT04", "system", "system", "Y")
			,new CateVO("CT0406", 0, "롱패딩", "롱패딩", "2", "CT04", "system", "system", "Y")
			,new CateVO("CT0407", 0, "숏패딩", "숏패딩", "2", "CT04", "system", "system", "Y")
			,new CateVO("CT0408", 0, "무스탕", "무스탕", "2", "CT04", "system", "system", "Y")
			,new CateVO("CT0409", 0, "집업", "집업", "2", "CT04", "system", "system", "Y")
			,new CateVO("CT05", 0, "신발", "신발", "1", "CT05", "system", "system", "Y")
			,new CateVO("CT0501", 0, "런닝화", "런닝화", "2", "CT05", "system", "system", "Y")
			,new CateVO("CT0502", 0, "스니커즈", "스니커즈", "2", "CT05", "system", "system", "Y")
			,new CateVO("CT06", 0, "스커트", "스커트", "1", "CT06", "system", "system", "Y")
			,new CateVO("CT0601", 0, "숏스커트", "숏스커트", "2", "CT06", "system", "system", "Y")
			,new CateVO("CT0602", 0, "롱스커트", "롱스커트", "2", "CT06", "system", "system", "Y")
			,new CateVO("CT07", 0, "상의", "상의", "1", "CT07", "system", "system", "Y")
			,new CateVO("CT0701", 0, "니트", "니트", "2", "CT07", "system", "system", "Y")
			,new CateVO("CT0702", 0, "긴팔", "긴팔", "2", "CT07", "system", "system", "Y")
			,new CateVO("CT0703", 0, "맨투맨", "맨투맨", "2", "CT07", "system", "system", "Y")
			,new CateVO("CT0704", 0, "목티", "목티", "2", "CT07", "system", "system", "Y")
			,new CateVO("CT0705", 0, "셔츠", "셔츠", "2", "CT07", "system", "system", "Y")
			,new CateVO("CT0706", 0, "반팔", "반팔", "2", "CT07", "system", "system", "Y")
			,new CateVO("CT0707", 0, "민소매", "민소매", "2", "CT07", "system", "system", "Y")
			,new CateVO("CT0708", 0, "스웨터", "스웨터", "2", "CT07", "system", "system", "Y")
			,new CateVO("CT08", 0, "트레이닝복", "트레이닝복", "1", "CT08", "system", "system", "Y")
			,new CateVO("CT0801", 0, "세트", "세트", "2", "CT08", "system", "system", "Y")
			,new CateVO("CT0802", 0, "상의", "상의", "2", "CT08", "system", "system", "Y")
			,new CateVO("CT0803", 0, "하의", "하의", "2", "CT08", "system", "system", "Y")
		};
		
		UserVO[] userList = {
			 new UserVO("chunkind", "김준성", "1", "19880420", "chunkind@naver.com", "01012341244", "경기도 부천시 소사구", "괴안동 11", "12345", "경인로 122", "1동", "12345", "system")
			,new UserVO("djfeis", "박떵산", "1", "19900303", "Ejdtks@naver.com", "01012341233", "경기도 부천시 소사구", "괴안동 11", "12345", "경인로 122", "1동", "12345", "system")
			,new UserVO("marry", "이메리", "1", "19870612", "apfl@naver.com", "01012341222", "경기도 부천시 소사구", "괴안동 11", "12345", "경인로 122", "1동", "12345", "system")
			,new UserVO("short", "김짧다", "1", "19750905", "Wkfqek@naver.com", "01012341211", "경기도 부천시 소사구", "괴안동 11", "12345", "경인로 122", "1동", "12345", "system")
		};
		
		// 업체 데이터
		EntrVO[] entrList = {
			 new EntrVO("chunkind", "JShop", "123-45-67890", "김준성", "01012341234", "jshop@go.ir", "김담당", "01043214321", "jjdd@naver.com", 0, "경기 성남시 분당구", "삼평동 681", "13494", "경기 성남시 분당구 판교역로 235 (에어치스퀘어 엔동)", "13494", DateUtils.stringToSqlDate("2010-10-01"), null, "Y", "Y", "system", "system")
			,new EntrVO("djfeis", "떵싼바지", "122-44-11111", "떵바지", "01021432143", "gsshop@gs.ml", "바지", "01045318888", "efjw@naver.com", 0, "경기 성남시 분당구", "삼평동 681", "13494", "경기 성남시 분당구 판교역로 235 (에어치스퀘어 엔동)", "13494", DateUtils.stringToSqlDate("2010-10-01"), null, "Y", "Y", "system", "system")
			,new EntrVO("marry", "메리샵", "333-22-12345", "메리", "01011223344", "apflapfl@mary.io", "메리꼬붕", "01022113344", "marry@naver.com", 0, "경기 성남시 분당구", "삼평동 681", "13494", "경기 성남시 분당구 판교역로 235 (에어치스퀘어 엔동)", "13494", DateUtils.stringToSqlDate("2010-10-01"), null, "Y", "Y", "system", "system")
			,new EntrVO("short", "쇼츠", "123-21-22334", "짧다", "01010023004", "Wkfqek@naver.com", "꼬붕", "01011222211", "Rhqhd@naver.com", 0, "경기 성남시 분당구", "삼평동 681", "13494", "경기 성남시 분당구 판교역로 235 (에어치스퀘어 엔동)", "13494", DateUtils.stringToSqlDate("2010-10-01"), null, "Y", "Y", "system", "system")
		};
		
		// 상품 데이터
		GoodsVO[] goodsList = {
			/*가방-백팩*/
			 new GoodsVO(1L, "흰색가방", 250000, "CT01", "CT0101", 10, 2500, "S", "흰색", "/images/part/bag/backpack/", "backpack_01.jpg", "흰색 가방 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "빨간가방", 150000, "CT01", "CT0101", 5, 2500, "L", "빨간색", "/images/part/bag/backpack/", "backpack_02.jpg", "빨간가방 가방 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "폴로가방", 120000, "CT01", "CT0101", 15, 2500, "L", "빨간색", "/images/part/bag/backpack/", "backpack_03.jpg", "폴로가방 가방 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "검정가방", 100000, "CT01", "CT0101", 20, 2500, "L", "빨간색", "/images/part/bag/backpack/", "backpack_04.jpg", "검정가방 가방 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "청색가방", 150000, "CT01", "CT0101", 40, 2500, "L", "빨간색", "/images/part/bag/backpack/", "backpack_05.jpg", "청색가방 가방 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "하늘색가방", 300000, "CT01", "CT0101", 20, 2500, "L", "빨간색", "/images/part/bag/backpack/", "backpack_06.jpg", "하늘색가방 가방 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "검정가방2", 350000, "CT01", "CT0101", 50, 2500, "L", "빨간색", "/images/part/bag/backpack/", "backpack_07.jpg", "검정가방 가방 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "검정가방3", 120000, "CT01", "CT0101", 1, 2500, "L", "빨간색", "/images/part/bag/backpack/", "backpack_08.jpg", "검정가방 가방 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "흰색가방2", 190000, "CT01", "CT0101", 5, 2500, "L", "빨간색", "/images/part/bag/backpack/", "backpack_09.jpg", "흰색가방 가방 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*하의-청바지*/
			,new GoodsVO(2L, "청바지1", 150000, "CT02", "CT0201", 10, 2500, "L", "빨간색", "/images/part/down/jeans/", "jeans_01.jpg", "청바지1 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "청바지2", 150000, "CT02", "CT0201", 10, 2500, "L", "빨간색", "/images/part/down/jeans/", "jeans_02.jpg", "청바지2 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "청바지3", 150000, "CT02", "CT0201", 10, 2500, "L", "빨간색", "/images/part/down/jeans/", "jeans_03.jpg", "청바지3 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "청바지4", 150000, "CT02", "CT0201", 10, 2500, "L", "빨간색", "/images/part/down/jeans/", "jeans_04.jpg", "청바지4 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "청바지5", 150000, "CT02", "CT0201", 10, 2500, "L", "빨간색", "/images/part/down/jeans/", "jeans_05.jpg", "청바지5 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "청바지6", 150000, "CT02", "CT0201", 10, 2500, "L", "빨간색", "/images/part/down/jeans/", "jeans_06.jpg", "청바지6 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "청바지7", 150000, "CT02", "CT0201", 10, 2500, "L", "빨간색", "/images/part/down/jeans/", "jeans_07.jpg", "청바지7 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "청바지8", 150000, "CT02", "CT0201", 10, 2500, "L", "빨간색", "/images/part/down/jeans/", "jeans_08.jpg", "청바지8 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "청바지9", 150000, "CT02", "CT0201", 10, 2500, "L", "빨간색", "/images/part/down/jeans/", "jeans_09.jpg", "청바지9 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "청바지10", 150000, "CT02", "CT0201", 10, 2500, "L", "빨간색", "/images/part/down/jeans/", "jeans_10.jpg", "청바지10 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "청바지11", 150000, "CT02", "CT0201", 10, 2500, "L", "빨간색", "/images/part/down/jeans/", "jeans_11.jpg", "청바지11 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*하의-레깅스*/
			,new GoodsVO(3L, "레깅스1", 50000, "CT02", "CT0202", 10, 2500, "S", "검정", "/images/part/down/leggings/", "leggings1.jpg", "스포츠 레깅스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*하의-긴바지*/
			/*하의-짧은바지*/
			,new GoodsVO(4L, "반바지1", 50000, "CT02", "CT0204", 10, 2500, "L", "검정", "/images/part/down/short_pants/", "short_pants_01.jpg", "반바지 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "반바지2", 50000, "CT02", "CT0204", 10, 2500, "L", "검정", "/images/part/down/short_pants/", "short_pants_02.jpg", "반바지 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "반바지3", 50000, "CT02", "CT0204", 10, 2500, "L", "검정", "/images/part/down/short_pants/", "short_pants_03.jpg", "반바지 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*원피스-원피스*/
			,new GoodsVO(3L, "원피스1", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_01.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스2", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_02.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스3", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_03.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스4", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_04.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스5", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_05.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스6", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_06.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스7", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_07.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스8", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_08.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스9", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_09.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스10", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_10.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스11", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_11.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스12", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_12.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스13", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_13.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스14", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_14.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "원피스15", 50000, "CT03", "CT0301", 10, 2500, "L", "검정", "/images/part/one_piece/one_piece/", "one_piece_15.jpg", "원피스 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*아우터-블레이저*/
			,new GoodsVO(1L, "블레이저1", 50000, "CT04", "CT0401", 10, 2500, "L", "검정", "/images/part/outer/blazer/", "blazer_01.jpg", "블레이저 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*아우터-가디건*/
			,new GoodsVO(1L, "가디건1", 50000, "CT04", "CT0402", 10, 2500, "L", "검정", "/images/part/outer/cardigan/", "cardigan_01.jpg", "가디건 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "가디건2", 50000, "CT04", "CT0402", 10, 2500, "L", "검정", "/images/part/outer/cardigan/", "cardigan_02.jpg", "가디건 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "가디건3", 50000, "CT04", "CT0402", 10, 2500, "L", "검정", "/images/part/outer/cardigan/", "cardigan_03.jpg", "가디건 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "가디건4", 50000, "CT04", "CT0402", 10, 2500, "L", "검정", "/images/part/outer/cardigan/", "cardigan_04.jpg", "가디건 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "가디건5", 50000, "CT04", "CT0402", 10, 2500, "L", "검정", "/images/part/outer/cardigan/", "cardigan_05.jpg", "가디건 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*아우터-코트*/
			,new GoodsVO(1L, "코트1", 50000, "CT04", "CT0403", 10, 2500, "L", "검정", "/images/part/outer/coat/", "coat_01.jpg", "코트 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "코트2", 50000, "CT04", "CT0403", 10, 2500, "L", "검정", "/images/part/outer/coat/", "coat_02.jpg", "코트 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*아우터-자켓*/
			,new GoodsVO(1L, "자켓1", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_01.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓2", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_02.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓3", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_03.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓4", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_04.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓5", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_05.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓6", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_06.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓7", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_07.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓8", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_08.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓9", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_09.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓10", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_10.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓11", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_11.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓12", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_12.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓13", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_13.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓14", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_14.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓15", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_15.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓16", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_16.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "자켓17", 50000, "CT04", "CT0404", 10, 2500, "L", "검정", "/images/part/outer/jackets/", "jacket_17.jpg", "자켓 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*아우터-점퍼*/
			,new GoodsVO(2L, "점퍼1", 50000, "CT04", "CT0405", 10, 2500, "L", "검정", "/images/part/outer/jumper/", "jumper_01.jpg", "점퍼 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "점퍼2", 50000, "CT04", "CT0405", 10, 2500, "L", "검정", "/images/part/outer/jumper/", "jumper_02.jpg", "점퍼 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "점퍼3", 50000, "CT04", "CT0405", 10, 2500, "L", "검정", "/images/part/outer/jumper/", "jumper_03.jpg", "점퍼 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*아우터-롱패딩*/
			,new GoodsVO(2L, "롱패딩1", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_01.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩2", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_02.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩3", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_03.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩4", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_04.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩5", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_05.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩6", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_06.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩7", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_07.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩8", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_08.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩9", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_09.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩10", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_10.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩11", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_11.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩12", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_12.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩13", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_13.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩14", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_14.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(2L, "롱패딩15", 50000, "CT04", "CT0406", 10, 2500, "L", "검정", "/images/part/outer/long_padding/", "long_padding_15.jpg", "롱패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*아우터-숏패딩*/
			,new GoodsVO(4L, "숏패딩1", 50000, "CT04", "CT0407", 10, 2500, "L", "검정", "/images/part/outer/short_padding/", "short_padding_01.jpg", "숏패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "숏패딩2", 50000, "CT04", "CT0407", 10, 2500, "L", "검정", "/images/part/outer/short_padding/", "short_padding_02.jpg", "숏패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "숏패딩3", 50000, "CT04", "CT0407", 10, 2500, "L", "검정", "/images/part/outer/short_padding/", "short_padding_03.jpg", "숏패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "숏패딩4", 50000, "CT04", "CT0407", 10, 2500, "L", "검정", "/images/part/outer/short_padding/", "short_padding_04.jpg", "숏패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "숏패딩5", 50000, "CT04", "CT0407", 10, 2500, "L", "검정", "/images/part/outer/short_padding/", "short_padding_05.jpg", "숏패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "숏패딩6", 50000, "CT04", "CT0407", 10, 2500, "L", "검정", "/images/part/outer/short_padding/", "short_padding_06.jpg", "숏패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "숏패딩7", 50000, "CT04", "CT0407", 10, 2500, "L", "검정", "/images/part/outer/short_padding/", "short_padding_07.jpg", "숏패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "숏패딩8", 50000, "CT04", "CT0407", 10, 2500, "L", "검정", "/images/part/outer/short_padding/", "short_padding_08.jpg", "숏패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "숏패딩9", 50000, "CT04", "CT0407", 10, 2500, "L", "검정", "/images/part/outer/short_padding/", "short_padding_09.jpg", "숏패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "숏패딩10", 50000, "CT04", "CT0407", 10, 2500, "L", "검정", "/images/part/outer/short_padding/", "short_padding_10.jpg", "숏패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "숏패딩11", 50000, "CT04", "CT0407", 10, 2500, "L", "검정", "/images/part/outer/short_padding/", "short_padding_11.jpg", "숏패딩 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*아우터-무스탕*/
			,new GoodsVO(3L, "무스탕1", 50000, "CT04", "CT0408", 10, 2500, "L", "검정", "/images/part/outer/mustang/", "mustang_01.jpg", "무스탕 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "무스탕2", 50000, "CT04", "CT0408", 10, 2500, "L", "검정", "/images/part/outer/mustang/", "mustang_02.jpg", "무스탕 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*아우터-집업*/
			,new GoodsVO(3L, "집업1", 50000, "CT04", "CT0409", 10, 2500, "L", "검정", "/images/part/outer/zipup/", "zip_up_01.jpg", "집업 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "집업2", 50000, "CT04", "CT0409", 10, 2500, "L", "검정", "/images/part/outer/zipup/", "zip_up_02.jpg", "집업 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "집업3", 50000, "CT04", "CT0409", 10, 2500, "L", "검정", "/images/part/outer/zipup/", "zip_up_03.jpg", "집업 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "집업4", 50000, "CT04", "CT0409", 10, 2500, "L", "검정", "/images/part/outer/zipup/", "zip_up_04.jpg", "집업 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "집업5", 50000, "CT04", "CT0409", 10, 2500, "L", "검정", "/images/part/outer/zipup/", "zip_up_05.jpg", "집업 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "집업6", 50000, "CT04", "CT0409", 10, 2500, "L", "검정", "/images/part/outer/zipup/", "zip_up_06.jpg", "집업 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "집업7", 50000, "CT04", "CT0409", 10, 2500, "L", "검정", "/images/part/outer/zipup/", "zip_up_07.jpg", "집업 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "집업8", 50000, "CT04", "CT0409", 10, 2500, "L", "검정", "/images/part/outer/zipup/", "zip_up_08.jpg", "집업 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "집업9", 50000, "CT04", "CT0409", 10, 2500, "L", "검정", "/images/part/outer/zipup/", "zip_up_09.jpg", "집업 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(3L, "집업10", 50000, "CT04", "CT0409", 10, 2500, "L", "검정", "/images/part/outer/zipup/", "zip_up_10.jpg", "집업 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*신발-런닝화*/
			,new GoodsVO(4L, "런닝화1", 50000, "CT05", "CT0501", 10, 2500, "L", "검정", "/images/part/shoes/running_shoes/", "running_shoes_01.jpg", "런닝화 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "런닝화2", 50000, "CT05", "CT0501", 10, 2500, "L", "검정", "/images/part/shoes/running_shoes/", "running_shoes_02.jpg", "런닝화 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "런닝화3", 50000, "CT05", "CT0501", 10, 2500, "L", "검정", "/images/part/shoes/running_shoes/", "running_shoes_03.jpg", "런닝화 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "런닝화4", 50000, "CT05", "CT0501", 10, 2500, "L", "검정", "/images/part/shoes/running_shoes/", "running_shoes_04.jpg", "런닝화 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "런닝화5", 50000, "CT05", "CT0501", 10, 2500, "L", "검정", "/images/part/shoes/running_shoes/", "running_shoes_05.jpg", "런닝화 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "런닝화6", 50000, "CT05", "CT0501", 10, 2500, "L", "검정", "/images/part/shoes/running_shoes/", "running_shoes_06.jpg", "런닝화 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "런닝화7", 50000, "CT05", "CT0501", 10, 2500, "L", "검정", "/images/part/shoes/running_shoes/", "running_shoes_07.jpg", "런닝화 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*신발-스니커즈*/
			,new GoodsVO(4L, "스니커즈1", 50000, "CT05", "CT0502", 10, 2500, "L", "검정", "/images/part/shoes/sneakers/", "sneakers_01.jpg", "스니커즈 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "스니커즈2", 50000, "CT05", "CT0502", 10, 2500, "L", "검정", "/images/part/shoes/sneakers/", "sneakers_02.jpg", "스니커즈 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(4L, "스니커즈3", 50000, "CT05", "CT0502", 10, 2500, "L", "검정", "/images/part/shoes/sneakers/", "sneakers_03.jpg", "스니커즈 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*스커트-숏*/
			,new GoodsVO(3L, "숏스커트1", 50000, "CT06", "CT0601", 10, 2500, "L", "검정", "/images/part/skirt/short_skirt/", "short_skirt_01.jpg", "스커트 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*스커트-롱*/
			,new GoodsVO(3L, "롱스커트1", 50000, "CT06", "CT0602", 10, 2500, "L", "검정", "/images/part/skirt/long_skirt/", "long_skirt_01.jpg", "스커트 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*상의-니트*/
			,new GoodsVO(1L, "니트1", 50000, "CT07", "CT0701", 10, 2500, "L", "검정", "/images/part/top/knit/", "knitwear_01.jpg", "니트 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "니트2", 50000, "CT07", "CT0701", 10, 2500, "L", "검정", "/images/part/top/knit/", "knitwear_02.jpg", "니트 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "니트3", 50000, "CT07", "CT0701", 10, 2500, "L", "검정", "/images/part/top/knit/", "knitwear_03.jpg", "니트 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "니트4", 50000, "CT07", "CT0701", 10, 2500, "L", "검정", "/images/part/top/knit/", "knitwear_04.jpg", "니트 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*상의-긴팔*/
			,new GoodsVO(1L, "긴팔1", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_01.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "긴팔2", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_02.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "긴팔3", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_03.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "긴팔4", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_04.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "긴팔5", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_05.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "긴팔6", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_06.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "긴팔7", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_07.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "긴팔8", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_08.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "긴팔9", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_09.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "긴팔10", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_10.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "긴팔11", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_11.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "긴팔12", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_12.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "긴팔13", 50000, "CT07", "CT0702", 10, 2500, "L", "검정", "/images/part/top/long_shirt/", "long_sleeves_13.jpg", "긴팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*상의-맨투맨*/
			,new GoodsVO(1L, "맨투맨1", 50000, "CT07", "CT0703", 10, 2500, "L", "검정", "/images/part/top/man_to_man/", "man_to_man_01.jpg", "맨투맨 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "맨투맨2", 50000, "CT07", "CT0703", 10, 2500, "L", "검정", "/images/part/top/man_to_man/", "man_to_man_02.jpg", "맨투맨 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "맨투맨3", 50000, "CT07", "CT0703", 10, 2500, "L", "검정", "/images/part/top/man_to_man/", "man_to_man_03.jpg", "맨투맨 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "맨투맨4", 50000, "CT07", "CT0703", 10, 2500, "L", "검정", "/images/part/top/man_to_man/", "man_to_man_04.jpg", "맨투맨 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "맨투맨5", 50000, "CT07", "CT0703", 10, 2500, "L", "검정", "/images/part/top/man_to_man/", "man_to_man_05.jpg", "맨투맨 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "맨투맨6", 50000, "CT07", "CT0703", 10, 2500, "L", "검정", "/images/part/top/man_to_man/", "man_to_man_06.jpg", "맨투맨 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "맨투맨7", 50000, "CT07", "CT0703", 10, 2500, "L", "검정", "/images/part/top/man_to_man/", "man_to_man_07.jpg", "맨투맨 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "맨투맨8", 50000, "CT07", "CT0703", 10, 2500, "L", "검정", "/images/part/top/man_to_man/", "man_to_man_08.jpg", "맨투맨 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "맨투맨9", 50000, "CT07", "CT0703", 10, 2500, "L", "검정", "/images/part/top/man_to_man/", "man_to_man_09.jpg", "맨투맨 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*상의-목티*/
			,new GoodsVO(1L, "목티1", 50000, "CT07", "CT0704", 10, 2500, "L", "검정", "/images/part/top/neck_tee/", "neck_tee_shirt_01.jpg", "목티 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "목티2", 50000, "CT07", "CT0704", 10, 2500, "L", "검정", "/images/part/top/neck_tee/", "neck_tee_shirt_02.jpg", "목티 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*상의-셔츠*/
			,new GoodsVO(1L, "셔츠1", 50000, "CT07", "CT0705", 10, 2500, "L", "검정", "/images/part/top/shirt/", "shirt_01.jpg", "셔츠 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "셔츠2", 50000, "CT07", "CT0705", 10, 2500, "L", "검정", "/images/part/top/shirt/", "shirt_02.jpg", "셔츠 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "셔츠3", 50000, "CT07", "CT0705", 10, 2500, "L", "검정", "/images/part/top/shirt/", "shirt_03.jpg", "셔츠 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "셔츠4", 50000, "CT07", "CT0705", 10, 2500, "L", "검정", "/images/part/top/shirt/", "shirt_04.jpg", "셔츠 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "셔츠5", 50000, "CT07", "CT0705", 10, 2500, "L", "검정", "/images/part/top/shirt/", "shirt_05.jpg", "셔츠 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*상의-반팔*/
			,new GoodsVO(1L, "반팔티1", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_01.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티2", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_02.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티3", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_03.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티4", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_04.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티5", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_05.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티6", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_06.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티7", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_07.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티8", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_08.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티9", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_09.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티10", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_10.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티11", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_11.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티12", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_12.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티13", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_13.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티14", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_14.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티15", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_15.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "반팔티16", 50000, "CT07", "CT0706", 10, 2500, "L", "검정", "/images/part/top/short_shirt/", "short_sleeved_shirt_16.jpg", "반팔 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*상의-민소매*/
			,new GoodsVO(1L, "민소매티1", 50000, "CT07", "CT0707", 10, 2500, "L", "검정", "/images/part/top/sleeveless/", "sleeveless_shirt.jpg", "민소매티 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*상의-스웨터*/
			,new GoodsVO(1L, "스웨터1", 50000, "CT07", "CT0708", 10, 2500, "L", "검정", "/images/part/top/sweater/", "sweater_01.jpg", "스웨터 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "스웨터2", 50000, "CT07", "CT0708", 10, 2500, "L", "검정", "/images/part/top/sweater/", "sweater_02.jpg", "스웨터 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "스웨터3", 50000, "CT07", "CT0708", 10, 2500, "L", "검정", "/images/part/top/sweater/", "sweater_03.jpg", "스웨터 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			/*트레이닝복-세트(CT0801)*/
			/*트레이닝복-상의(CT0802)*/
			/*트레이닝복-하의(CT0803)*/
			,new GoodsVO(1L, "트레이닝복바지1", 50000, "CT08", "CT0803", 10, 2500, "L", "검정", "/images/part/training/down/", "training_pants_01.jpg", "트레이닝복바지 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
			,new GoodsVO(1L, "트레이닝복바지2", 50000, "CT08", "CT0803", 10, 2500, "L", "검정", "/images/part/training/down/", "training_pants_02.jpg", "트레이닝복바지 입니다.", "01", "Y", "system", DateUtils.stringToSqlDate("2012-05-21"), "system", DateUtils.stringToSqlDate("2012-05-21"))
		};
		
		//판매 게시글 데이터
		SalesVO[] salesList = {
		   /*가방-백팩       업체번호 상태코드                                                                                                                               제목                  내용          뷰카운트 좋아요  가격   할인액          수량*/
			new SalesVO(1, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "클래식 유로 백팩", "아주 좋은 상품 입니다", 111, 10, 130000, 15000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(2, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "맨하탄 포티지 RED", "아주 좋은 상품 입니다", 200, 111, 100000, 10000, "01", 2, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(3, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "폴로 랄프 로렌 백팩", "아주 좋은 상품 입니다", 168, 33, 70000, 5000, "01", 5, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(4, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "맨하탄 포티지 BLACK", "아주 좋은 상품 입니다", 130, 121, 50000, 0, "01", 50, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(5, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "에프씨이 백팩", "아주 좋은 상품 입니다", 103, 51, 120000, 20000, "01", 11, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(6, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "버빌리안 백팩", "아주 좋은 상품 입니다", 250, 130, 68000, 8000, "01", 20, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(7, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "커버낫 백팩", "아주 좋은 상품 입니다", 200, 25, 80000, 5000, "01", 1, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(8, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "베이직 백팩", "아주 좋은 상품 입니다", 243, 61, 70000, 10000, "01", 3, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(9, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "Ultimit 백팩", "아주 좋은 상품 입니다", 451, 100, 120000, 20000, "01", 16, "system", "system", "01", "설명 없음.")
		   /*하의-청바지*/
		   ,new SalesVO(10, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "플랙 청바지", "아주 좋은 상품 입니다", 551, 210, 48000, 8000, "01", 40, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(11, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "토피 청바지", "아주 좋은 상품 입니다", 548, 158, 50000, 5000, "01", 35, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(12, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "피스워커 청바지", "아주 좋은 상품 입니다", 280, 30, 88000, 8000, "01", 20, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(13, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "브랜디드 진청바지", "아주 좋은 상품 입니다", 551, 211, 48000, 8000, "01", 20, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(14, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "브랜디드 청바지", "아주 좋은 상품 입니다", 680, 280, 79000, 9000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(15, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 청바지", "아주 좋은 상품 입니다", 551, 100, 68000, 8000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(16, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "드로우핏 청바지", "아주 좋은 상품 입니다", 481, 100, 58000, 0, "01", 33, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(17, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "리 청바지", "아주 좋은 상품 입니다", 380, 110, 80000, 10000, "01", 11, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(18, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "모드나인 청바지", "아주 좋은 상품 입니다", 777, 333, 100000, 20000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(19, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "페이탈리즘 청바지", "아주 좋은 상품 입니다", 550, 111, 57000, 7000, "01", 44, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(20, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "브랜디드 청바지", "아주 좋은 상품 입니다", 543, 120, 50000, 10000, "01", 50, "system", "system", "01", "설명 없음.")
		   /*하의-레깅스*/
		   ,new SalesVO(21, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "아디다스 레깅스", "아주 좋은 상품 입니다", 680, 500, 70000, 15000, "01", 30, "system", "system", "01", "설명 없음.")
		   /*하의-긴바지*/
		   /*하의-짧은바지*/
		   ,new SalesVO(22, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "나이키 반바지", "아주 좋은 상품 입니다", 307, 110, 55000, 5000, "01", 30, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(23, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "다이클레즈 반바지", "아주 좋은 상품 입니다", 120, 40, 58000, 8000, "01", 22, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(24, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "크리틱 반바지", "아주 좋은 상품 입니다", 310, 210, 38000, 8000, "01", 9, "system", "system", "01", "설명 없음.")
		   /*원피스-원피스*/
		   ,new SalesVO(25, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "엠엘비 원피스", "아주 좋은 상품 입니다", 410, 110, 80000, 5000, "01", 28, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(26, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "코닥 원피스", "아주 좋은 상품 입니다", 150, 41, 120000, 20000, "01", 25, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(27, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "르니앤맥코이 원피스", "아주 좋은 상품 입니다", 550, 360, 180000, 0, "01", 11, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(28, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "그란데라인 원피스", "아주 좋은 상품 입니다", 380, 210, 150000, 10000, "01", 1, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(29, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "이슈넘버 원피스", "아주 좋은 상품 입니다", 610, 510, 170000, 10000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(30, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "에잇세컨즈 플라워 원피스", "아주 좋은 상품 입니다", 433, 203, 146000, 52000, "01", 16, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(31, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "에잇세컨즈 블랙 원피스", "아주 좋은 상품 입니다", 398, 180, 170000, 20000, "01", 15, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(32, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "에잇세컨즈 네이비 반팔 원피스", "아주 좋은 상품 입니다", 408, 210, 110000, 0, "01", 33, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(33, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "커버낫 원피스", "아주 좋은 상품 입니다", 577, 209, 135000, 15000, "01", 25, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(34, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "에잇세컨즈 블루 원피스", "아주 좋은 상품 입니다", 210, 103, 125000, 5000, "01", 17, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(35, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "잭니클라우스 원피스", "아주 좋은 상품 입니다", 310, 120, 130000, 20000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(36, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "폴로 랄프 로렌 원피스", "아주 좋은 상품 입니다", 501, 308, 128000, 8000, "01", 50, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(37, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "에잇세컨즈 화이트 원피스", "아주 좋은 상품 입니다", 409, 203, 150000, 20000, "01", 15, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(38, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "에잇세컨즈 원피스", "아주 좋은 상품 입니다", 310, 102, 70000, 5000, "01", 40, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(39, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "에잇세컨즈 네이비 원피스", "아주 좋은 상품 입니다", 207, 107, 99000, 9000, "01", 5, "system", "system", "01", "설명 없음.")
		   /*아우터-블레이저*/
		   ,new SalesVO(40, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "로파이 블레이저", "아주 좋은 상품 입니다", 710, 410, 150000, 10000, "01", 19, "system", "system", "01", "설명 없음.")
		   /*아우터-가디건*/
		   ,new SalesVO(41, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "니티드 가디건", "아주 좋은 상품 입니다", 310, 60, 75000, 10000, "01", 8, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(42, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "비욘드클로젯 가디건", "아주 좋은 상품 입니다", 110, 10, 55000, 5000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(43, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "와랏이즌 가디건", "아주 좋은 상품 입니다", 490, 180, 65000, 0, "01", 20, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(44, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "꼼파뇨 가디건", "아주 좋은 상품 입니다", 387, 247, 55000, 0, "01", 15, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(45, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "노매뉴얼 가디건", "아주 좋은 상품 입니다", 436, 175, 80000, 5000, "01", 5, "system", "system", "01", "설명 없음.")
		   /*아우터-코트*/
		   ,new SalesVO(46, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "쿠어 코트", "아주 좋은 상품 입니다", 360, 210, 148000, 8000, "01", 40, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(47, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "메인부스 떡볶이 코트", "아주 좋은 상품 입니다", 380, 220, 98000, 18000, "01", 25, "system", "system", "01", "설명 없음.")
		   /*아우터-자켓*/
		   ,new SalesVO(48, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "제멋 딥그레이 자켓", "아주 좋은 상품 입니다", 510, 210, 48000, 0, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(49, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "제멋 블랙 자켓", "아주 좋은 상품 입니다", 310, 111, 50000, 0, "01", 18, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(50, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "코드그라피 후드 자켓", "아주 좋은 상품 입니다", 710, 501, 70000, 5000, "01", 2, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(51, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "더스토리 자켓", "아주 좋은 상품 입니다", 680, 408, 87000, 7000, "01", 33, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(52, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "제멋 자켓", "아주 좋은 상품 입니다", 607, 203, 40000, 0, "01", 12, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(53, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "86로드 자켓", "아주 좋은 상품 입니다", 709, 410, 79000, 4000, "01", 1, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(54, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "86로드 자켓", "아주 좋은 상품 입니다", 710, 410, 76000, 1000, "01", 8, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(55, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 자켓", "아주 좋은 상품 입니다", 864, 540, 49000, 0, "01", 1, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(56, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 라이트웨이트 자켓", "아주 좋은 상품 입니다", 855, 555, 50000, 0, "01", 7, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(57, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "로파이 자켓", "아주 좋은 상품 입니다", 940, 610, 85000, 5000, "01", 13, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(58, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "파르티멘토 자켓", "아주 좋은 상품 입니다", 910, 510, 84000, 4000, "01", 15, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(59, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "뎃츠잇 자켓", "아주 좋은 상품 입니다", 560, 408, 68000, 8000, "01", 20, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(60, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "코너스 자켓", "아주 좋은 상품 입니다", 410, 110, 88000, 8000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(61, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "말렌 자켓", "아주 좋은 상품 입니다", 510, 210, 60000, 0, "01", 18, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(62, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "벌스데이수트 자켓", "아주 좋은 상품 입니다", 420, 150, 50000, 5000, "01", 14, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(63, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "오케이 블레이저 자켓", "아주 좋은 상품 입니다", 710, 601, 79000, 4000, "01", 4, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(64, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "투포켓 면자켓", "아주 좋은 상품 입니다", 870, 508, 88000, 4000, "01", 17, "system", "system", "01", "설명 없음.")
		   /*아우터-점퍼*/
		   ,new SalesVO(65, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "로스코 점퍼", "아주 좋은 상품 입니다", 620, 305, 68000, 8000, "01", 16, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(66, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "코드그라피 점퍼", "아주 좋은 상품 입니다", 610, 203, 48000, 0, "01", 35, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(67, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "티알마크 점퍼", "아주 좋은 상품 입니다", 310, 101, 53000, 3000, "01", 12, "system", "system", "01", "설명 없음.")
		   /*아우터-롱패딩*/
		   ,new SalesVO(68, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "내셔널지오그래픽 롱패딩", "아주 좋은 상품 입니다", 780, 600, 249000, 9000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(69, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "노스페이스 롱패딩", "아주 좋은 상품 입니다", 910, 810, 250000, 20000, "01", 15, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(70, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 롱패딩", "아주 좋은 상품 입니다", 609, 410, 105000, 5000, "01", 8, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(71, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "널디 롱패딩", "아주 좋은 상품 입니다", 510, 303, 185000, 5000, "01", 20, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(72, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "코닥 롱패딩", "아주 좋은 상품 입니다", 430, 201, 230000, 10000, "01", 22, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(73, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "에잇세컨즈 롱패딩", "아주 좋은 상품 입니다", 617, 315, 130000, 0, "01", 33, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(74, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "토트넘 어패럴 롱패딩", "아주 좋은 상품 입니다", 704, 501, 205000, 5000, "01", 30, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(75, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "지프 롱패딩", "아주 좋은 상품 입니다", 710, 510, 205000, 15000, "01", 18, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(76, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무스너클 롱패딩", "아주 좋은 상품 입니다", 930, 820, 108000, 0, "01", 16, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(77, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 롱패딩", "아주 좋은 상품 입니다", 609, 410, 105000, 5000, "01", 15, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(78, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "안토니모라토 롱패딩", "아주 좋은 상품 입니다", 440, 223, 135000, 5000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(79, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "라이프 아카이브 롱패딩", "아주 좋은 상품 입니다", 310, 210, 150000, 0, "01", 1, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(80, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "널디 롱패딩", "아주 좋은 상품 입니다", 510, 303, 185000, 5000, "01", 8, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(81, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무스너클 롱패딩", "아주 좋은 상품 입니다", 505, 402, 207000, 7000, "01", 26, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(82, 2L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "라퍼지스토어 롱패딩", "아주 좋은 상품 입니다", 408, 208, 105000, 0, "01", 14, "system", "system", "01", "설명 없음.")
		   /*아우터-숏패딩*/
		   ,new SalesVO(83, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 블랙 숏패딩", "아주 좋은 상품 입니다", 705, 310, 150000, 5000, "01", 1, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(84, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 라이트 그레이 숏패딩", "아주 좋은 상품 입니다", 701, 309, 148000, 5000, "01", 8, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(85, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "에프씨엠엠 숏패딩", "아주 좋은 상품 입니다", 510, 210, 132000, 0, "01", 19, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(86, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "디미트리블랙 숏패딩", "아주 좋은 상품 입니다", 810, 111, 129000, 5000, "01", 28, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(87, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "아웃스탠딩 숏패딩", "아주 좋은 상품 입니다", 610, 110, 150000, 0, "01", 30, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(88, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "지프 숏패딩", "아주 좋은 상품 입니다", 508, 316, 150000, 5000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(89, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "에르노 숏패딩", "아주 좋은 상품 입니다", 607, 310, 148000, 8000, "01", 12, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(90, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "라퍼지스토어 숏패딩", "아주 좋은 상품 입니다", 710, 409, 105000, 5000, "01", 8, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(91, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "내셔널지오그래픽 숏패딩", "아주 좋은 상품 입니다", 801, 501, 149000, 9000, "01", 15, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(92, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "몽클레어 숏패딩", "아주 좋은 상품 입니다", 610, 190, 105000, 0, "01", 16, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(93, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "유니폼브릿지 숏패딩", "아주 좋은 상품 입니다", 503, 150, 125000, 5000, "01", 8, "system", "system", "01", "설명 없음.")
		   /*아우터-무스탕*/
		   ,new SalesVO(94, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "모던스튜디오 무스탕", "아주 좋은 상품 입니다", 810, 310, 250000, 0, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(95, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "프롬웨얼 무스탕", "아주 좋은 상품 입니다", 910, 420, 350000, 50000, "01", 18, "system", "system", "01", "설명 없음.")

		   /*아우터-집업*/
		   ,new SalesVO(96, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "에스피오나지 후드 집업", "아주 좋은 상품 입니다", 610, 310, 35000, 4000, "01", 50, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(97, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "챔피온 후드 집업", "아주 좋은 상품 입니다", 810, 403, 45000, 3000, "01", 30, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(98, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "와랏이즌 후드 집업", "아주 좋은 상품 입니다", 550, 255, 50000, 0, "01", 20, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(99, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "페플 후드 집업", "아주 좋은 상품 입니다", 480, 380, 38000, 0, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(100, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "그루브라임 후드 집업", "아주 좋은 상품 입니다", 810, 601, 42000, 0, "01", 18, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(101, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "그레이버 그레이 후드 집업", "아주 좋은 상품 입니다", 710, 510, 38500, 500, "01", 12, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(102, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "그레이버 블랙 후드 집업", "아주 좋은 상품 입니다", 708, 502, 41500, 500, "01", 5, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(103, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "오앤에이 후드 집업", "아주 좋은 상품 입니다", 601, 406, 55000, 0, "01", 44, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(104, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "꼼파뇨 광복절 후드 집업", "아주 좋은 상품 입니다", 780, 540, 44000, 0, "01", 25, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(105, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 후드 집업", "아주 좋은 상품 입니다", 690, 580, 28000, 0, "01", 1, "system", "system", "01", "설명 없음.")
		   /*신발-런닝화*/
		   ,new SalesVO(106, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "살로몬 런닝화", "아주 좋은 상품 입니다", 706, 510, 105000, 0, "01", 18, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(107, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "아디다스 런닝화", "아주 좋은 상품 입니다", 408, 300, 85000, 5000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(108, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "뉴발란스 런닝화", "아주 좋은 상품 입니다", 500, 208, 105000, 0, "01", 7, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(109, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "윙스풋 런닝화", "아주 좋은 상품 입니다", 601, 411, 65000, 5000, "01", 2, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(110, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "아식스 런닝화", "아주 좋은 상품 입니다", 710, 510, 115000, 5000, "01", 15, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(111, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "23.65 런닝화", "아주 좋은 상품 입니다", 680, 371, 75000, 0, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(112, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "아식스 런닝화", "아주 좋은 상품 입니다", 208, 105, 55000, 0, "01", 18, "system", "system", "01", "설명 없음.")
		   /*신발-스니커즈*/
		   ,new SalesVO(113, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "휠라 스니커즈", "아주 좋은 상품 입니다", 810, 620, 105000, 0, "01", 20, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(114, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "컨버스 스니커즈", "아주 좋은 상품 입니다", 799, 570, 95000, 0, "01", 30, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(115, 4L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "컨버스 스니커즈", "아주 좋은 상품 입니다", 844, 588, 85000, 0, "01", 40, "system", "system", "01", "설명 없음.")
		   /*스커트-숏*/
		   ,new SalesVO(116, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "네스티 팬시 클럽 미니스커트", "아주 좋은 상품 입니다", 688, 388, 45000, 0, "01", 30, "system", "system", "01", "설명 없음.")
		   /*스커트-롱*/
		   ,new SalesVO(117, 3L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 롱 스커트", "아주 좋은 상품 입니다", 677, 199, 50000, 5000, "01", 10, "system", "system", "01", "설명 없음.")
		   /*상의-니트*/
		   ,new SalesVO(118, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "니티드 니트", "아주 좋은 상품 입니다", 576, 487, 58000, 0, "01", 12, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(119, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "블론드나인 니트", "아주 좋은 상품 입니다", 432, 236, 49800, 8000, "01", 12, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(120, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "더웨더이즈어썸 니트", "아주 좋은 상품 입니다", 318, 156, 57000, 0, "01", 13, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(121, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "데이 니트", "아주 좋은 상품 입니다", 436, 126, 55000, 5000, "01", 1, "system", "system", "01", "설명 없음.")
		   /*상의-긴팔*/
		   ,new SalesVO(122, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 베이식 긴팔", "아주 좋은 상품 입니다", 467, 310, 48000, 3000, "01", 1, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(123, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "바스틱 긴팔", "아주 좋은 상품 입니다", 360, 217, 58000, 5000, "01", 30, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(124, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "커버낫 긴팔", "아주 좋은 상품 입니다", 670, 390, 58000, 5000, "01", 20, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(125, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 긴팔", "아주 좋은 상품 입니다", 620, 390, 48000, 0, "01", 2, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(126, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 화이트 긴팔", "아주 좋은 상품 입니다", 633, 387, 48000, 0, "01", 3, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(127, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 블랙 긴팔", "아주 좋은 상품 입니다", 644, 399, 48000, 0, "01", 5, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(128, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "드로우핏 긴팔", "아주 좋은 상품 입니다", 777, 298, 55000, 5000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(129, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "LA 긴팔", "아주 좋은 상품 입니다", 972, 527, 53000, 3000, "01", 14, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(130, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "heybig 긴팔", "아주 좋은 상품 입니다", 347, 129, 53000, 2000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(131, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "아미 긴팔", "아주 좋은 상품 입니다", 997, 642, 58000, 3000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(132, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무지 민트 긴팔", "아주 좋은 상품 입니다", 678, 325, 38000, 0, "01", 1, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(133, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무지 블랙 긴팔", "아주 좋은 상품 입니다", 544, 324, 38000, 0, "01", 3, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(134, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "솔리드 긴팔", "아주 좋은 상품 입니다", 666, 333, 43000, 3000, "01", 10, "system", "system", "01", "설명 없음.")
		   /*상의-맨투맨*/
		   ,new SalesVO(135, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "딥인다이브 맨투맨", "아주 좋은 상품 입니다", 498, 245, 60000, 10000, "01", 5, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(136, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 맨투맨", "아주 좋은 상품 입니다", 768, 442, 45000, 0, "01", 3, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(137, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "팔렛 맨투맨", "아주 좋은 상품 입니다", 539, 362, 58000, 3000, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(138, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "나이키 맨투맨", "아주 좋은 상품 입니다", 668, 384, 62000, 0, "01", 13, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(139, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "와랏이즌 맨투맨", "아주 좋은 상품 입니다", 628, 368, 63000, 0, "01", 18, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(140, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "마하그리드 맨투맨", "아주 좋은 상품 입니다", 654, 366, 38000, 0, "01", 2, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(141, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "어반디타입 맨투맨", "아주 좋은 상품 입니다", 410, 250, 42000, 0, "01", 7, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(142, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "게인스브로 맨투맨", "아주 좋은 상품 입니다", 710, 310, 56000, 0, "01", 8, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(143, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "커버낫 맨투맨", "아주 좋은 상품 입니다", 410, 110, 40000, 0, "01", 1, "system", "system", "01", "설명 없음.")
		   /*상의-목티*/
		   ,new SalesVO(144, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무지 목티", "아주 좋은 상품 입니다", 310, 118, 38000, 0, "01", 6, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(145, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 목티", "아주 좋은 상품 입니다", 710, 420, 25000, 0, "01", 4, "system", "system", "01", "설명 없음.")
		   /*상의-셔츠*/
		   ,new SalesVO(146, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "다이아몬드 레이라 셔츠", "아주 좋은 상품 입니다", 610, 210, 48000, 0, "01", 20, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(147, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "라퍼지스토어 셔츠", "아주 좋은 상품 입니다", 640, 340, 50000, 5000, "01", 38, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(148, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "토마스모어 셔츠", "아주 좋은 상품 입니다", 689, 346, 44000, 4000, "01", 33, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(149, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "필루미네이트 셔츠", "아주 좋은 상품 입니다", 769, 489, 53000, 3000, "01", 24, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(150, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "아노블리어 체크 셔츠", "아주 좋은 상품 입니다", 777, 477, 55000, 0, "01", 15, "system", "system", "01", "설명 없음.")
		   /*상의-반팔*/
		   ,new SalesVO(151, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "오닐 반팔티", "아주 좋은 상품 입니다", 377, 222, 28000, 3000, "01", 30, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(152, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "도그 반팔티", "아주 좋은 상품 입니다", 688, 344, 38000, 3000, "01", 50, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(153, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "프랑켄모노 반팔티", "아주 좋은 상품 입니다", 333, 111, 27000, 4000, "01", 80, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(154, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "오리지널 데이 반팔티", "아주 좋은 상품 입니다", 342, 156, 35000, 0, "01", 70, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(155, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 반팔티", "아주 좋은 상품 입니다", 489, 275, 20000, 0, "01", 20, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(156, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "리 반팔티", "아주 좋은 상품 입니다", 490, 208, 40000, 0, "01", 58, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(157, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무지 민소매 반팔티", "아주 좋은 상품 입니다", 488, 208, 20000, 0, "01", 35, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(158, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "예일 스프라이트 반팔티", "아주 좋은 상품 입니다", 468, 197, 35000, 0, "01", 34, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(159, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "예일 반팔티", "아주 좋은 상품 입니다", 672, 333, 34900, 0, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(160, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "오버핏 반팔티", "아주 좋은 상품 입니다", 863, 426, 33000, 0, "01", 8, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(151, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "오닐 반팔티", "아주 좋은 상품 입니다", 377, 222, 28000, 3000, "01", 30, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(152, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "도그 반팔티", "아주 좋은 상품 입니다", 688, 344, 38000, 3000, "01", 50, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(153, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "프랑켄모노 반팔티", "아주 좋은 상품 입니다", 333, 111, 27000, 4000, "01", 80, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(154, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "오리지널 데이 반팔티", "아주 좋은 상품 입니다", 342, 156, 35000, 0, "01", 70, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(155, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무신사 스탠다드 반팔티", "아주 좋은 상품 입니다", 489, 275, 20000, 0, "01", 20, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(156, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "리 반팔티", "아주 좋은 상품 입니다", 490, 208, 40000, 0, "01", 58, "system", "system", "01", "설명 없음.")
		   /*상의-민소매*/
		   ,new SalesVO(157, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "무지 민소매 반팔티", "아주 좋은 상품 입니다", 488, 208, 20000, 0, "01", 35, "system", "system", "01", "설명 없음.")
		   /*상의-스웨터*/
		   ,new SalesVO(158, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "예일 스프라이트 반팔티", "아주 좋은 상품 입니다", 468, 197, 35000, 0, "01", 34, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(159, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "예일 반팔티", "아주 좋은 상품 입니다", 672, 333, 34900, 0, "01", 10, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(160, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "오버핏 반팔티", "아주 좋은 상품 입니다", 863, 426, 33000, 0, "01", 8, "system", "system", "01", "설명 없음.")
		   /*트레이닝복-하의*/
		   ,new SalesVO(161, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "웬이즈아영 반팔티", "아주 좋은 상품 입니다", 699, 348, 38000, 0, "01", 5, "system", "system", "01", "설명 없음.")
		   ,new SalesVO(162, 1L, "01", "Y",DateUtils.stringToSqlDate("2022-05-01"), DateUtils.stringToSqlDate("2022-12-31"), "블랙 캣츠 반팔티", "아주 좋은 상품 입니다", 641, 317, 35800, 800, "01", 11, "system", "system", "01", "설명 없음.")
		};
		
//		codeDataInsert(codeList);
//		cateDataInsert(cateList);
//		userDataInsert(userList);
//		entrDataInsert(entrList);
//		goodsDataInsert(goodsList);
		salesDataInsert(salesList);
		
	}
	
	// 코드 데이터 입력
	public static void codeDataInsert(CodeVO[] codeList) {
		CodeDaoOracle codeDao = new CodeDaoOracle();
		codeDao.dropSeq();
		codeDao.createSeq();
		codeDao.deleteCodeAll();
		for(int i=0; i<codeList.length; i++){
			codeDao.insertCode(codeList[i]);
		}
	}
	
	// 카테고리 데이터 입력
	public static void cateDataInsert(CateVO[] cateList) {
		CateDaoOracle cateDao = new CateDaoOracle();
		cateDao.dropSeq();
		cateDao.createSeq();
		cateDao.deleteCateAll();
		for(int i=0; i<cateList.length; i++){
			cateDao.insertCate(cateList[i]);
		}
	}

	// 회원 데이터 입력
	public static void userDataInsert(UserVO[] userList) {
		UserDaoOracle userDao = new UserDaoOracle();
		userDao.dropSeq();
		userDao.createSeq();
		userDao.deleteUserAll();
		for(int i=0; i<userList.length; i++) {
			userDao.insertUser(userList[i]);
		}
	}
	
	// 업체 데이터 입력
	public static void entrDataInsert(EntrVO[] entrList) {
		EntrDaoOracle entrDao = new EntrDaoOracle();
		entrDao.dropSeq();
		entrDao.createSeq();
		entrDao.deleteEntrAll();
		for(int i=0; i<entrList.length; i++) {
			entrDao.insertEntr(entrList[i]);
		}
	}
	
	// 상품 데이터 입력
	public static void goodsDataInsert(GoodsVO[] goodsList) {
		GoodsDaoOracle goodsDao = new GoodsDaoOracle();
		goodsDao.dropSeq();
		goodsDao.createSeq();
		goodsDao.deleteGoodsAll();
		for(int i=0; i<goodsList.length; i++) {
			goodsDao.insertGoods(goodsList[i]);
		}
	}
	
	// 판매 게시글 데이터 입력
	public static void salesDataInsert(SalesVO[] salesList) {
		SalesDaoOracle saleDao = new SalesDaoOracle();
		saleDao.dropSeq();
		saleDao.createSeq();
		saleDao.deleteSalesAll();
		for(int i=0; i<salesList.length; i++) {
			saleDao.insertSales(salesList[i]);
		}
	}
}
