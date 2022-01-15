
package test;

import Persistencia.PersonaDAO;
import Logica.Persona;
import java.util.Collections;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        List<Persona> personas = personaDao.seleccionar();
        
        for(Persona persona:personas){
            System.out.println("persona = " + persona);
        }
        
        //insertar objeto en la base de datos
        //Persona persona = new Persona("Roberto","Alvarez","Ralvarez@gmail.com","4356908");
       // personaDao.insertar(persona);
       
       //modificar registro
//       Persona persona = new Persona(3,"Maria","Alvares","Malvarez@gmail.com","4167054");
//       personaDao.actualizar(persona);

        //Eliminar un objeto de la base de datos.
        Persona personaeliminar = new Persona(2);
        personaDao.eliminar(personaeliminar);
      
        personas = personaDao.seleccionar();
        for(Persona persona2:personas){
           System.out.println("persona = " + persona2);
       //     Collections.sort(personas);
    }
}}
    

