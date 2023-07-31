<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<link  rel="stylesheet"type="text/css" href="css/style.css"/>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />

<frm:form modelAttribute="emp">
<table class="table table-bordered table-dark">
<tr>
<td>EMPID</td>
<td><frm:input path="empid" readonly="true" /></td>
</tr>
<tr>
<tr>
<td>NAME</td>
<td><frm:input path="name" /><frm:errors path="name"  /></td>
</tr>
<tr>
<td>DOJ</td>
<td><frm:input path="doj" type="datetime-local" /><frm:errors path="doj"  /></td>
</tr>
<tr>
<td>DESG</td>
<td><frm:input path="desg" /><frm:errors path="desg"  /></td>
</tr>
<tr>
<td>SALARY</td>
<td><frm:input path="sal" /><frm:errors path="sal"  /></td>
</tr>
<tr>
<td>STATUS</td>
<td><frm:input path="status" /></td>
</tr>
<tr>
<td><input type="submit" value="UPDATE"/></td>
<td><input type="reset" value="reset"/></td>
</tr>
</table>



</frm:form>