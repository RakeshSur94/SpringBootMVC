<%@ page isELIgnored="false" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />

<c:choose>
	<c:when test="${!empty pageData}">
		<table class="table table-bordered table-dark">
			<tr>
				<th>EMPID</th>
				<th>ENAME</th>
				<th>EDESG</th>
				<th>ESAL</th>
				<th>STATUS</th>
			</tr>

			<c:forEach var="emp" items="${pageData.getContent()}">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.desg}</td>
					<td>${emp.sal}</td>
					<td>${emp.status}</td>
				</tr>

			</c:forEach>
		</table>
		<p style="text-align: center;">
			
			
			<c:forEach var="i" begin="1" end="${pageData.getTotalPages() }"
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
		${pageData}</h1>
<br><br>
<h1 style=" color: black;text-align: center;"><a href="./">HOME</a></h1>

