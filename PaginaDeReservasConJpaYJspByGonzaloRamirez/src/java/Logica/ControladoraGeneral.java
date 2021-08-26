
package Logica;

import Persistencia.ControladoraPersistenciaGeneral;
import java.util.Date;
import java.util.List;

public class ControladoraGeneral {
   private final ControladoraPersistenciaGeneral general = new ControladoraPersistenciaGeneral();
   
    
    public void newEmpleado(Empleado empleado){
        general.crearEmpleado(empleado);
    }
    
    public void newHuesped(Huesped huesped){
        general.crearHuesped(huesped);
    }
    
    public void newHabitacion(Habitacion habit){
        general.crearHabitacion(habit);
    }
    
    public void newReserva(Reserva reser){
        general.crearReserva(reser);
    }
    
    public List<Huesped> traerHuespedes(){
        
        return general.traerHuespedes();
    }
    
    public List<Reserva> traerReservas(){
        return general.traerReservas();
    }
    
   public boolean dentroDelRango(Date fecha, Date inicio, Date finaldat) {
   
       return fecha.before(inicio) && fecha.after(finaldat);
    }
    public boolean VerificarHuesped(int dni){
     
        List<Huesped> listadoHuesp = general.traerHuespedes();
    
        for(Huesped huesp : listadoHuesp){
            if(listadoHuesp != null){
                if(dni==huesp.getDni()){
                    return true;
                }
            }
        }   
        return false;
    }  
    
    public boolean verificarCantidadPersonas(String tipo, int cantidad){
        if(tipo.equals("single")){
            if(cantidad==1){
                return true;
            }else{
                return false;
            }
        }
        if(tipo.equals("doble")){
            if(cantidad<=2){
                return true;
            }else{
                return false;
            }
        }
        if(tipo.equals("triple")){
            if(cantidad<=3){
                return true;
            }else{
                return false;
            }
        }
        if(tipo.equals("multiple")){
            if(cantidad<=5){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
   
   
}
