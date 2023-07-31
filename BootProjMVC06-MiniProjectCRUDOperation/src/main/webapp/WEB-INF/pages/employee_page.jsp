<%@ page isELIgnored="false" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:choose>
<c:when test="${!empty emplist}">
<h1 style="color: red; text-align: center;">Employee Info Page</h1>
<table border="1" align="center" bgcolor="cyan">
<tr color="black">
<th>empNo</th><th>empName</th><th>empJob</th><th>empSal</th><th>empDeptno</th><th>Edit</th><th>Delete</th>
</tr>
<c:forEach var="emp" items="${emplist}">
<tr >
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.job}</td>
<td>${emp.sal}</td>
<td>${emp.deptno}</td>
<td ><a href="edit_emp?no=${emp.empno}" >EDIT</a></td>
<td><a href="delete_emp?no=${emp.empno}" onclick="return confirm('ARE YOU SURE  YOU WANT TO DELETE')" >DELETE</a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color:aqua; text-align: center;">Employee not Found</h1>
</c:otherwise>
</c:choose>

<br><br>
<h1 style="color:black; text-align: center;">${resultmsg}</h1>
<br><br>
<h1 style=" color: black;text-align: center;"><a href="emp_add">ADD EMPLOYEE</a></h1>
<br><br>
<h1  style="color:blue; text-align: center"> Contact information Of Rakesh</h1>
<h1 style="color: red; text-align: center;">Detiails::${Rakesh} </h1>
<br><br>
<h1 style=" color: black;text-align: center;"><a href="./">HOME</a></h1>
