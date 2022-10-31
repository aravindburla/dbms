<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/welcome.jsp"/>
<br><br><br>
<h2 style="color:red;" align="center">Student Database Management</h2>
<h2 style="color:blue" align="center">Student Details</h2>
<table align="center" border="1">
<tr><td>Student Id</td><td>${student.sid}</td></tr>
<tr><td>Student Name</td><td>${student.sname}</td></tr>
<tr><td>Student Email</td><td>${student.semail}</td></tr>
<tr><td>Student Course</td><td>${student.scourse}</td></tr>
<tr><td>Student Address</td><td>${student.saddr}</td></tr>
<tr><td>Student City</td><td>${student.scity}</td></tr>
<tr><td>Student State</td><td>${student.sstate}</td></tr>
<tr><td>Student Country</td><td>${student.scountry}</td></tr>
<tr><td>Student Contact No</td><td>${student.scontact}</td></tr>
</table>
</body>
</html>