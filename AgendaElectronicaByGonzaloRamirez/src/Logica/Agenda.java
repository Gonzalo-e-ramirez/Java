
package Logica;

import IGU.AgendaInterface;

/**
 *
 * @author Gonzalo Ramirez
 */
public class Agenda {
    
    public static void main(String args[]) {
        
        AgendaInterface interfaz = new AgendaInterface();
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
    }
    
    //variables utilizadas
    private int indice;
    private String[] dni;
    private String[] nombre;
    private String[] apellido;
    private String[] direccion;
    private String[] telefono;
    private String[] fecNac;
    
    public Agenda(){
        //constructor de agenda
        indice=0;
        dni = new String [10];
        nombre = new String[10];
        apellido= new String[10];
        direccion = new String[10];
        telefono = new String[10];
        fecNac = new String[10];
    }
    //Cambiar el valor del indice
    public void cambiarIndice(int indice){
        this.indice = indice;
    }
    //Devolver el valor de indice
    public int valorIndice(){
        return this.indice;
    }
    //Metodos para cambiar y devolver los valores de la agenda
   public void dniGuardar(String dni, int numero){
       this.dni[numero]=dni;
   }
   public String dniRetorna(int numero){
       return this.dni[numero];
   }
    
   public void nombreGuardar(String nombre, int numero){
       this.nombre[numero]=nombre;
   }
   public String nombreRetorna(int numero){
       return this.nombre[numero];
   } 
   public void apellidoGuardar(String apellido, int numero){
       this.apellido[numero]=apellido;
   }
   public String apellidoRetorna(int numero){
       return this.apellido[numero];
   }   
   public void direccionGuardar(String direccion, int numero){
       this.direccion[numero]=direccion;
   }
   public String direccionRetorna(int numero){
       return this.direccion[numero];
   } 
    public void telefooGuardar(String telefono, int numero){
       this.telefono[numero]=telefono;
   }
   public String telefonoRetorna(int numero){
       return this.telefono[numero];
   }   
   public void fecNacGuardar(String fecNac, int numero){
       this.fecNac[numero]=fecNac;
   }
   public String fecNacRetorna(int numero){
       return this.fecNac[numero];
   }    
}
