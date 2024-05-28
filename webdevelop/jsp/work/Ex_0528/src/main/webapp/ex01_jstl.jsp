<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>

<%
	int n = 10;
	request.setAttribute("n", n);
	
	List<String> array = new ArrayList<>();
	array.add("서울");
	array.add("대전");
	array.add("대구");
	
	request.setAttribute("array", array);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="num" value="100"/>

${num}
<br>
<c:if test="${n eq 10}">
	참
</c:if>

<br>
<c:choose>
	<c:when test="${param.msg eq 10}">나는 10이다</c:when>
	<c:when test="${param.msg eq 11}">나는 10이 아니다</c:when>
	<c:otherwise>모두 아니다</c:otherwise>
</c:choose>

<hr>
<!-- var : 값을 담을 벼수
     begin : 시작값
     end : 종료값
     step : 증가량 -->
<c:forEach var="i" begin = "1" end="5" step="1">
	<c:if test="${i mod 2 eq 1 }">
		<font color="red">안녕 (${i})</font>
	</c:if>
</c:forEach>

<hr>
<c:forEach var="s" items="${array}" varStatus="cnt">
	${cnt.count } / ${s} --- ${cnt.index } / ${s}<br>
</c:forEach>
</body>
</html>