<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 조회</title>
</head>
<body>



<h1>
${view.title}
<span>작성자 : </span>
${view.create_userid}

${view.content}
</h1>
<a href="/board/modify?seq=${view.seq}">게시물 수정</a>, <a href="/board/delete?seq=${view.seq}">게시물 삭제</a>

</body>
</html>