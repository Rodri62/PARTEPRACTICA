<%@page import="java.util.ArrayList"%>
<%
    if (session.getAttribute("lista") == null) {
        // Inicializar una coleccion
        ArrayList<String> listAux = new ArrayList<String>();
        // Se guarda el atributo lista
        session.setAttribute("lista", listAux);
    }

    ArrayList<String> lista = (ArrayList<String>) session.getAttribute("lista");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <div style="border: 1px solid black; padding: 20px; width: 400px; margin: 0 auto; text-align: center;">
            <h2>Primer Parcial TEM-742</h2>
            <ul style="list-style: none; padding: 0;">
                <li>Nombre: <strong>Rodrigo Chuquichambi Huanca</strong></li>
                <li>Carnet: <strong>12574149</strong></li>
            </ul>
        </div>
        <h1 style="text-align: center;">Registo de calificaciones</h1> 
    <div style="margin: 0 auto; width: 400px; border: 1px solid black; padding: 20px;">    
         
        <form action="MainServlet" method="post" >
            Nombre: <input type="text" name="nombre" style="width: 330px;"><br> <br>  
            Nota 1: <input type="text" name="nota1" style="width: 150px;"><br> <br>  
            Nota 2: <input type="text" name="nota2" style="width: 150px;"><br> <br>  
            Nota 3: <input type="text" name="nota3" style="width: 150px;"><br> <br>  
            <input type="submit" value="Enviar">
        </form>
    </div>  
    </body>
</html>