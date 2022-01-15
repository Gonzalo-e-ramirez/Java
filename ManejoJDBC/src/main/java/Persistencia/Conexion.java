package Persistencia;

import java.sql.*;

//una clase reutilizable

public class Conexion {
     //parametros importantes para conectarse a la base de datos.
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
   //creamos los paramegro y usuarios
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "1234";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER,JDBC_PASSWORD);
    }
    
    //sobrecargamos los metodos.
    
    //cerrar result set de la clase sql.
    public static void close(ResultSet rs) throws SQLException{
        rs.close(); 
    }
    
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    //tiene mejor performance los preparedStatement que los statement.
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
    
}
