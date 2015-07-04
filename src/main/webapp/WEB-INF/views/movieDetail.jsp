<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">@import url("<c:url value="/css/car.css"/>");</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie Detail</title>
                 <link href="resources/style.css" rel="stylesheet" type="text/css" />

</head>
<body>
<div class="global">


 <div>
            <a href="j_spring_security_logout">logout</a> | &nbsp;&nbsp;&nbsp; 
            <a href="<c:url value="/index" />">Home</a> | &nbsp;&nbsp;&nbsp;
            <a href="<c:url value="/addCustomer" />">Register</a> | &nbsp; &nbsp; &nbsp; 
            <a href="<c:url value="/getMovie" />">Movie</a> | &nbsp; &nbsp; &nbsp;
        </div>
            
           <h1>successfully added</h1> 
<form:form modelAttribute="movies" action="addMovie" method="get">
<p>
  Title: ${movies.title } 
</p>
<p>
  Gener : ${movies.genere }
</p>
  Description : $ ${movies.description }
  
  </p>
  <p>
  Rental price : ${movies.rentalPrice }
  </p>
  <p>
  Sale Price : ${movies.salePrice}
  </p>
  <p>
  Release Year : ${movies.releaseYear }
  </p>
  <p>
  Number in Stock : ${movies.numberInStock }
  </p>
  
 <button>Add More Movies </button> 
 </form:form>
 

</div>
</body>
</html>