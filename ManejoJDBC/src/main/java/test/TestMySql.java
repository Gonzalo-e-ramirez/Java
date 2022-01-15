package test;

import java.sql.*;

public class TestMySql {
    public static void main(String[] args) {
        //parametros importantes para conectarse a la base de datos.
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //en aplicaciones web aveces es requerida.
           // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root","1234");
            Statement instruccion = conexion.createStatement();
            //hacemos un query y lo ejecutamos.
            String sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona;";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("id_Persona: "+ resultado.getInt("id_persona"));
                System.out.print(", Nombre: "+ resultado.getString("nombre"));
                System.out.print(", Apellido: "+ resultado.getString("apellido"));
                System.out.print(", Email: "+ resultado.getString("email"));
                System.out.println(", Telefono: "+ resultado.getString("telefono"));
            }
            //debemos cerrar los objetos abiertos
            resultado.close();
            instruccion.close();
            conexion.close();
       // } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
