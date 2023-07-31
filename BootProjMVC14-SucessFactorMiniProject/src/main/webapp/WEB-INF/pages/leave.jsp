<%@page isELIgnored="false"  import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />


<c:choose>
<c:when test="${!empty leave_page_allemp}">
<table class="table table-bordered table-dark">
<tr class="table-active">
<th scope="col">EMPLOYEE NO</th><th scope="col">EMPLOYEE ALP</th><th scope="col">LeaveTaken Date</th><th scope="col">LeaveEnd Date</th ><th scope="col">Total Leave</th>
</tr>
<c:forEach var="emp"  items="${leave_page_allemp}">
<tr  class="table-primary">
<td class="table-primary">${emp.empid}</td>
<td class="table-primary">${emp.empALP}</td>
<td class="table-danger">${emp.leaveTakenDate}</td>
<td class="table-warning">${emp.leaveEndDate}</td>
<td class="table-info">${emp.totalDayOfLeave}</td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color: buttonhighlight; text-align: center;">ERROR</h1>
</c:otherwise>
</c:choose>
<br><br>
<h1 style="color: buttonhighlight; text-align: center;"><a href="./">HOME</a></h1>

