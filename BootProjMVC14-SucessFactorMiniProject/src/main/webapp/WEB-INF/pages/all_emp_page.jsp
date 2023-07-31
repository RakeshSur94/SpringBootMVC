<%@page isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />

<c:choose>
<c:when test="${!empty allEmp}">
<table class="table table-bordered table-dark">
<tr class="table-active">
<th scope="col">EMPID</th><th scope="col">ENAME</th><th scope="col">EDOJ</th ><th scope="col">EDESG</th><th scope="col">ESAL</th><th scope="col">ESTATUS</th><th scope="col">EDIT</th><th scope="col">DELETE</th>
</tr>
<c:forEach var="emp"  items="${allEmp}">
<tr  class="table-primary">
<td class="table-active">${emp.empid}</td>
<td class="table-primary">${emp.name}</td>
<td class="table-danger">${emp.doj}</td>
<td class="table-warning">${emp.desg}</td>
<td class="table-info">${emp.sal}</td>
<td class="table-dark">${emp.status}</td>
<td class="table-warning"><a href="emp_edit?no=${emp.empid}"><img src="images/edit.jpg" width="50px"></a></td>
<td><a href="emp_delete?no=${emp.empid}"  onclick="return confirm('Do You Really Want To Delete')"><img src="images/delete.jpg" width="50px"></a></td>
</tr>
</c:forEach>
<tr>
<td class="table-info"><a href="pagination">Get EMP INFO PAGE BY PAGE</a></td>
</tr>
</table>
</c:when>
<c:otherwise>
<h1 style="color: buttonhighlight; text-align: center;">There Is No employee</h1>
</c:otherwise>
</c:choose>
<br><br>
<h1 style="color: maroon;text-align: center;">${savedEmployee}</h1>
<br><br>
<h1 style="color: maroon;text-align: center;">${emp_leave}</h1>
<br>
<h1 style="color: maroon;text-align: center;"><a href="leavedetails">GET ALL LEAVE</a></h1>
<br><br><br><br>
<h1 style="color: cyan; text-align: center;"><a href="add_emp">Add Employee</a></h1>

<br><br><br><br>


    <table data-toggle="table">
      <thead>
        <tr>
          <th>download PDF File</th>
          <th>download EXCEL File</th>
          <th>HOME</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td><a href="report?type=pdf">download </a></td>
          <td><a href="report?type=excel">download</a></td>
          <td><a href="./">home</a></td>
        </tr>
      </tbody>
    </table>

    <script src="https://cdn.jsdelivr.net/npm/jquery/dist/jquery.min.js"></script>
    <script src="https://unpkg.com/bootstrap-table@1.21.4/dist/bootstrap-table.min.js"></script>
    <script src="https://unpkg.com/bootstrap-table@1.21.4/dist/themes/bootstrap-table/bootstrap-table.min.js"></script>








