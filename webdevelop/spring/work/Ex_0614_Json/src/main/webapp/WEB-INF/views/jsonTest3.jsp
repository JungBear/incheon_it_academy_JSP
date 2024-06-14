<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	function apiList(){
		let api = document.getElementById("api");
		
		fetch("https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20240530")
		.then(response => response.json())
		.then(data=> {
			let res = data.boxOfficeResult.dailyBoxOfficeList[0].movieNm;
			api.value = res;
		})
				
	}
</script>
</head>
<body>
	<input type="button" value="API" onclick="apiList()">
	<input id="api">

</body>
</html>