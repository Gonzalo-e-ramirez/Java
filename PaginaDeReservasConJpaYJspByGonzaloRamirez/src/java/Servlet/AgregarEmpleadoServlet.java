/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.ControladoraGeneral;
import Logica.ControladoraUsuarios;
import Logica.Empleado;
import Logica.Reserva;
import Logica.Usuarios;
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


@WebServlet(name = "AgregarEmpleadoServlet", urlPatterns = {"/AgregarEmpleadoServlet"})
public class AgregarEmpleadoServlet extends HttpServlet {


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
       String fechaNac = request.getParameter("fechaNac");
       String direccion= request.getParameter("direccion");
       String cargo= request.getParameter("cargo");
       String user= request.getParameter("user");
       String clave= request.getParameter("clave");
       
       ControladoraGeneral nuevo = new ControladoraGeneral();
        int dniEmpleado = Integer.parseInt(dni);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date fecha = new Date();
        try {
            fecha = formato.parse(fechaNac);
        } catch (ParseException ex) {
            Logger.getLogger(AgregarEmpleadoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        ControladoraUsuarios login = new ControladoraUsuarios();
        Usuarios usuario = new Usuarios(dniEmpleado, user, clave);
        login.crearUsuario(usuario);
        List<Reserva> lista = null;
        Empleado empleado = new Empleado(dniEmpleado, nombre, apellido, fecha, direccion, cargo, usuario, lista );
        
        nuevo.newEmpleado(empleado);
            
       
       response.sendRedirect("Home.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
