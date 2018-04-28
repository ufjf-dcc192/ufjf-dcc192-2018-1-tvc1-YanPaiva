/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC192.ufjf.br.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YanNotebook
 */
@WebServlet(name = "indexServlet", urlPatterns = {"/index.html", "/cadastro.html"})
public class indexServlet extends HttpServlet {
       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
        if ("/index.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/index.jsp");
            despachante.forward(request, response);
      
        }else if("/cadastro.html".equals(request.getServletPath())){
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/cadastro.jsp");
            despachante.forward(request, response);
        }
        
        
        }
}

