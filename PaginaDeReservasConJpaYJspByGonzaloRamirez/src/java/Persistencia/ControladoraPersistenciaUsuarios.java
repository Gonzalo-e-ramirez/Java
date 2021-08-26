
package Persistencia;

import Logica.Usuarios;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistenciaUsuarios {
    
    private final UsuariosJpaController usuario = new UsuariosJpaController();
    
    
    public void crearUsuario(Usuarios user){
        try {
            usuario.create(user);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistenciaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Usuarios> traerUsuarios(){
        
        return usuario.findUsuariosEntities();
    }
    
}
