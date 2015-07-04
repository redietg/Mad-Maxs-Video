<%-- 
    Document   : customerList
    Created on : Apr 20, 2015, 5:00:04 PM
    Author     : Rediet Girma
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer List Page</title>
            <link href="resources/style.css" rel="stylesheet" type="text/css" />

    </head>
    <body>
       <h1>Customers Currently in the Registered</h1>
       <div>
            <a href="j_spring_security_logout">logout</a> | &nbsp;&nbsp;&nbsp; 
            <a href="<c:url value="/index" />">Home</a> | &nbsp;&nbsp;&nbsp;
            <a href="<c:url value="/addCustomer" />">Register</a> | &nbsp; &nbsp; &nbsp; 
            <a href="<c:url value="/getMovie" />">Movie</a> | &nbsp; &nbsp; &nbsp;
        </div>
        <table border="1" style="width:100%; border-collapse:collapse; padding:5px;
              " >
            <tr><td>First Name</td><td>Last Name</td> <td>Gender</td><td>Member Id</td><td>Password</td><td>Role</td><td>Manage</td></tr>
           <c:forEach var="customer" items="${customers}">
               <tr>
                    <td>${customer.firstname}</td>
                    <td>${customer.lastname}</td>
                    <td>${customer.gender}</td>
                    <td>${customer.memberId}</td>
                    <td>${customer.password}</td>
                    <td>${customer.role}</td>
                   
                        <td><a href="customer/${customer.id}"> Manage Customer</a></td>
                       <sec:authorize access="hasRole('ROLE_ADMIN')" >
                       </sec:authorize>  
                </tr>
            </c:forEach>
        </table>
         
      
        
    </body>
</html>
