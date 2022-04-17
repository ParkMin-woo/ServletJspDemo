<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<html>
<body>
<!-- <h2>Hello World! Test</h2> -->

	<form action="searchEmployee" method="post">	 <!-- method="post" -->
		사원 번호 : <input type="text" name="empNo" /><br>
		<!-- 사원명 : <input type="text" name="empName" /><br> -->
		<input type="submit" />
	</form>

	<form action="uploadFile" method="post" enctype="multipart/form-data">	 <!-- method="post" -->
		업로드 테스트 : <input type="file" name="file" multiple="multiple" /><br>
		<!-- 사원명 : <input type="text" name="empName" /><br> -->
		<input type="submit" />
	</form>

</body>
</html>
