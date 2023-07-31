<%@page isELIgnored="false" contentType="text/html; charset=UTF-8" import="java.util.*"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"prefix="c" %>
<h1 style="color: black;text-align: center"><sp:message code="home.title"/></h1>
<a href="register"><h1 style="color: black;text-align: center"><sp:message code="home.link"/></h1></a> 
<br>
<h1>current active locale is :: ${pageContext.response.locale}</h1>

<fmt:setLocale value="${pageContext.response.locale}"/>

<jsp:usebean id="dt" class="java.util.Date"/>
<fmt:formatDate var="fdt" value=${dt } type="date" dateStyle="FULL" />






<br><br>
<p align="center">
<a href="?lang=de_DE">German</a>&nbsp;&nbsp;
<a href="?lang=hi_IN">हिंदी</a>&nbsp;&nbsp;
<a href="?lang=or_IN">ଓଡିଆ</a>&nbsp;&nbsp;
<a href="?lang=en_US">English</a>
</p>