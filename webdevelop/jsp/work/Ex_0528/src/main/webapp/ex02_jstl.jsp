<%@page import="java.util.Date"%>
<%@page import="vo.PersonVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
	int n = 10;
	request.setAttribute("n", n);
	
	List<PersonVO> list = new ArrayList<>();
	list.add(new PersonVO("홍길동",20));
	list.add(new PersonVO("김길동",30));
	
	request.setAttribute("list", list);
	
	int money = 12000000;
	Date today = new Date();
	
	request.setAttribute("money", money);
	request.setAttribute("today", today);
	
	String str = "Kim Mal DDong";
	request.setAttribute("str", str);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="vo" items="${list }">
		${vo.name} / ${vo.age }<br>
	</c:forEach>
	<hr>
	&#8361;<fmt:formatNumber value="${money }"/><br>
	<fmt:formatDate value="${today }"/><br>
	<fmt:formatDate value="${today }" pattern="yyyy년 MM월 dd일"/><br>
	
	<hr>
	문자열의 길이 : ${fn:length(str)}<br> <!-- 13 -->
	글자의 인덱스값 반환 : ${fn:indexOf(str, "M") }<br>	<!-- 4 -->
	문자열 자르기 : ${fn:split(str, " ")[0] }<br>  <!-- kim -->
	


</body>
</html>