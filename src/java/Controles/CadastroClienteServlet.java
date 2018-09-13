package Controles;

import DAOs.DAOCliente;
import Entidade.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a1712004
 */
@WebServlet(name = "CadastroCliente", urlPatterns = {"/CadastroCliente"})
public class CadastroClienteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroCliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadastroCliente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            Integer rg = Integer.valueOf(request.getParameter("RGCliente"));
            String nome = request.getParameter("NomeCliente");
            String endereco = request.getParameter("Endereco");
            String email = request.getParameter("Email");
            String telefone = request.getParameter("Telefone");
            
            
            DAOCliente daoCliente = new DAOCliente();
            Cliente produto = new Cliente();
            
            produto.setRg(rg);
            produto.setNomeCliente(nome);
            produto.setEndereco(endereco);
            produto.setEmail(email);
            produto.setTelefone(telefone);
            
            daoCliente.inserir(produto);
        }
    }

}