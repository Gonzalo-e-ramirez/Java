
package Persistencia;

import Logica.Empleado;
import Logica.Habitacion;
import Logica.Huesped;
import Logica.Reserva;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistenciaGeneral {
    
    EmpleadoJpaController empleado = new EmpleadoJpaController();
    
    HuespedJpaController huesped = new HuespedJpaController();
    
    PersonaJpaController persona = new PersonaJpaController();
    
    ReservaJpaController reserva = new ReservaJpaController();
    
    HabitacionJpaController habitacion = new HabitacionJpaController();
    
    public void crearEmpleado(Empleado emp){
        try {
            this.empleado.create(emp);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistenciaGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void crearHuesped(Huesped hues){
        try {
            this.huesped.create(hues);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistenciaGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearReserva(Reserva reser){
        reserva.create(reser);
    }
    
    public void crearHabitacion(Habitacion habit){
        try {
            habitacion.create(habit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistenciaGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public List<Huesped> traerHuespedes(){
        
        return this.huesped.findHuespedEntities();
    }
    public List<Reserva> traerReservas(){
        
        return this.reserva.findReservaEntities();
    }
    
}
