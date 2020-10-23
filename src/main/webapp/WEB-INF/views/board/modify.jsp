<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 수정</title>
</head>
<body>



<form method="post">
<h3>${view.seq }</h3>

<label>제목</label>
<input type="text" name="title" value="${view.title}"/><br />

<label>작성자</label>
<input type="text" name="create_userid" value="${view.create_userid}"/><br />

<label>내용</label>
<textarea cols="50" rows="5" name="content">${view.content}</textarea><br />

<button type="submit">완료</button>

</form>

</body>
</html>