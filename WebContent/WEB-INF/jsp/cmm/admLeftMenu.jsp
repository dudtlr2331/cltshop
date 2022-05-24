<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>

</style>
<!-- adm menu start -->
<nav class="adm_left_menu">
    <ul>
       <li><a href="/DispatcherServlet?command=adm_goods_list">상품 관리</a></li>
       <li class="sub"><a href="/DispatcherServlet?command=adm_goods_list">상품 목록</a></li>
       <li class="sub"><a href="/DispatcherServlet?command=adm_goods_qna">상품 문의 관리</a></li>
       <li><a href="/DispatcherServlet?command=adm_order_list">주문 관리</a></li>
       <li><a href="/DispatcherServlet?command=adm_user_list">회원 관리</a></li>
       <li><a href="/DispatcherServlet?command=adm_event_banner">이벤트 관리</a></li>
       <li><a href="/DispatcherServlet?command=adm_stats_sales">매출현황</a></li>
       <li><a href="/DispatcherServlet?command=adm_dressroom_manager">드레스룸 관리</a></li>
       <li><a href="/DispatcherServlet?command=adm_qna_list">1:1 문의 관리</a></li>
       <li><a href="/DispatcherServlet?command=adm_cpn_list">쿠폰/적립금 관리</a></li>
    </ul>
</nav>
<!-- adm menu end -->
<script>
let leftMenu;
let leftMenuNav = '${leftMenuNav}';

window.onload = ()=>{
	leftMenu = document.querySelectorAll('.adm_left_menu ul li');
	if(leftMenuNav == 'adm_goods_list'){
		leftMenu[1].classList.add('active');		
	}else if(leftMenuNav == 'adm_goods_qna'){
		leftMenu[2].classList.add('active');		
	}else if(leftMenuNav == 'adm_order_list'){
		leftMenu[3].classList.add('active');		
	}else if(leftMenuNav == 'adm_user_list'){
		leftMenu[4].classList.add('active');		
	}else if(leftMenuNav == 'adm_event_banner'){
		leftMenu[5].classList.add('active');		
	}else if(leftMenuNav == 'adm_stats_sales'){
		leftMenu[6].classList.add('active');		
	}else if(leftMenuNav == 'adm_dressroom_manager'){
		leftMenu[7].classList.add('active');		
	}else if(leftMenuNav == 'adm_qna_list'){
		leftMenu[8].classList.add('active');		
	}else if(leftMenuNav == 'adm_cpn_list'){
		leftMenu[9].classList.add('active');		
	}
	
	/* for(let i=0; i<leftMenu.length; i++){
		leftMenu[i].addEventListener('click', (e)=>{
			e.preventDefault();
			e.target.parentElement.classList.toggle('active');
		});
	} */
};
</script>