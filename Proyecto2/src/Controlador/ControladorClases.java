package Controlador;

import Modelo.MetodosDAO;
import Modelo.ClaseVirtual;
import Vista.CursoVirtual;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class ControladorClases implements ActionListener{
    
    CursoVirtual curso = new CursoVirtual();
    ClaseVirtual clase = new ClaseVirtual();
    MetodosDAO dao = new MetodosDAO();
    
    public ControladorClases(CursoVirtual frm) {
        curso = frm;
        this.curso.btnAgregar.addActionListener(this);
        this.curso.btnBuscar.addActionListener(this);
        this.curso.btnEliminar.addActionListener(this);
        this.curso.btnCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == curso.btnAgregar) {
            
        }
        
        if (e.getSource() == curso.btnEliminar) {
            if (curso.txtBuscar.getText().equals("")) {
                JOptionPane.showMessageDialog(curso, "Debe ingresar el código del curso que desea eliminar");
            } else {
                eliminarCurso(Integer.parseInt(curso.txtBuscar.getText()));
            }    
        }
        
        if (e.getSource() == curso.btnBuscar) {
            if (curso.txtBuscar.getText().equals("")) {
                JOptionPane.showMessageDialog(curso, "Debe ingresar el código del curso que desea buscar");
            } else {
                buscarCurso(curso.tablaCursos, Integer.parseInt(curso.txtBuscar.getText()));
            }    
        }
        
        if (e.getSource() == curso.btnCancelar) {
            cleanBlanks();
        }
    }
    
    public void eliminarCurso (int codigo) {
        int r = dao.eliminarCurso(codigo);
        
        if (r == r) {
            JOptionPane.showMessageDialog(curso, "El curso se eliminó correctamente");
            inicio();
            cleanBlanks();
        } else {
            JOptionPane.showMessageDialog(curso, "No se pudo eliminar el curso");
        }
    }
    
    public void inicio() {
        dao.tablaCursos(curso.tablaCursos);
        cleanBlanks();
    }
    
    public void buscarCurso(JTable table, int codigo) {
        dao.buscarCurso(table, codigo);
    }
    
    public void cleanBlanks() {
        curso.txtBuscar.setText(null);
        curso.txtCodigo.setText(null);
        curso.txtDocente.setText(null);
        curso.txtDía.setText(null);
        curso.txtHoraFin.setText(null);
        curso.txtHoraInicio.setText(null);
        curso.txtNombreCurso.setText(null);
        curso.txtSede.setText(null);
        curso.txtTema.setText(null);
    }
}
