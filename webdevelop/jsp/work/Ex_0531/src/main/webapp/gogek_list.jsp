<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function search(){
		let addr = document.getElementById("search").value;
		
		location.href="gogek_list?addr=" + addr;
	}
</script>	
</head>
<body>
	<div align="center">
		지역:
		<input id="search" placeholder="검색어를 입력하세요">
		<input type="button" value="검색" onclick="search();">
	</div>

	<table border="1" align="center">
		<caption>:::고객목록:::</caption>
		<tr>
			<th>고객번호</th>
			<th>담당자</th>
			<th>이름</th>
			<th>주소</th>
			<th>주민번호</th>
		</tr>
		
		<c:forEach var="vo" items="${list }">
			<tr>
				<th>${vo.gobun }</th>
				<th>${vo.godam }</th>
				<th>${vo.goname }</th>
				<th>${vo.goaddr }</th>
				<th>${vo.gojumin }</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>