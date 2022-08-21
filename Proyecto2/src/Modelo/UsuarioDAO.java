package Modelo;

import DB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion conectar = new Conexion();

    public int addUser(Usuario user) {
        int r = 0;
        String sql = "INSERT INTO Usuarios (Nombre, Apellidos, Usuario, Contrasena) VALUES (?,?,?,?);";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getUser());
            ps.setString(4, user.getPassword());
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error 1: "+e.getMessage());
        }
        return r;
    }
    
    public boolean login(Usuario user) {

        String sql = "SELECT Usuario, Contrasena FROM Usuarios WHERE Usuario=?;";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUser());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (user.getPassword().equals(rs.getString("Contrasena"))){
                    user.setUser(rs.getString("Usuario"));
                    return true;
                } else {
                    return false;
                }
            }
            return false;
            
        } catch (SQLException e) {
            System.out.println("Error 1: "+e.getMessage());
            return false;
        }
    }
}
