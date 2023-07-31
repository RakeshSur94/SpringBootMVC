<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<center> <h1 style="color:blue; text-align:center;">Registration Page</h1></center>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />
<frm:form modelAttribute="js" enctype="multipart/form-data">
<table class="table table-dark">
<tr>
<td>JOBSEEKER NAME</td>
<td>
<frm:input path="jsName"/>
</td>
</tr>
<tr>
<td>JOBSEEKER ADDRESS</td>
<td>
<frm:input path="jsAddrs"/>
</td>
</tr>
<tr>
<td>UPLOAD RESUME</td>
<td>
<frm:input type="file" path="resume"/>
</td>
</tr>
<tr>
<td>UPLOAD PHOTO</td>
<td>
<frm:input type="file" path="photo"/>
</td>
</tr>
<tr>
<td>
<input type="submit" value="js_register">
</td>
<td>
<input type="reset" value="reset">
</td>
</tr>
</table>
</frm:form>