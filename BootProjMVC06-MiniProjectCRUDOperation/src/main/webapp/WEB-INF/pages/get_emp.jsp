<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<frm:form modelAttribute ="emp">
<table align="center" bgcolor="cyan" border="1">
<tr>
<td>EmpNo</td>
<td><frm:input path="empno"/>
</td>
</tr>
<tr>
<td><input type="submit" value="submit"/>
</tr>

</table>

</frm:form>









