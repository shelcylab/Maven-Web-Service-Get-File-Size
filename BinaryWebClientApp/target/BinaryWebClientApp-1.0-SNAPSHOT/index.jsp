<%-- 
    Document   : index
    Created on : 2 Mar, 2021, 10:05:08 PM
    Author     : shelc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        	<form name="Upload" action="FileHandlerServ" method="post" enctype="multipart/form-data">
		<input type="file" name="file" />
		<input type="submit" value="Upload" />
	</form>

    </body>
</html>
