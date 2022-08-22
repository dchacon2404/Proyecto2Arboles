package Controlador;

import Modelo.Usuario;
import Modelo.MetodosDAO;
import Vista.NuevoUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorUsuario implements ActionListener {

    Usuario user = new Usuario();
    MetodosDAO userdao = new MetodosDAO();
    NuevoUsuario newuser = new NuevoUsuario();

    public ControladorUsuario(NuevoUsuario frm) {
        this.newuser = frm;
        this.newuser.btnAddNewUser.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newuser.btnAddNewUser) {
            //codigo que quiero que realice ese boton
            if (newuser.txtName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(newuser, "Debe de ingresar el nombre");
            } else if (newuser.txtLastName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(newuser, "Debe de ingresar los apellidos del usuario");
            } else if (newuser.txtUser.getText().isEmpty()) {
                JOptionPane.showMessageDialog(newuser, "Debe de ingresar el usuario");
            } else if (newuser.txtPassword.getText().isEmpty()) {
                JOptionPane.showMessageDialog(newuser, "Debe de ingresar una contraseña");

            } else {
                addUser();
            }
        }
    }

    public void addUser() {
        //Extraer los datos de los campos

        String name = newuser.txtName.getText();
        String lastName = newuser.txtLastName.getText();
        String username = newuser.txtUser.getText();
        String password = newuser.txtPassword.getText();

        user.setName(name);
        user.setLastName(lastName);
        user.setUser(username);
        user.setPassword(password);

        int r = userdao.addUser(user);
        if (r == 1) {
            JOptionPane.showMessageDialog(newuser, "Usuario agregado con exito");
            cleanBlanks();
            newuser.dispose();
        } else {
            JOptionPane.showMessageDialog(newuser, "Usuario no agregado");
        }
    }

    public void cleanBlanks() {

        newuser.txtName.setText("");
        newuser.txtLastName.setText("");
        newuser.txtUser.setText("");
        newuser.txtPassword.setText("");

    }
    
    public void start() {
        cleanBlanks();
    }
}
