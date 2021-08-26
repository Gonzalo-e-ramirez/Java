
package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class Huesped extends Persona implements Serializable{
    @Basic
    private String profesion;
    @OneToMany
    private List<Reserva> reservasRealizadas;

    public Huesped( int dni, String nombre, String apellido, Date fechaNacimiento, String direccion, String profesion, List<Reserva> reservasRealizadas) {
        super(dni, nombre, apellido, fechaNacimiento, direccion);
        this.profesion = profesion;
        this.reservasRealizadas=reservasRealizadas;
    }
    
       public Huesped() {
        super(0, null, null, null, null);
        this.profesion=null;
         reservasRealizadas = new ArrayList<Reserva>();
       }
       
       public void agregarReserva( Reserva reserva){
           this.reservasRealizadas.add(reserva);
       }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
       
       
    }
    
    
