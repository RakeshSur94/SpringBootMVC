<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />

<frm:form modelAttribute="cust">
<table class="table table-bordered table-dark">
<tr>
<td>customer no::</td>
<td>
<frm:input path="cid"/>
</td>
</tr>
<tr>
<td>customer name::</td>
<td>
<frm:input path="cname"/>
</td>
</tr>
<tr>
<td>customer dateOfBirth ::</td>
<td>
<frm:input path="doj" type="date"/>
</td>
</tr>
<tr>
<td>customer dateOfJoining::</td>
<td>
<frm:input path="dob"  type="date"/>
</td>
</tr>
<tr>
<td>customer dateOfJoining::</td>
<td>
<frm:input path="tob"  type="time"/>
</td>
</tr>
<tr>
<td>customer dateOfPurchage::</td>
<td>
<frm:input path="dop"  type="datetime-local"/>
</td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
</tr>

</table>


</frm:form>
