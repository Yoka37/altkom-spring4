<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/pages/layout/head.jsp"%>

<form:form modelAttribute="product"
action ="${contextPath }/product/save">
	<form:input path="price"/>
	<button type="submit" value="Zapisz" class="btn btn-primary pull-right">Zapisz</button>
	
	<form:input path="name" />
	<form:input path="quantity" />
	
	
</form:form>

<%@ include file="/WEB-INF/pages/layout/footer.jsp"%>

