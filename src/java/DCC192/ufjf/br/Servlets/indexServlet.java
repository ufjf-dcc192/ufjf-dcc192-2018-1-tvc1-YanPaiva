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
@WebServlet(name = "indexServlet", urlPatterns = {"/index.html", "/cadastro.html"})
public class indexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if ("/index.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/index.jsp");
            despachante.forward(request, response);

        } else if ("/cadastro.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/cadastro.jsp");
            despachante.forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ComunidadeAcademica.getInstances();
        Intercambistas.getInstances();
        Pessoas p = new Pessoas();
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/login.jsp");
        String nome = request.getParameter("nomeUsuario");
        String senha = request.getParameter("senhaUsuario");
        String dataInicio = request.getParameter("dataInicial");
        String dataFinal = request.getParameter("dataFinal");
        boolean ehDaComunidade;
        if ("ON".equals(request.getParameter("checkComunidade"))) {
            ehDaComunidade = false;
            p.setNome(nome);
            p.setSenha(senha);
            p.setEhComunidade(ehDaComunidade);
            p.setDataDisponivelInicio(dataInicio);
            p.setDataDisponivelTermino(dataInicio);
            Intercambistas.getInstances().add(p);
        } else {
            ehDaComunidade = true;
            p.setNome(nome);
            p.setSenha(senha);
            p.setEhComunidade(ehDaComunidade);
            p.setDataDisponivelInicio(dataInicio);
            p.setDataDisponivelTermino(dataInicio);
            ComunidadeAcademica.getInstances().add(p);       
        }
        
        despachante.forward(request, response);

    }

}
