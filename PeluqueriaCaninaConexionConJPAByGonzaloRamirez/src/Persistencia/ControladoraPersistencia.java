
package Persistencia;

import Logica.PeluqueriaCanina;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    PeluqueriaCaninaJpaController control = new PeluqueriaCaninaJpaController();
    
    //creamos un metodo para crear la tabla o almacenas mas datos en ella
    public void crearDatos(PeluqueriaCanina pc1){
        try {
            control.create(pc1);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
}
