'use strict' //자바스크립트의 미친짓을 제한한다.
const authRight = '성영식이 작성함.';
// console.log('authRight:' + authRight);
console.log(`common js를 읽어들입니다... authRight: ${authRight}`);



const l = '1'; //자바로(final)
let f = '1'; //변수


let loginBtn = document.querySelector("#login_btn");


// loginBtn.addEventListener('click', function () {
// })

// loginBtn.addEventListener('click', ()=>{
//     alert('hh')
// })


function pageMove(pageName){
    if(pageName == 'main'){
        location.href = '/html/shp/goods/goods_list.html';
    }
    else if(pageName == 'mypage'){
        location.href = '/html/shp/mypage/mypage.html';
    }
    else if(pageName == 'join'){
        location.href = '/html/shp/user/login.html';
    }
    else if(pageName == 'product'){
        location.href = '/html/shp/goods/goods_detail.html';
    }
}

//상품 중간 메뉴 선택시 해당 부분으로 이동(상단 포함)
const productMenu = document.querySelector(".product_menu_list");
const productMenuUpperbar = document.querySelector(".product_menu_list_upperbar");
productMenu.addEventListener("click", (event) => { //클릭 이벤트 발생시
    const target = event.target; //마우스 클릭 타겟
    const link = target.dataset.link; //data-link와 연동
    if (link == null) { //data-link가 null일 경우
        return; //아무것도 안함
    }
    const scrollTo = document.querySelector(link);
    scrollTo.scrollIntoView({behavior : 'smooth'}); //이동
});
productMenuUpperbar.addEventListener("click", (event) => { //상단
    const target = event.target;
    const link = target.dataset.link;
    if (link == null) {
        return;
    }
    const scrollTo = document.querySelector(link);
    scrollTo.scrollIntoView({behavior : 'smooth'}); //이동
});

// 일정 아래로 스크롤 하면 상품 중간 메뉴 상단에 나타남
const productUpperbar = document.querySelector('#product_menu_upperbar');
const productMenuTop = window.pageYOffset + productMenu.getBoundingClientRect().top - 10;
document.addEventListener("scroll", () => {
    if(window.scrollY > productMenuTop) {
        productUpperbar.classList.remove('invisible');
        productUpperbar.classList.add('visible');
    } else {
        productUpperbar.classList.remove('visible');
        productUpperbar.classList.add('invisible');
    }
});