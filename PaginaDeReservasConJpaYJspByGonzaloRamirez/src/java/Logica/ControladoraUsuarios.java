
package Logica;

import Persistencia.ControladoraPersistenciaUsuarios;
import java.util.List;


public class ControladoraUsuarios {
    
    private final ControladoraPersistenciaUsuarios control = new ControladoraPersistenciaUsuarios();
    
    public boolean verificarUsuario(String usuario, String clave){
    List<Usuarios> listadoUser = control.traerUsuarios();
    
    for(Usuarios user : listadoUser){
        if(listadoUser != null){
            if(user.getUsuario().equals(usuario) && user.getContrasenia().equals(clave)){
                return true;
            }
        }
    }   
    return false;
    }
    
    
    public void crearUsuario(Usuarios user){
        control.crearUsuario(user);
    }
}
