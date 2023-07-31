<%@ page isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<center> <h1 style="color:blue; text-align:center;">Update Employee Page</h1></center>
<frm:form modelAttribute="emp">
<table  align="center" bgcolor="cyan" border="1">
<tr>
<td>EID</td>
<td>
<frm:input path="id" readonly="true"/>
</td>
</tr>
<tr>
<td>ENAME</td>
<td>
<frm:input path="name"/><frm:errors path="name"/>
</td>
</tr>
<tr>
<td>EDESG</td>
<td>
<frm:select path="desg"/><frm:errors path="desg"/>
<frm:options items="${desginfo}"/>
</td>
</tr>
<tr>
<td>ESAL</td>
<td>
<frm:input path="sal"/><frm:errors path="sal"/>
</td>
</tr>
<tr>
<td>ESTATUS</td>
<td>
<frm:input path="status"/><frm:errors path="status"/>
</td>
</tr>
<tr>
<td>
<input type="submit" value="update_employee">
</td>
<td>
<input type="reset" value="reset">
</td>
</tr>
</table>
</frm:form>
