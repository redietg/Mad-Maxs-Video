<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
            <link href="resources/style.css" rel="stylesheet" type="text/css" />

</head>
<body>
     <div>
            <a href="j_spring_security_logout">logout</a> | &nbsp;&nbsp;&nbsp; 
            <a href="<c:url value="/index" />">Home</a> | &nbsp;&nbsp;&nbsp;
            <a href="<c:url value="/addCustomer" />">Register</a> | &nbsp; &nbsp; &nbsp; 
            <a href="<c:url value="/getMovie" />">Movie</a> | &nbsp; &nbsp; &nbsp;
        </div>
<div >
    
<form:form modelAttribute="paymentinfo"  action= "thankyoupage" method="POST">
    <fieldset>
        <legend>Payment Page</legend>
       
    <div class="personalInfo">
   
      <div id="label">
        <p> <label for="firstName">first Name </label> 
        <form:input class="righter"  path="firstName"/> 
        </p>
        <p> <label for="lastName">last Name </label> 
        <form:input class="righter"  id="lastName" path="lastName"/> 
        </p>
        <p> <label for="street">street </label>  
        <form:input class="righter" path="street"/> </p>
        <p> <label for="city">city </label>   
         <form:input class="righter" path="city"/>   </p>
        <p> <label for="state">state </label>      
        <form:input class="righter" path="state"/> 
        </p>
        <p> <label for="zip"  >zip  </label>  
        <form:input class="righter" path="zip"/>  </p>
   
       Payment method : <form:select path="paymentMethod" >
               <form:option value="cardType" lable="CardType"/>
               <form:option value="visa" > Visa</form:option>
               <form:option value="masterCard"> masterCard</form:option>
               <form:option value="americanExpress" label="AmericanExpress" selected="selected"/>
             </form:select> 
      
    
        <p>CardNumber : <form:input path="cardNumber"/> </p>
      <p> ExpDate  : <form:input path="expDate"/></p>
       <p> ccv : <form:input path="ccv"/></p> 
       <p>YourTotal: <form:input path="total" /></p> </br>
     <form:button id="confirmbtn"> Confirm-Payment</form:button></p></br>
    
    </div>
    </div>
    
    </fieldset>
</form:form>
</div>
</body>
</html>