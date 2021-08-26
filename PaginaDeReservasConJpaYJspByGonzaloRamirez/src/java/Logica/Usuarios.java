
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuarios implements Serializable {
    
    @Id
    private int dni;
    @Basic
    private String usuario;
    private String contrasenia;
    

    public Usuarios(int dni,String usuario, String contrasenia) {
        this.dni=dni;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Usuarios() {
        this.dni=0;
        this.usuario=null;
        this.contrasenia=null;
    }
    
    //Getters y Setters

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    
    
    
}
