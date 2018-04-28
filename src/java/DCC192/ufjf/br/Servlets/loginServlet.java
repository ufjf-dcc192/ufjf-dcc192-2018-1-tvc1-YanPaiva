/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC192.ufjf.br.Servlets;

import DCC192.ufjf.br.dados.ComunidadeAcademica;
import DCC192.ufjf.br.dados.Intercambistas;
import DCC192.ufjf.br.dados.Pessoas;
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
@WebServlet(name = "loginServlet", urlPatterns = {"/login.html"})
public class loginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if ("/login.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/login.jsp");
            despachante.forward(request, response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user =request.getParameter("usuario");
        String pass = request.getParameter("senha");
        ComunidadeAcademica.getInstances();
        Intercambistas.getInstances();
        if(ComunidadeAcademica.verificaSeCadastrado(user, pass) !=null){
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/logado.jsp");
            request.setAttribute("pessoa", ComunidadeAcademica.verificaSeCadastrado(user, pass));
            despachante.forward(request, response);

        }else if(Intercambistas.verificaSeCadastrado(user, pass) !=null){
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/logado.jsp");
            request.setAttribute("pessoa", Intercambistas.verificaSeCadastrado(user, pass));
            despachante.forward(request, response);

        }else{
            response.sendRedirect("login.html");
        }
    }
    
}
