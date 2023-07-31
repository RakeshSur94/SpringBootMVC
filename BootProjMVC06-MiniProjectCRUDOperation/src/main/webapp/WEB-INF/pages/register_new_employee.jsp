<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<link rel="stylesheet" type="text/css" href="css/style.css">
<script lang="javascript" src="js/validation.js"></script>

<frm:form modelAttribute="emp" onsubmit="return doValidation(this)">
<table align="center" bgcolor="cyan" border="1">

<tr>
<td>ENAME</td>
<td><frm:input path="ename"/><frm:errors path="ename"/><span id="enameErr"></span>
</td>
</tr>
<tr>
<td>EJOB</td>
<td><frm:input path="job"/><frm:errors path="job"/><span id="jobErr"></span>
</td>
</tr>
<tr>
<td>ESAL</td>
<td><frm:input path="sal"/><frm:errors path="sal"/><span id="salErr"></span>
</td>
</tr>
<tr>
<td>EDEPTNO</td>
<td><frm:input path="deptno"/><frm:errors path="deptno"/><span id="deptnoErr"></span>
</td>
</tr>
<tr>
<td><input type="submit" value="submit" /></td>
<td><input type="reset" value="reset" /></td>
</tr>
</table>
<frm:hidden path="vflag"/>
<%-- <p style="color: red;text-align: center;">
<frm:errors path="*"/>
</p> --%>
</frm:form>




