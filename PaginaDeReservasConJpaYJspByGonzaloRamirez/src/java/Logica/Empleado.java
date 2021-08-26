
package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Empleado extends Persona implements Serializable{
    @Basic
    private String cargo;
    
    @OneToOne
    private Usuarios login;
    
    @OneToMany
    private List<Reserva> ocupada;

    public Empleado(int dni, String nombre, String apellido, Date fechaNacimiento, String direccion, String cargo, Usuarios user,List<Reserva> ocupada) {
        super(dni, nombre, apellido, fechaNacimiento, direccion);
        this.cargo = cargo;
        this.login = user;
        this.ocupada=ocupada;
    }

    public Empleado() {
        super(0, null, null, null, null);
        this.cargo=null;
        this.login = null;
        this.ocupada = new ArrayList<Reserva>();;
    }
    
    public void agregarReserva( Reserva reserva){
       this.ocupada.add(reserva);
     }
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Usuarios getLogin() {
        return login;
    }

    public void setLogin(Usuarios login) {
        this.login = login;
    }

    public List<Reserva> getOcupada() {
        return ocupada;
    }

    public void setOcupada(List<Reserva> ocupada) {
        this.ocupada = ocupada;
    }
    
    
    
    
    
    
    
    
    
}
