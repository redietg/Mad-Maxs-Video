<%-- 
    Document   : register
    Created on : Apr 20, 2015, 4:42:07 PM
    Author     : Rediet Girma
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <link href="resources/style.css" rel="stylesheet" type="text/css" />

    </head>
    <body>
        <h1>Add Movie Page</h1>
        <div>
            <a href="j_spring_security_logout">logout</a> | &nbsp;&nbsp;&nbsp; 
            <a href="<c:url value="/index" />">Home</a> | &nbsp;&nbsp;&nbsp;
            <a href="<c:url value="/addCustomer" />">Register</a> | &nbsp; &nbsp; &nbsp; 
            <a href="<c:url value="/getMovie" />">Movie</a> | &nbsp; &nbsp; &nbsp;
        </div>

        <form:form modelAttribute="movies" method="post" action="addMovie" enctype="multipart/form-data">
            <fieldset>
                <legend>Add Movie</legend>
                <form:errors path="*" cssStyle="color : red;" />
                <p>
                    <label for="title">Title: </label>
                    <form:input id="title" path="title" />
                    <form:errors path="title" cssStyle="color : red;" />
                </p>
                <p>
                    <label for="lastname">Genere: </label>
                    <form:select path="genere">
                        <form:option value="compact"> Action</form:option>
                        <form:option value="mid size">Comedy</form:option>
                        <form:option value="Economy"> Family</form:option>
                        <form:option value="Standard">Horror</form:option>
                        <form:option value="Full Size"> Romance</form:option>
                        <form:option value="Full Size">Sci-Fic</form:option>
                        <form:option value="Full Size"> War</form:option>
                    </form:select>
                </p> 
                <p> 
                    <label for="description">Description: </label>
                    <form:input id="description" path="description" />
                    <form:errors path="description" cssStyle="color : red;" />  
                </p>
                <p> 
                    <label for="numberInStock">Number In Stock : </label>
                    <form:input id="numberInStock" path="numberInStock" />
                    <form:errors path="numberInStock" cssStyle="color : red;" />  
                </p>
                <p> 
                    <label for="rentalPrice">Rental Price: </label>
                    <form:input id="rentalPrice" path="rentalPrice" />
                    <form:errors path="rentalPrice" cssStyle="color : red;" />  
                </p>
                <p> 
                    <label for="salePrice">Sale Price : </label>
                    <form:input id="salePrice" path="salePrice" />
                    <form:errors path="salePrice" cssStyle="color : red;" />  
                </p>
                <p> 
                    <label for="releaseYear">Release Year : </label>
                    <form:input id="releaseYear" path="releaseYear" />
                    <form:errors path="releaseYear" cssStyle="color : red;" />  
                </p>
                <p> 
                    <label for="image">Image: </label>
                     <form:input path="image" type="file"/>
                </p>
               <form:hidden path="id"/>
                
                <input type="submit" Value="Add Movie" />  <input type="reset" value="Clear">

            </fieldset>
        </form:form>

    </body>
</html>
