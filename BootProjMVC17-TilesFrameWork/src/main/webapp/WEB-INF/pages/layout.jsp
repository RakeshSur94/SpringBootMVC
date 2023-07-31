<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<head>
<title><tiles:insertAttribute name="title"/></title>
</head>
<table border="1"  height="100%">
<tr bgcolor="orange" height="30%">
<td colspan="3"><tiles:insertAttribute name="header"/></td>
</tr>
<tr bgcolor="cyan" height="60%">
<td width="30%"><tiles:insertAttribute name="menu"/></td>
<td width="40%"><tiles:insertAttribute name="body"/></td>
<td width="30%"><tiles:insertAttribute name="adds"/></td>
</tr>
<tr bgcolor="green" height="10%">
<td colspan="3"><tiles:insertAttribute name="footer"/></td>
</tr>
</table>
