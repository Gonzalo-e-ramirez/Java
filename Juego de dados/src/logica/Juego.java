
package logica;


public class Juego {
    
    private Jugador jugador;
    private Dado dado1;
    private Dado dado2;
    private int resultado = 1;

    public Juego() {
    }
    
    public void iniciarJuego(String nombre){
        this.jugador = new Jugador(nombre);
        this.dado1 = new Dado();
        this.dado2 = new Dado();
        
        while(this.jugador.getCredito().getCredito() > 0){
            comprobarResultado();
            System.out.println(this.jugador.toString());
        }
        
    }
    
    private void comprobarResultado(){
        this.dado1.lanzar();
        this.dado2.lanzar();
        int suma = this.dado1.getCara() + this.dado2.getCara();
        
        if(suma==7){
            this.jugador.getCredito().incremento();
            System.out.println("Has Ganado "+resultado+ " veces");
            resultado++;
        }else{
            this.jugador.getCredito().decremento();
            
        }
    }
    
}
