
package logica;

import java.util.Random;


public class Dado {
    
    private int cara;

    public Dado() {
    }
    
    public void lanzar(){
        Random rd = new Random();
        this.cara = rd.nextInt(6)+1;
    }

    public int getCara() {
        return cara;
    }
    
    
    
}
