
package Servlet;

import Logica.ControladoraUsuarios;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "UsuarioServlet", urlPatterns = {"/UsuarioServlet"})
public class UsuariosServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String usuario = request.getParameter("user");
       String clave= request.getParameter("pass");
       
       ControladoraUsuarios control = new ControladoraUsuarios();
       boolean autorizado = control.verificarUsuario(usuario, clave);
       if (autorizado ==true){
           HttpSession sesion = request.getSession(true);
           sesion.setAttribute("usuario", usuario);
           sesion.setAttribute("clave", clave);
           
           response.sendRedirect("Home.jsp");
           
       }else{
           response.sendRedirect("index.jsp");
       }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
