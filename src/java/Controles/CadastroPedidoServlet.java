package Controles;

import DAOs.DAOPedido;
import Entidade.Pedido;
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
@WebServlet(name = "CadastroPedido", urlPatterns = {"/CadastroPedido"})
public class CadastroPedidoServlet extends HttpServlet {

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
            out.println("<title>Servlet CadastroPedido</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadastroPedido at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            Integer idPedido = Integer.valueOf(request.getParameter("IdPedido"));
            //String data = request.getParameter("DataPedido");
            Integer funcionarioId = Integer.valueOf(request.getParameter("funcionarioId"));
            String clienteRg = request.getParameter("clienteId");
           
            
            
            DAOPedido daoPedido = new DAOPedido();
            Pedido pedido = new Pedido();
            
            pedido.setIdPedido(idPedido);
            pedido.setClienteRg(clienteRg);
            pedido.setFuncionarioId(funcionarioId);
            //pedido.setDataPedido(dataPedido);
            
            daoPedido.inserir(pedido);
        }
    }

}