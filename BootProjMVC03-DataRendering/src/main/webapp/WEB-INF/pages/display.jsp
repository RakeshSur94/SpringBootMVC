<%@ page isELIgnored="false" import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 style="color: red; text-align: center">WELCOME TO SEASON PAGE</h1><br>
<c:if test="${!empty resultmssg}">
<h2  style="color: cyan; text-align: center">Season Name::${resultmssg}</h2><br>
</c:if>
<br>
<h2  style="color: Red; text-align: center">
<c:if test="${!empty empinfo}">
EmpInfo Name::${empinfo}<br>
</c:if>
<br>
<c:if test="${!empty CompanyList and !empty Employeename and !empty Salary and !empty PhoneNumber}">
Employee Company Name<%=Arrays.toString(((String[])request.getAttribute("CompanyList"))) %><br>
Employee Name::${Employeename},<br>Employee Salary::${Salary},<br>Employee PhoneNumber::${PhoneNumber}
</c:if>
</h2><br>
<br><br>
<c:choose>
<c:when test="${!empty emplist}">
<table border="1" bgcolor="cyan" align="center">
<tr>
<th>ename</th><th>ejob</th><th>age</th></tr>
<c:forEach var="emp" items="${emplist}">
<tr>
<td>${emp.ename}</td>
<td>${emp.ejob}</td>
<td>${emp.age}</td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color: red; text-align: center">Employee not found</h1>
</c:otherwise>
</c:choose>
<br><br>
<h1 style="color: pink; text-align: center"><a href="./">HOME</a></h1>
