<%@page import="java.util.ArrayList"%>
<%@page import="vo.PersonVO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Map<String, Integer> map = new HashMap<>();
	map.put("key1", 100);
	map.put("key2", 200);
	map.put("key3", 300);
	map.put("key4", 400);
/*  */
	request.setAttribute("myMap", map);

	// ArrayList 객체
	List<PersonVO> list = new ArrayList<>();
	list.add(new PersonVO("홍길동", 30));
	list.add(new PersonVO("김길동", 40));
	list.add(new PersonVO("정길동", 20));
	
	request.setAttribute("list", list);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	${myMap.get("key1")}<br>
	${myMap["key2"]}<br>
	${myMap.key3}<br>
	
	<hr>
	${list[0].name} <br>   
	${list[0].age}  <br>
	${list[1].name} <br>   
	${list[1].age}  <br>
		
	

</body>
</html>