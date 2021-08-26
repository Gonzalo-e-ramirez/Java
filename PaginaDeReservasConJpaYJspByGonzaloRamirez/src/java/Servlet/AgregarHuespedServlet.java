
package Servlet;

import Logica.Huesped;
import Logica.Reserva;
import Persistencia.ControladoraPersistenciaGeneral;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "AgregarHuespedServlet", urlPatterns = {"/AgregarHuespedServlet"})
public class AgregarHuespedServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
       String nombre = request.getParameter("nombre");
       String apellido= request.getParameter("apellido");
       String dni = request.getParameter("dni");
       String fechaNac = request.getParameter("fechaNac"); //cambiar a date
       String direccion= request.getParameter("direccion");
       String profesion= request.getParameter("profesion");
       
        int dniHuesped = Integer.parseInt(dni);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date fecha = new Date();
        try {
            fecha = formato.parse(fechaNac);
        } catch (ParseException ex) {
            Logger.getLogger(AgregarEmpleadoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<Reserva> lista = null;
        Huesped huesped = new Huesped(dniHuesped, nombre, apellido, fecha, direccion, profesion, lista);
        ControladoraPersistenciaGeneral nuevo = new ControladoraPersistenciaGeneral();
        nuevo.crearHuesped(huesped);
            

       
       response.sendRedirect("Home.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
