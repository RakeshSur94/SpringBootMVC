<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>





<style>
.table-striped tbody tr:nth-child(odd) td,
.table-striped tbody tr:nth-child(odd) th {
	background-color: #F2DEE0;
}

.table-striped tbody tr:nth-child(even) td,
.table-striped tbody tr:nth-child(even) th {
	background-color: #8D3841;
    color:#fff;
}
</style>

		
			<c:choose>
				<c:when test="${!empty empData.getContent()}">
					<table id="example" class="table table-striped table-bordered"
						style="width: 100%">
						<thead>
							<tr>
								<th>EmpNo</th>
								<th>Ename</th>
								<th>Ejob</th>
								<th>Esal</th>
								<th>Edeptno</th>
								<td ><a href="edit_emp?no=${emp.empno}" >EDIT</a></td>
<td><a href="delete_emp?no=${emp.empno}" onclick="return confirm('ARE YOU SURE  YOU WANT TO DELETE')" >DELETE</a></td>
</tr>
						</thead>

						<tbody>
							<c:forEach var="emp" items="${empData.getContent()}">
								<tr>
									<td>${emp.empno}</td>
									<td>${emp.ename}</td>
									<td>${emp.job}</td>
									<td>${emp.sal}</td>
									<td>${emp.deptno}</td>

								</tr>

							</c:forEach>
							</tbody>
					</table>
					<p style="text-align: center;">
					<c:if test="${empData.hasPrevious()}">
					<a href="report_emp_page?page=${empData.getPageable().getPageNumber()-1 }">Previous</a>&nbsp;&nbsp;
					</c:if>
					<c:if test="${empData.isFirst()}">
					<a href="report_emp_page?page=0">First</a>&nbsp;&nbsp;
					</c:if>
					<c:forEach var="i" begin="1" end="${empData.getTotalPages()}" step="1">
					[<a href="report_emp_page?page=${i-1 }">${i}</a>]&nbsp;&nbsp;
					</c:forEach>
					<c:if test="${empData.isLast()}">
					<a href="report_emp_page?page=${empData.getTotalPages()-1 }">Last</a>&nbsp;&nbsp;
					</c:if>
					<c:if test="${empData.hasNext()}">
					<a href="report_emp_page?page=${empData.getPageable().getPageNumber()+1 }">Next</a>&nbsp;&nbsp;
					</c:if>
					
				</c:when>
				<c:otherwise>
				<h1 style="color: red;text-align: center;">Employee Record Not found</h1>
				</c:otherwise>
			</c:choose>
			<h1 style="color: black; text-align: center;">Result is: ${empData}</h1>
			