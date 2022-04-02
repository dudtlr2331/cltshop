drop table buy;
drop table DRESSROOM;
drop table DRESSROOM_COMMENT;
drop table DRESSROOM_TAG;
drop table EVENT_TBL;
drop table GOODS_INFO;
drop table GOODS_QNA;
drop table GOODS_REVIEW;
drop table GOODSCATEGORY;
drop table GOODSCOLOR;
drop table GOODSSIZE;
drop table MEMBER;
drop table ONEQNA_TBL;
drop table PRODUCT_IO;
drop table STATS_TBL;

CREATE TABLE member (
	member_seq	number	NOT NULL,
	member_id	varchar(100)	NULL,
	member_name	varchar(50)	NULL,
	member_pwd	varchar(100)	NULL,
	member_tel	varchar(100)	NULL,
	birth	varchar(100)	NULL,
	gender	char(1)	NULL,
	email	varchar(100)	NULL,
	created_at	timestamp	NULL,
	grade	varchar(10)	NULL,
	del_flag	char(1)	NULL,
	del_date	date	NULL,
	coupon	VARCHAR(255)	NULL,
	accumulated_money	number	NULL
);

CREATE TABLE buy (
	order_num	number	NOT NULL,
	res_name	varchar(20)	NULL,
	res_tel	varchar(100)	NULL,
	res_addr	varchar(100)	NULL,
	better_addr	varchar(100)	NULL,
	postcode	number	NULL,
	res_requirement	varchar(200)	NULL,
	total_price	number	NULL,
	order_date	date	NULL,
	member_id	varchar(100)	NOT NULL
);

CREATE TABLE product_io (
	io_num	number	NOT NULL,
	order_num2	number	NOT NULL,
	Key	VARCHAR(255)	NOT NULL,
	amount	number	NULL,
	status	varchar(10)	NULL,
	pDate	date	NULL
);

CREATE TABLE coupon_tbl (
	cou_num	number	NOT NULL,
	cou_name	varchar2(30)	NULL,
	cou_discount	number	NULL,
	cou_time	datetime	NULL,
	cou_count	number	NULL
);

CREATE TABLE event_tbl (
	eve_num	number	NOT NULL,
	eve_title	varchar2(30)	NULL,
	eve_con	varchar2(30)	NULL,
	eve_regd	date	NULL,
	eve_date	date	NULL
);

CREATE TABLE oneqna_tbl (
	oneq_num	number	NOT NULL,
	oneq_title	varchar2(30)	NULL,
	oneq_name	varchar2(30)	NULL,
	oneq_date	date	NULL,
	oneq_con	varchar2(30)	NULL
);

CREATE TABLE stats_tbl (
	stats_code	number	NOT NULL,
	week_stats	number	NULL,
	monthly_stats	number	NULL,
	daily_count	number	NULL,
	week_count	number	NULL,
	monthly_count	number	NULL,
	dep_count	number	NULL,
	dep_money	number	NULL,
	depcom_count	number	NULL,
	depcom_money	number	NULL,
	deli_count	number	NULL,
	deli_money	number	NULL,
	delicom_count	number	NULL,
	delicom_money	number	NULL,
	ordercom_count	number	NULL,
	ordercom_money	number	NULL,
	can_count	number	NULL,
	cancom_count	number	NULL,
	swap_count	number	NULL,
	swapcom_count	number	NULL,
	return_count	number	NULL,
	returncom_count	number	NULL
);

CREATE TABLE GOODS_INFO (
	GOODS_INFO_SEQ	NUMBER	NOT NULL,
	GOODS_CATEGORY_ID	NUMBER	NOT NULL,
	SIZE_ID	NUMBER	NOT NULL,
	GOODS_ID	NUMBER	NOT NULL,
	COLOR_ID	NUMBER	NOT NULL,
	GOODS_NAME	VARCHAR2(40)	NULL,
	GOODS_PRICE	NUMBER	NULL,
	GOODS_STOCK	NUMBER	NULL,
	GOODS_DESCRIPTION	VARCHAR2(3000)	NULL,
	GOODS_IMG	VARCHAR2(100)	NULL
);

CREATE TABLE goodsCategory (
	goods_category_id	number	NOT NULL,
	category_name	varchar2(20)	NULL
);

CREATE TABLE goodsSize (
	size_id	number	NOT NULL,
	size_name	varchar2(10)	NULL
);

CREATE TABLE goodsColor (
	color_id	number	NOT NULL,
	color_name	varchar2(20)	NULL
);

CREATE TABLE goods_review (
	review_id	number	NOT NULL,
	review_type	number	NOT NULL,
	goods_category_id	number	NOT NULL,
	size_id	number	NOT NULL,
	color_id2	number	NOT NULL,
	Key	VARCHAR(255)	NOT NULL,
	user_id	number	NULL,
	user_height	number	NULL,
	review_description	varchar2(3000)	NULL,
	review_date	date	NULL,
	review_image	varchar2(3000)	NULL
);

CREATE TABLE goods_qna (
	goods_qna_id	number	NOT NULL,
	goods_category_id	number	NOT NULL,
	size_id	number	NOT NULL,
	color_id2	number	NOT NULL,
	Key	VARCHAR(255)	NOT NULL,
	user_id	number	NULL,
	goods_qna_answer	number	NULL,
	goods_qna_description	varchar2(1000)	NULL,
	goods_qna_date	date	NULL,
	goods_qna_secret	number	NULL,
	goods_qna_pwd	number	NULL
);

CREATE TABLE dressroom (
	dressroom_id	number	NOT NULL,
	tag_id	number	NOT NULL,
	user_id	number	NULL,
	dressroom_name	varchar2(40)	NULL,
	dressroom_description	varchar2(3000)	NULL,
	dressroom_date	date	NULL,
	dressroom_like	number	NULL
);

CREATE TABLE dressroom_tag (
	tag_id	number	NOT NULL,
	tag_name	varchar2(20)	NULL
);

CREATE TABLE dressroom_comment (
	dressroom_comment_id	number	NOT NULL,
	dressroom_id	number	NOT NULL,
	user_id	number	NULL,
	dressroom_comment_date	date	NULL,
	dressroom_comment_description	varchar2(3000)	NULL
);


