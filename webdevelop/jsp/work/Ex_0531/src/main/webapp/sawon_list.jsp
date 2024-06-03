<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function find(){
		
		let deptno = document.getElementById("deptno").value;
		
		location.href ="sawon_list?deptno=" + deptno;
	}
</script>
</head>
<body>

	<div align="center">
		부서번호 : 
		<select id="deptno">
			<option value="0">:::부서를 선택하세요</option>
			<option value="10">총무부</option>
			<option value="20">영업부</option>
			<option value="30">전산실</option>
			<option value="40">관리부</option>
			<option value="50">경리부</option>
		</select>
		<input type="button" value="검색" onclick="find()">
	</div>
	<table border="1" align="center">
		<caption>:::사원테이블:::</caption>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>직종</th>
			<th>입사 날짜</th>
			<th>급여</th>
		</tr>
		
		<c:forEach var="vo" items="${list }">
			<tr>
				<th>${vo.sabun }</th>
				<th>${vo.saname }</th>
				<th>${vo.deptno }</th>
				<th>
					<c:set var="sahire" value="${vo.sahire }"/>
					${fn:split(sahire,' ')[0]}
				</th>
				<th>${vo.sapay }</th>
			</tr>
		</c:forEach>
			
	</table>
</body>
</html>