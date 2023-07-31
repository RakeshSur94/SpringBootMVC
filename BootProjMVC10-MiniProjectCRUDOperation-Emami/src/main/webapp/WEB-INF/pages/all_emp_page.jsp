<%@ page isELIgnored="false" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />


<c:choose>
<c:when test="${!empty empResult}">
<h1 style="color: red; text-align: center;">Employee Info Page</h1>
<table  class="table table-bordered table-dark">
<tr color="black">
<th>EID</th><th>ENAME</th><th>EDESG</th><th>ESAL</th><th>ESTATUS</th><th>EDIT</th><th>DELETE</th>
</tr>
<c:forEach var="emp" items="${empResult}">
<tr >
<td>${emp.id}</td>
<td>${emp.name}</td>
<td>${emp.desg}</td>
<td>${emp.sal}</td>
<td>${emp.status}</td>
<td><a href="edit_emp?id=${emp.id}"><img src="images/edit.jpg" width="50px"></a></td>
<td ><a href="delete_emp?id=${emp.id}" onclick="return confirm('ARE YOU SURE WANT TO DELETE')"><img src="images/delete.jpg" width="70px" ></a></td>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color:aqua; text-align: center;">Employee not Found</h1>
</c:otherwise>
</c:choose>
<br><br>
<h1 style="color:red; text-align: center;"><a href="newemployee">Add New Employee Here</a></h1>
<br><br>
<h1 style="color:red; text-align: center;">${empData}</h1>
<h1 style=" color: black;text-align: center;"><a href="./">HOME</a></h1>
