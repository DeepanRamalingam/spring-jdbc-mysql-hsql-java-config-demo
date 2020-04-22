<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<h2>Welcome to stackroute</h2>

<table>
<tr>
<th>EMPID</th>
<th>EMPNAME</th>
<th>GENDER</th>
<th>DESIGNATION</th>
<th>CITY</th>
<th>SALARY</th>
</tr>

<c:forEach items="${employees}" var="employee">

<!--  -->
<tr>
<td><c:out value="${employee.empid}" /></td>
<td>${employee.empname}</td>
<td>${employee.gender}</td>
<td>${employee.design}</td>
<td>${employee.city}</td>
<td>${employee.salary}</td>
</tr>

</c:forEach>
</table>
</body>
</html>