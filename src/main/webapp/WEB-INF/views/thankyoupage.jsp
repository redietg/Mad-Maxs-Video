<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <link href="resources/style.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
 <div>
            <a href="j_spring_security_logout">logout</a> | &nbsp;&nbsp;&nbsp; 
            <a href="<c:url value="/index" />">Home</a> | &nbsp;&nbsp;&nbsp;
            <a href="<c:url value="/addCustomer" />">Register</a> | &nbsp; &nbsp; &nbsp; 
            <a href="<c:url value="/getMovie" />">Movie</a> | &nbsp; &nbsp; &nbsp;
        </div>

<form:form modelAttribute="paymentinfo" action="/getMovie"  method="GET">
<fieldset>
<legend> Thank you </legend>

<div>

<p>If you have not done so, please register with us and get a 10% discount on your next service.</p> 
Registration also will allow you to rate your service provider.

</div>
<h3> Here is your Confirmation Receipt: </h3> 
   
      
      <div id="thankyoulabel">
        <p> <label for="firstName">first Name </label>${paymentinfo.firstName}</p>
        <p> <label for="lastName">last Name </label>  ${paymentinfo.lastName}  </p>
         
         <p> Your Total charge is :  ${paymentinfo.total}</p> 
     </div>


  </fieldset>       
</form:form>
</body>
</html>