
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Habitacion implements Serializable {
    //Variables
    @Id
    private int numeroIdentificacion;
    @Basic
    private int piso;
    private String nombre;
    private String tipo;
    private float precioPorNoche;
    @OneToMany
    List<Reserva> ocupada;
    

    //Constructores
    public Habitacion() {

    }

    public Habitacion( int piso, String tipo, List<Reserva> ocupada) {
        this.numeroIdentificacion = this.calcularID(piso, tipo);
        this.piso = piso;
        this.tipo = tipo;
        this.nombre = this.nombrePorPiso(piso);
        this.precioPorNoche = this.calcularPrecio(tipo);
        this.ocupada=ocupada;
    }
    
    
    
    private String nombrePorPiso(int piso){
        String nombreHabit=null;
        if(piso==1){
            nombreHabit= this.tipo + " colorido";
        }
        if(piso==2){
            nombreHabit= this.tipo + " natural";
        }
        if(piso==3){
            nombreHabit= this.tipo + " animado";
        }
        if(piso==4){
            nombreHabit= this.tipo + " luxury";
        }
        return nombreHabit;
    }
    
    private float calcularPrecio(String tipo){
        float precio=0;
        if(tipo.equals("single")){
            precio=1000;
            return precio;
        }
        if(tipo.equals("doble")){
             precio=1400;
            return precio;
        }
        if(tipo.equals("triple")){
             precio=2000;
            return precio;
        }
        if(tipo.equals("multiple")){
             precio=2500;
            return precio;
        }
        
        return precio;
    }
    
    private int calcularID(int piso,String tipo ){
        int id=0;
        if(tipo.equals("single") && piso==1){
            id=1;
            return id;
        }
        if(tipo.equals("doble") && piso==1){
             id=2;
            return id;
        }
        if(tipo.equals("triple") && piso==1){
            id=3;
            return id;
        }
        if(tipo.equals("multiple") && piso==1){
            id=4;
            return id;
        } 
        if(tipo.equals("single") && piso==2){
            id=5;
            return id;
        }
        if(tipo.equals("doble") && piso==2){
             id=6;
            return id;
        }
        if(tipo.equals("triple") && piso==2){
            id=7;
            return id;
        }
        if(tipo.equals("multiple") && piso==2){
            id=8;
            return id;
        }
        if(tipo.equals("single") && piso==3){
            id=9;
            return id;
        }
        if(tipo.equals("doble") && piso==3){
             id=10;
            return id;
        }
        if(tipo.equals("triple") && piso==3){
            id=11;
            return id;
        }
        if(tipo.equals("multiple") && piso==3){
            id=12;
            return id;
        }
        if(tipo.equals("single") && piso==4){
            id=13;
            return id;
        }
        if(tipo.equals("doble") && piso==4){
             id=14;
            return id;
        }
        if(tipo.equals("triple") && piso==4){
            id=15;
            return id;
        }
        if(tipo.equals("multiple") && piso==4){
            id=16;
            return id;
        }
        
        return id;
    }
    
    //Getters y Setters

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecioPorNoche(float precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    
    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public int getPiso() {
        return piso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPrecioPorNoche() {
        return precioPorNoche;
    }
    
        
}
