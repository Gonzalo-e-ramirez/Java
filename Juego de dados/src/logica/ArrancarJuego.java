
package logica;

public class ArrancarJuego {
    
    public static void main(String[] args){
        //creamos 10 jugadores
        Juego[] juego = new Juego[10];
        int indice=1;
        
        for(int i=0; i<10; i++){
            juego[i] = new Juego();
        }
        for(Juego juegos : juego){
            juegos.iniciarJuego("Jugador "+indice);
            indice++;
        }
        
    }
    
}
