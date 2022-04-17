<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	Welcome to searchEmployeeView.jsp<br>
	
	<%-- <c:forEach var="ele" items="${vo}"> --%>
	<%-- ${empNo} --%>
	<%-- <c:out value="${empNo}" /> --%>
		사원 번호 : <c:out value="${vo.empNo}" /><br>
		사원명 : <c:out value="${vo.empName}" /><br>
		사원 주소 : <c:out value="${vo.empAddr}" /><br>
		사원 나이 : <c:out value="${vo.empAge}" /><br>
	<%-- </c:forEach> --%>
</body>
</html>