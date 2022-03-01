<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/main.css" rel="stylesheet">
    <link href="/css/category.css" rel="stylesheet">
    <link href="/css/list.css" rel="stylesheet">
    <title>카테고리</title>
    <script src="https://kit.fontawesome.com/db1622cae4.js" crossorigin="anonymous"></script>
    <script src="/js/common.js" defer></script>
</head>
<body>
   <header id="header">
      <div class="logo">쇼핑몰로고...</div>
      <div class="top_btn">
         <input type="text"/>
         <a href="/html/user/cart/cart_view.html"><i class="fa-solid fa-cart-shopping"></i></a>
         <a href="/html/user/login/login.html"><i class="fa-solid fa-user-large"></i></a>
      </div>
   </header>
   <section id="main_benner">
        <ul class="menu">
            <a href="/html/user/main/main.html"><li>홈</li></a>
            <a href="/html/user/category/category.html"><li>카테고리</li></a>
            <a href="/html/user/one_qna/one_qna.html"><li>1:1문의</li></a>
            <a href="/html/user/dressroom/dressRoom_main.html"><li>커뮤니티</li></a>
        </ul>
        <div id="sub_menu">
          <ul id="nav">
              <li class="cate_menu"><a href="#">성별</a>
                <ul class="sub">
                    <li><a href="#">남성 패션</a></li>
                    <li><a href="#">여성 패션</a></li>
                </ul>
              </li>
              <li class="cate_menu"><a href="#">계절</a>
                <ul class="sub">
                    <li><a href="#">봄 패션</a></li>
                    <li><a href="#">여름 패션</a></li>
                    <li><a href="#">가을 패션</a></li>
                    <li><a href="#">겨울 패션</a></li>
                </ul>
              </li>
              <li class="cate_menu"><a href="#">나이대</a>
                <ul class="sub">
                    <li><a href="#">10대 이하</a></li>
                    <li><a href="#">10-20대</a></li>
                    <li><a href="#">20-30대</a></li>
                    <li><a href="#">30-40대</a></li>
                    <li><a href="#">40-50대</a></li>
                    <li><a href="#">60대 이상</a></li>
                </ul>
              </li>
          </ul>
        </div>
    </section>
   <section class="serv_list">
        <div class="container">
            <div class="title">
                <ul>
                    <li><a href="">이름순</a></li>
                    <li><a href="">최신순</a></li>
                    <li><a href="">좋아요순</a></li>
                </ul>
            </div>
            <div class="item_list">
                <div class="card">
                    <div class="img">
                        <img src="/images/test.png">
                    </div>
                    <div class="text">
                        <h2>test</h2>
                        <p>test2</p>
                        <button>test3</button>
                    </div>
                </div>
                <div class="card">
                    <div class="img">
                        <img src="/images/test.png">
                    </div>
                    <div class="text">
                        <h2>test</h2>
                        <p>test2</p>
                        <button>test3</button>
                    </div>
                </div>
                <div class="card">
                    <div class="img">
                        <img src="/images/test.png">
                    </div>
                    <div class="text">
                        <h2>test</h2>
                        <p>test2</p>
                        <button>test3</button>
                    </div>
                </div>
                <div class="card">
                    <div class="img">
                        <img src="/images/test.png">
                    </div>
                    <div class="text">
                        <h2>test</h2>
                        <p>test2</p>
                        <button>test3</button>
                    </div>
                </div>
                <div class="card">
                    <div class="img">
                        <img src="/images/test.png">
                    </div>
                    <div class="text">
                        <h2>test</h2>
                        <p>test2</p>
                        <button>test3</button>
                    </div>
                </div>
                <div class="card">
                    <div class="img">
                        <img src="/images/test.png">
                    </div>
                    <div class="text">
                        <h2>test</h2>
                        <p>test2</p>
                        <button>test3</button>
                    </div>
                </div>
                <div class="card">
                    <div class="img">
                        <img src="/images/test.png">
                    </div>
                    <div class="text">
                        <h2>test</h2>
                        <p>test2</p>
                        <button>test3</button>
                    </div>
                </div>
                <div class="card">
                    <div class="img">
                        <img src="/images/test.png">
                    </div>
                    <div class="text">
                        <h2>test</h2>
                        <p>test2</p>
                        <button>test3</button>
                    </div>
                </div>
            </div>
        </div>
   </section>
   <footer>

   </footer>
</body>
</html>