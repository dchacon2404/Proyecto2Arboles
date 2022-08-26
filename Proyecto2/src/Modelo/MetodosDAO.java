package Modelo;

import DB.Conexion;
import Vista.CursoVirtual;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
        String sql = "call pa_AgregarUsuario(?,?,?,?);";
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
            JOptionPane.showMessageDialog(curso, "El usuario ingresado ya existe");
        }
        return r;
    }
    
    public boolean login(Usuario user) {

        String sql = "call pa_Login(?);";
        
        try {
            conn = conexion.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUser());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (user.getPassword().equals(rs.getString("Contrasena"))){
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
    
    public int agregarCurso(ClaseVirtual clase) {
        int p = 0;
        String sql = "call pa_AgregarCurso(?,?,?,?,?,?,?,?)";
        
        try {
            
            conn = conexion.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, clase.getCodigoCurso());
            ps.setString(2, clase.getSede());
            ps.setString(3, clase.getNombreCurso());
            ps.setString(4, clase.getTemaCurso());
            ps.setString(5, clase.getDocente());
            ps.setString(6, clase.getDia());
            ps.setString(7, clase.getHoraInicio());
            ps.setString(8, clase.getHoraFin());
            p = ps.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println("Error de agregado: "+e.getMessage());
        }
        return p;
    }
    
    public int eliminarCurso(int codigo) {
        int p = 0;
        String sql = "call pa_CodigoEliminar(?);";
        
        try {
            conn = conexion.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            p = ps.executeUpdate();
            
            if (p > 0) {
                JOptionPane.showMessageDialog(curso, "El curso se eliminó correctamente");
            } else {
                JOptionPane.showMessageDialog(curso, "No se pudo eliminar el curso, no existe");
            }
            
        } catch (SQLException e) {
            System.out.println("Error al elimar: "+e.getMessage());
        }
        return p;
    } 
    
    public void tablaCursos(JTable table, ClaseVirtual clase) {
        String[] titles = {"Código", "Sede", "Nombre", "Tema", "Docente", "Día", "Hora Inicio", "Hora Fin"};
        String[] datos = new String[8];
        String sql = "call pa_TablaCursos;";
        DefaultTableModel modelo = new DefaultTableModel(null, titles);
        Metodos metodo = new Metodos();
        
        try {
            conn = conexion.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                clase.setCodigoCurso(rs.getInt(1));
                clase.setSede(rs.getString(2));
                clase.setNombreCurso(rs.getString(3));
                clase.setTemaCurso(rs.getString(4));
                clase.setDocente(rs.getString(5));
                clase.setDia(rs.getString(6));
                clase.setHoraInicio(rs.getString(7));
                clase.setHoraFin(rs.getString(8));
                
                metodo.root = metodo.insert(metodo.root, clase);
                
                //Acá se usa el método insert2
                /*metodo.root = metodo.insert2(metodo.root, 1);
                metodo.root = metodo.insert2(metodo.root, 2);
                metodo.root = metodo.insert2(metodo.root, 3);
                metodo.root = metodo.insert2(metodo.root, 7);
                metodo.root = metodo.insert2(metodo.root, 6);
                metodo.root = metodo.insert2(metodo.root, 5);
                metodo.root = metodo.insert2(metodo.root, 4);*/
                
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
        
        String sql = "call pa_BuscarCurso(?);";
        String[] titles = {"Código", "Sede", "Nombre", "Tema", "Docente", "Día", "Hora Inicio", "Hora Fin"};
        String[] datos = new String[8];
        DefaultTableModel modelo = new DefaultTableModel(null, titles);
        
        try {
            conn = conexion.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
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
