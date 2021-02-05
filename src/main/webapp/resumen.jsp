<%-- 
    Document   : pueblos
    Created on : 25-ene-2021, 21:17:32
    Author     : DAW2-PROFESOR
--%>

<%@page import="Modelo.Alumno"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>

<%--@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mensaje a alumnos</h1>
        <% 
            String grupoActivo = ( String ) request.getAttribute("grupo");
            ArrayList<Alumno> alumnos = ( ArrayList<Alumno> ) request.getAttribute("alumnosSeleccionados");
         %>
         Grupo Seleccionado: <%=grupoActivo%> <br>
       

        
        <table border="1">
         <% for ( Alumno al: alumnos) { %>
           <tr>
               <td>
                   <%=al.getNombre() %>
               </td>
               <td>
                  <%=al.getApellidos()  %>
               </td>
               <td>
                  <%=al.getEmail()  %>
               </td>
           </tr>          
            <% } %>
          </table>
          Mensaje: <textarea cols="50" rows="10"></textarea>
          <p><button>Enviar</button></p>
          
    </body>
</html>
