<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String msg = "안녕";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	\${3 > 2} = ${3 > 2 }<br>
	\${3 < 2} = ${3 lt 2 }<br>
	\${3 <= 2} = ${3 le 2 }<br>
	\${3 >= 2} = ${3 ge 2 }<br>
	\${3 == 2} = ${3 eq 2 }<br>
	
	<%-- \${3 != 2} = ${3 ne 2 }<br> --%>
	
</body>
</html>