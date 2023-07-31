<%@ page language="java" isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
 <link  rel="stylesheet"type="text/css" href="css/style.css"/>
 <h1 style="color: gray;text-align: center;">Employee List Page By Page</h1>
 <c:choose>
 <c:when test="${!empty empResultPageByPage.getContent()}">
 <header class="header">
    <div class="container h-100">
      <div class="row h-100 align-items-center">
        <div class="col-md-12 text-center">
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">EMPNO</th>
      <th scope="col">ENAME</th>
      <th scope="col">JOB</th>
      <th scope="col">SAL</th>
      <th scope="col">EDIT</th>
      <th scope="col">DELETE</th>
    </tr>
</thead>
<c:forEach items="${empResultPageByPage.getContent()}" var="emp">
<tbody>
    <tr>
      <th scope="row">${emp.empno}</th>
      <td>${emp.ename}</td>
      <td>${emp.job}</td>
      <td>${emp.sal}</td>
      <td><a href="edit_emp?no=${emp.empno}">edit</a></td>
      <td><a href="delete_emp?no=${emp.empno}" onclick="return confirm('ARE YOU SURE  YOU WANT TO DELETE')">delete</a></td>
    </tr>
    </tbody>
</c:forEach>
</table>
</div>
      </div>
    </div>
  </header>
<p style="text-align: center;">
					<c:if test="${empResultPageByPage.hasPrevious()}">
					<a href="pagebypage?page=${empResultPageByPage.getPageable().getPageNumber()-1 }">Previous</a>&nbsp;&nbsp;
					</c:if>
					<c:if test="${!empResultPageByPage.isFirst()}">
					<a href="pagebypage?page=0">First</a>&nbsp;&nbsp;
					</c:if>
					<c:forEach var="i" begin="1" end="${empResultPageByPage.getTotalPages()}" step="1">
					[<a href="pagebypage?page=${i-1 }">${i}</a>]&nbsp;&nbsp;
					</c:forEach>
					<c:if test="${!empResultPageByPage.isLast()}">
					<a href="pagebypage?page=${empResultPageByPage.getTotalPages()-1 }">Last</a>&nbsp;&nbsp;
					</c:if>
					<c:if test="${empResultPageByPage.hasNext()}">
					<a href="pagebypage?page=${empResultPageByPage.getPageable().getPageNumber()+1 }">Next</a>&nbsp;&nbsp;
					</c:if>
					
 
 
 </c:when>
 <c:otherwise>
				<h1 style="color: red;text-align: center;">Employee Record Not found</h1>
				</c:otherwise>
 
 </c:choose>
 <h1 style="color: black; text-align: center;">Result is: ${empResultPageByPage}</h1>