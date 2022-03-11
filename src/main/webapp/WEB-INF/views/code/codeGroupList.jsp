<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<form method="get" action="/">
회원 이름 : <input type="text" name="">
<input type="submit" name="search">

	<c:choose>
		<c:when test="${fn:length(list) eq0 }">
			<tr>
				<td class="text-center" colspan="9">There is no data!</td>			
			</tr>	
		</c:when>
	<c:otherwise>
		<c:forEach items="${list}" var="item" varStatus="status">
		<c:out value="${item.ifcgSeq}"/> | <a href="/infra/code/codeGroupView?ifcgSeq=<c:out value="${item.ifcgSeq}"/>">
		<c:out value=${item.ifchName}"/></a> | <c:out value="${item.ifcgDelNy}"/>

		</c:forEach>
	</c:otherwise>
	
	</c:choose>




</form>