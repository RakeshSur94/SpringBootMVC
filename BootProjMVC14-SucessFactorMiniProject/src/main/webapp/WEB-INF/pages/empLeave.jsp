<%@ page language="java" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />

<frm:form modelAttribute="emp">
<table class="table table-bordered table-dark">
<tr>
<td>EMPID</td>
<td>
<frm:select path="empid">
<frm:options items="${empidinfo}"/>
</frm:select>
</td>
</tr>
<tr>
<td>APL</td>
<td><frm:input path="empALP"/></td>
</tr>
<tr>
<td>StartingLeave</td>
<td><frm:input path="leaveTakenDate" type="date" /></td>
</tr>
<tr>
<td>EndingLeave</td>
<td><frm:input path="leaveEndDate" type="date" /></td>
</tr>
<tr>
<td>TotalDaysOfLeave</td>
<td><frm:input path="totalDayOfLeave" /></td>
</tr>
<tr>
<td><input type="submit" value="register"/></td>
<td><input type="reset" value="reset"/></td>
</tr>
</table>



</frm:form>
