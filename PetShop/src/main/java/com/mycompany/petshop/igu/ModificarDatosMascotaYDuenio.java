package com.mycompany.petshop.igu;

import com.mycompany.petshop.logica.ControladoraLogica;
import com.mycompany.petshop.logica.Duenio;
import com.mycompany.petshop.logica.Mascota;
import com.mycompany.petshop.logica.Relacion;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class ModificarDatosMascotaYDuenio extends javax.swing.JFrame {

    ControladoraLogica controlLogica = null;

    public ModificarDatosMascotaYDuenio() {
        
        controlLogica = new ControladoraLogica();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContendorModificar = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        PanelIngresoNuevo = new javax.swing.JPanel();
        labelPatito = new javax.swing.JLabel();
        labelOsito = new javax.swing.JLabel();
        labelLana = new javax.swing.JLabel();
        labelRaton = new javax.swing.JLabel();
        PanelDuenio = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtDuenio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoDuenio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        btnElejirDuenio = new javax.swing.JButton();
        labelBuscarDuenio = new javax.swing.JLabel();
        cmbOtroDuenioModi = new javax.swing.JComboBox<>();
        btnAceptarDuenio = new javax.swing.JButton();
        labelErrorDuenio = new javax.swing.JLabel();
        labelErrorApellido = new javax.swing.JLabel();
        labelErrorCelular = new javax.swing.JLabel();
        labelErrorDuenioModi = new javax.swing.JLabel();
        btnBuscarDuenioModi = new javax.swing.JButton();
        btnRestablecerDuenio = new javax.swing.JButton();
        TitutoIngresoMascota = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardarCambioMascotaDuenio = new javax.swing.JButton();
        PanelModificarMascota = new javax.swing.JPanel();
        btnAceptarMascota = new javax.swing.JButton();
        cmbBuscarMascotaModi = new javax.swing.JComboBox<>();
        labelBuscarMascotaModi = new javax.swing.JLabel();
        btnElejirMascota = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbAtencion = new javax.swing.JComboBox<>();
        labelErrorAtencion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbAlergico = new javax.swing.JComboBox<>();
        labelErrorAlergico = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        labelErrorColor = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        labelErrorEspecie = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        labelErrorRaza = new javax.swing.JLabel();
        nombreMascota = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        labelErrorMascota = new javax.swing.JLabel();
        labelErrorBuscarMascota = new javax.swing.JLabel();
        btnBuscarMas = new javax.swing.JButton();
        btnRestablecerMascota = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelContendorModificar.setBackground(new java.awt.Color(255, 255, 255));
        PanelContendorModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volverNegro64.png"))); // NOI18N
        btnVolver.setText("Atrás");
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/volverVioletaSinFondo64.png"))); // NOI18N
        btnVolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        PanelContendorModificar.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 70, 100));

        jLabel4.setBackground(new java.awt.Color(153, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gato.jpg"))); // NOI18N
        PanelContendorModificar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 360, 640));

        PanelIngresoNuevo.setBackground(new java.awt.Color(223, 227, 226));
        PanelIngresoNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPatito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PatitoCeleste64.png"))); // NOI18N
        PanelIngresoNuevo.add(labelPatito, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 660, -1, -1));

        labelOsito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OsitoPeluCeleste128.png"))); // NOI18N
        PanelIngresoNuevo.add(labelOsito, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, -1, -1));

        labelLana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lana128.png"))); // NOI18N
        PanelIngresoNuevo.add(labelLana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 110, 120));

        labelRaton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juguete2RatonCeleste64.png"))); // NOI18N
        PanelIngresoNuevo.add(labelRaton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 660, -1, -1));

        PanelDuenio.setBackground(new java.awt.Color(223, 227, 226));
        PanelDuenio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Nombre Dueño:");
        PanelDuenio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        txtDuenio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuenioKeyTyped(evt);
            }
        });
        PanelDuenio.add(txtDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 170, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Apellido Dueño:");
        PanelDuenio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtApellidoDuenio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoDuenioKeyTyped(evt);
            }
        });
        PanelDuenio.add(txtApellidoDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 170, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Celular:");
        PanelDuenio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        PanelDuenio.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, -1));

        btnElejirDuenio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnElejirDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/masNegro24Nuevo.png"))); // NOI18N
        btnElejirDuenio.setText("Cambiar Dueño");
        btnElejirDuenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnElejirDuenio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnElejirDuenio.setFocusPainted(false);
        btnElejirDuenio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnElejirDuenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/masVioleta24Nuevo.png"))); // NOI18N
        btnElejirDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElejirDuenioActionPerformed(evt);
            }
        });
        PanelDuenio.add(btnElejirDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 130, 30));

        labelBuscarDuenio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelBuscarDuenio.setText("Buscar Dueño:");
        PanelDuenio.add(labelBuscarDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        cmbOtroDuenioModi.setEnabled(false);
        cmbOtroDuenioModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOtroDuenioModiActionPerformed(evt);
            }
        });
        PanelDuenio.add(cmbOtroDuenioModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 170, -1));

        btnAceptarDuenio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAceptarDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkNegroNuevo24.png"))); // NOI18N
        btnAceptarDuenio.setText("Aceptar Dueño");
        btnAceptarDuenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptarDuenio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptarDuenio.setEnabled(false);
        btnAceptarDuenio.setFocusPainted(false);
        btnAceptarDuenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/checkVioletaNuevo24.png"))); // NOI18N
        btnAceptarDuenio.setVerifyInputWhenFocusTarget(false);
        btnAceptarDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarDuenioActionPerformed(evt);
            }
        });
        PanelDuenio.add(btnAceptarDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 130, 25));

        labelErrorDuenio.setForeground(new java.awt.Color(255, 0, 0));
        PanelDuenio.add(labelErrorDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 110, 20));

        labelErrorApellido.setForeground(new java.awt.Color(255, 0, 0));
        PanelDuenio.add(labelErrorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 110, 20));

        labelErrorCelular.setForeground(new java.awt.Color(255, 0, 0));
        PanelDuenio.add(labelErrorCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 110, 20));

        labelErrorDuenioModi.setForeground(new java.awt.Color(255, 0, 0));
        PanelDuenio.add(labelErrorDuenioModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 110, 20));

        btnBuscarDuenioModi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupaNegra24.png"))); // NOI18N
        btnBuscarDuenioModi.setText("Buscar");
        btnBuscarDuenioModi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarDuenioModi.setEnabled(false);
        btnBuscarDuenioModi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarDuenioModi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/lupaVioleta24.png"))); // NOI18N
        btnBuscarDuenioModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDuenioModiActionPerformed(evt);
            }
        });
        PanelDuenio.add(btnBuscarDuenioModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 80, -1));

        btnRestablecerDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restablecer Negro 24.png"))); // NOI18N
        btnRestablecerDuenio.setText("Restablecer Dueño");
        btnRestablecerDuenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRestablecerDuenio.setEnabled(false);
        btnRestablecerDuenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/restablecer Violet 24.png"))); // NOI18N
        btnRestablecerDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerDuenioActionPerformed(evt);
            }
        });
        PanelDuenio.add(btnRestablecerDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, 30));

        PanelIngresoNuevo.add(PanelDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 430, 190));

        TitutoIngresoMascota.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TitutoIngresoMascota.setText("Modificar Mascota y/o Dueño");
        PanelIngresoNuevo.add(TitutoIngresoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Limpiarnegro24.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Limpiarvioleta24.png"))); // NOI18N
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelIngresoNuevo.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, 60, 60));

        btnGuardarCambioMascotaDuenio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarCambioMascotaDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Guardarnegro24.png"))); // NOI18N
        btnGuardarCambioMascotaDuenio.setText("<html><center>Guardar <p>Cambios<html>");
        btnGuardarCambioMascotaDuenio.setBorder(null);
        btnGuardarCambioMascotaDuenio.setContentAreaFilled(false);
        btnGuardarCambioMascotaDuenio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCambioMascotaDuenio.setFocusPainted(false);
        btnGuardarCambioMascotaDuenio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarCambioMascotaDuenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Guardarvioleta24.png"))); // NOI18N
        btnGuardarCambioMascotaDuenio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarCambioMascotaDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambioMascotaDuenioActionPerformed(evt);
            }
        });
        PanelIngresoNuevo.add(btnGuardarCambioMascotaDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 70, 70));

        PanelModificarMascota.setBackground(new java.awt.Color(223, 227, 226));
        PanelModificarMascota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkNegroNuevo24.png"))); // NOI18N
        btnAceptarMascota.setText("Aceptar Mascota");
        btnAceptarMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptarMascota.setEnabled(false);
        btnAceptarMascota.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/checkVioletaNuevo24.png"))); // NOI18N
        btnAceptarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarMascotaActionPerformed(evt);
            }
        });
        PanelModificarMascota.add(btnAceptarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 140, 25));

        cmbBuscarMascotaModi.setEnabled(false);
        PanelModificarMascota.add(cmbBuscarMascotaModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, -1));

        labelBuscarMascotaModi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelBuscarMascotaModi.setText("Buscar Mascota:");
        PanelModificarMascota.add(labelBuscarMascotaModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        btnElejirMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/masNegro24Nuevo.png"))); // NOI18N
        btnElejirMascota.setText("Cambiar Mascota");
        btnElejirMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnElejirMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnElejirMascota.setFocusPainted(false);
        btnElejirMascota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnElejirMascota.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/masVioleta24Nuevo.png"))); // NOI18N
        btnElejirMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElejirMascotaActionPerformed(evt);
            }
        });
        PanelModificarMascota.add(btnElejirMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 30));

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        txtObservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObservacionesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtObservaciones);

        PanelModificarMascota.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 170, 80));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Observaciones:");
        PanelModificarMascota.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setText("Atencion Especial:");
        PanelModificarMascota.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        cmbAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "SI", "NO" }));
        PanelModificarMascota.add(cmbAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 110, -1));

        labelErrorAtencion.setForeground(new java.awt.Color(255, 0, 0));
        PanelModificarMascota.add(labelErrorAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 110, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Alergico:");
        PanelModificarMascota.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "SI", "NO" }));
        PanelModificarMascota.add(cmbAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 110, -1));

        labelErrorAlergico.setForeground(new java.awt.Color(255, 0, 0));
        PanelModificarMascota.add(labelErrorAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 110, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Color:");
        PanelModificarMascota.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });
        PanelModificarMascota.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 170, -1));

        labelErrorColor.setForeground(new java.awt.Color(255, 0, 0));
        PanelModificarMascota.add(labelErrorColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 110, 20));

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel28.setText("Especie:");
        PanelModificarMascota.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEspecieKeyTyped(evt);
            }
        });
        PanelModificarMascota.add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 170, -1));

        labelErrorEspecie.setForeground(new java.awt.Color(255, 0, 0));
        PanelModificarMascota.add(labelErrorEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 110, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Raza:");
        PanelModificarMascota.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazaKeyTyped(evt);
            }
        });
        PanelModificarMascota.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 170, -1));

        labelErrorRaza.setForeground(new java.awt.Color(255, 0, 0));
        PanelModificarMascota.add(labelErrorRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 110, 20));

        nombreMascota.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombreMascota.setText("Nombre Mascota:");
        PanelModificarMascota.add(nombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        txtNombreMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreMascotaKeyTyped(evt);
            }
        });
        PanelModificarMascota.add(txtNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 170, -1));

        labelErrorMascota.setForeground(new java.awt.Color(255, 0, 0));
        PanelModificarMascota.add(labelErrorMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 110, 20));

        labelErrorBuscarMascota.setForeground(new java.awt.Color(255, 0, 0));
        PanelModificarMascota.add(labelErrorBuscarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 110, 20));

        btnBuscarMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupaNegra24.png"))); // NOI18N
        btnBuscarMas.setText("Buscar");
        btnBuscarMas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarMas.setEnabled(false);
        btnBuscarMas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarMas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/lupaVioleta24.png"))); // NOI18N
        btnBuscarMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMasActionPerformed(evt);
            }
        });
        PanelModificarMascota.add(btnBuscarMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 80, -1));

        btnRestablecerMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restablecer Negro 24.png"))); // NOI18N
        btnRestablecerMascota.setText("Restablecer Mascota");
        btnRestablecerMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRestablecerMascota.setEnabled(false);
        btnRestablecerMascota.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/restablecer Violet 24.png"))); // NOI18N
        btnRestablecerMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerMascotaActionPerformed(evt);
            }
        });
        PanelModificarMascota.add(btnRestablecerMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, 30));

        PanelIngresoNuevo.add(PanelModificarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 440, 370));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 255));
        PanelIngresoNuevo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 330, 10));

        PanelContendorModificar.add(PanelIngresoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 720));

        getContentPane().add(PanelContendorModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        volverPestanaTurnos();
    }//GEN-LAST:event_btnVolverActionPerformed

    public void volverPestanaTurnos() {
    
        //Llamo al form de Registros para que se vuelva a abrir y cargar
        //con los registros desde la BD
        Principal princi = new Principal();
        princi.setVisible(true);
        princi.setLocationRelativeTo(null);
        
        /*Una vez abra el Form Principal, me mande al metodo, que me mostrara
        la pestaña de Lista de Mascotas*/
        princi.mostrarPestanaListaMascotas();

        //Cierro el form
        this.dispose();
    }
    
    private void btnElejirDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElejirDuenioActionPerformed

        /*Habilito el combo de Duenio*/
        cmbOtroDuenioModi.setEnabled(true);
        
        /*Habilito el boton Buscar de Duenio*/
        btnBuscarDuenioModi.setEnabled(true);
        
        /*Desabilito el boton Guardar*/
        btnGuardarCambioMascotaDuenio.setEnabled(false);
        
        /*Deshabilito los txt de Duenio*/
        txtDuenio.setEnabled(false);
        txtApellidoDuenio.setEnabled(false);
        txtCelular.setEnabled(false);
    }//GEN-LAST:event_btnElejirDuenioActionPerformed

    private void recargarTodosCombosModi() {
    
        cargarComboDuenioModi();
        cargarComboMascotaModi();
    }
    
    private void cargarComboDuenioModi() {
    
        /*Otra forma:*/
        DefaultComboBoxModel modeloComboDuenio = new DefaultComboBoxModel();
        
        List<Duenio> listaDuenios = controlLogica.traerListaDuenios();
        
        modeloComboDuenio.addElement("<Seleccione>");
        
        if(listaDuenios.size() > 0){
            for(Duenio duenio: listaDuenios){
                
                modeloComboDuenio.addElement(duenio.mostrarNombreCompleto());
            }
        }
        
        cmbOtroDuenioModi.setModel(modeloComboDuenio);
    }
    
    private void cargarComboMascotaModi() {
    
        /*Otra forma:*/
        DefaultComboBoxModel modeloComboMascota = new DefaultComboBoxModel();
        
        List<Mascota> listaMascotas = controlLogica.traerListaMascotas();
        
        modeloComboMascota.addElement("<Seleccione>");
        
        if(listaMascotas.size() > 0){
            for(Mascota mascota: listaMascotas){
                
                modeloComboMascota.addElement(mascota.mostrarMascota());
            }
        }
        
        cmbBuscarMascotaModi.setModel(modeloComboMascota);
    }
    
    private void btnAceptarDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarDuenioActionPerformed
     
        if ( validarDuenioCombo() ) {

            /*Traigo los datos del Duenio*/
            String nombre = txtDuenio.getText();
            String apellido = txtApellidoDuenio.getText();
            String celular = txtCelular.getText();
                
            /*Traigo el id de la Relacion seleccionada desde la Tabla*/
            Relacion rela = controlLogica.traerUnaRelacion(bandera);
        
            /*Le modifico el Duenio a la Relacion, el duenio lo obtuve del combo*/
            controlLogica.modificarDuenioEnRelacion(rela, due);
            
            /*Paso el Duenio que traje del combo para Modificar sus datos en la BD*/
            /*controlLogica.modiDuenio(due, nombre, apellido, celular);*/
            
            /*Recargar todos los Combos*/
            /*recargarTodosCombosModi();*/
            
            apagarBotonesDuenio();
            
            /*Muestro mensaje de que todo salio bien*/
            mostrarMensaje("Duenio asociado a la Mascota "
            + "actual correctamente!", "Info", 
            "Editar Relacion de Dueño con Mascota");
                
            if ( !(btnAceptarDuenio.isEnabled()) && !(btnAceptarMascota.isEnabled()) ) {
            
                btnGuardarCambioMascotaDuenio.setEnabled(true);
            }
        }

    }//GEN-LAST:event_btnAceptarDuenioActionPerformed

    private void apagarBotonesDuenio() {
    
        btnBuscarDuenioModi.setEnabled(false);
        cmbOtroDuenioModi.setSelectedIndex(0);
        cmbOtroDuenioModi.setEnabled(false);
        btnAceptarDuenio.setEnabled(false);
        btnRestablecerDuenio.setEnabled(false);
        
        /*Habilito los txt de Duenio*/
        txtDuenio.setEnabled(true);
        txtApellidoDuenio.setEnabled(true);
        txtCelular.setEnabled(true);
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarCambioMascotaDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambioMascotaDuenioActionPerformed
      
        
        if ( validarMascotaYDuenio() ) {
            
            String nombreMascota = txtNombreMascota.getText();
            String raza = txtRaza.getText();
            String especie = txtEspecie.getText();
            String color = txtColor.getText();
            String alergico = (String) cmbAlergico.getSelectedItem();
            String atencion = (String) cmbAtencion.getSelectedItem();
            
            String nombreDuenio = txtDuenio.getText();
            String apellido = txtApellidoDuenio.getText();
            String celular = txtCelular.getText();
            String observaciones = txtObservaciones.getText();

            /*Traigo el id de la Relacion seleccionada desde la Tabla*/
            Relacion rela = controlLogica.traerUnaRelacion(bandera);
            
            /*Obtengo el Duenio y Mascota de esa Relacion*/
            Mascota masco = rela.getMascota();
            Duenio duenio = rela.getDuenio();
            
            /*Modifico al Duenio*/
            controlLogica.modiDuenio(duenio, nombreDuenio, 
            apellido, celular);
            
            /*Modifico a la Mascota*/
            controlLogica.modiMascota(masco, nombreMascota, 
            raza, especie, color, alergico, atencion, observaciones);
            
            /*Recargar todos los Combos*/
            /*recargarTodosCombosModi();*/
            
            limpiar();
            
            btnElejirMascota.setEnabled(false);
            btnElejirDuenio.setEnabled(false);
            
            /*Muestro mensaje de que todo salio bien*/
            mostrarMensaje("Datos del Duenio y Mascota guardados "
            + "correctamente!", "Info", "Editar");
                
            volverPestanaTurnos();
        }
    }//GEN-LAST:event_btnGuardarCambioMascotaDuenioActionPerformed

    private void mostrarMensaje(String mensaje, String tipoMensaje, String titulo) {
        
        JOptionPane optionPane = new JOptionPane(mensaje);
        
        if ( tipoMensaje.equalsIgnoreCase("Info") ) {
            
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            
        } else if ( tipoMensaje.equalsIgnoreCase("Error") ) {
        
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    private void btnElejirMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElejirMascotaActionPerformed

        /*Habilito el combo de Mascota*/
        cmbBuscarMascotaModi.setEnabled(true);
        
        /*Habilito el boton Buscar de Mascota*/
        btnBuscarMas.setEnabled(true);
       
        /*Desabilito el boton Guardar*/
        btnGuardarCambioMascotaDuenio.setEnabled(false);
        
        /*Deshabilito los txt de Mascota*/
        txtNombreMascota.setEnabled(false);
        txtRaza.setEnabled(false);
        txtEspecie.setEnabled(false);
        txtColor.setEnabled(false);
        cmbAlergico.setEnabled(false);
        cmbAtencion.setEnabled(false);
        txtObservaciones.setEnabled(false);
    }//GEN-LAST:event_btnElejirMascotaActionPerformed

    private void btnAceptarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarMascotaActionPerformed

        if ( validarAceptarMascota() ) {
            
            /*Traigo los datos de la Mascota*/
            String nombre = txtNombreMascota.getText();
            String raza = txtRaza.getText();
            String especie = txtEspecie.getText();
            String color = txtColor.getText();
            String alergico = (String)cmbAlergico.getSelectedItem();
            String atencion = (String)cmbAtencion.getSelectedItem();
            String observacion = txtObservaciones.getText();
                
            /*Traigo el id de la Relacion seleccionada desde la Tabla*/
            Relacion rela = controlLogica.traerUnaRelacion(bandera);
        
            /*Le modifico la Mascota a la Relacion*/
            controlLogica.modificarMascotaEnRelacion(rela, ma);
            
            /*Paso la Mascota para Modificar en la BD*/
            /*controlLogica.modiMascota(ma, nombre, raza, especie, color, 
            alergico, atencion, observacion);*/
            
            /*Recargar todos los Combos*/
            /*recargarTodosCombosModi();*/
            
            apagarBotonesMascota();
            
            /*Muestro mensaje de que todo salio bien*/
            mostrarMensaje("Mascota asociada al Duenio Actual correctamente!", 
            "Info", "Editar Relacion de Mascota con Duenio");

            if ( !(btnAceptarDuenio.isEnabled()) && !(btnAceptarMascota.isEnabled()) ) {
            
                btnGuardarCambioMascotaDuenio.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnAceptarMascotaActionPerformed

    private void apagarBotonesMascota() {
    
        btnBuscarMas.setEnabled(false);
        cmbBuscarMascotaModi.setSelectedIndex(0);
        cmbBuscarMascotaModi.setEnabled(false);
        btnAceptarMascota.setEnabled(false);
        btnRestablecerMascota.setEnabled(false);
        
        
        /*Habilito los txt de Mascota*/
        txtNombreMascota.setEnabled(true);
        txtRaza.setEnabled(true);
        txtEspecie.setEnabled(true);
        txtColor.setEnabled(true);
        cmbAlergico.setEnabled(true);
        cmbAtencion.setEnabled(true);
        txtObservaciones.setEnabled(true);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        recargarTodosCombosModi();
    }//GEN-LAST:event_formWindowOpened

    
    public void buscarMascota() {
        
        /*Obtengo el nombre de la Mascota seleccionada en el Combo*/
        String mascotaStr = cmbBuscarMascotaModi.getSelectedItem().toString();
        
        /*Traigo el index seleccionado en el Combo*/
        int mascoInt = cmbBuscarMascotaModi.getSelectedIndex();
        
        /*Consegui la Mascota seleccionada en el Combo*/
        Mascota masco = controlLogica.buscarMascota(mascoInt, mascotaStr);   
        
        /*Traigo la Mascota con ese id*/
        /*Mascota masco = controlLogica.buscarUnaMascota(iDMascota);*/
            
        /*Muestro los Datos de la Mascota seleccionada en el Combo*/
        mostrarMascotaComboSeleccionada(masco);
    }
    
    private void btnBuscarMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMasActionPerformed

        if ( validarElijioMascotaCombo() ) {
        
            buscarMascota();
            
            /*Habilito el boton Aceptar Mascota*/
            btnAceptarMascota.setEnabled(true);
            
            /*Habilito el boton Reestablecer Datos de la Mascota*/
            btnRestablecerMascota.setEnabled(true);
        } 
    }//GEN-LAST:event_btnBuscarMasActionPerformed

    private void btnBuscarDuenioModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDuenioModiActionPerformed

        /*Pregunto si seleciono al Duenio*/ 
        if ( validarElijioDuenioCombo() ) {

            buscarDuenio();

            /*Habilito el boton Aceptar Duenio*/
            btnAceptarDuenio.setEnabled(true);
            
            /*Habilito el boton Reestablecer Datos del Duenio*/
            btnRestablecerDuenio.setEnabled(true);
        }
    }//GEN-LAST:event_btnBuscarDuenioModiActionPerformed

    private void cmbOtroDuenioModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOtroDuenioModiActionPerformed

    }//GEN-LAST:event_cmbOtroDuenioModiActionPerformed

    private void btnRestablecerMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerMascotaActionPerformed

        /*Deshabilito momentaneamente todo el Ingreso de OTRA MASCOTA*/
        cmbBuscarMascotaModi.setSelectedIndex(0);
        cmbBuscarMascotaModi.setEnabled(false);
        btnBuscarMas.setEnabled(false);
        btnAceptarMascota.setEnabled(false);
        
        /*Por si selecciono una Mascota del Combo por Error, Reestablesco los
        Datos de la Mascota seleccionada en la Tabla*/
        mostrarMascotaDeTablaEnModi(bandera);
        
        /*Habilito el boton Guardar*/
        btnGuardarCambioMascotaDuenio.setEnabled(true);
        
        /*Habilito los txt de Mascota*/
        txtNombreMascota.setEnabled(true);
        txtRaza.setEnabled(true);
        txtEspecie.setEnabled(true);
        txtColor.setEnabled(true);
        cmbAlergico.setEnabled(true);
        cmbAtencion.setEnabled(true);
        txtObservaciones.setEnabled(true);
        
        labelErrorBuscarMascota.setText("");
        
        /*Deshabilito una vez usado el boton Reestablecer Datos*/
        btnRestablecerMascota.setEnabled(false);
    }//GEN-LAST:event_btnRestablecerMascotaActionPerformed

    private void btnRestablecerDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerDuenioActionPerformed
        
        cmbOtroDuenioModi.setSelectedIndex(0);
        cmbOtroDuenioModi.setEnabled(false);
        btnBuscarDuenioModi.setEnabled(false);
        btnAceptarDuenio.setEnabled(false);
        
        /*Por si selecciono un Duenio del Combo por Error, Reestablesco los
        Datos del Duenio seleccionado en la Tabla*/
        mostrarDuenioDeTablaEnModi(bandera);
        
        /*Habilito boton Guardar*/
        btnGuardarCambioMascotaDuenio.setEnabled(true);
        
        /*Habilito los txt de Duenio*/
        txtDuenio.setEnabled(true);
        txtApellidoDuenio.setEnabled(true);
        txtCelular.setEnabled(true);
        
        labelErrorDuenioModi.setText("");
        
        /*Deshabilito una vez usado el boton Reestablecer Datos*/
        btnRestablecerDuenio.setEnabled(false);
    }//GEN-LAST:event_btnRestablecerDuenioActionPerformed

    private void txtNombreMascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMascotaKeyTyped
        //Para controlar que solo se ingresen Letras en el txt
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)  ) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreMascotaKeyTyped

    private void txtRazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazaKeyTyped
        //Para controlar que solo se ingresen Letras en el txt
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)  ) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txtRazaKeyTyped

    private void txtEspecieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEspecieKeyTyped
        //Para controlar que solo se ingresen Letras en el txt
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)  ) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txtEspecieKeyTyped

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        //Para controlar que solo se ingresen Letras en el txt
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)  ) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txtColorKeyTyped

    private void txtObservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionesKeyTyped

    }//GEN-LAST:event_txtObservacionesKeyTyped

    private void txtDuenioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuenioKeyTyped
        //Para controlar que solo se ingresen Letras en el txt
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)  ) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txtDuenioKeyTyped

    private void txtApellidoDuenioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoDuenioKeyTyped
        //Para controlar que solo se ingresen Letras en el txt
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)  ) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoDuenioKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        //Para que controlar que solo se ingrese nros.
        int tecla = evt.getKeyChar();
        boolean numero = tecla >= 48 && tecla <= 57;
        
        if (!numero) {
            
            evt.consume();
        }
        
        //Solo permite ingresar hasta 14 nros.
        if (txtCelular.getText().trim().length() == 14) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txtCelularKeyTyped
  
    private void limpiar() {
    
        txtNombreMascota.setText("");
        txtRaza.setText("");
        txtEspecie.setText("");
        txtColor.setText("");
        
        cmbAlergico.setSelectedIndex(0);
        cmbAtencion.setSelectedIndex(0);
        txtObservaciones.setText("");
        
        txtDuenio.setText("");
        txtApellidoDuenio.setText("");
        txtCelular.setText("");
        
        cmbBuscarMascotaModi.setSelectedIndex(0);
        cmbOtroDuenioModi.setSelectedIndex(0);
        
        /*Limpiar mensajes de advertencia*/
        labelErrorMascota.setText("");
        labelErrorRaza.setText("");
        labelErrorEspecie.setText("");
        labelErrorColor.setText("");
        labelErrorAlergico.setText("");
        labelErrorAtencion.setText("");
        labelErrorDuenio.setText("");
        labelErrorApellido.setText("");
        labelErrorCelular.setText("");
        labelErrorBuscarMascota.setText("");
        labelErrorDuenioModi.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContendorModificar;
    private javax.swing.JPanel PanelDuenio;
    private javax.swing.JPanel PanelIngresoNuevo;
    private javax.swing.JPanel PanelModificarMascota;
    private javax.swing.JLabel TitutoIngresoMascota;
    private javax.swing.JButton btnAceptarDuenio;
    private javax.swing.JButton btnAceptarMascota;
    private javax.swing.JButton btnBuscarDuenioModi;
    private javax.swing.JButton btnBuscarMas;
    private javax.swing.JButton btnElejirDuenio;
    private javax.swing.JButton btnElejirMascota;
    private javax.swing.JButton btnGuardarCambioMascotaDuenio;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRestablecerDuenio;
    private javax.swing.JButton btnRestablecerMascota;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencion;
    private javax.swing.JComboBox<String> cmbBuscarMascotaModi;
    private javax.swing.JComboBox<String> cmbOtroDuenioModi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelBuscarDuenio;
    private javax.swing.JLabel labelBuscarMascotaModi;
    private javax.swing.JLabel labelErrorAlergico;
    private javax.swing.JLabel labelErrorApellido;
    private javax.swing.JLabel labelErrorAtencion;
    private javax.swing.JLabel labelErrorBuscarMascota;
    private javax.swing.JLabel labelErrorCelular;
    private javax.swing.JLabel labelErrorColor;
    private javax.swing.JLabel labelErrorDuenio;
    private javax.swing.JLabel labelErrorDuenioModi;
    private javax.swing.JLabel labelErrorEspecie;
    private javax.swing.JLabel labelErrorMascota;
    private javax.swing.JLabel labelErrorRaza;
    private javax.swing.JLabel labelLana;
    private javax.swing.JLabel labelOsito;
    private javax.swing.JLabel labelPatito;
    private javax.swing.JLabel labelRaton;
    private javax.swing.JLabel nombreMascota;
    private javax.swing.JTextField txtApellidoDuenio;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDuenio;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables


    private boolean validarMascotaYDuenio() {
        
        boolean valido = true;
        
        if ( txtNombreMascota.getText().isEmpty() ) {
            
            labelErrorMascota.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtRaza.getText().isEmpty() ) {
            
            labelErrorRaza.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtEspecie.getText().isEmpty() ) {
            
            labelErrorEspecie.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtColor.getText().isEmpty() ) {
            
            labelErrorColor.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( !(cmbAlergico.getSelectedIndex() > 0)) {
            
            labelErrorAlergico.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( !(cmbAtencion.getSelectedIndex() > 0)) {
            
            labelErrorAtencion.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtDuenio.getText().isEmpty() ) {
            
            labelErrorDuenio.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtApellidoDuenio.getText().isEmpty() ) {
            
            labelErrorApellido.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtCelular.getText().isEmpty() ) {
            
            labelErrorCelular.setText("• Campo Requerido");
            valido = false;
        }
        
        return valido;
    }

    private boolean validarAceptarMascota() {
        
        boolean valido = true;
        
        if ( txtNombreMascota.getText().isEmpty() ) {
            
            labelErrorMascota.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtRaza.getText().isEmpty() ) {
            
            labelErrorRaza.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtEspecie.getText().isEmpty() ) {
            
            labelErrorEspecie.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtColor.getText().isEmpty() ) {
            
            labelErrorColor.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( !(cmbAlergico.getSelectedIndex() > 0)) {
            
            labelErrorAlergico.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( !(cmbAtencion.getSelectedIndex() > 0)) {
            
            labelErrorAtencion.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( !(cmbBuscarMascotaModi.getSelectedIndex() > 0)) {
            
            labelErrorBuscarMascota.setText("• Campo Requerido");
            valido = false;
        }
        
        return valido;
    }

    private boolean validarElijioMascotaCombo() {
        
        boolean valido = true;
        if ( !(cmbBuscarMascotaModi.getSelectedIndex() > 0) ) {
            
            labelErrorBuscarMascota.setText("• Campo Requerido");
            valido = false;
        }
        
        return valido;
    }

    private boolean validarElijioDuenioCombo() {
        
        boolean valido = true;
        if ( !(cmbOtroDuenioModi.getSelectedIndex() > 0) ) {
            
            labelErrorDuenioModi.setText("• Campo Requerido");
            valido = false;
        }
        
        return valido;
    }

    private boolean validarDuenioCombo() {
      
        boolean valido = true;
        if ( txtDuenio.getText().isEmpty() ) {
            
            labelErrorDuenio.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtApellidoDuenio.getText().isEmpty() ) {
            
            labelErrorApellido.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtCelular.getText().isEmpty() ) {
            
            labelErrorCelular.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( !(cmbOtroDuenioModi.getSelectedIndex() > 0) ) {
            
            labelErrorDuenioModi.setText("• Campo Requerido");
            valido = false;
        }
        
        /*Mascota*/
        if ( txtNombreMascota.getText().isEmpty() ) {
            
            labelErrorMascota.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtRaza.getText().isEmpty() ) {
            
            labelErrorRaza.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtEspecie.getText().isEmpty() ) {
            
            labelErrorEspecie.setText("• Campo Requerido");
            valido = false;
        }
        if ( txtColor.getText().isEmpty() ) {
            
            labelErrorColor.setText("• Campo Requerido");
            valido = false;
        }
        if ( !(cmbAlergico.getSelectedIndex() > 0) ) {
            
            labelErrorAlergico.setText("• Campo Requerido");
            valido = false;
        }
        if ( !(cmbAtencion.getSelectedIndex() > 0) ) {
            
            labelErrorAtencion.setText("• Campo Requerido");
            valido = false;
        }
        return valido;
    }

    int bandera;
    public void enviarRelacion(Relacion rela) {
        
        /*Si selecciono una Mascota del Combo*/
        bandera = rela.getIdRelacion();

        /*Si NO selecciono una Mascota del Combo*/
        mostrarRelacionDeTablaEnModi(rela);

    }

    Relacion re;
    public void mostrarRelacionDeTablaEnModi(Relacion rela){
        
        /*Aca me llega el Id de la Relacion seleccionada en la Tabla*/
        
        /*Traigo la Relacion cuyo Id es id_Rela que me llega*/
        /*Relacion rela = controlLogica.traerUnaRelacion(id_Rela);*/
        re = rela;
        
        /*Muestro cada Dato de Mascota y Duenio que estan en esa Relacion*/
        txtNombreMascota.setText(rela.getMascota().getNombre());
        txtRaza.setText(rela.getMascota().getRaza());
        txtEspecie.setText(rela.getMascota().getEspecie());
        txtColor.setText(rela.getMascota().getColor());
        if ( rela.getMascota().getAlergico().equalsIgnoreCase("SI") ) {
            
                cmbAlergico.setSelectedIndex(1);
            
            } else if ( rela.getMascota().getAlergico().equalsIgnoreCase("NO") ){
            
                cmbAlergico.setSelectedIndex(2);
            }
        
            if ( rela.getMascota().getAtencion().equalsIgnoreCase("SI") ) {
            
                cmbAtencion.setSelectedIndex(1);
            
            } else if ( rela.getMascota().getAtencion().equalsIgnoreCase("NO") ){
            
                cmbAtencion.setSelectedIndex(2);
            }
        txtObservaciones.setText(rela.getMascota().getObservacion());
        
        txtDuenio.setText(rela.getDuenio().getNombre());
        txtApellidoDuenio.setText(rela.getDuenio().getApellido());
        txtCelular.setText(rela.getDuenio().getCelular()); 
    }

    
    Mascota ma;
    private void mostrarMascotaComboSeleccionada(Mascota masco) {
        
        /*Muestro cada Datos de Mascota*/
        txtNombreMascota.setText(masco.getNombre());
        txtRaza.setText(masco.getRaza());
        txtEspecie.setText(masco.getEspecie());
        txtColor.setText(masco.getColor());
        if ( masco.getAlergico().equalsIgnoreCase("SI") ) {
            
                cmbAlergico.setSelectedIndex(1);
            
            } else if (masco.getAlergico().equalsIgnoreCase("NO") ){
            
                cmbAlergico.setSelectedIndex(2);
            }
        
            if ( masco.getAtencion().equalsIgnoreCase("SI") ) {
            
                cmbAtencion.setSelectedIndex(1);
            
            } else if ( masco.getAtencion().equalsIgnoreCase("NO") ){
            
                cmbAtencion.setSelectedIndex(2);
            }
        txtObservaciones.setText(masco.getObservacion());
        
        ma = masco;
    }

    private void buscarDuenio() {
        
        /*Obtengo el nombre del Duenio seleccionada en el Combo*/
        String duenioStr = cmbOtroDuenioModi.getSelectedItem().toString();
        
        /*Traigo el index seleccionado en el Combo*/
        int duenioInt = cmbOtroDuenioModi.getSelectedIndex();
        
        /*Consegui el id del Duenio seleccionada en el Combo*/
        Duenio duenio = controlLogica.buscarDuenio(duenioStr, duenioInt);   
        
        /*Traigo el Duenio con ese id*/
        /*Duenio duenio = controlLogica.buscarUnDuenio(iDDuenio);*/
            
        /*Muestro los Datos del Duenio seleccionado en el Combo*/
        mostrarDuenioComboSeleccionado(duenio);
    }

    Duenio due;
    private void mostrarDuenioComboSeleccionado(Duenio duenio) {
        
        /*Muestro cada Datos del Duenio*/
        txtDuenio.setText(duenio.getNombre());
        txtApellidoDuenio.setText(duenio.getApellido());
        txtCelular.setText(duenio.getCelular());
        
        due = duenio;
    }

    private void mostrarMascotaDeTablaEnModi(int bandera) {
        
        /*Aca me llega el Id de la Relacion seleccionada en la Tabla*/
        
        /*Traigo la Relacion cuyo Id es id_Rela que me llega*/
        Relacion rela = controlLogica.traerUnaRelacion(bandera);
        
        /*Muestro cada Dato de Mascota y Duenio que estan en esa Relacion*/
        txtNombreMascota.setText(rela.getMascota().getNombre());
        txtRaza.setText(rela.getMascota().getRaza());
        txtEspecie.setText(rela.getMascota().getEspecie());
        txtColor.setText(rela.getMascota().getColor());
        if ( rela.getMascota().getAlergico().equalsIgnoreCase("SI") ) {
            
                cmbAlergico.setSelectedIndex(1);
            
            } else if ( rela.getMascota().getAlergico().equalsIgnoreCase("NO") ){
            
                cmbAlergico.setSelectedIndex(2);
            }
        
            if ( rela.getMascota().getAtencion().equalsIgnoreCase("SI") ) {
            
                cmbAtencion.setSelectedIndex(1);
            
            } else if ( rela.getMascota().getAtencion().equalsIgnoreCase("NO") ){
            
                cmbAtencion.setSelectedIndex(2);
            }
        txtObservaciones.setText(rela.getMascota().getObservacion());
    }

    private void mostrarDuenioDeTablaEnModi(int bandera) {
        
        /*Aca me llega el Id de la Relacion seleccionada en la Tabla*/
        
        /*Traigo la Relacion cuyo Id es id_Rela que me llega*/
        Relacion rela = controlLogica.traerUnaRelacion(bandera);
        
        txtDuenio.setText(rela.getDuenio().getNombre());
        txtApellidoDuenio.setText(rela.getDuenio().getApellido());
        txtCelular.setText(rela.getDuenio().getCelular()); 
    }

    /*private boolean compararMascotaDelCombo() {
        
        boolean valido = true;
        /*Traigo los datos Nuevos que ingrese en los txt para la Mascota que eleji
        en el Combo*/
        /*Traigo los datos de la Mascota*/
        /*String nombre = txtNombreMascota.getText();
        String raza = txtRaza.getText();
        String especie = txtEspecie.getText();
        String color = txtColor.getText();
        String alergico = (String)cmbAlergico.getSelectedItem();
        String atencion = (String)cmbAtencion.getSelectedItem();
        String observacion = txtObservaciones.getText();
        
        boolean val = controlLogica.compararMascotas(ma, nombre, raza, especie, 
                color, alergico, atencion);
        
        if ( val ) {
        
            valido = true;
        } else {
        
            valido = false;
        }
        
        return valido;
    }*/
 
}
