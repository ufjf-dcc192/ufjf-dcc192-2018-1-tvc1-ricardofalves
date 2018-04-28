package Servlet;

import Classe.Hospedagem;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "IndexServlet", urlPatterns = {"/hospedagem.html", "/lista-hospedagem.html"})
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/hospedagem.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/hospedagem.jsp");
            despachante.forward(request, response);
        } else if ("/lista-hospedagem.html".equals(request.getServletPath())) {            
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/lista-hospedagem.jsp");
            request.setAttribute("hospedagens", Hospedagem.getListaHospedagens());
            despachante.forward(request, response);
            
        }
   }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/hospedagem.html".equals(request.getServletPath())) {
            if (request.getParameter("nome") != "" && request.getParameter("endereco") != "" && request.getParameter("email" )!= "") {
                String nome = request.getParameter("nome");
                String email = request.getParameter("email");
                String endereco = request.getParameter("endereco");
                String telefone = request.getParameter("telefone");
                String cargo = request.getParameter("cargo");
                Hospedagem hospedagem = new Hospedagem(nome, email, telefone, endereco, cargo);
                Hospedagem.setListaHospedagens(hospedagem);
                response.sendRedirect("lista-hospedagem.html");
            }
               
        }
    }
}
