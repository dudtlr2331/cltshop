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
        location.href = '/main/main.html';
    }
    else if(pageName == 'mypage'){
        location.href = '/mypage/mypage.html';
    }
}