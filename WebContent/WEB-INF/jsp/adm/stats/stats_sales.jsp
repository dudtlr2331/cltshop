<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admLeftMenu.jsp" %>
<div id="sales">
    <h2>매출현황</h2>
    <div class="check">
        <li><a href="#">월간</a></li>
        <li><a href="#">주간</a></li>
    </div>
    <div class="date_area">
        <a href="">◀</a>
        <div class="date">2021.01</div>
        <a href="">▶</a>
    </div>
</div>
<div id="chart_box">
    <div class="chart">
        <ul class="axis_y">                
            <li><span>500,000</span></li>
            <li><span>400,000</span></li>
            <li><span>300,000</span></li>
            <li><span>200,000</span></li>
            <li><span>100,000</span></li>
        </ul>
        <!--
        <ul class="axis_x">
            <li><span>01/01</span></li>
            <li><span>01/02</span></li>
            <li><span>01/03</span></li>
            <li><span>01/04</span></li>
            <li><span>01/05</span></li>
            <li><span>01/06</span></li>
            <li><span>01/07</span></li>
        </ul>-->
        <ul class="bar">
            <!--
            <li style="height:90%;"><span></span></li>
            <li style="height:80%;"><span></span></li>
            <li style="height:85%;"><span></span></li>
            <li style="height:50%;"><span></span></li>
            <li style="height:45%;"><span></span></li>
            <li style="height:90%;"><span></span></li>
            <li style="height:40%;"><span></span></li>-->
            <li><div><span style="height:90%;"></span></div><p>01/01</p></li>
            <li><div><span style="height:80%;"></span></div><p>01/02</p></li>
            <li><div><span style="height:85%;"></span></div><p>01/03</p></li>
            <li><div><span style="height:50%;"></span></div><p>01/04</p></li>
            <li><div><span style="height:45%;"></span></div><p>01/05</p></li>
            <li><div><span style="height:90%;"></span></div><p>01/06</p></li>
            <li><div><span style="height:40%;"></span></div><p>01/07</p></li>
        </ul>
    </div>
</div>
<div class="amount">
    <table>
        <tr>
            <th colspan="2">120,000원</th>
            <th colspan="2">405,600원</th>
            <th colspan="2">2,206,700원</th>
            <th colspan="2">13,021,400원</th>
        </tr>
        <tr class="a_another">               
            <td>오늘</td>
            <td>
                <table>
                    <tr>                           
                        <td>12건</td>
                    </tr>
                </table>
            </td>
            <td>이번주</td>
            <td>
                <table>
                    <tr>                           
                        <td>45건</td>
                    </tr>
                </table>      
            </td>
            <td>이번달</td>
            <td>
                <table>
                    <tr>                           
                        <td>258건</td>
                    </tr>
                </table>      
            </td>
            <td>올해</td>
            <td>
                <table>
                    <tr>                              
                        <td>1000건</td>
                    </tr>
                </table>      
            </td>
        </tr> 
    </table>
</div>
<div class="date_select">
    <select>
        <option>2021-09-16 ~ 2021-10-16</option>
        <option>2021-11-16 ~ 2021-12-16</option>
        <option>2021-12-16 ~ 2022-01-16</option>
        <option>2022-02-16 ~ 2022-03-16</option>
    </select>
</div>
<div class="count">
    <table border="1">
        <tr>
            <th rowspan="2">입금대기</th>
            <td>3건</td>
            <th rowspan="2">입금완료</th>
            <td>1건</td>
            <th rowspan="4">주문처리 완료<br><br>7건<br><br>18,400원</th>
            <th>취소요청</th>
            <th>교환요청</th>
            <th>반품요청</th>
        </tr>
        <tr>
            <td>51,600원</td>
            <td>12,900원</td>
            <td>1건</td>
            <td>2건</td>
            <td>1건</td>
        </tr>
        <tr>
            <th rowspan="2">배송중</th>
            <td>87건</td>
            <th rowspan="2">배송완료</th>
            <td>386건</td>
            <th>취소완료</th>
            <th>교환접수</th>
            <th>반품접수</th>
        </tr>
        <tr>
            <td>797,800원</td>
            <td>2,991,500원</td>
            <td>0건</td>
            <td>0건</td>
            <td>0건</td>
        </tr>
    </table>
</div>