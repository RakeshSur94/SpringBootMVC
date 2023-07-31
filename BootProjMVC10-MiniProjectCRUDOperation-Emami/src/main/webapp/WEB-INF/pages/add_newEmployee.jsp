<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<center> <h1 style="color:blue; text-align:center;">Registration New Employee Page</h1></center>
<frm:form modelAttribute="emp">
<table  align="center" bgcolor="cyan" border="1">
<tr>
<td>ENAME</td>
<td>
<frm:input path="name"/>
</td>
</tr>
<tr>
<td>EDESG</td>
<td>
<frm:input path="desg"/>
</td>
</tr>
<tr>
<td>ESAL</td>
<td>
<frm:input path="sal"/>
</td>
</tr>
<tr>
<td>ESTATUS</td>
<td>
<frm:input path="status"/>
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
