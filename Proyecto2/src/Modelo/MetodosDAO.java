package Modelo;

import DB.Conexion;
import Vista.CursoVirtual;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MetodosDAO {
    
    PreparedStatement ps;
    Connection conn;
    ResultSet rs;
    Conexion conexion = new Conexion();
    CursoVirtual curso = new CursoVirtual();
    
    public int addUser(Usuario user) {
        int r = 0;
        String sql = "INSERT INTO Usuarios (Nombre, Apellidos, Usuario, Contrasena) VALUES (?,?,?,?);";
        try {
            conn = conexion.getConnection();
            ps = conn.prepareStatement(sql);
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
            conn = conexion.getConnection();
            ps = conn.prepareStatement(sql);
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
    
    public int eliminarCurso(int codigo) {
        int p = 0;
        String sql = "DELETE FROM ClasesVirtuales WHERE Codigo="+codigo+";";
        
        try {
            conn = conexion.getConnection();
            ps = conn.prepareStatement(sql);
            p = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error al elimar: "+e.getMessage());
        }
        return p;
    } 
    
    public void tablaCursos(JTable table) {
        String[] titles = {"Código", "Sede", "Nombre", "Tema", "Docente", "Día", "Hora Inicio", "Hora Fin"};
        String[] datos = new String[8];
        String sql = "SELECT Codigo, Sede, Nombre, Tema, Docente, Dia, HoraInicio, HoraFin FROM ClasesVirtuales;";
        DefaultTableModel modelo = new DefaultTableModel(null, titles);
        
        try {
            conn = conexion.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                datos[0] = rs.getString("Codigo");
                datos[1] = rs.getString("Sede");
                datos[2] = rs.getString("Nombre");
                datos[3] = rs.getString("Tema");
                datos[4] = rs.getString("Docente");
                datos[5] = rs.getString("Dia");
                datos[6] = rs.getString("HoraInicio");
                datos[7] = rs.getString("HoraFin");
                modelo.addRow(datos);
            }            
            table.setModel(modelo);
            
        } catch (SQLException e) {
            System.out.println("Error en tabla: "+e.getMessage());
        }
    }
    
    public void buscarCurso(JTable table, int codigo) {
        
        String sql = "SELECT Codigo, Sede, Nombre, Tema, Docente, Dia, HoraInicio, HoraFin FROM ClasesVirtuales "
                + "WHERE Codigo="+codigo+";";
        String[] titles = {"Código", "Sede", "Nombre", "Tema", "Docente", "Día", "Hora Inicio", "Hora Fin"};
        String[] datos = new String[8];
        DefaultTableModel modelo = new DefaultTableModel(null, titles);
        
        try {
            conn = conexion.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                datos[0] = rs.getString("Codigo");
                datos[1] = rs.getString("Sede");
                datos[2] = rs.getString("Nombre");
                datos[3] = rs.getString("Tema");
                datos[4] = rs.getString("Docente");
                datos[5] = rs.getString("Dia");
                datos[6] = rs.getString("HoraInicio");
                datos[7] = rs.getString("HoraFin");
                modelo.addRow(datos);
            }            
            table.setModel(modelo);
            
        } catch (SQLException e) {
            System.out.println("Error al buscar: "+e.getMessage());
        }
    }
}
