package servlet;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "ServletOne", urlPatterns = "/ServletOne")
public class ServletOne extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().println("Upload  GitHub Test");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
