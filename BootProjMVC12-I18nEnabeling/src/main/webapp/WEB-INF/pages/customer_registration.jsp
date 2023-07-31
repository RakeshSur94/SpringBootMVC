<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="sp" %>

<h1 style="color: black;text-align: center;"><sp:message code="cust.registration.title"/></h1>
<frm:form modelAttribute="cust">
<table  align="center" bgcolor="cyan" border="1">
<tr>
<td><sp:message code="cust.registration.name"/></td>
<td>
<frm:input path="cname"/>
</td>
</tr>
<tr>
<td><sp:message code="cust.registration.addrs"/></td>
<td>
<frm:input path="caddrs"/>
</td>
</tr>
<tr>
<td><sp:message code="cust.registration.billAmt"/></td>
<td>
<frm:input path="billAmount"/>
</td>
</tr>
<tr>
<td>
<input type="submit" value="<sp:message code="cust.btn.register"/>"/>
</td>
</tr>
</table>
</frm:form>
<br><br>
<p align="center">
<a href="?lang=de_DE">German</a>&nbsp;&nbsp;
<a href="?lang=hi_IN">हिंदी</a>&nbsp;&nbsp;
<a href="?lang=or_IN">ଓଡିଆ</a>&nbsp;&nbsp;
<a href="?lang=en_US">English</a>
</p>
