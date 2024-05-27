<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String msg = "안녕";

	//JSP에 EL표현식으로 출력을 하고싶으면
	// 4개의 영역객체중 하나에 담아야한다.
	
	pageContext.setAttribute("msg", msg);
	
	request.setAttribute("msg", "request 영역에 저장됨");
	
	
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${requestScope.msg}
	<!-- 영역 참조 순서 -->

</body>
</html>