<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script lang="javascript" src="js/validation.js"></script>

<frm:form modelAttribute="emp" onsubmit="return doValidation(this)">
<table align="center" bgcolor="cyan" border="1">

<tr>
<td>EMPNO</td>
<td><frm:input path="empno" readonly="true"/>
</td>
</tr>
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
<td><frm:select path="deptno">
<frm:options items="${deptNoInfo}"/>
</frm:select><span id="deptnoErr"></span>
</td>
</tr>
<tr>
<td><input type="submit" value="update" /></td>
<td><input type="reset" value="reset" /></td>
</tr>
</table>
<frm:hidden path="vflag"/>
</frm:form>
