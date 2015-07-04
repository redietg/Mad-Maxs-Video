<%-- 
    Document   : index
    Created on : Apr 20, 2015, 4:36:54 PM
    Author     : Rediet Girma


--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Home Page</title>
        <link href="resources/style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div id="main">
            <h1>Welcome to Mad Max Video Rental </h1>
            Current Locale : ${pageContext.response.locale}
            <br><br>

            <a href="<c:url value="/login" />">LogIn</a>  | &nbsp; &nbsp; &nbsp; 

            <a href="<c:url value="/addCustomer" />">Register</a> | &nbsp; &nbsp; &nbsp; 

            <a href="<c:url value="/getMovie" />">Movie</a> | &nbsp; &nbsp; &nbsp; 

             <td><a href="<c:url value="/login" />">Manage|</a></td>

             <sec:authorize url="/customers" >
                <a href="<c:url value="/customers" />">Customers</a> 
            </sec:authorize>| &nbsp; &nbsp; &nbsp;
             <sec:authorize url="/addMovie" >
                 <a href="<c:url value="/addMovie" />">Add Movie</a>
             </sec:authorize> | &nbsp; &nbsp; &nbsp; 
                   <sec:authorize url="/addMovie" >
          <a href="<c:url value="/deletep" />">Delete Movie</a> 
                   </sec:authorize>| &nbsp; &nbsp; &nbsp; 
            Language : <a href="?language=en">English</a>|<a href="?language=fr">French</a>
        </div>

        <div>
            <p>
                <spring:message code="index.message" text="default text" /> </p>
        </div>

        <div id="pic">
            <table>
                <tr>
                    <td><img src="<c:url value="/resources/indiana.jpg"></c:url>"/></td>
                    <td><img src="<c:url value="/resources/friends.jpg"></c:url>"/></td>
                    <td><img src="<c:url value="/resources/Avengers.jpg"></c:url>"/></td>
                    </tr>
                    <tr>
                        <td><img src="<c:url value="/resources/dispicable.jpg"></c:url>"/></td>
                    <td><img src="<c:url value="/resources/fast.jpg"></c:url>"/></td>  
                    <td><img src="<c:url value="/resources/hunger.jpg"></c:url>"/></td>
                </tr>

            </table>
        </div>


    </body>
</html>
