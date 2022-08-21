package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Conexion {
    
    private Connection cnn = null;
    private Statement st = null;
    
    public Conexion() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto2?useUnicode=true&useJDBCCompliant"
                    + "TimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "andres123");
            st = cnn.createStatement();
            System.out.println("Conexión Buena");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error 1: "+e.getMessage());
        }
    }
    
    public Connection getConnection() {
        return cnn;
    }
    
    public void desconnetion() {
        
        try {
            cnn.close();
            System.exit(0);
            
        } catch (Exception e) {
            System.out.println("Error 3:"+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Conexion con = new Conexion();
    }
}
