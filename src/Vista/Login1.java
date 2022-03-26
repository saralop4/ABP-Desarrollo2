package Vista;

//import static CrudArchivos.Archivo.*;

public class Login1 extends javax.swing.JFrame {


    public Login1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        radioContra = new javax.swing.JRadioButton();
        registrarseEmpresa = new javax.swing.JLabel();
        registrarseCandi1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frameLogin"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Hola! ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pc (2).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 440));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("USER LOGIN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 190, 30));
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 190, 30));

        btnIniciar.setBackground(new java.awt.Color(153, 0, 153));
        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("LOGIN");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 180, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("¡Buenas Tardes!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 30, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 30, -1));

        radioContra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioContra.setText("Mostra Contraseña");
        radioContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioContraActionPerformed(evt);
            }
        });
        getContentPane().add(radioContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 130, -1));

        registrarseEmpresa.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        registrarseEmpresa.setText("Registrarse como Empresa");
        registrarseEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarseEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarseEmpresaMouseClicked(evt);
            }
        });
        getContentPane().add(registrarseEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 150, -1));

        registrarseCandi1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        registrarseCandi1.setText("Registrarse como Candidato");
        registrarseCandi1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarseCandi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarseCandi1MouseClicked(evt);
            }
        });
        getContentPane().add(registrarseCandi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        InterfazEmpresa empres = new InterfazEmpresa();

        //var nombreArchivo = "c:\\archivo\\prueba.txt";
//        var nombreArchivo = "prueba.txt";
//        // crearArchivo(nombreArchivo);
//        anexarArchivo(nombreArchivo, "Hola java");
//        leerArchivo(nombreArchivo);
        empres.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(Login1.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void radioContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioContraActionPerformed
        if (radioContra.isSelected()) {
            txtClave.setEchoChar((char) 0);
        } else {
            txtClave.setEchoChar('*');
        }
    }//GEN-LAST:event_radioContraActionPerformed

    private void registrarseEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseEmpresaMouseClicked

    }//GEN-LAST:event_registrarseEmpresaMouseClicked

    private void registrarseCandi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseCandi1MouseClicked
   dialogCandidato v = new   dialogCandidato(this, true);
        
        v.setLocationRelativeTo(null);
        v.setVisible(true);

    }//GEN-LAST:event_registrarseCandi1MouseClicked

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioContra;
    private javax.swing.JLabel registrarseCandi1;
    private javax.swing.JLabel registrarseEmpresa;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
