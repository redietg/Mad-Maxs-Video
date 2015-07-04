<%-- 
    Document   : manageCustomer
    Created on : Apr 21, 2015, 9:09:15 PM
    Author     : Rediet Girma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Customer Page</title>
         <link href="resources/style.css" rel="stylesheet" type="text/css" />
     </head>
    <body>
        
         <div>
            <a href="j_spring_security_logout">logout</a> | &nbsp;&nbsp;&nbsp; 
            <a href="<c:url value="/index" />">Home</a> | &nbsp;&nbsp;&nbsp;
            <a href="<c:url value="/addCustomer" />">Register</a> | &nbsp; &nbsp; &nbsp; 
            <a href="<c:url value="/getMovie" />">Movie</a> | &nbsp; &nbsp; &nbsp;
        </div>
        
       <form:form modelAttribute="customer" method="post" action="../customer/${customer.id}">
           <form:hidden path="id"/>
           <fieldset>
			<legend>Modify Customer</legend>
 			<form:errors path="*" cssStyle="color : red;" />
			<p>
				<label for="firstname">First Name: </label>
				<form:input id="firstname" path="firstname" />
				<form:errors path="firstname" cssStyle="color : red;" />
			</p>
                        <p>
                               <label for="lastname">Last Name: </label>
			       <form:input id="lastname" path="lastname" />
			       <form:errors path="lastname" cssStyle="color : red;" /> 
                          </p> 
                        <p> 
                               <label for="gender">Gender: </label>
			       <form:input id="gender" path="gender" />
			       <form:errors path="gender" cssStyle="color : red;" />  
                       </p>
                      <p> 
                               <label for="memberId">Member Id : </label>
			       <form:input id="memberId" path="memberId" />
			       <form:errors path="memberId" cssStyle="color : red;" />  
                      </p>
                           <p> 
                               <label for="password">Password : </label>
			       <form:input id="password" path="password" />
			       <form:errors path="password" cssStyle="color : red;" />  
                           </p>
                           <p> 
                               <label for="email">Email : </label>
			       <form:input id="email" path="email" />
			       <form:errors path="email" cssStyle="color : red;" />  
                           </p>
                         <input type="submit" value="update"/>

                </fieldset>
       </form:form>
           
        <form action="delete?memberId=${customer.id}" method="post">
		<button type="submit">Delete</button>
        </form>
	 
                
	 
    </body>
</html>
