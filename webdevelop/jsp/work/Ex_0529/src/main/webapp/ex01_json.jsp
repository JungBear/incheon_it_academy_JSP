<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	let p = {'name' : '홍길동', 'age' : '20', 'tel' : '010-1111-1111'};
	document.write('이름 : ' + p.name + '<br>');
	document.write('나이 : ' + p.age + '<br>');
	document.write('전화번호 : ' + p.tel + '<br>');
	document.write('<hr>');
	
	let p_arr = [{"name" : "홍길동", "age" : "30"}, {"name" : "김길동", "age" : "40"}];
	document.write('이름 : ' + p_arr[0].name + '<br>');
	document.write('나이 : ' + p_arr[0].age + '<br>');
	document.write('이름 : ' + p_arr[1].name + '<br>');
	document.write('나이 : ' + p_arr[1].age + '<br>');
	document.write('<hr>');
	
	// 다차원 배열
	let cource = {'name' : '웹개발',
			      'start' : '2024-0505',
			      'end' : '2024-07-19',
			      'sub' : ['java', 'jsp', 'spring'],
			      'student' : [{'name' : '홍길동', 'age' : '20'}, {'name':'김길동', 'age' : '30'}]};
	
	document.write('과목명 : ' + cource.name + '<br>');
	document.write('시작일 : ' + cource.start + '<br>');
	document.write('종료일 : ' + cource.end + '<br>');
	document.write('과목1 : ' + cource.sub[0] + '<br>');
	document.write('과목2 : ' + cource.sub[1] + '<br>');
	document.write('과목3 : ' + cource.sub[2] + '<br>');
	document.write('학생1 : ' + cource.student[0].name + "  " + cource.student[0].age + '<br>');
	document.write('학생2 : ' + cource.student[1].name + "  " + cource.student[1].age + '<br>');
	document.write('<hr>');
	
	
</script>
</head>
<body>
	
</body>
</html>