package Vista;

import Controlador.CandidatoController;
import Modelo.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarah
 */
public class dialogCandidato extends javax.swing.JDialog {

    FormacionAcademica form = new FormacionAcademica();
    ExperienciaLaboral expe = new ExperienciaLaboral();
    Idioma idio = new Idioma();
    AtomicInteger incremetIdioma = new AtomicInteger();

    public dialogCandidato(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupButtonGenero = new javax.swing.ButtonGroup();
        grupViajar = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombreCandidato = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCorreoCandidato = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtContraseñaCandidato = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        combxEstadocivil = new javax.swing.JComboBox<>();
        txtNumId = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        combxtipoId = new javax.swing.JComboBox<>();
        txtCelularCandidato = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        butonFemenino = new javax.swing.JRadioButton();
        butonMasculino = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        combxPais = new javax.swing.JComboBox<>();
        combxCiudad = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTituloProfesional = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPuestoDeseado = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSalarioAceptado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        buttonSi = new javax.swing.JRadioButton();
        buttonNo = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        combxNivelidioma = new javax.swing.JComboBox<>();
        combxIdioma = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        combxNivelEstudios = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtInstitucion = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtCargoExperiencia = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtEmpresaExperiencia = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtJefeExperiencia = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtTiempoLaborado = new javax.swing.JTextField();
        btnGuardarCandidato = new javax.swing.JButton();
        nacimientoCandidato = new org.jdesktop.swingx.JXDatePicker();
        fechaFinalizacion = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(153, 0, 153));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SarahTrabajo");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Empieza a crear tu cuenta");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marca.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addGap(237, 237, 237))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(36, 36, 36))))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Nombre");

        txtNombreCandidato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCandidatoActionPerformed(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Apellidos");

        txtCorreoCandidato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Email");

        txtContraseñaCandidato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Contraseña");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Fecha de Nacimiento");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Tipo de Identificacion");

        combxEstadocivil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combxEstadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero(a)", "Casado(a)", "Union Libre", "Divorciado(a)", "Viudo(a)" }));

        txtNumId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Estado Civil");

        combxtipoId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combxtipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de Ciudadania", "Cedula de Extranjeria", "Tarjeta de Identidad" }));

        txtCelularCandidato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Celular");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Genero");

        grupButtonGenero.add(butonFemenino);
        butonFemenino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        butonFemenino.setText("Femenino");

        grupButtonGenero.add(butonMasculino);
        butonMasculino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        butonMasculino.setText("Masculino");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Pais");

        combxPais.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombia", "Mexico", "Argentina" }));

        combxCiudad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combxCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartagena", "Medellin", "Buenos Aires" }));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Ciudad");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("PERFIL PROFESIONAL");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Cargo o Titulo breve de su Hoja de Vida");

        txtTituloProfesional.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Puesto Deseado");

        txtPuestoDeseado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Salario minimo aceptado");

        txtSalarioAceptado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Disponibilidad para viajar");

        grupViajar.add(buttonSi);
        buttonSi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonSi.setText("Si");

        grupViajar.add(buttonNo);
        buttonNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonNo.setText("No");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("IDIOMAS");

        combxNivelidioma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combxNivelidioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Basico", "Basico", "Intermedio", "Avanzado", "Nativo" }));

        combxIdioma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combxIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Arabe", "Armenio", "Ingles", "Chino", "Coreano", "Frances", "Griego", "Latin", "Persa", "Portugues", "Polaco", "Ruso", "Sueco", "Tailandés", "Italiano", "Turco", " " }));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("FORMACION ACADEMICA");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Nivel de estudios");

        combxNivelEstudios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combxNivelEstudios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Educacion Basica Primaria", "Educacion Basica Secundaria", "Bachilerato / Educacion Media", "Universidsd / Carrera tecnica", "Universidad / Carrera tecnologica", "Universidad / Carrera profesional", "Postgrado / Especializacion ", "Postgrado / Maestria", "Postgrado / Doctorado" }));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Centro educativo");

        txtInstitucion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Fecha de finalizacion");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("EXPERIENCIA PROFESIONAL");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Cargo");

        txtCargoExperiencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Nombre de la empresa");

        txtEmpresaExperiencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Nombre del jefe inmediato");

        txtJefeExperiencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Tiempo laborado");

        txtTiempoLaborado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnGuardarCandidato.setBackground(new java.awt.Color(204, 0, 204));
        btnGuardarCandidato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarCandidato.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCandidato.setText("Guardar");
        btnGuardarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCandidatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(326, 326, 326))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(276, 276, 276))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTiempoLaborado)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtJefeExperiencia)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEmpresaExperiencia)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel24)
                                            .addComponent(txtInstitucion, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel23)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel22)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(buttonSi)
                                                        .addGap(12, 12, 12)
                                                        .addComponent(buttonNo))
                                                    .addComponent(jLabel17)
                                                    .addComponent(jLabel16)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel31)
                                                    .addComponent(combxPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel30)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                            .addGap(38, 38, 38)
                                                            .addComponent(butonFemenino)
                                                            .addGap(46, 46, 46)
                                                            .addComponent(butonMasculino))
                                                        .addComponent(jLabel29)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                    .addComponent(combxtipoId, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(txtNumId, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel12)
                                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(txtContraseñaCandidato, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                                                                        .addComponent(txtCorreoCandidato)
                                                                        .addComponent(txtApellido)
                                                                        .addComponent(txtNombreCandidato))
                                                                    .addComponent(jLabel13)
                                                                    .addComponent(jLabel14)
                                                                    .addComponent(jLabel15)
                                                                    .addComponent(jLabel18)))
                                                            .addComponent(combxEstadocivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel27)
                                                            .addComponent(jLabel20)
                                                            .addComponent(txtCelularCandidato, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                    .addComponent(combxCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtTituloProfesional)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7))
                                                    .addComponent(txtPuestoDeseado)
                                                    .addComponent(txtSalarioAceptado)
                                                    .addComponent(jSeparator2)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(combxIdioma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(combxNivelidioma, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jSeparator3)
                                                    .addComponent(combxNivelEstudios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(jSeparator4)
                                            .addComponent(txtCargoExperiencia)))))))
                    .addComponent(btnGuardarCandidato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nacimientoCandidato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaFinalizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseñaCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nacimientoCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combxtipoId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combxEstadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCelularCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butonFemenino)
                    .addComponent(butonMasculino))
                .addGap(14, 14, 14)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTituloProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPuestoDeseado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSalarioAceptado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSi)
                    .addComponent(buttonNo))
                .addGap(43, 43, 43)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combxNivelidioma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combxNivelEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addGap(37, 37, 37)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargoExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmpresaExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJefeExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTiempoLaborado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnGuardarCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCandidatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCandidatoActionPerformed

    public void limpiar() {
        txtNombreCandidato.setText("");
        txtApellido.setText("");
        txtCorreoCandidato.setText("");
        txtContraseñaCandidato.setText("");
        nacimientoCandidato.setDate(null);
        combxtipoId.setSelectedIndex(0); // convertimos el tipo de dato select a un string
        txtNumId.setText("");
        combxEstadocivil.setSelectedIndex(0);
        txtCelularCandidato.setText("");
        butonFemenino.isSelected();
        combxPais.setSelectedIndex(0);
        combxCiudad.setSelectedIndex(0);
        txtTituloProfesional.setText("");
        txtPuestoDeseado.setText("");
        txtSalarioAceptado.setText("");
        buttonSi.isSelected();
        combxNivelidioma.setSelectedIndex(0);
        combxIdioma.setSelectedIndex(0);
        combxNivelEstudios.setSelectedIndex(0);
        txtInstitucion.setText("");
        fechaFinalizacion.setDate(null);
        txtCargoExperiencia.setText("");
        txtEmpresaExperiencia.setText("");
        txtJefeExperiencia.setText("");
        txtTiempoLaborado.setText("");

    }


    private void btnGuardarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCandidatoActionPerformed

        String nombre = txtNombreCandidato.getText();
        String apellido = txtApellido.getText();
        String email = txtCorreoCandidato.getText();
        String clave = txtContraseñaCandidato.getText();
        String fecha = nacimientoCandidato.getEditor().getText();
        String tipoId = (String) combxtipoId.getSelectedItem();
        String numID = txtNumId.getText();
        String estadoCivil = (String) combxEstadocivil.getSelectedItem();
        String telefono = txtCelularCandidato.getText();
        String genero = (butonFemenino.isSelected()) ? "Masculino" : "Femenino";
        String pais = (String) combxPais.getSelectedItem();
        String ciudad = (String) combxCiudad.getSelectedItem();
        String profesion = txtTituloProfesional.getText();
        String puestoDeseado = txtPuestoDeseado.getText();
        String salaDeseado = txtSalarioAceptado.getText();
        String disponibilidad = (buttonSi.isSelected()) ? "Si" : "No";

        nombre = (nombre.trim().isEmpty() == true) ? null : nombre;
        apellido = (apellido.trim().isEmpty() == true) ? null : apellido;
        email = (email.trim().isEmpty() == true) ? null : email;
        clave = (clave.trim().isEmpty() == true) ? null : clave;
        fecha = (fecha.trim().isEmpty() == true) ? null : fecha;
        Date fechaNacimiento = (fecha != null) ? nacimientoCandidato.getDate() : null;
        telefono = (telefono.trim().isEmpty() == true) ? null : telefono;

        if (nombre.trim().isEmpty() == true || apellido.trim().isEmpty() == true || email.trim().isEmpty() == true
                || clave.trim().isEmpty() == true || fecha.trim().isEmpty() == true) {
            JOptionPane.showMessageDialog(this, "Ingrese Nombre, Apellido,Email,Clave y Fecha");
            return;
        }

        try {

            if (telefono.length() == 0) {
                Integer.parseInt(telefono);
            } else {
            }
            if (numID.length() == 0) {
                Integer.parseInt(numID);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Cedula y Telefono deben ser numeros");

        }

        //creamos el objeto de idioma para su lista respectiva 
        idio.setCodigo(incremetIdioma.incrementAndGet());
        idio.setNivel((String) combxNivelidioma.getSelectedItem());
        idio.setNombreIdioma((String) combxIdioma.getSelectedItem());

//        creamos el objeto de formacion academica para su lista respectiva 
        form.setNivelAcademico((String) combxNivelEstudios.getSelectedItem());
        form.setInstitucion(txtInstitucion.getText());
        form.setFechadeFinalizacion((fechaFinalizacion.getDate()));

//        creamos el objeto de experiencia laboral para su lista respectiva 
        expe.setCargo(txtCargoExperiencia.getText());
        expe.setEmpresa(txtEmpresaExperiencia.getText());
        expe.setJefe(txtJefeExperiencia.getText());
        expe.setTiempolaborado(txtTiempoLaborado.getText());

        CandidatoController.crear(nombre,
                apellido, email,
                clave, fechaNacimiento,
                tipoId, numID,
                estadoCivil, telefono,
                genero, pais,
                ciudad, profesion,
                puestoDeseado, salaDeseado,
                disponibilidad,
                idio,
                null, null
        );
        JOptionPane.showMessageDialog(this, "SE GUARDO CON EXITO!!");
        limpiar();
    }//GEN-LAST:event_btnGuardarCandidatoActionPerformed

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
            java.util.logging.Logger.getLogger(dialogCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogCandidato dialog = new dialogCandidato(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCandidato;
    private javax.swing.JRadioButton butonFemenino;
    private javax.swing.JRadioButton butonMasculino;
    private javax.swing.JRadioButton buttonNo;
    private javax.swing.JRadioButton buttonSi;
    private javax.swing.JComboBox<String> combxCiudad;
    private javax.swing.JComboBox<String> combxEstadocivil;
    private javax.swing.JComboBox<String> combxIdioma;
    private javax.swing.JComboBox<String> combxNivelEstudios;
    private javax.swing.JComboBox<String> combxNivelidioma;
    private javax.swing.JComboBox<String> combxPais;
    private javax.swing.JComboBox<String> combxtipoId;
    private org.jdesktop.swingx.JXDatePicker fechaFinalizacion;
    private javax.swing.ButtonGroup grupButtonGenero;
    private javax.swing.ButtonGroup grupViajar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private org.jdesktop.swingx.JXDatePicker nacimientoCandidato;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCargoExperiencia;
    private javax.swing.JTextField txtCelularCandidato;
    private javax.swing.JTextField txtContraseñaCandidato;
    private javax.swing.JTextField txtCorreoCandidato;
    private javax.swing.JTextField txtEmpresaExperiencia;
    private javax.swing.JTextField txtInstitucion;
    private javax.swing.JTextField txtJefeExperiencia;
    private javax.swing.JTextField txtNombreCandidato;
    private javax.swing.JTextField txtNumId;
    private javax.swing.JTextField txtPuestoDeseado;
    private javax.swing.JTextField txtSalarioAceptado;
    private javax.swing.JTextField txtTiempoLaborado;
    private javax.swing.JTextField txtTituloProfesional;
    // End of variables declaration//GEN-END:variables
}
