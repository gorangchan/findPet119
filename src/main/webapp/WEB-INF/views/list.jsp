
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>


<!DOCTYPE html>
<html lang="en">
<head>
<title>CSS Template</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.barTitle {
	background-color: #2d6bba;
	color: white;
	padding: 30px;
	font-size: 25px;
}
/* Style the side navigation */
.sidenav {
	height: 100%;
	width: 250px;
	z-index: 1;
	background-color: white;
	overflow-x: hidden;
	margin: 30px 0px;
}

/* Side navigation links */
.sidenav a {
	color: black;
	padding: 16px;
	text-decoration: none;
	display: block;
}

/* Change color on hover */
.sidenav a:hover {
	background-color: #2d6bba;
	color: white;
	font-size: 15px;
}

/* Style the content */
.layout {
	display: flex;
	position: absolute;
	left: 220px;
	justify-content: space-around;
}


able caption {
	padding: .5em 0;
}

table.dataTable th, table.dataTable td {
	white-space: nowrap;
}

table th {
	width: 100px;
}

.boardTop {
	border-top: 3px solid #2d6bba;
}
.insertBoard {
	align:rignt;
}
</style>
</head>
<body>


	<div class="layout">
		<div class="sidenav">
			<div class="barTitle">습득물</div>
			<a href="#">습득물 검색</a> <a href="#">습득물 휴대폰 검색</a> <a href="#">핸드폰찾기콜센터
				검색</a>
		</div>
	</div>
	</div>
	</div>



		<div class="container">
			<h2>습득물 검색</h2>
			<br>
			<a class="insertBoard" href="${path}/insertForm/nm/null/pageNum/1">게시글 입력</a>
			<div class="row">
				<div class="col-xs-12">
					<table
						summary="This table shows how to create responsive tables using Datatables' extended functionality"
						class="table table-bordered table-hover dt-responsive"
						style="width: 900px">

						<thead style="text-align: center;">
							<tr class="boardTop">
								<th>관리번호</th>
								<th style='width: 300px'>제목</th>
								<th>글쓴이</th>
								<th>등록일</th>
								<th>조회수</th>
							</tr>
						</thead>
						<tbody>
							<c:if test="${empty list }">
								<tr>
									<td colspan="5">데이터가 없습니다</td>
								</tr>
							</c:if>
							<c:if test="${not empty list }"> </c:if>
								<c:forEach var="board" items="${list}">
									<tr>
										<th>${board.seq }</th>
										<th>
										<a style="color: black;" href="${path}/view/num/${board.seq}/pageNum/${pb.currentPage}">
											${board.title }</a></th>
										<th>${board.create_userid }</th>
										<th>${board.create_datime}</th>
										<th>${board.hit_cnt}</th>
									</tr>
								</c:forEach>
						</tbody>
					</table>

</body>
</html>
