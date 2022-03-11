<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<form method="get" action="/infr/code/codeGroupList">
회원 이름 : <input type="text" name="shIfcgName">
<input type="submit" name="search">

<select name="shIfcgSeq">
	<option value=""> ::코드 그룹::
	<c:forEach items="${listCodeGroup}" var="item" varStatus="status"/>
	<option value="<c:out value="${item.ifchSeq}";"><c:out value="${item.ifcgName}"/>
		
</select>

<input type="submit" name="search">



	<c:choose>
		<c:when test="${fn:length(list) eq 0}">
			<tr>
				<td class="text-center" colspan="9">There is no data!</td>			
			</tr>	
		</c:when>
	<c:otherwise>
		<c:forEach items="${list}" var="item" varStatus="status">
		<c:out value="${item.ifcgSeq}"/> | <a href="/infra/code/codeGroupView?ifcgSeq=<c:out value="${item.ifcgSeq}"/>">

		</c:forEach>
	</c:otherwise>
	
	</c:choose>




</form>