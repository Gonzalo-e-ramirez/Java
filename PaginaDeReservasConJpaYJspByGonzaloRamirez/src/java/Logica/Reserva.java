
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity

public class Reserva implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int numeroDeReserva;
    @Temporal(TemporalType.DATE)
    private Date ingreso;
    @Temporal(TemporalType.DATE)
    private Date egreso;
    @Basic
    private int dniHuesped;
    private int dniEmpleado;

    
    
    public Reserva(){
        this.ingreso = null;
        this.egreso=null;
        
    }

    public Reserva( Date Ingreso, Date egreso, int dniE, int dniH) {
        this.ingreso = Ingreso;
        this.egreso = egreso;
        this.dniEmpleado=dniE;
        this.dniHuesped=dniH;
                
    }
    

    public int getNumeroDeReserva() {
        return numeroDeReserva;
    }

    public void setNumeroDeReserva(int numeroDeReserva) {
        this.numeroDeReserva = numeroDeReserva;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date Ingreso) {
        this.ingreso = Ingreso;
    }

    public Date getEgreso() {
        return egreso;
    }

    public void setEgreso(Date egreso) {
        this.egreso = egreso;
    }

    public int getDniHuesped() {
        return dniHuesped;
    }

    public void setDniHuesped(int dniHuesped) {
        this.dniHuesped = dniHuesped;
    }

    public int getDniEmpleado() {
        return dniEmpleado;
    }

    public void setDniEmpleado(int dniEmpleado) {
        this.dniEmpleado = dniEmpleado;
    }
    
    
    
    
    
}
