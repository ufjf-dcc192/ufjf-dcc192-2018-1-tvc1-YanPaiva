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
@WebServlet(name = "logadoServlet", urlPatterns = {"/logado.html"})
public class logadoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        testaUsuario(request, response);

    }

    private void testaUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/logado.jsp");
        Pessoas novaPessoa = new Pessoas();
        novaPessoa = (Pessoas) request.getAttribute("pessoa");
        ComunidadeAcademica.getInstances();
        Intercambistas.getInstances();
        if (ComunidadeAcademica.getInstances().contains(novaPessoa)) {

            request.setAttribute("pessoa", novaPessoa);
            request.setAttribute("match", Intercambistas.match(novaPessoa));
            despachante.forward(request, response);

        } else {
            request.setAttribute("pessoa", novaPessoa);
            request.setAttribute("match", ComunidadeAcademica.match(novaPessoa));
            despachante.forward(request, response);

        }

    }

}
