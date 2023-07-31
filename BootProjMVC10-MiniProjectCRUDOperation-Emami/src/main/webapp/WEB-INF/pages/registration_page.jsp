<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<center> <h1 style="color:blue; text-align:center;">Registration Page</h1></center>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />
<frm:form modelAttribute="emp">
<table  class="table table-dark">
<tr>
<td>ENAME</td>
<td>
<frm:input path="name"/><frm:errors path="name" />
</td>
</tr>
<tr>
<td>EDESG</td>
<td>
<frm:input path="desg"/><frm:errors path="desg" />
</td>
</tr>
<tr>
<td>ESAL</td>
<td>
<frm:input path="sal"/><frm:errors path="sal" />
</td>
</tr>
<tr>
<td>ESTATUS</td>
<td>
<frm:input path="status"/><frm:errors path="status" />
</td>
</tr>
<tr>
<td>
<input type="submit" value="submit">
</td>
<td>
<input type="reset" value="reset">
</td>
</tr>
</table>
</frm:form>
