package com.mycompany.petshop.igu;

import com.mycompany.petshop.logica.ControladoraLogica;
import com.mycompany.petshop.logica.Duenio;
import com.mycompany.petshop.logica.Mascota;
import com.mycompany.petshop.logica.Relacion;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class SacarTurno extends javax.swing.JFrame {

    ControladoraLogica controlLogica = new ControladoraLogica();
    
    private String errorRazonTurno = "• Seleccione al menos un "
                    + "razon para el turno";
    private Object java;
    
    public SacarTurno() {
        initComponents();
    }

    private String strToHtml(String texto) {
    
        return "<html><p>" + texto + "</p></html>";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        PanelContenedor = new javax.swing.JPanel();
        PanelIngresoTurno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMascotaTurno = new javax.swing.JTextField();
        txtDuenioTurno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jdcFechaTurno = new com.toedter.calendar.JDateChooser();
        labelTituloIngresarTurno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbAtencionTurno = new javax.swing.JComboBox<>();
        cmbPeluqueriaTurno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        labelErrorAtencionTurno = new javax.swing.JLabel();
        labelErrorFechaTurno = new javax.swing.JLabel();
        btnRestablecerDatosTurno = new javax.swing.JButton();
        labelErrorPeluqueria = new javax.swing.JLabel();
        btnLimpiarT = new javax.swing.JButton();
        btnGuardarT = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelIngresoTurno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Mascota:");
        PanelIngresoTurno.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Dueño:");
        PanelIngresoTurno.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtMascotaTurno.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtMascotaTurno.setEnabled(false);
        PanelIngresoTurno.add(txtMascotaTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 180, -1));

        txtDuenioTurno.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtDuenioTurno.setEnabled(false);
        PanelIngresoTurno.add(txtDuenioTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 180, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Fecha Turno:");
        PanelIngresoTurno.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        PanelIngresoTurno.add(jdcFechaTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 140, -1));

        labelTituloIngresarTurno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        labelTituloIngresarTurno.setText("Ingresar Turno");
        PanelIngresoTurno.add(labelTituloIngresarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Atencion Medica:");
        PanelIngresoTurno.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Peluqueria:");
        PanelIngresoTurno.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 80, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Descripcion:");
        PanelIngresoTurno.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, 20));

        cmbAtencionTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "SI", "NO" }));
        PanelIngresoTurno.add(cmbAtencionTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 110, 25));

        cmbPeluqueriaTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "SI", "NO" }));
        PanelIngresoTurno.add(cmbPeluqueriaTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 110, 25));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        PanelIngresoTurno.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 170, 90));

        labelErrorAtencionTurno.setForeground(new java.awt.Color(255, 0, 0));
        labelErrorAtencionTurno.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelErrorAtencionTurno.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        PanelIngresoTurno.add(labelErrorAtencionTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 110, 20));

        labelErrorFechaTurno.setForeground(new java.awt.Color(255, 0, 0));
        PanelIngresoTurno.add(labelErrorFechaTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 110, 20));

        btnRestablecerDatosTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restablecer Negro 24.png"))); // NOI18N
        btnRestablecerDatosTurno.setText("Restablecer");
        btnRestablecerDatosTurno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRestablecerDatosTurno.setContentAreaFilled(false);
        btnRestablecerDatosTurno.setFocusPainted(false);
        btnRestablecerDatosTurno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRestablecerDatosTurno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/restablecer Violet 24.png"))); // NOI18N
        btnRestablecerDatosTurno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRestablecerDatosTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerDatosTurnoActionPerformed(evt);
            }
        });
        PanelIngresoTurno.add(btnRestablecerDatosTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        labelErrorPeluqueria.setForeground(new java.awt.Color(255, 0, 0));
        PanelIngresoTurno.add(labelErrorPeluqueria, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 110, 20));

        btnLimpiarT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLimpiarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Limpiarnegro24.png"))); // NOI18N
        btnLimpiarT.setText("Limpiar");
        btnLimpiarT.setBorder(null);
        btnLimpiarT.setContentAreaFilled(false);
        btnLimpiarT.setFocusPainted(false);
        btnLimpiarT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiarT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Limpiarvioleta24.png"))); // NOI18N
        btnLimpiarT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTActionPerformed(evt);
            }
        });
        PanelIngresoTurno.add(btnLimpiarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 60, 60));

        btnGuardarT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Guardarnegro24.png"))); // NOI18N
        btnGuardarT.setText("Guardar");
        btnGuardarT.setBorder(null);
        btnGuardarT.setContentAreaFilled(false);
        btnGuardarT.setFocusPainted(false);
        btnGuardarT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Guardarvioleta24.png"))); // NOI18N
        btnGuardarT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTActionPerformed(evt);
            }
        });
        PanelIngresoTurno.add(btnGuardarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 60, 60));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volverNegro64.png"))); // NOI18N
        btnVolver.setText("Atras");
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setFocusPainted(false);
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/volverVioletaSinFondo64.png"))); // NOI18N
        btnVolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        PanelIngresoTurno.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 70, 90));

        PanelContenedor.add(PanelIngresoTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 490));

        getContentPane().add(PanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        volverPestanaTurnos();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRestablecerDatosTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerDatosTurnoActionPerformed
        
        if ( validarTxt() ) {
            
            Relacion rela = controlLogica.traerUnaRelacion(bandera);
        
            Duenio duenio = rela.getDuenio();
            Mascota mascota = rela.getMascota();
            cargarDatosEnTurno(mascota, duenio);
        }
    }//GEN-LAST:event_btnRestablecerDatosTurnoActionPerformed

    private void btnGuardarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTActionPerformed
        
        if ( validarTurno() ) {
            
            /*Obtengo la Relacion seleccionada en la Tabla*/
            Relacion rela = controlLogica.traerUnaRelacion(bandera);
        
            /*De la Relacion, saco el Duenio y Mascota*/
            Duenio duenio = rela.getDuenio();
            Mascota mascota = rela.getMascota();
            
            if ( !(cmbAtencionTurno.getSelectedIndex() > 0) ) {
            
                cmbAtencionTurno.setSelectedIndex(2);   
            }
        
            if ( !(cmbPeluqueriaTurno.getSelectedIndex() > 0)  ) {
            
                cmbPeluqueriaTurno.setSelectedIndex(2); 
            }
            
            String atencion = (String) cmbAtencionTurno.getSelectedItem();
            String peluqueria = (String) cmbPeluqueriaTurno.getSelectedItem();
            String descripcion = txtDescripcion.getText();
            
            controlLogica.guardarTurno(mascota, duenio, fechaSql, atencion, 
                    peluqueria, descripcion);
            
            limpiar();
            
            /*Deshabilito el boton Restablecer datos*/
            btnRestablecerDatosTurno.setEnabled(false);
            
            mostrarMensaje("Turno guardado correctamente!",
                "Info", "Crear Turno");
            
            Principal princi = new Principal();
            princi.setVisible(true);
            princi.setLocationRelativeTo(null);
            
            /*Una vez abra el Form Principal, me mande al metodo, que me mostrara
            la pestaña de Lista de Turnos y Mascotas*/
            princi.mostrarPestanaListaMascotas();
          /*princi.cargarTablaTurnos();*/

            //Cierro el form
            this.dispose();
        }
    }//GEN-LAST:event_btnGuardarTActionPerformed

    private void btnLimpiarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTActionPerformed
        
        limpiar();
    }//GEN-LAST:event_btnLimpiarTActionPerformed

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
    
    private void limpiar() {
    
        jdcFechaTurno.setCalendar(null);
        txtMascotaTurno.setText("");
        txtDuenioTurno.setText("");
        cmbAtencionTurno.setSelectedIndex(0);
        cmbPeluqueriaTurno.setSelectedIndex(0);
        txtDescripcion.setText("");
        
        labelErrorFechaTurno.setText("");
        labelErrorAtencionTurno.setText("");
    }
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelIngresoTurno;
    private javax.swing.JButton btnGuardarT;
    private javax.swing.JButton btnLimpiarT;
    private javax.swing.JButton btnRestablecerDatosTurno;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAtencionTurno;
    private javax.swing.JComboBox<String> cmbPeluqueriaTurno;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaTurno;
    private javax.swing.JLabel labelErrorAtencionTurno;
    private javax.swing.JLabel labelErrorFechaTurno;
    private javax.swing.JLabel labelErrorPeluqueria;
    private javax.swing.JLabel labelTituloIngresarTurno;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDuenioTurno;
    private javax.swing.JTextField txtMascotaTurno;
    // End of variables declaration//GEN-END:variables

    int bandera;
    public void enviarRelacionTurno(Relacion rela) {
        
        bandera = rela.getIdRelacion();
        
        Duenio duenio = rela.getDuenio();
        Mascota mascota = rela.getMascota();
        
        cargarDatosEnTurno(mascota, duenio);
    }

    private void cargarDatosEnTurno(Mascota mascota, Duenio duenio) {
        
        String mascoStr = mascota.mostrarMascota();
        String duenioStr = duenio.mostrarNombreCompleto();
        
        txtMascotaTurno.setText(mascoStr);
        txtDuenioTurno.setText(duenioStr);
    }

    java.sql.Date fechaSql;
    private boolean validarTurno() {

        boolean valido = true;
        
        /*Controlo la Exception en caso de que fechaIngresada sea null, 
        o sea no se haya ingresado nada en el JCalendar*/
        try{
        
            /*Obtengo la Fecha seleccionada en el JCalendar*/
            Date fechaIngresada = jdcFechaTurno.getDate();
            
            /*Con .getTime() convierto la fecha al Tipo de Dato long, y lo guardo
            en la variable long*/
            long fechaLong = fechaIngresada.getTime();
        
            /*Y con java.sql.Date hago que la fecha se vea en Formato sql, o sea:
            2025/02/10, y NO de la forma java.util.Date que es formate eeuu: 
            mon Sep 10 00:00:00 CDT 2025*/
            fechaSql = new java.sql.Date(fechaLong);
        
        } catch (NullPointerException e) {
        
            /*mostrarMensaje("Debe ingresar una Fecha", "Error",
            "Error al Ingresar Turno");*/
            labelErrorFechaTurno.setText("• Campo Requerido");
            valido = false;
        }
        
        /*if ( !(cmbAtencionTurno.getSelectedIndex() > 0) ) {
            
            /*labelErrorAtencionTurno.setText(strToHtml(errorRazonTurno));*/
            /*labelErrorAtencionTurno.setText("• Campo Requerido");
            valido = false;
        }*/
        
        /*if ( !(cmbPeluqueriaTurno.getSelectedIndex() > 0)  ) {
            
            labelErrorPeluqueria.setText("• Campo Requerido");
            valido = false;
        }*/
        
        return valido;
    }

    private boolean validarTxt() {
        
        boolean valido = true;
        
        if ( !(txtMascotaTurno.getText().isEmpty()) || 
             !(txtDuenioTurno.getText().isBlank()) ) {
            
            valido = false;
        }
        return valido;
    }
}
