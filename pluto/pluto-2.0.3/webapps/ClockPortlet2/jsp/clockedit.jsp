<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<portlet:actionURL var="changeCityURL">
	<portlet:param name="action" value="changeCity"/>
</portlet:actionURL>

<form action="${changeCityURL}" method="post">
	<select name="city">
		<c:forEach var="entry" items="${cities}">
			<option value="${entry.value}" <c:if test="${entry.value == city}">selected</c:if>>${entry.key}</option>
		</c:forEach>
	</select>
	<input type="submit" value="Change city"/>
</form>

<a href="<portlet:renderURL portletMode="view" windowState="normal"/>">-Home-</a>