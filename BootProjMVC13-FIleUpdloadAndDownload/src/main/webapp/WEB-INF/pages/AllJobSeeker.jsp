<%@ page language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />



<c:choose>
<c:when test="${!empty list_of_allJobSeeker}">
<table class="table table-bordered table-dark" >
<tr>
<th>JSID</th><th>JSNAME</th><th>JSADRESS</th><th>JSRESUME</th><th>JSPHOTO</th>
</tr>
<c:forEach var="js" items="${list_of_allJobSeeker}">
<tr>
<td>${js.jsId}</td>
<td>${js.jsName}</td>
<td>${js.jsAddrs}</td>
<td><a href="download?jsId=${js.jsId}&type=resume">download Resume</a></td>
<td><a href="download?jsId=${js.jsId}&type=photo">download Photo</a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color: black;text-align: center;">Not available</h1>
</c:otherwise>
</c:choose>
<br>
<h1 style="color: maroon; text-align: center;"><a href="./">HOME</a></h1>
