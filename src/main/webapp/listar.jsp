<%-- 
    Document   : listarUser
    Created on : 2/09/2023, 5:57:26 p. m.
    Author     : Diego A Cuenca
--%>


<%@page import="co.edu.sena.wbrecepcioncfim.logica.User"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de Users</h1>

        <%
            List<User> estudiantes = (List) request.getSession().getAttribute("listaUsers");
            int cont = 1;
            for (User e : estudiantes) {

        %>

        

        
        <p><b>usuario Numero:<%=cont%> </b></p>
        
        <p><%=e%> </p>

        <%cont=cont+1;%> 
        
        <% }%>

    </body>
</html>