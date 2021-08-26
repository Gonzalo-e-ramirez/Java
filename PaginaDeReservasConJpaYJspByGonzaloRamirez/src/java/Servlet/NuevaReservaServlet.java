
package Servlet;

import Logica.ControladoraGeneral;
import Logica.Empleado;
import Logica.Habitacion;
import Logica.Huesped;
import Logica.Reserva;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "NuevaReservaServlet", urlPatterns = {"/NuevaReservaServlet"})
public class NuevaReservaServlet extends HttpServlet {


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
        ControladoraGeneral control = new ControladoraGeneral();
        
        String ingreso = request.getParameter("ingreso");
        String egreso = request.getParameter("egreso");
        String tipo = request.getParameter("tipo");
        String piso = request.getParameter("piso");
        String dniHesped = request.getParameter("dniH");
        String dniEmpleado = request.getParameter("dniE");
        
        ControladoraGeneral nuevo = new ControladoraGeneral();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaingreso = new Date();
        Date fechaegreso = new Date();
        int pisoHabit = Integer.parseInt(piso);
        int dniH = Integer.parseInt(dniHesped);
        int dniE = Integer.parseInt(dniEmpleado);
        if(nuevo.VerificarHuesped(dniH)){
        try {
            fechaingreso = formato.parse(ingreso);
            fechaegreso = formato.parse(egreso);
        } catch (ParseException ex) {
            Logger.getLogger(NuevaReservaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Reserva reser = new Reserva(fechaingreso, fechaegreso, dniE, dniH);
        List<Reserva> lista = new ArrayList<Reserva>();
        lista.add(reser);
        Habitacion habit = new Habitacion(pisoHabit, tipo, lista);
        Huesped h1=new Huesped();
        Empleado e1=new Empleado();
        h1.agregarReserva(reser);
        e1.agregarReserva(reser);
       
        
        control.newHabitacion(habit);
        control.newReserva(reser);
        }
        response.sendRedirect("Home.jsp");
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
