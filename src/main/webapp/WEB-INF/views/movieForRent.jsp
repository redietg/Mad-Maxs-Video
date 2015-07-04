
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie List</title>
                 <link href="resources/style.css" rel="stylesheet" type="text/css" />

</head>
<body>
    
     <div>
            <a href="j_spring_security_logout">logout</a> | &nbsp;&nbsp;&nbsp; 
            <a href="<c:url value="/index" />">Home</a> | &nbsp;&nbsp;&nbsp;
            <a href="<c:url value="/addCustomer" />">Register</a> | &nbsp; &nbsp; &nbsp; 
            <a href="<c:url value="/getMovie" />">Movie</a> | &nbsp; &nbsp; &nbsp;
        </div>
    
    <form:form modelAttribute="movies" action="getMovie" method="POST">
        Search By Title : <form:input path="title"/><button>Search</button>
    </form:form>
<h1>${Notfound}</h1>
<div id="global">
<table border="0" width=550px>
<c:forEach var="movie" items="${listOfMovies}" varStatus="counter">
<tr>
<td><img src="<c:url value="/resources/indiana.jpg"></c:url>"/></td>
 <td>
    
 Title :
 <c:out value="${movie.title}"></c:out><br />
 Genre : 
 <c:out value="${movie.genere}"></c:out> <br />
 
 Release Year:
 <c:out value="${movie.releaseYear }"></c:out> <br />
 Description :
 <c:out value="${movie.description }"></c:out>
 
<spring:url value="/paymentForm"  var="movieId" >
   				<spring:param name="id" value="${movie.id}" />
   				<spring:param name="price" value="${movie.rentalPrice}" />
   				
 		</spring:url>
</td>
 <td>Total cost :$ ${movie.rentalPrice } <br /><a href="${movieId}">Rent</a></td>
</tr>
</c:forEach>
</table>
 </div>
</body>
</html>