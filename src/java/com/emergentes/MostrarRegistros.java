
package com.emergentes;

import com.emergentes.MainServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "MostrarRegistros", urlPatterns = {"/MostrarRegistros"})
public class MostrarRegistros extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>");
        html.append("<html>");
        html.append("<head>");
        html.append("<title>Tabla de Registros</title>");
        html.append("</head>");
        html.append("<body>");
        html.append("<div style=\"border: 1px solid black; padding: 20px; width: 400px; margin: 0 auto; text-align: center;\">");
        html.append("<h2>Primer Parcial TEM-742</h2>");
        html.append("<ul style=\"list-style: none; padding: 0;\">");
        html.append("<li>Nombre: <strong>Rodrigo Chuquichambi Huanca</strong></li>");
        html.append("<li>Carnet: <strong>12574149</strong></li>");
        html.append(" </ul>");
        html.append("</div>");
        html.append("<a href='index.jsp'>Nuevo</a>");
        html.append("<table border='1'>");
        html.append("<tr>");
        html.append("<th>ID</th>");
        html.append("<th>Nombre</th>");
        html.append("<th>Nota 1</th>");
        html.append("<th>Nota 2</th>");
        html.append("<th>Nota 3</th>");
        html.append("<th>Suma</th>");
        html.append("<th>Editar</th>");
        html.append("<th>Eliminar</th>");
        html.append("</tr>");
        for (Registro registro : MainServlet.registros) {
            html.append("<tr>");
            html.append("<td>").append(registro.getId()).append("</td>");
            html.append("<td>").append(registro.getNombre()).append("</td>");
            html.append("<td>").append(registro.getNota1()).append("</td>");
            html.append("<td>").append(registro.getNota2()).append("</td>");
            html.append("<td>").append(registro.getNota3()).append("</td>");
            html.append("<td>").append(registro.getSuma()).append("</td>");
            html.append("<td><a href=\"EditarRegistro?id=${registro.id}\">Editar</a></td>");
            html.append("<td><a href=\"EliminarRegistro?id=${registro.id}\">Eliminar</a></td>");
            html.append("</tr>");
        }
        html.append("</table>");
        html.append("<br>");
        html.append("</body>");
        html.append("</html>");

        response.getWriter().append(html.toString());
    }
    
    
}
