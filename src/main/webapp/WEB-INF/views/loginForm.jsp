
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

footer {
	position: absolute;
	bottom: -150px;
	left: 0;
	right: 0;
	color: black;
}

.contents-wrap {
	position: absolute;
	top: 350px;
	left: 500px;
	right: 100px;
}
</style>
</head>
<body>


	<div class="layout">
		<div class="sidenav">
			<div class="barTitle">회원마당</div>
			<a href="termsOfUse">이용약관</a> 
			<a href="#">회원가입</a> 
			<a href="updateBefore">아이디/비밀번호찾기</a>
			<a href="loginForm">로그인</a>
		</div>
	</div>
	</div>

	<div class="contents-wrap">

		<div class="container" align="center">
			
			<form class="form-signin" style="width: 400px; padding: 40px;">
				<img class="mb-4"
					src="${pageContext.request.contextPath}/resources/images/logo.png"
					alt="" width="233" height="62">
				<h1 class="h3 mb-3 font-weight-normal">로그인</h1>
				<label for="inputEmail" class="sr-only">ID</label> <input
					type="text" id="id" class="form-control" name="id" placeholder="id"
					required="" autofocus=""><br> <label
					for="inputPassword" class="sr-only">Password</label> <input
					type="password" id="inputPassword" class="form-control" name="pw"
					placeholder="Password" required="">
				<div class="checkbox mb-3"></div>
				<button class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>
				<button class="btn btn-lg btn-light btn-block">회원가입</button>
				<p class="mt-5 mb-3 text-muted">©분실물 중앙정보센터</p>
			</form>

		</div>

</body>
</html>

