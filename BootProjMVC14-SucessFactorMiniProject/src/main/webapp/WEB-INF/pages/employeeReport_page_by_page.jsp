<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />
<c:choose>
<c:when test="${!empty pagingResult}">
<table class="table table-hove">
<tr>
<th>EMPID</th><th>ENAME</th><th>EDOJ</th><th>EDESG</th><th>ESALARY</th><th>STATUS</th>
</tr>
<c:forEach var="emp" items="${pagingResult.getContent()}">
<tr>
<td scope="col">${emp.empid}</td>
<td scope="col">${emp.name}</td>
<td scope="col">${emp.doj}</td>
<td scope="col">${emp.desg}</td>
<td scope="col">${emp.sal}</td>
<td scope="col">${emp.status}</td>
</tr>
</c:forEach>
</table>

	<c:forEach var="i" begin="1" end="${pagingResult.getTotalPages() }"
				step="1">
        [<a href="pagebypage?page=${i-1 }">${i}</a>]&nbsp;&nbsp;
        </c:forEach>
			
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center;">Employee Record Not
			found</h1>
	</c:otherwise>
	
</c:choose>
<h1 style="color: black; text-align: center;">Result is:
		${pagingResult}</h1>
<br><br>
<h1 style=" color: black;text-align: center;"><a href="./">HOME</a></h1>
