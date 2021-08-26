
package logica;

public class Credito {
    
    private int credito;
    
    public Credito(){
        this.credito=10;
    }
    
    
    public void incremento(){
        this.credito++;
    }
    public void decremento(){
        this.credito--;
    }

    public int getCredito() {
        return credito;
    }
   
}
