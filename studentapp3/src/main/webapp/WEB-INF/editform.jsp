<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/welcome.jsp"/>
<br><br><br>
<h2 style="color:red;" align="center">Durga Software Solution</h2>
<h2 style="color:blue" align="center">Student Edit Form</h2>
<form method="post" action="update">
<table align="center">
<tr>
<td>Student Id</td>
<td>${student.sid}</td>
</tr>
<tr>
<td>Student Name</td>
<td><input type="text" name="sname" value='${student.sname}'/></td>
</tr>
<tr>
<td>Student Email</td>
<td><input type="email" name="semail" value='${student.semail}'/></td>
</tr>
<tr>
<td>Student Course</td>
<td><input type="text" name="scourse" value='${student.scourse}'/></td>
</tr>
<tr>
<td>Student Address</td>
<td><input type="text" name="saddr" value='${student.saddr}'/></td>
</tr>
<tr>
<td>Student City</td>
<td><input type="text" name="scity" value='${student.scity}'/></td>
</tr>
<tr>
<td>Student State</td>
<td><input type="text" name="sstate" value='${student.sstate}'/></td>
</tr>
<tr>
<td>Student Country</td>
<td><input type="text" name="scountry" value='${student.scountry}'/></td>
</tr>
<tr>
<td>Student Contact No</td>
<td><input type="text" name="scontact" value='${student.scontact}'/></td>
</tr>
<tr>
<td><input  type="submit" value="UPDATE"></td>
</tr>
</table>
<input type="hidden" name="sid" value='${student.sid}'/>
</form>
</body>
</html>