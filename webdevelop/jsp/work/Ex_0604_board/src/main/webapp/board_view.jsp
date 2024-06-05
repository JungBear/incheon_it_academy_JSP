<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<caption>:::게시글 상세보기:::</caption>
		
		<tr>
			<th>제목</th>
			<td>${vo.subject}</td>
		</tr>
		
		<tr>
			<th>작성자</th>
			<td>${vo.name}</td>
		</tr>
		
		<tr>
			<th>작성일</th>
			<td>${fn:split(vo.regdate,' ')[0]}</td>
		</tr>
		
		<tr>
			<th>ip</th>
			<td>${vo.ip}</td>
		</tr>
		
		<tr>
			<th>내용</th>
			<td width="500px" height="200px"><pre>${vo.content}</pre></td>
		</tr>
		
		<tr>
			<th>비밀번호</th>
			<td>
				<input type="password" name="pwd">
			</td>
		</tr>
		
		<tr>
			<td colspan="2">
				<img src="img/btn_list.gif" onclick="location.href='board_list'" style="cursor: pointer">
				<img src="img/btn_reply.gif">
				<img src="img/btn_delete.gif">
			</td>
		</tr>
		
	</table>
</body>
</html>