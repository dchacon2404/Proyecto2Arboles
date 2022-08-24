package Vista;

import java.awt.Color;


public class CursoVirtual extends javax.swing.JFrame {

    
    public CursoVirtual() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblSede = new javax.swing.JLabel();
        lblNombreCurso = new javax.swing.JLabel();
        lblTema = new javax.swing.JLabel();
        lblDocente = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblHoraInicio = new javax.swing.JLabel();
        lblHoraFin = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtSede = new javax.swing.JTextField();
        txtNombreCurso = new javax.swing.JTextField();
        txtTema = new javax.swing.JTextField();
        txtDocente = new javax.swing.JTextField();
        txtDía = new javax.swing.JTextField();
        txtHoraInicio = new javax.swing.JTextField();
        txtHoraFin = new javax.swing.JTextField();
        tableCursos = new javax.swing.JScrollPane();
        tablaCursos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setText("Código Clase:");
        bg.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblSede.setText("Sede:");
        bg.add(lblSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        lblNombreCurso.setText("Nombre Curso:");
        bg.add(lblNombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblTema.setText("Tema:");
        bg.add(lblTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        lblDocente.setText("Docente:");
        bg.add(lblDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        lblDia.setText("Día:");
        bg.add(lblDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        lblHoraInicio.setText("Hora Inicio:");
        bg.add(lblHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        lblHoraFin.setText("Hora Fin:");
        bg.add(lblHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));
        bg.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, -1));
        bg.add(txtSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, -1));
        bg.add(txtNombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 170, -1));
        bg.add(txtTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 170, -1));
        bg.add(txtDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 170, -1));
        bg.add(txtDía, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 170, -1));
        bg.add(txtHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 170, -1));
        bg.add(txtHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 170, -1));

        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableCursos.setViewportView(tablaCursos);

        bg.add(tableCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 520, 220));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setText("AGREGAR CURSO");
        bg.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR CURSO");
        bg.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        lblBuscar.setText("Buscar Curso Virtual:");
        bg.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 120, -1));

        txtBuscar.setToolTipText("Ingrese el código del curso");
        bg.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 200, -1));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        bg.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 110, -1));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("   X");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        bg.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(853, 0, 40, 20));

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        bg.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        btnRefrescar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRefrescar.setText("...");
        bg.add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Union.png"))); // NOI18N
        fondo.setText(".");
        bg.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setForeground(Color.white);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(Color.red);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CursoVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursoVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursoVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursoVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursoVirtual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblHoraFin;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JLabel lblNombreCurso;
    private javax.swing.JLabel lblSede;
    private javax.swing.JLabel lblTema;
    public javax.swing.JTable tablaCursos;
    private javax.swing.JScrollPane tableCursos;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtDocente;
    public javax.swing.JTextField txtDía;
    public javax.swing.JTextField txtHoraFin;
    public javax.swing.JTextField txtHoraInicio;
    public javax.swing.JTextField txtNombreCurso;
    public javax.swing.JTextField txtSede;
    public javax.swing.JTextField txtTema;
    // End of variables declaration//GEN-END:variables
}
