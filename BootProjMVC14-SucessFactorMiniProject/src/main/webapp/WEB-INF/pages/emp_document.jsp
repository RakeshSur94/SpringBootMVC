<%@ page language="java" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />
<frm:form modelAttribute="emp" enctype="mulitpart/form-data">
<table class="table table-sm">
<tr>
<td>EMPID</td>
<td>
<frm:select path="empid">
<frm:options items="${empidinfo}"/>
</frm:select>
</td>
</tr>
<tr>
<td>NAME</td>
<td>
<frm:select path="name">
<frm:options items="${empnameinfo}"/>
</frm:select>
</td>
</tr>
<tr>
<td>IMAGE</td>
<td>
<frm:input type="file" path="imageFile"/>
</td>
</tr>
<tr>
<td>IMAGE</td>
<td>
<frm:input type="file" path="document"/>
</td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
<td><input type="reset" value="reset"></td>

</tr>
</table>




</frm:form>
