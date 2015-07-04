<%-- 
    Document   : 404
    Created on : Apr 20, 2015, 5:53:59 PM
    Author     : Rediet Girma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <title>${e.resourceType } not Found</title>
</head>
<body>
	<p>I'm sorry, but the ${e.resourceType } you were looking for (id: ${e.resourceId}) 
	do<es not seem to exist.<p />
	
	<p>Please use your back button and refresh the previous page before trying again.</p>
	
	<p>If this problem continues to persist please contact your local system administrator.</p>
    </body>
</html>
