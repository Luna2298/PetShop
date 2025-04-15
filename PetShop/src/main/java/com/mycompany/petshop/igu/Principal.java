package com.mycompany.petshop.igu;

import com.mycompany.petshop.logica.ControladoraLogica;
import com.mycompany.petshop.logica.DetalleVenta;
import com.mycompany.petshop.logica.DetalleVentaTurno;
import com.mycompany.petshop.logica.Duenio;
import com.mycompany.petshop.logica.Factura;
import com.mycompany.petshop.logica.FacturaDeTurno;
import com.mycompany.petshop.logica.Mascota;
import com.mycompany.petshop.logica.Producto;
import com.mycompany.petshop.logica.Relacion;
import com.mycompany.petshop.logica.Turno;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;


public class Principal extends javax.swing.JFrame {

    ControladoraLogica controlLogica = new ControladoraLogica();
    
    /*String print;*/
    
    /*Necesito tener para cada Tabla un Sorteador y/o Filtro, de lo contrario
    si uso el mismo para 2 Objetos y/o Tablas distintas, no funcionara*/
    private TableRowSorter<DefaultTableModel> sorter;
    private TableRowSorter<DefaultTableModel> sorterTurno;
    private TableRowSorter<DefaultTableModel> sorterProducto;

    
    public Principal() {
        initComponents();
        
        //Instancio la clase del Modelo de Spinner para CANTIDAD de PRODUCTOS
        SpinnerNumberModel spinner = new SpinnerNumberModel();
        //Valor maximo que se le puede Ingresar al Spinner
        spinner.setMaximum(50);
        //Valor minimo que se le puede Ingresar al Spinner
        spinner.setMinimum(0);
        //Le aplico las Caracterìsticas ANTERIORES Mencionadas
        //al Modelo del Spinner que tengo en el Form
        spinnerCantidad.setModel(spinner);
        
        //Instancio la clase del Modelo de Spinner para DESCUENTO POR PRODUCTOS
        SpinnerNumberModel spinnerDescuento = new SpinnerNumberModel();
        //Valor maximo que se le puede Ingresar al Spinner
        spinnerDescuento.setMaximum(80);
        //Valor minimo que se le puede Ingresar al Spinner
        spinnerDescuento.setMinimum(0);
        //Le aplico las Caracterìsticas ANTERIORES Mencionadas
        //al Modelo del Spinner que tengo en el Form
        spinnerDescuentoProducto.setModel(spinnerDescuento);
        
        //Instancio la clase del Modelo de Spinner para IVA POR PRODUCTOS
        SpinnerNumberModel spinnerIva = new SpinnerNumberModel();
        //Valor maximo que se le puede Ingresar al Spinner
        spinnerIva.setMaximum(80);
        //Valor minimo que se le puede Ingresar al Spinner
        spinnerIva.setMinimum(0);
        //Le aplico las Caracterìsticas ANTERIORES Mencionadas
        //al Modelo del Spinner que tengo en el Form
        spinnerIvaProducto.setModel(spinnerIva);
        
        /*======================  Ahora Spinner para la Factura final  ============*/
        //Instancio la clase del Modelo de Spinner para CANTIDAD de PRODUCTOS
        SpinnerNumberModel spinnerDescuCompra = new SpinnerNumberModel();
        //Valor maximo que se le puede Ingresar al Spinner
        spinnerDescuCompra.setMaximum(80);
        //Valor minimo que se le puede Ingresar al Spinner
        spinnerDescuCompra.setMinimum(0);
        //Le aplico las Caracterìsticas ANTERIORES Mencionadas
        //al Modelo del Spinner que tengo en el Form
        spinnerDescuentoCompra.setModel(spinnerDescuCompra);
        
        
        //Instancio la clase del Modelo de Spinner para CANTIDAD de PRODUCTOS
        SpinnerNumberModel spinnerIvaComp = new SpinnerNumberModel();
        //Valor maximo que se le puede Ingresar al Spinner
        spinnerIvaComp.setMaximum(80);
        //Valor minimo que se le puede Ingresar al Spinner
        spinnerIvaComp.setMinimum(0);
        //Le aplico las Caracterìsticas ANTERIORES Mencionadas
        //al Modelo del Spinner que tengo en el Form
        spinnerIvaCompra.setModel(spinnerIvaComp);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor = new javax.swing.JPanel();
        PanelMenu = new javax.swing.JPanel();
        btnlImagenMenu = new javax.swing.JButton();
        btnInformacionProgramador = new javax.swing.JButton();
        PanelBotonSalir = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        PanelBotonTienda = new javax.swing.JPanel();
        btnTienda = new javax.swing.JButton();
        PanelPagarTurnos = new javax.swing.JPanel();
        btnPagarTurnos = new javax.swing.JButton();
        PanelBotonTurnos = new javax.swing.JPanel();
        btnTurnos = new javax.swing.JButton();
        PanelBotonNuevo = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        TabedPestanas = new javax.swing.JTabbedPane();
        TabedIngresoMascota = new javax.swing.JPanel();
        labelPerritoPug = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        PanelIngresoNuevo = new javax.swing.JPanel();
        labelBurbujaDerecha3 = new javax.swing.JLabel();
        labelBurbujaDerecha1 = new javax.swing.JLabel();
        labelBurbujaFlotanteDerecha = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        PanelDuenio = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbDuenio = new javax.swing.JComboBox<>();
        btnIngresarDuenio = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDuenio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoDuenio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        btnAceptarDuenio = new javax.swing.JButton();
        labelErrorComboDuenio = new javax.swing.JLabel();
        labelErrorDuenio = new javax.swing.JLabel();
        labelErrorApellido = new javax.swing.JLabel();
        labelErrorCelular = new javax.swing.JLabel();
        btnCancelarDuenio = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        TitutoIngresoMascota = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardarMascotaDuenio = new javax.swing.JButton();
        PanelNuevaMascota = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnAceptarMascota = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbAtencion = new javax.swing.JComboBox<>();
        labelErrorAtencion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbAlergico = new javax.swing.JComboBox<>();
        labelErrorAlergico = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        labelErrorColor = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        labelErrorEspecie = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelErrorRaza = new javax.swing.JLabel();
        nombreMascota = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        labelErrorMascota = new javax.swing.JLabel();
        btnIngresarMascota = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        cmbIngresarMascota = new javax.swing.JComboBox<>();
        labelErrorIngresarMascota = new javax.swing.JLabel();
        btnCancelarNuevaMascota = new javax.swing.JButton();
        txtEspecie = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        labelBurbujaDerecha2 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        PanelFondoPerro = new javax.swing.JPanel();
        TabedListaMascotasYTurnos = new javax.swing.JPanel();
        PanelContenedorTurnos = new javax.swing.JPanel();
        PanelListaMascotas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaListaMascotas = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminarMascotaYDuenio = new javax.swing.JButton();
        btnSacarTurno = new javax.swing.JButton();
        btnRecargarListaMascota = new javax.swing.JButton();
        labelTituloListaTurnos = new javax.swing.JLabel();
        btnBuscarRelacion = new javax.swing.JButton();
        txtFiltrarMascota = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        labelErrorBuscarMasco = new javax.swing.JLabel();
        PanelListaTurnos = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaListaTurnos = new javax.swing.JTable();
        labelGatoNaranja = new javax.swing.JLabel();
        labelGatoGris = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        labelTituloRegistrarTurno = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        TabedContenedorProductos = new javax.swing.JPanel();
        PanelProductosYCompra = new javax.swing.JPanel();
        PanelListaProductos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaListaProductos = new javax.swing.JTable();
        btnEditarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnRecargarProductos = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        labelErrorBuscarProducto = new javax.swing.JLabel();
        btnIngresarProductos = new javax.swing.JButton();
        PanelComprar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        PanelProductoComprados = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaCompra = new javax.swing.JTable();
        btnEliminarDetalleProducto = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtTotalPagar = new javax.swing.JTextField();
        btnPagarCompra = new javax.swing.JButton();
        btnResultadoFinalCompra = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btnEditarDetalleProducto = new javax.swing.JButton();
        labelErrorSubtotal = new javax.swing.JLabel();
        btnComprobante = new javax.swing.JButton();
        spinnerDescuentoCompra = new javax.swing.JSpinner();
        spinnerIvaCompra = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtProductoSeleccionado = new javax.swing.JTextField();
        spinnerCantidad = new javax.swing.JSpinner();
        btnAceptarProducto = new javax.swing.JButton();
        labelErrorCantidadComprar = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        txtCalcular = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cmbDuenioCompra = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtFechaFactura = new javax.swing.JTextField();
        labelErrorDuenioCompra = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        spinnerDescuentoProducto = new javax.swing.JSpinner();
        spinnerIvaProducto = new javax.swing.JSpinner();
        PagarTurnos = new javax.swing.JPanel();
        ContenedorPagarTurnos = new javax.swing.JPanel();
        PanelPagarTurno = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaDetalleVentaTurnos = new javax.swing.JTable();
        btnEliminarTurnoPagar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        btnPagarTurno = new javax.swing.JButton();
        txtTotalAPagar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtFechaFacturaTurno = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cmbDuenioPagarTurno = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        txtPrecioTurno = new javax.swing.JTextField();
        labelErrorDuenioPagar = new javax.swing.JLabel();
        labelErrorPrecioTurno = new javax.swing.JLabel();
        PanelTurnos = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        btnAbonarTurno = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        TablaListaTurnosAPagar = new javax.swing.JTable();
        btnAceptarDatosPagar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        txtNroTurno = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtMascotaTurno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PanelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlImagenMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PeluqueriaMiFielAmigo200x200.png"))); // NOI18N
        btnlImagenMenu.setBorder(null);
        btnlImagenMenu.setContentAreaFilled(false);
        btnlImagenMenu.setFocusPainted(false);
        btnlImagenMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlImagenMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlImagenMenuActionPerformed(evt);
            }
        });
        PanelMenu.add(btnlImagenMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 240));

        btnInformacionProgramador.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnInformacionProgramador.setForeground(new java.awt.Color(0, 0, 0));
        btnInformacionProgramador.setText("©2025. Luna, Maria Ines");
        btnInformacionProgramador.setBorder(null);
        btnInformacionProgramador.setContentAreaFilled(false);
        btnInformacionProgramador.setFocusPainted(false);
        btnInformacionProgramador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInformacionProgramadorMouseEntered(evt);
            }
        });
        PanelMenu.add(btnInformacionProgramador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 230, 20));

        PanelBotonSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/removeNegro50.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/removeBlanco50Nuevo.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelBotonSalir.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 60));

        PanelMenu.add(PanelBotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 230, 60));

        PanelBotonTienda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTienda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendaNegro50.png"))); // NOI18N
        btnTienda.setText("Tienda");
        btnTienda.setBorder(null);
        btnTienda.setBorderPainted(false);
        btnTienda.setContentAreaFilled(false);
        btnTienda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTienda.setFocusPainted(false);
        btnTienda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendaBlanco50.png"))); // NOI18N
        btnTienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTiendaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTiendaMouseEntered(evt);
            }
        });
        btnTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiendaActionPerformed(evt);
            }
        });
        PanelBotonTienda.add(btnTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 60));

        PanelMenu.add(PanelBotonTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, 60));

        PanelPagarTurnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPagarTurnos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPagarTurnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dineroNegro50.png"))); // NOI18N
        btnPagarTurnos.setText("Pagar Turnos");
        btnPagarTurnos.setBorder(null);
        btnPagarTurnos.setContentAreaFilled(false);
        btnPagarTurnos.setFocusPainted(false);
        btnPagarTurnos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/dineroBlanco50.png"))); // NOI18N
        btnPagarTurnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPagarTurnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPagarTurnosMouseEntered(evt);
            }
        });
        btnPagarTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarTurnosActionPerformed(evt);
            }
        });
        PanelPagarTurnos.add(btnPagarTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 60));

        PanelMenu.add(PanelPagarTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 230, 60));

        btnTurnos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnTurnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lista 50Nuevo.png"))); // NOI18N
        btnTurnos.setText("<html><center>Lista de Mascotas <p>y Turnos<html>");
        btnTurnos.setBorder(null);
        btnTurnos.setContentAreaFilled(false);
        btnTurnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTurnos.setFocusPainted(false);
        btnTurnos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/lista 50-BLANCO.png"))); // NOI18N
        btnTurnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTurnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTurnosMouseEntered(evt);
            }
        });
        btnTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonTurnosLayout = new javax.swing.GroupLayout(PanelBotonTurnos);
        PanelBotonTurnos.setLayout(PanelBotonTurnosLayout);
        PanelBotonTurnosLayout.setHorizontalGroup(
            PanelBotonTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonTurnosLayout.createSequentialGroup()
                .addComponent(btnTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelBotonTurnosLayout.setVerticalGroup(
            PanelBotonTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTurnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PanelMenu.add(PanelBotonTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 60));

        btnNuevo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo 50-N.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFocusPainted(false);
        btnNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo 50-B.png"))); // NOI18N
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoMouseEntered(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonNuevoLayout = new javax.swing.GroupLayout(PanelBotonNuevo);
        PanelBotonNuevo.setLayout(PanelBotonNuevoLayout);
        PanelBotonNuevoLayout.setHorizontalGroup(
            PanelBotonNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonNuevoLayout.createSequentialGroup()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelBotonNuevoLayout.setVerticalGroup(
            PanelBotonNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        PanelMenu.add(PanelBotonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 230, 60));

        PanelContenedor.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 710));

        TabedPestanas.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        TabedIngresoMascota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPerritoPug.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PERRITOPUG.png"))); // NOI18N
        TabedIngresoMascota.add(labelPerritoPug, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 340, 620));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Burbuja32.png"))); // NOI18N
        TabedIngresoMascota.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 40, 40));

        PanelIngresoNuevo.setBackground(new java.awt.Color(223, 227, 226));
        PanelIngresoNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBurbujaDerecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevoNucleo128.png"))); // NOI18N
        PanelIngresoNuevo.add(labelBurbujaDerecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, -1, -1));

        labelBurbujaDerecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevoNucleo128.png"))); // NOI18N
        PanelIngresoNuevo.add(labelBurbujaDerecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 150, -1));

        labelBurbujaFlotanteDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Burbuja64.png"))); // NOI18N
        PanelIngresoNuevo.add(labelBurbujaFlotanteDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Burbuja32.png"))); // NOI18N
        PanelIngresoNuevo.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 600, -1, -1));

        PanelDuenio.setBackground(new java.awt.Color(223, 227, 226));
        PanelDuenio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Buscar Dueño:");
        PanelDuenio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));
        PanelDuenio.add(cmbDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 170, -1));

        btnIngresarDuenio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnIngresarDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/masNegro24Nuevo.png"))); // NOI18N
        btnIngresarDuenio.setText("Ingresar Dueño");
        btnIngresarDuenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresarDuenio.setContentAreaFilled(false);
        btnIngresarDuenio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresarDuenio.setFocusPainted(false);
        btnIngresarDuenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/masVioleta24Nuevo-CORREJIDO.png"))); // NOI18N
        btnIngresarDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDuenioActionPerformed(evt);
            }
        });
        PanelDuenio.add(btnIngresarDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 170, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Nombre Dueño:");
        PanelDuenio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtDuenio.setEnabled(false);
        txtDuenio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuenioKeyTyped(evt);
            }
        });
        PanelDuenio.add(txtDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 170, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Apellido Dueño:");
        PanelDuenio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtApellidoDuenio.setEnabled(false);
        txtApellidoDuenio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoDuenioKeyTyped(evt);
            }
        });
        PanelDuenio.add(txtApellidoDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 170, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Celular:");
        PanelDuenio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtCelular.setEnabled(false);
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        PanelDuenio.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 170, -1));

        btnAceptarDuenio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAceptarDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkNegroNuevo24.png"))); // NOI18N
        btnAceptarDuenio.setText("Aceptar Dueño");
        btnAceptarDuenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptarDuenio.setContentAreaFilled(false);
        btnAceptarDuenio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptarDuenio.setEnabled(false);
        btnAceptarDuenio.setFocusPainted(false);
        btnAceptarDuenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/checkVioletaNuevo24-CORREJIDO.png"))); // NOI18N
        btnAceptarDuenio.setVerifyInputWhenFocusTarget(false);
        btnAceptarDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarDuenioActionPerformed(evt);
            }
        });
        PanelDuenio.add(btnAceptarDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 130, 30));

        labelErrorComboDuenio.setForeground(new java.awt.Color(255, 0, 0));
        PanelDuenio.add(labelErrorComboDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 110, 20));

        labelErrorDuenio.setForeground(new java.awt.Color(255, 0, 0));
        PanelDuenio.add(labelErrorDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 110, 20));

        labelErrorApellido.setForeground(new java.awt.Color(255, 0, 0));
        PanelDuenio.add(labelErrorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 110, 20));

        labelErrorCelular.setForeground(new java.awt.Color(255, 0, 0));
        PanelDuenio.add(labelErrorCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 110, 20));

        btnCancelarDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xCancelarNegro24.png"))); // NOI18N
        btnCancelarDuenio.setText("Cancelar");
        btnCancelarDuenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelarDuenio.setContentAreaFilled(false);
        btnCancelarDuenio.setEnabled(false);
        btnCancelarDuenio.setFocusPainted(false);
        btnCancelarDuenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/xCancelarVioleta24.png"))); // NOI18N
        btnCancelarDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDuenioActionPerformed(evt);
            }
        });
        PanelDuenio.add(btnCancelarDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 130, 30));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OtraBurbuja64.png"))); // NOI18N
        PanelDuenio.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        PanelIngresoNuevo.add(PanelDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 450, 190));

        TitutoIngresoMascota.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TitutoIngresoMascota.setText("Ingresar Mascota y/o Dueño");
        PanelIngresoNuevo.add(TitutoIngresoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 30));

        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Limpiarnegro24.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Limpiarvioleta24-CORREJIDO.png"))); // NOI18N
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelIngresoNuevo.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, 70, 60));

        btnGuardarMascotaDuenio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarMascotaDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Guardarnegro24.png"))); // NOI18N
        btnGuardarMascotaDuenio.setText("Guardar");
        btnGuardarMascotaDuenio.setBorder(null);
        btnGuardarMascotaDuenio.setContentAreaFilled(false);
        btnGuardarMascotaDuenio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarMascotaDuenio.setFocusPainted(false);
        btnGuardarMascotaDuenio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarMascotaDuenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Guardarvioleta24-CORREJIDO.png"))); // NOI18N
        btnGuardarMascotaDuenio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarMascotaDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMascotaDuenioActionPerformed(evt);
            }
        });
        PanelIngresoNuevo.add(btnGuardarMascotaDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 70, 60));

        PanelNuevaMascota.setBackground(new java.awt.Color(223, 227, 226));
        PanelNuevaMascota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        txtObservaciones.setEnabled(false);
        txtObservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObservacionesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtObservaciones);

        PanelNuevaMascota.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 170, 80));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Observaciones:");
        PanelNuevaMascota.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        btnAceptarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkNegroNuevo24.png"))); // NOI18N
        btnAceptarMascota.setText("Aceptar Mascota");
        btnAceptarMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptarMascota.setContentAreaFilled(false);
        btnAceptarMascota.setEnabled(false);
        btnAceptarMascota.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/checkVioletaNuevo24-CORREJIDO.png"))); // NOI18N
        btnAceptarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarMascotaActionPerformed(evt);
            }
        });
        PanelNuevaMascota.add(btnAceptarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 130, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Atencion Especial:");
        PanelNuevaMascota.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        cmbAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "SI", "NO" }));
        cmbAtencion.setEnabled(false);
        PanelNuevaMascota.add(cmbAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, -1));

        labelErrorAtencion.setForeground(new java.awt.Color(255, 0, 0));
        PanelNuevaMascota.add(labelErrorAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 110, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Alergico:");
        PanelNuevaMascota.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "SI", "NO" }));
        cmbAlergico.setEnabled(false);
        PanelNuevaMascota.add(cmbAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 110, -1));

        labelErrorAlergico.setForeground(new java.awt.Color(255, 0, 0));
        PanelNuevaMascota.add(labelErrorAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 110, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Color:");
        PanelNuevaMascota.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtColor.setEnabled(false);
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });
        PanelNuevaMascota.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 170, -1));

        labelErrorColor.setForeground(new java.awt.Color(255, 0, 0));
        PanelNuevaMascota.add(labelErrorColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 110, 20));

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel28.setText("Especie:");
        PanelNuevaMascota.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        labelErrorEspecie.setForeground(new java.awt.Color(255, 0, 0));
        PanelNuevaMascota.add(labelErrorEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 110, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Raza:");
        PanelNuevaMascota.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        labelErrorRaza.setForeground(new java.awt.Color(255, 0, 0));
        PanelNuevaMascota.add(labelErrorRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 110, 20));

        nombreMascota.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombreMascota.setText("Nombre Mascota:");
        PanelNuevaMascota.add(nombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtNombreMascota.setEnabled(false);
        txtNombreMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreMascotaKeyTyped(evt);
            }
        });
        PanelNuevaMascota.add(txtNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 170, -1));

        labelErrorMascota.setForeground(new java.awt.Color(255, 0, 0));
        PanelNuevaMascota.add(labelErrorMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 110, 20));

        btnIngresarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/masNegro24Nuevo.png"))); // NOI18N
        btnIngresarMascota.setText("Nueva Mascota");
        btnIngresarMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresarMascota.setContentAreaFilled(false);
        btnIngresarMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresarMascota.setFocusPainted(false);
        btnIngresarMascota.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/masVioleta24Nuevo-CORREJIDO.png"))); // NOI18N
        btnIngresarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarMascotaActionPerformed(evt);
            }
        });
        PanelNuevaMascota.add(btnIngresarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 170, 30));

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel29.setText("Buscar Mascota:");
        PanelNuevaMascota.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        PanelNuevaMascota.add(cmbIngresarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 170, -1));

        labelErrorIngresarMascota.setForeground(new java.awt.Color(255, 0, 0));
        PanelNuevaMascota.add(labelErrorIngresarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 110, 20));

        btnCancelarNuevaMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xCancelarNegro24.png"))); // NOI18N
        btnCancelarNuevaMascota.setText("Cancelar");
        btnCancelarNuevaMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelarNuevaMascota.setContentAreaFilled(false);
        btnCancelarNuevaMascota.setEnabled(false);
        btnCancelarNuevaMascota.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/xCancelarVioleta24.png"))); // NOI18N
        btnCancelarNuevaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNuevaMascotaActionPerformed(evt);
            }
        });
        PanelNuevaMascota.add(btnCancelarNuevaMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 130, 30));

        txtEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEspecieKeyTyped(evt);
            }
        });
        PanelNuevaMascota.add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, -1));

        txtRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazaKeyTyped(evt);
            }
        });
        PanelNuevaMascota.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, -1));

        PanelIngresoNuevo.add(PanelNuevaMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 440, 370));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 255));
        PanelIngresoNuevo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 330, 10));

        labelBurbujaDerecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevoNucleo128.png"))); // NOI18N
        PanelIngresoNuevo.add(labelBurbujaDerecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, 110, 110));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OtroNucleo64.png"))); // NOI18N
        PanelIngresoNuevo.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 640, -1, 70));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BUrbuja2 64.png"))); // NOI18N
        PanelIngresoNuevo.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Burbuja sin relleno32.png"))); // NOI18N
        PanelIngresoNuevo.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, -1, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Burbuja64.png"))); // NOI18N
        PanelIngresoNuevo.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, -1, -1));

        TabedIngresoMascota.add(PanelIngresoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 460, 710));

        PanelFondoPerro.setBackground(new java.awt.Color(255, 255, 255));
        PanelFondoPerro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TabedIngresoMascota.add(PanelFondoPerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 340, 710));

        TabedPestanas.addTab("", TabedIngresoMascota);

        TabedListaMascotasYTurnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabedListaMascotasYTurnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelContenedorTurnos.setBackground(new java.awt.Color(223, 227, 226));
        PanelContenedorTurnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelListaMascotas.setBackground(new java.awt.Color(223, 227, 226));
        PanelListaMascotas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaListaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaListaMascotas);

        PanelListaMascotas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 760, 190));

        btnEditar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Editarnegro24.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Editarvioleta24.png"))); // NOI18N
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PanelListaMascotas.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 50, 50));

        btnEliminarMascotaYDuenio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminarMascotaYDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminarnegro24.png"))); // NOI18N
        btnEliminarMascotaYDuenio.setText("Eliminar");
        btnEliminarMascotaYDuenio.setBorder(null);
        btnEliminarMascotaYDuenio.setContentAreaFilled(false);
        btnEliminarMascotaYDuenio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarMascotaYDuenio.setFocusPainted(false);
        btnEliminarMascotaYDuenio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarMascotaYDuenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminarvioleta24-CORREJIDO.png"))); // NOI18N
        btnEliminarMascotaYDuenio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarMascotaYDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMascotaYDuenioActionPerformed(evt);
            }
        });
        PanelListaMascotas.add(btnEliminarMascotaYDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, 50));

        btnSacarTurno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSacarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/masNegro24Nuevo.png"))); // NOI18N
        btnSacarTurno.setText("<html><center>Sacar <p>Turno<html>");
        btnSacarTurno.setBorder(null);
        btnSacarTurno.setContentAreaFilled(false);
        btnSacarTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSacarTurno.setFocusPainted(false);
        btnSacarTurno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSacarTurno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/masVioleta24Nuevo-CORREJIDO.png"))); // NOI18N
        btnSacarTurno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSacarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarTurnoActionPerformed(evt);
            }
        });
        PanelListaMascotas.add(btnSacarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 70, 60));

        btnRecargarListaMascota.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRecargarListaMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recargarNegro24.png"))); // NOI18N
        btnRecargarListaMascota.setText("Recargar");
        btnRecargarListaMascota.setBorder(null);
        btnRecargarListaMascota.setContentAreaFilled(false);
        btnRecargarListaMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecargarListaMascota.setFocusPainted(false);
        btnRecargarListaMascota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRecargarListaMascota.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recargarVioleta24-CORREJIDO.png"))); // NOI18N
        btnRecargarListaMascota.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRecargarListaMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRecargarListaMascotaMouseClicked(evt);
            }
        });
        btnRecargarListaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarListaMascotaActionPerformed(evt);
            }
        });
        PanelListaMascotas.add(btnRecargarListaMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 60, 50));

        labelTituloListaTurnos.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        labelTituloListaTurnos.setText("Lista de Relaciones entre Mascotas y Dueños");
        PanelListaMascotas.add(labelTituloListaTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        btnBuscarRelacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBuscarRelacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupaNegra24.png"))); // NOI18N
        btnBuscarRelacion.setText("Buscar");
        btnBuscarRelacion.setBorder(null);
        btnBuscarRelacion.setContentAreaFilled(false);
        btnBuscarRelacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarRelacion.setFocusPainted(false);
        btnBuscarRelacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarRelacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/lupaVioleta24.png"))); // NOI18N
        btnBuscarRelacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRelacionActionPerformed(evt);
            }
        });
        PanelListaMascotas.add(btnBuscarRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 50, 50));
        PanelListaMascotas.add(txtFiltrarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 140, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Buscar Mascota:");
        PanelListaMascotas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        labelErrorBuscarMasco.setForeground(new java.awt.Color(255, 0, 0));
        PanelListaMascotas.add(labelErrorBuscarMasco, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 110, 20));

        PanelContenedorTurnos.add(PanelListaMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 280));

        PanelListaTurnos.setBackground(new java.awt.Color(223, 227, 226));
        PanelListaTurnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaListaTurnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaListaTurnos);

        PanelListaTurnos.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 760, 200));

        PanelContenedorTurnos.add(PanelListaTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 800, 200));

        labelGatoNaranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gato Escalando240.png"))); // NOI18N
        PanelContenedorTurnos.add(labelGatoNaranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, 170));

        labelGatoGris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gato gris.png"))); // NOI18N
        PanelContenedorTurnos.add(labelGatoGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 200, 230));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 255));
        jSeparator4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PanelContenedorTurnos.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 490, 10));

        labelTituloRegistrarTurno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        labelTituloRegistrarTurno.setText("Lista de Turnos");
        PanelContenedorTurnos.add(labelTituloRegistrarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(102, 102, 255));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        PanelContenedorTurnos.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 50, 220));

        TabedListaMascotasYTurnos.add(PanelContenedorTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 800, 710));

        TabedPestanas.addTab("", TabedListaMascotasYTurnos);

        TabedContenedorProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelProductosYCompra.setBackground(new java.awt.Color(223, 227, 226));
        PanelProductosYCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelListaProductos.setBackground(new java.awt.Color(223, 227, 226));
        PanelListaProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaListaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaListaProductos);

        PanelListaProductos.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 770, 150));

        btnEditarProducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Editarnegro24.png"))); // NOI18N
        btnEditarProducto.setText("Editar");
        btnEditarProducto.setBorder(null);
        btnEditarProducto.setContentAreaFilled(false);
        btnEditarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProducto.setFocusPainted(false);
        btnEditarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Editarvioleta24.png"))); // NOI18N
        btnEditarProducto.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Editarvioleta24.png"))); // NOI18N
        btnEditarProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });
        PanelListaProductos.add(btnEditarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 50, 50));

        btnEliminarProducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminarnegro24.png"))); // NOI18N
        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.setBorder(null);
        btnEliminarProducto.setContentAreaFilled(false);
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.setFocusPainted(false);
        btnEliminarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminarvioleta24-CORREJIDO.png"))); // NOI18N
        btnEliminarProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        PanelListaProductos.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 50, 50));

        btnRecargarProductos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRecargarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recargarNegro24.png"))); // NOI18N
        btnRecargarProductos.setText("Actualizar");
        btnRecargarProductos.setBorder(null);
        btnRecargarProductos.setContentAreaFilled(false);
        btnRecargarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecargarProductos.setFocusPainted(false);
        btnRecargarProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRecargarProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recargarVioleta24-CORREJIDO.png"))); // NOI18N
        btnRecargarProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRecargarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarProductosActionPerformed(evt);
            }
        });
        PanelListaProductos.add(btnRecargarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 70, 50));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setText("Lista de Productos:");
        PanelListaProductos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btnCarrito.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carritoNegro24.png"))); // NOI18N
        btnCarrito.setText("Agregar");
        btnCarrito.setBorder(null);
        btnCarrito.setContentAreaFilled(false);
        btnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrito.setFocusPainted(false);
        btnCarrito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCarrito.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/carritoCeleste24.png"))); // NOI18N
        btnCarrito.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        PanelListaProductos.add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 60, 50));

        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupaNegra24.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/lupaVioleta24.png"))); // NOI18N
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        PanelListaProductos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 50, -1));

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel32.setText("Buscar Producto:");
        PanelListaProductos.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        PanelListaProductos.add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 160, -1));

        labelErrorBuscarProducto.setForeground(new java.awt.Color(255, 0, 0));
        PanelListaProductos.add(labelErrorBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 110, 20));

        btnIngresarProductos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnIngresarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/masNegro24Nuevo.png"))); // NOI18N
        btnIngresarProductos.setText("Ingresar");
        btnIngresarProductos.setBorder(null);
        btnIngresarProductos.setContentAreaFilled(false);
        btnIngresarProductos.setFocusPainted(false);
        btnIngresarProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresarProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/masVioleta24Nuevo-CORREJIDO.png"))); // NOI18N
        btnIngresarProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIngresarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarProductosActionPerformed(evt);
            }
        });
        PanelListaProductos.add(btnIngresarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, 50));

        PanelProductosYCompra.add(PanelListaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 240));

        PanelComprar.setBackground(new java.awt.Color(223, 227, 226));
        PanelComprar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel14.setText("Detalle de Compra:");
        PanelComprar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        PanelProductoComprados.setBackground(new java.awt.Color(223, 227, 226));
        PanelProductoComprados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(TablaCompra);

        PanelProductoComprados.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 700, 160));

        btnEliminarDetalleProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarDetalleProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminarnegro24.png"))); // NOI18N
        btnEliminarDetalleProducto.setText("Eliminar");
        btnEliminarDetalleProducto.setBorder(null);
        btnEliminarDetalleProducto.setContentAreaFilled(false);
        btnEliminarDetalleProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarDetalleProducto.setEnabled(false);
        btnEliminarDetalleProducto.setFocusPainted(false);
        btnEliminarDetalleProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarDetalleProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminarvioleta24-CORREJIDO.png"))); // NOI18N
        btnEliminarDetalleProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarDetalleProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDetalleProductoActionPerformed(evt);
            }
        });
        PanelProductoComprados.add(btnEliminarDetalleProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 60, 60));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setText("SubTotal:");
        PanelProductoComprados.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setText("Descuento x Venta:");
        PanelProductoComprados.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel19.setText("IVA Venta:");
        PanelProductoComprados.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel20.setText("Total a Pagar:");
        PanelProductoComprados.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        txtSubTotal.setDisabledTextColor(new java.awt.Color(153, 0, 153));
        txtSubTotal.setEnabled(false);
        PanelProductoComprados.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 120, -1));

        txtTotalPagar.setDisabledTextColor(new java.awt.Color(153, 0, 153));
        txtTotalPagar.setEnabled(false);
        PanelProductoComprados.add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 130, -1));

        btnPagarCompra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPagarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billeteNegro24.png"))); // NOI18N
        btnPagarCompra.setText("Pagar");
        btnPagarCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPagarCompra.setContentAreaFilled(false);
        btnPagarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagarCompra.setEnabled(false);
        btnPagarCompra.setFocusPainted(false);
        btnPagarCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPagarCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/billeteVerde24.png"))); // NOI18N
        btnPagarCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPagarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarCompraActionPerformed(evt);
            }
        });
        PanelProductoComprados.add(btnPagarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 100, 60));

        btnResultadoFinalCompra.setText("Calcular Total Compra");
        btnResultadoFinalCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResultadoFinalCompra.setContentAreaFilled(false);
        btnResultadoFinalCompra.setFocusPainted(false);
        btnResultadoFinalCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoFinalCompraActionPerformed(evt);
            }
        });
        PanelProductoComprados.add(btnResultadoFinalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 150, 30));

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel37.setText("%");
        PanelProductoComprados.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel38.setText("%");
        PanelProductoComprados.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        btnEditarDetalleProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditarDetalleProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Editarnegro24.png"))); // NOI18N
        btnEditarDetalleProducto.setText("Editar");
        btnEditarDetalleProducto.setBorder(null);
        btnEditarDetalleProducto.setContentAreaFilled(false);
        btnEditarDetalleProducto.setEnabled(false);
        btnEditarDetalleProducto.setFocusPainted(false);
        btnEditarDetalleProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarDetalleProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Editarvioleta24.png"))); // NOI18N
        btnEditarDetalleProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditarDetalleProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDetalleProductoActionPerformed(evt);
            }
        });
        PanelProductoComprados.add(btnEditarDetalleProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 60, -1));

        labelErrorSubtotal.setForeground(new java.awt.Color(255, 0, 0));
        PanelProductoComprados.add(labelErrorSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 150, 40));

        btnComprobante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnComprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/impresoraNegro24.png"))); // NOI18N
        btnComprobante.setText("Ticket");
        btnComprobante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnComprobante.setContentAreaFilled(false);
        btnComprobante.setEnabled(false);
        btnComprobante.setFocusPainted(false);
        btnComprobante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComprobante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/impresoraVioleta24.png"))); // NOI18N
        btnComprobante.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobanteActionPerformed(evt);
            }
        });
        PanelProductoComprados.add(btnComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 90, 60));
        PanelProductoComprados.add(spinnerDescuentoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, -1));
        PanelProductoComprados.add(spinnerIvaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 120, -1));

        PanelComprar.add(PanelProductoComprados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 790, 260));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 255));
        PanelComprar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 650, 10));

        PanelProductosYCompra.add(PanelComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 790, -1));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 255));
        PanelProductosYCompra.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 650, 10));

        jLabel21.setText("Producto Seleccionado:");
        PanelProductosYCompra.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel22.setText("Cantidad:");
        PanelProductosYCompra.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel23.setText("Descuento x Producto:");
        PanelProductosYCompra.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel24.setText("IVA x Producto:");
        PanelProductosYCompra.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        txtProductoSeleccionado.setDisabledTextColor(new java.awt.Color(153, 0, 153));
        txtProductoSeleccionado.setEnabled(false);
        PanelProductosYCompra.add(txtProductoSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 160, -1));

        spinnerCantidad.setEnabled(false);
        PanelProductosYCompra.add(spinnerCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 110, -1));

        btnAceptarProducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAceptarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkNegroNuevo24.png"))); // NOI18N
        btnAceptarProducto.setText("Aceptar");
        btnAceptarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptarProducto.setContentAreaFilled(false);
        btnAceptarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptarProducto.setEnabled(false);
        btnAceptarProducto.setFocusPainted(false);
        btnAceptarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/checkVioletaNuevo24-CORREJIDO.png"))); // NOI18N
        btnAceptarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarProductoActionPerformed(evt);
            }
        });
        PanelProductosYCompra.add(btnAceptarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 120, 30));

        labelErrorCantidadComprar.setForeground(new java.awt.Color(255, 0, 0));
        PanelProductosYCompra.add(labelErrorCantidadComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        btnCalcular.setText("Calcular :");
        btnCalcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setEnabled(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        PanelProductosYCompra.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 120, 30));

        txtCalcular.setDisabledTextColor(new java.awt.Color(153, 0, 153));
        txtCalcular.setEnabled(false);
        PanelProductosYCompra.add(txtCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 120, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setEnabled(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        PanelProductosYCompra.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 120, 30));

        jLabel15.setText("Buscar Dueño:");
        PanelProductosYCompra.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        PanelProductosYCompra.add(cmbDuenioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 160, -1));

        jLabel16.setText("Fecha Factura:");
        PanelProductosYCompra.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        txtFechaFactura.setDisabledTextColor(new java.awt.Color(153, 0, 153));
        txtFechaFactura.setEnabled(false);
        PanelProductosYCompra.add(txtFechaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 130, -1));

        labelErrorDuenioCompra.setForeground(new java.awt.Color(255, 0, 0));
        PanelProductosYCompra.add(labelErrorDuenioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 110, 20));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel35.setText("%");
        PanelProductosYCompra.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel36.setText("%");
        PanelProductosYCompra.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        spinnerDescuentoProducto.setEnabled(false);
        PanelProductosYCompra.add(spinnerDescuentoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 110, -1));

        spinnerIvaProducto.setEnabled(false);
        PanelProductosYCompra.add(spinnerIvaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 110, -1));

        TabedContenedorProductos.add(PanelProductosYCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 800, 710));

        TabedPestanas.addTab("", TabedContenedorProductos);

        PagarTurnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContenedorPagarTurnos.setBackground(new java.awt.Color(223, 227, 226));
        ContenedorPagarTurnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPagarTurno.setBackground(new java.awt.Color(223, 227, 226));
        PanelPagarTurno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel25.setText("Turnos a Pagar");
        PanelPagarTurno.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        TablaDetalleVentaTurnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(TablaDetalleVentaTurnos);

        PanelPagarTurno.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 760, 160));

        btnEliminarTurnoPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminarnegro24.png"))); // NOI18N
        btnEliminarTurnoPagar.setText("<html><center>Eliminar Turno <p>a Pagar<html>");
        btnEliminarTurnoPagar.setBorder(null);
        btnEliminarTurnoPagar.setContentAreaFilled(false);
        btnEliminarTurnoPagar.setEnabled(false);
        btnEliminarTurnoPagar.setFocusPainted(false);
        btnEliminarTurnoPagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarTurnoPagar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminarvioleta24-CORREJIDO.png"))); // NOI18N
        btnEliminarTurnoPagar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarTurnoPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTurnoPagarActionPerformed(evt);
            }
        });
        PanelPagarTurno.add(btnEliminarTurnoPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 130, 70));

        jSeparator6.setForeground(new java.awt.Color(102, 102, 255));
        PanelPagarTurno.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 650, 10));

        ContenedorPagarTurnos.add(PanelPagarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 800, 250));

        btnPagarTurno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPagarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billeteNegro24.png"))); // NOI18N
        btnPagarTurno.setText("Pagar");
        btnPagarTurno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPagarTurno.setContentAreaFilled(false);
        btnPagarTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagarTurno.setEnabled(false);
        btnPagarTurno.setFocusPainted(false);
        btnPagarTurno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/billeteVerde24.png"))); // NOI18N
        btnPagarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarTurnoActionPerformed(evt);
            }
        });
        ContenedorPagarTurnos.add(btnPagarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 120, 40));

        txtTotalAPagar.setDisabledTextColor(new java.awt.Color(153, 0, 153));
        txtTotalAPagar.setEnabled(false);
        txtTotalAPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAPagarActionPerformed(evt);
            }
        });
        ContenedorPagarTurnos.add(txtTotalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 670, 130, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Total:");
        ContenedorPagarTurnos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 670, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel13.setText("Datos de Factura");
        ContenedorPagarTurnos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel27.setText("Fecha Factura:");
        ContenedorPagarTurnos.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        txtFechaFacturaTurno.setDisabledTextColor(new java.awt.Color(153, 0, 153));
        txtFechaFacturaTurno.setEnabled(false);
        ContenedorPagarTurnos.add(txtFechaFacturaTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 120, -1));

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel26.setText("Dueño:");
        ContenedorPagarTurnos.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        ContenedorPagarTurnos.add(cmbDuenioPagarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, -1));

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel30.setText("Precio del Turno:");
        ContenedorPagarTurnos.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 110, -1));
        ContenedorPagarTurnos.add(txtPrecioTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 110, 22));

        labelErrorDuenioPagar.setForeground(new java.awt.Color(255, 0, 0));
        ContenedorPagarTurnos.add(labelErrorDuenioPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 110, 20));

        labelErrorPrecioTurno.setForeground(new java.awt.Color(255, 0, 0));
        ContenedorPagarTurnos.add(labelErrorPrecioTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 110, 20));

        PanelTurnos.setBackground(new java.awt.Color(223, 227, 226));
        PanelTurnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel31.setText("Lista de Turnos Pendientes a Pagar");
        PanelTurnos.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnAbonarTurno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAbonarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flechaAbajoNegro24.png"))); // NOI18N
        btnAbonarTurno.setText("<html><center>Abonar <p>Turno<html>");
        btnAbonarTurno.setBorder(null);
        btnAbonarTurno.setContentAreaFilled(false);
        btnAbonarTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbonarTurno.setFocusPainted(false);
        btnAbonarTurno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbonarTurno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/flechaAbajoVioleta24-CORREJIDO.png"))); // NOI18N
        btnAbonarTurno.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAbonarTurno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbonarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonarTurnoActionPerformed(evt);
            }
        });
        PanelTurnos.add(btnAbonarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 80, 60));

        TablaListaTurnosAPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(TablaListaTurnosAPagar);

        PanelTurnos.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 760, 150));

        ContenedorPagarTurnos.add(PanelTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 240));

        btnAceptarDatosPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkNegroNuevo24.png"))); // NOI18N
        btnAceptarDatosPagar.setText("Aceptar Datos Factura");
        btnAceptarDatosPagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptarDatosPagar.setContentAreaFilled(false);
        btnAceptarDatosPagar.setEnabled(false);
        btnAceptarDatosPagar.setFocusPainted(false);
        btnAceptarDatosPagar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/checkVioletaNuevo24-CORREJIDO.png"))); // NOI18N
        btnAceptarDatosPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarDatosPagarActionPerformed(evt);
            }
        });
        ContenedorPagarTurnos.add(btnAceptarDatosPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 160, 30));

        jSeparator5.setForeground(new java.awt.Color(102, 102, 255));
        ContenedorPagarTurnos.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 650, 10));

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel33.setText("Nro. Turno Seleccionado:");
        ContenedorPagarTurnos.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txtNroTurno.setDisabledTextColor(new java.awt.Color(153, 0, 153));
        txtNroTurno.setEnabled(false);
        ContenedorPagarTurnos.add(txtNroTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 60, -1));

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel34.setText("Mascota:");
        ContenedorPagarTurnos.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        txtMascotaTurno.setDisabledTextColor(new java.awt.Color(153, 0, 153));
        txtMascotaTurno.setEnabled(false);
        ContenedorPagarTurnos.add(txtMascotaTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 150, -1));

        PagarTurnos.add(ContenedorPagarTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 800, 710));

        TabedPestanas.addTab("tab4", PagarTurnos);

        PanelContenedor.add(TabedPestanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1010, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Para acomodar y mostrar TEXTO LARGO en label*/
    public String strToHtml (String texto) {
    
        return "<html><p>" + texto + "</p></html>";
    }
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        presionarSalirVioleta();
        
        /*Borro las Facturas que se crearon pero no se Usaron, o sea no se hizo
        el pago total, ya que el detalle con 1 SOLO Producto se borro*/
        List<Factura> listaFacturasSinUsar = controlLogica.buscarFacturasTotalConCero();
        controlLogica.borrarFacturasSinUsar(listaFacturasSinUsar);
        
        /*Lo mismo hago con Facturas de Turnos*/
        List<FacturaDeTurno> listaFacturasSinUsarTurno = controlLogica.buscarFacturasTotalConCeroTurno();
        controlLogica.borrarFacturasSinUsarTurno(listaFacturasSinUsarTurno);
        
        /*Que me borre cualquier detalle de Venta cuya Factura No se haya usado
        Y por ende borrado*/
        List<DetalleVenta> listaDetalleVentaProductoSinFactura = controlLogica.traerListaDetalleVenta();
        controlLogica.borrarDetallesConFacturaNull(listaDetalleVentaProductoSinFactura);
        
        /*Que me borre cualquier detalle de Venta cuya Factura No se haya usado
        Y por ende borrado*/
        List<DetalleVentaTurno> listaDetalleVentaTurnoSinFactura = controlLogica.traerListaDetalleVentaTurnos();
        controlLogica.borrarDetallesVentaTurnosConFacturaNull(listaDetalleVentaTurnoSinFactura);
        
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseEntered
        
        /*Cuando el mouse pase por Encima del BOTON, el panel de detras cambie de color*/
        PanelBotonNuevo.setBackground(Color.LIGHT_GRAY);
        PanelBotonSalir.setBackground(Color.white);
        PanelBotonTienda.setBackground(Color.white);
        PanelBotonTurnos.setBackground(Color.white);
        PanelPagarTurnos.setBackground(Color.white);
        
        btnInformacionProgramador.setContentAreaFilled(false);
        btnInformacionProgramador.setBackground(Color.white);
        btnInformacionProgramador.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnNuevoMouseEntered

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        
        presionarNuevoVioleta();
    }//GEN-LAST:event_btnNuevoMouseClicked

    public void presionarNuevoVioleta() {
    
        //Una vez presionado con el mouse sobre el boton Nuevo, se muestra
        //la pestaña de Cargar Datos
        TabedPestanas.setSelectedIndex(0);
        
        btnPagarTurnos.setContentAreaFilled(false);
        btnPagarTurnos.setBackground(Color.white);
        btnPagarTurnos.setForeground(Color.BLACK);
        
        btnTienda.setContentAreaFilled(false);
        btnTienda.setBackground(Color.white);
        btnTienda.setForeground(Color.BLACK);
        
        btnTurnos.setContentAreaFilled(false);
        btnTurnos.setBackground(Color.white);
        btnTurnos.setForeground(Color.BLACK);
        
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBackground(Color.white);
        btnSalir.setForeground(Color.BLACK);
        
        btnNuevo.setContentAreaFilled(true);
        btnNuevo.setBackground(new Color(133, 38, 233 ));
        btnNuevo.setForeground(Color.white);
    }
    
    private void btnTurnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTurnosMouseClicked
        
        presionarTurnosVioleta();

        recargarTodosCombos();
        
        /*Cargo la Tabla de la Pestaña de Turnos, la Tabla de Lista de Mascotas*/
        cargarTablaRelacion();
        
        /*Cargo la Tabla de la Pestaña de Turnos, la Tabla de Lista de Turnos*/
        cargarTablaTurnos();
    }//GEN-LAST:event_btnTurnosMouseClicked

    public void presionarTurnosVioleta() {
    
        //Una vez presionado con el mouse sobre el boton Nuevo, se muestra
        //la pestaña de Cargar Datos
        TabedPestanas.setSelectedIndex(1);
        
        btnPagarTurnos.setContentAreaFilled(false);
        btnPagarTurnos.setBackground(Color.white);
        btnPagarTurnos.setForeground(Color.BLACK);
        
        btnTienda.setContentAreaFilled(false);
        btnTienda.setBackground(Color.white);
        btnTienda.setForeground(Color.BLACK);
        
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setBackground(Color.white);
        btnNuevo.setForeground(Color.BLACK);
        
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBackground(Color.white);
        btnSalir.setForeground(Color.BLACK);
        
        btnTurnos.setContentAreaFilled(true);
        btnTurnos.setBackground(new Color(133, 38, 233 ));
        btnTurnos.setForeground(Color.white);
    }
    
    private void btnTiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiendaMouseClicked
        
        presionarTiendaVioleta();
    }//GEN-LAST:event_btnTiendaMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        
        presionarSalirVioleta();
        
        /*Borro las Facturas que se crearon pero no se Usaron, o sea no se hizo
        el pago total, ya que el detalle con 1 SOLO Producto se borro*/
        List<Factura> listaFacturasSinUsar = controlLogica.buscarFacturasTotalConCero();
        controlLogica.borrarFacturasSinUsar(listaFacturasSinUsar);
        
        /*Lo mismo hago con Facturas de Turnos*/
        List<FacturaDeTurno> listaFacturasSinUsarTurno = controlLogica.buscarFacturasTotalConCeroTurno();
        controlLogica.borrarFacturasSinUsarTurno(listaFacturasSinUsarTurno);
        
        /*Que me borre cualquier detalle de Venta cuya Factura No se haya usado
        Y por ende borrado*/
        List<DetalleVenta> listaDetalleVentaProductoSinFactura = controlLogica.traerListaDetalleVenta();
        controlLogica.borrarDetallesConFacturaNull(listaDetalleVentaProductoSinFactura);
        
        /*Que me borre cualquier detalle de Venta cuya Factura No se haya usado
        Y por ende borrado*/
        List<DetalleVentaTurno> listaDetalleVentaTurnoSinFactura = controlLogica.traerListaDetalleVentaTurnos();
        controlLogica.borrarDetallesVentaTurnosConFacturaNull(listaDetalleVentaTurnoSinFactura);
        
        
        presionarSalirVioleta();
        System.exit(0);

    }//GEN-LAST:event_btnSalirMouseClicked

    public void presionarTiendaVioleta() {
    
        //Una vez presionado con el mouse sobre el boton Tienda, se muestra
        //la pestaña de Tienda
        TabedPestanas.setSelectedIndex(2);
        
        btnPagarTurnos.setContentAreaFilled(false);
        btnPagarTurnos.setBackground(Color.white);
        btnPagarTurnos.setForeground(Color.BLACK);
        
        btnTurnos.setContentAreaFilled(false);
        btnTurnos.setBackground(Color.white);
        btnTurnos.setForeground(Color.BLACK);
        
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setBackground(Color.white);
        btnNuevo.setForeground(Color.BLACK);
        
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBackground(Color.white);
        btnSalir.setForeground(Color.BLACK);
        
        btnTienda.setContentAreaFilled(true);
        btnTienda.setBackground(new Color(133, 38, 233 ));
        btnTienda.setForeground(Color.white);
    }
    
    
    public void presionarSalirVioleta() {
    
        //Una vez presionado con el mouse sobre el boton Nuevo, se muestra
        //la pestaña de Cargar Datos
        /*TabedPestanas.setSelectedIndex(0);*/
        
        btnPagarTurnos.setContentAreaFilled(false);
        btnPagarTurnos.setBackground(Color.white);
        btnPagarTurnos.setForeground(Color.BLACK);
        
        btnTurnos.setContentAreaFilled(false);
        btnTurnos.setBackground(Color.white);
        btnTurnos.setForeground(Color.BLACK);
        
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setBackground(Color.white);
        btnNuevo.setForeground(Color.BLACK);
        
        btnTienda.setContentAreaFilled(false);
        btnTienda.setBackground(Color.white);
        btnTienda.setForeground(Color.BLACK);
        
        btnSalir.setContentAreaFilled(true);
        btnSalir.setBackground(new Color(133, 38, 233 ));
        btnSalir.setForeground(Color.white);
    }
    
    private void btnTurnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTurnosMouseEntered
        
        /*Cuando el mouse pase por Encima del BOTON, el panel de detras cambie de color*/
        PanelBotonTurnos.setBackground(Color.LIGHT_GRAY);
        PanelBotonSalir.setBackground(Color.white);
        PanelBotonTienda.setBackground(Color.white);
        PanelBotonNuevo.setBackground(Color.white);
        PanelPagarTurnos.setBackground(Color.white);
        
        btnInformacionProgramador.setContentAreaFilled(false);
        btnInformacionProgramador.setBackground(Color.white);
        btnInformacionProgramador.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnTurnosMouseEntered

    private void btnTiendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiendaMouseEntered
        
        /*Cuando el mouse pase por Encima del BOTON, el panel de detras cambie de color*/
        PanelBotonTienda.setBackground(Color.LIGHT_GRAY);
        PanelBotonSalir.setBackground(Color.white);
        PanelBotonTurnos.setBackground(Color.white);
        PanelBotonNuevo.setBackground(Color.white);
        PanelPagarTurnos.setBackground(Color.white);
        
        btnInformacionProgramador.setContentAreaFilled(false);
        btnInformacionProgramador.setBackground(Color.white);
        btnInformacionProgramador.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnTiendaMouseEntered

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        
        /*Cuando el mouse pase por Encima del BOTON, el panel de detras cambie de color*/
        PanelBotonSalir.setBackground(Color.LIGHT_GRAY);
        PanelBotonTienda.setBackground(Color.white);
        PanelBotonTurnos.setBackground(Color.white);
        PanelBotonNuevo.setBackground(Color.white);
        PanelPagarTurnos.setBackground(Color.white);
        
        btnInformacionProgramador.setContentAreaFilled(false);
        btnInformacionProgramador.setBackground(Color.white);
        btnInformacionProgramador.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        
        /*Cargo todos los combos*/
        recargarTodosCombos();
        
        /*Cargo la Lista de Mascotas*/
        cargarTablaRelacion();
        
        /*Cargo la Lista de Turnos*/
        cargarTablaTurnos();
        
        /*Cargo la Lista de Turnos Pendientes a Pagar*/
        cargarTablaTurnosAPagar();

        /*Recargo la Lista de Productos*/
        cargarTablaProductos();
    }//GEN-LAST:event_formWindowOpened

   
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnIngresarDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDuenioActionPerformed
        
        /*Una vez presionado el Boton de Ingresar Duenio, Deshabilito el Combo
        de Duenio y lo pongo en Cero*/
        cmbDuenio.setSelectedIndex(0);
        cmbDuenio.setEnabled(false);
        btnGuardarMascotaDuenio.setEnabled(false);
        habilitarIngresoDuenio();
    }//GEN-LAST:event_btnIngresarDuenioActionPerformed

    private void btnAceptarDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarDuenioActionPerformed
        
        if ( validarDuenio() ) {
            
            /*Obtengo el Duenio*/
            String nombre = txtDuenio.getText();
            String apellido = txtApellidoDuenio.getText();
            String celular = txtCelular.getText();
            
            /*Paso el duenio a la logica*/
            controlLogica.guardarDuenio(nombre, apellido, celular);
            
            /*Como ya ingrese al duenio, DESHABILITE todo 
            para que no vuelvan a Ingresar otro Duenio.
            Para obligarlo a usar el ComboBox*/
            deshabilitarIngresoDuenio();
            
            /*Recargar el combo de Duenio*/
            actualizarComboListaDuenio();
            
            /*Muestro mensaje de que todo salio bien*/
            mostrarMensaje("Dueño guardado correctamente!", 
                    "Info", "Crear Duenio");

            cmbDuenio.setEnabled(true);
            cmbDuenio.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnAceptarDuenioActionPerformed

    private void habilitarIngresoDuenio() {
    
        /*Que HABILITE todo 
        para poder Ingresar otro Duenio*/
        txtDuenio.setEnabled(true);
        txtApellidoDuenio.setEnabled(true);
        txtCelular.setEnabled(true);
        btnAceptarDuenio.setEnabled(true);
        btnCancelarDuenio.setEnabled(true);
    }
    
    private void deshabilitarIngresoDuenio() {
    
        /*Como ya ingrese al duenio, que DESHABILITE todo 
        para que no vuelvan a Ingresar otro Duenio*/
        txtDuenio.setEnabled(false);
        txtApellidoDuenio.setEnabled(false);
        txtCelular.setEnabled(false);
        btnAceptarDuenio.setEnabled(false);
        btnCancelarDuenio.setEnabled(false);
        
        btnGuardarMascotaDuenio.setEnabled(true);
        
        txtDuenio.setText("");
        txtApellidoDuenio.setText("");
        txtCelular.setText("");
        
        labelErrorDuenio.setText("");
        labelErrorApellido.setText("");
        labelErrorCelular.setText("");

    }
    
    private void actualizarComboListaDuenio() {

        /*Otra forma:*/
        DefaultComboBoxModel modeloComboDuenio = new DefaultComboBoxModel();
        
        List<Duenio> listaDuenios = controlLogica.traerListaDuenios();
        
        modeloComboDuenio.addElement("<Seleccione>");
        
        if(listaDuenios.size() > 0){
            for(Duenio duenio: listaDuenios){
                
                modeloComboDuenio.addElement(duenio.mostrarNombreCompleto());
            }
        }
        /*Combo Duenio en Ingresar Nueva Mascota*/
        cmbDuenio.setModel(modeloComboDuenio);
        
        /*Combo Duenio en Pagar Turno*/
        cmbDuenioPagarTurno.setModel(modeloComboDuenio);
        
        
        /*Si NO se Edito el Duenio en la Factura, entonces que se cargue el 
        combo con la Lista de Todos los Duenios*/
        if ( cambiarDuenio == false ) {
            
           /*Combo Duenio de la Pestaña Pagar Compra de Productos*/
           cmbDuenioCompra.setModel(modeloComboDuenio); 
           
        } else {
        
            /*Si el Duenio SI se Edito en la Factura, que se cargue la Lista de
            Duenios, pero que me muestre el Nuevo Duenio que aparece en la Factura*/
            cmbDuenioCompra.setModel(modeloComboDuenio); 
            /*Factura factura = controlLogica.buscarUltimaFacturaProducto();
            Duenio due = factura.getDuenio();*/
            cmbDuenioCompra.setSelectedItem(dueFactura.mostrarNombreCompleto());
            cmbDuenioCompra.setEnabled(false);
        }
        
    } 
    
    public void activarGuardarMascotaDuenio() {
    
        /*Si ambos botones estan DESHABILITADOS*/
        if ( !(btnAceptarMascota.isEnabled()) && !(btnAceptarDuenio.isEnabled()) ) {
            
            /*Entonces que me Habilite el boton Guardar Nueva RELACION entre
            Mascota Y Duenio*/
            btnGuardarMascotaDuenio.setEnabled(true);
        }
    }
    
    
    private void btnGuardarMascotaDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMascotaDuenioActionPerformed

        if ( validarMascotaYDuenio() ) {
            
            /* =====================  Duenio  ===================== */
            /*Obtengo el nombre completo del Duenio seleccionado en el Combo*/
            String duenioStr = cmbDuenio.getSelectedItem().toString();
            int duenioInt = cmbDuenio.getSelectedIndex();

            Duenio duenio = controlLogica.buscarDuenio(duenioStr, duenioInt);
            
            /* =====================  Mascota  ===================== */
            /*Obtengo el nombre completo de la Mascota seleccionada en el Combo*/
            String mascotaStr = cmbIngresarMascota.getSelectedItem().toString();
            int mascotaInt = cmbIngresarMascota.getSelectedIndex();
            
            Mascota masco = controlLogica.buscarMascota(mascotaInt, mascotaStr);
 
            /*Duenio duenio = new Duenio();
            Mascota masco = new Mascota();*/
            
            /*Guardo la Relacion entre Duenio y Mascota*/
            /*controlLogica.guardarRelacion(duenioInt, mascotaInt, duenioStr, mascotaStr);*/
            controlLogica.guardarRelacionn(duenio, masco);
            
            
            limpiar();
            
            mostrarMensaje("Relacion Duenio y Mascota registrada correctamente!", 
                    "Info", "Crear Mascota");
        }
    }//GEN-LAST:event_btnGuardarMascotaDuenioActionPerformed

    private void btnIngresarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarMascotaActionPerformed

        
        /*Una vez presionado el Boton de Ingresar Mascota, Deshabilito el Combo
        de Mascota y lo pongo en 0*/
        cmbIngresarMascota.setSelectedIndex(0);
        cmbIngresarMascota.setEnabled(false);
        btnGuardarMascotaDuenio.setEnabled(false);
        habilitarIngresoMascota();
    }//GEN-LAST:event_btnIngresarMascotaActionPerformed

    private void btnAceptarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarMascotaActionPerformed
        
        if ( validarAceptarMascota() ) {
            
            /*Obtengo cada dato de Mascota*/
            String nombre = txtNombreMascota.getText();
            String raza = txtRaza.getText();
            String especie = txtEspecie.getText();
            String color = txtColor.getText();
            String alergico = (String)cmbAlergico.getSelectedItem();
            String atencion = (String)cmbAtencion.getSelectedItem();
            String observacion = txtObservaciones.getText();
            
            /*Paso la Mascota a la logica*/
            controlLogica.guardarMascota(nombre, raza, especie, color, 
                    alergico, atencion, observacion);
            
            /*Como ya ingrese a la MASCOTA, DESHABILITE todo 
            para que no vuelvan a Ingresar otra MASCOTA.
            Para obligarlo a usar el ComboBox*/
            deshabilitarIngresoMascota();
            
            /*Recargar el combo de Mascota*/
            actualizarComboListaMascota();
            
            /*Muestro mensaje de que todo salio bien*/
            mostrarMensaje("Mascota guardada correctamente!", 
                    "Info", "Crear Mascota");
            
            cmbIngresarMascota.setEnabled(true);
            cmbIngresarMascota.setSelectedIndex(0);
        }
        
    }//GEN-LAST:event_btnAceptarMascotaActionPerformed

    private void btnTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnosActionPerformed
        
        presionarTurnosVioleta();
        
        /*Que muestre la Pestaña Turnos*/
        TabedPestanas.setSelectedIndex(1);
        
        /*Cargo la Tabla de la Pestaña de Turnos, la Tabla de Lista de Mascotas*/
        cargarTablaRelacion();
        
        /*Cargo la Tabla de la Pestaña de Turnos, la Tabla de Lista de Turnos*/
        cargarTablaTurnos();
    }//GEN-LAST:event_btnTurnosActionPerformed

    private void btnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiendaActionPerformed
        
        presionarTiendaVioleta();
        
        /*Que muestre la Pestaña Productos de la Tienda*/
        TabedPestanas.setSelectedIndex(2);
        
        /*Cargo la Tabla de la Pestaña de Turnos, la Tabla de Lista de Turnos*/
        /*cargarTablaTurnos();*/
        
        /*Recargo la Lista de Productos*/
        cargarTablaProductos();
    }//GEN-LAST:event_btnTiendaActionPerformed

    private void btnRecargarListaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarListaMascotaActionPerformed
      
        /*Actualizo la Tabla de la Pestaña de Turnos, la Tabla de Lista de Mascotas*/
        cargarTablaRelacion();
        
        /*Una vez que ya busco que me borre lo escrito en el txt*/
        txtFiltrarMascota.setText("");
                
    }//GEN-LAST:event_btnRecargarListaMascotaActionPerformed

    private void btnRecargarListaMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecargarListaMascotaMouseClicked
        
        /*Actualizo la Tabla de la Pestaña de Turnos, la Tabla de Lista de Mascotas*/
        cargarTablaRelacion();
    }//GEN-LAST:event_btnRecargarListaMascotaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        //Veo si la tabla tiene registros para editar
        if ( TablaListaMascotas.getRowCount() > 0 ) {
            
            //Veo que se haya seleccionado un registro para editar
            if ( TablaListaMascotas.getSelectedRow() != -1 ) { 

                /*Obtengo el id de la Relacion, forma MIA, (SIN MOSTRAR el id de la Relacion 
                en la Tabla)*/
                
                /*.convertRowIndexToModel() : 
                Este metodo al yo seleccionar un Objeto 
                en la Tabla, toma el Indice de la Fila en el que se encuentra ese Objeto
                seleccionado en la Tabla y lo convierte al Indice del Elemento en el Modelo
                de Tabla. Ejemplo:
                Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila en la Tabla
                es 2, con el .convertRowIndexToModel(), convierto ese 2, en el Indice
                7, ya que "Pepe" en el Modelo de Tabla, ocupa ese Index. 
                Una vez lo seleccione en la Tabla, para Editar, en el Form de Editar AHORA SI
                me traera a la Mascota "Pepe" y no otra.
                
                Debo usar el .convertRowIndexToModel() SI o SI, ya que puse un
                Sorteador/Ordenador de Objetos en el metodo .cargarTablaRelacion(),
                este me ordena la Tabla Lista Mascotas
                en base al Nombre de la Mascota en Ascendente por default y
                Descendente si es que lo quiero tambien.*/
                
                /*Primero me trae el Index de la Fila seleccionada en el Tabla,
                pero lo CONVIERTE y lo pasa al Index del Modelo de la Tabla,
                con esto, se lo paso a buscarRelacion*/
                int id_filaTabla = TablaListaMascotas.convertRowIndexToModel
                            (TablaListaMascotas.getSelectedRow());
                
                /*Obtengo la Relacion del Objeto seleccionado en la Tabla*/
                Relacion rela = controlLogica.buscarRelacion(id_filaTabla);

                
                //Llamo al form de Editar:
                ModificarDatosMascotaYDuenio pantallaModif = new ModificarDatosMascotaYDuenio();
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                pantallaModif.enviarRelacion(rela);
                
                //Cierro el form
                /*DEBO PONER SI O SI "this.dispose()" porque de lo contrario,
                abre muchos form iguales pero con distinta informacion en la tabla*/
                this.dispose();

            }
            else {
            
                //Mensaje en caso de no haber seleccionado un Registro
                mostrarMensaje("No seleccionó ninguna mascota para Editar!", 
                        "Error", "Error al Editar");
            }            
        }
        else {
            
            //Mensaje en caso de no haber Registros en la Tabla
            mostrarMensaje("No hay registros en la tabla para Editar!", 
                        "Error", "Error al Editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarMascotaYDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMascotaYDuenioActionPerformed
        
        //Veo si la tabla tiene registros para eliminar
        if ( TablaListaMascotas.getRowCount() > 0 ) {
            
            //Veo que se haya seleccionado un registro para eliminar
            if ( TablaListaMascotas.getSelectedRow() != -1 ) { 
                
                /*Obtengo el id de la Relacion, forma MIA, (SIN MOSTRAR el id de la Relacion 
                en la Tabla)*/
                //Obtengo el index de la fila Seleccionada en la Tabla.
                
                /*.convertRowIndexToModel() : 
                Este metodo al yo seleccionar un Objeto 
                en la Tabla, toma el Indice de la Fila en el que se encuentra ese Objeto
                seleccionado en la Tabla y lo convierte al Indice del Elemento en el Modelo
                de Tabla. Ejemplo:
                Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila en la Tabla
                es 2, con el .convertRowIndexToModel(), convierto ese 2, en el Indice
                7, ya que "Pepe" en el Modelo de Tabla, ocupa ese Index. 
                Una vez lo seleccione en la Tabla, para Editar, en el Form de Editar AHORA SI
                me traera a la Mascota "Pepe" y no otra.
                
                Debo usar el .convertRowIndexToModel() SI o SI, ya que puse un
                Sorteador/Ordenador de Objetos en el metodo .cargarTablaRelacion(),
                este me ordena la Tabla Lista Mascotas
                en base al Nombre de la Mascota en Ascendente por default y
                Descendente si es que lo quiero tambien.*/
                
                //Obtengo el index de la fila Seleccionada en la Tabla.
                int id_filaTabla = TablaListaMascotas.convertRowIndexToModel
                            (TablaListaMascotas.getSelectedRow());
                
                Relacion rela = controlLogica.buscarRelacion(id_filaTabla);
                
                /*De la relacion Obtengo el Duenio y Mascota*/
                Mascota masco = rela.getMascota();
                Duenio due = rela.getDuenio();
                
                /*Ya borre la Relacion seleccionada*/
                controlLogica.borrarRelacion(rela);
                
                //Volvemos a cargar la tabla desde la BD pero Actualizada
                /*Cargo la Lista de Mascotas*/
                cargarTablaRelacion();
                
                recargarTodosCombos();

                //Muestro el mensaje de Borrado Exitoso
                mostrarMensaje("Relacion eliminada correctamente!", 
                        "Info", "Eliminar Relacion");
                
                
                /*Pregunto si tambien quiere Borrar a Mascota y Duenio*/
                /*Object[] opcion = {"SI", "NO"};
                
                int i = JOptionPane.showOptionDialog(this, 
                        "Desea Borrar Duenio y Mascota tambien?",
                        "Elija una Opcion", JOptionPane.YES_NO_OPTION, 
                        JOptionPane.INFORMATION_MESSAGE, null, 
                        opcion, opcion[1]);
                
                if ( i == 0 ) {
                    
                    /*Busco si la Mascota esta Relacionada a Otro/Otros Duenios*/
                    /*int mascoEnRelaciones = controlLogica.buscarMascoEnMasRelacion(rela, masco);
                    
                    /*Busco si el Duenio esta Relacionado a Otra/Otras Mascotas*/
                    /*int dueEnRelaciones = controlLogica.buscarDueEnMasRelacion(rela, due);
                    
                    
                    if ( mascoEnRelaciones > 0 || dueEnRelaciones > 0 ) {
                        
                        //Muestro el mensaje de Borrado Exitoso
                        mostrarMensaje("Dueño y/o Mascota asociados a Otra Relacion. "
                                + "Elimine las demas Relaciones para poder borrar "
                                + "al Dueño y/o Mascota", 
                        "Error", "Error al eliminar Dueño y/o Mascota");
                        
                    } else if( mascoEnRelaciones == 0 && dueEnRelaciones == 0 ) {
                    
                        controlLogica.borrarMascota(masco.getIdMascota());
                    
                        controlLogica.borrarDuenio(due.getIdDuenio());
                        
                        //Muestro el mensaje de Borrado Exitoso
                        mostrarMensaje("Duenio y Mascota eliminados correctamente!", 
                        "Info", "Eliminar Duenio y Mascota");
                    }
                    
                }*/

                //Volvemos a cargar la tabla desde la BD pero Actualizada
                /*Cargo la Lista de Mascotas*/
                /*cargarTablaRelacion();
                
                recargarTodosCombos();*/
            }
            else {
            
                //Mensaje en caso de no haber seleccionado un Registro
                mostrarMensaje("No seleccionó ninguna mascota para Eliminar!", 
                        "Error", "Error al Eliminar");
            }            
        }
        else {
            
            //Mensaje en caso de no haber Registros en la Tabla
            mostrarMensaje("No hay registros en la tabla para Eliminar!", 
                        "Error", "Error al Eliminar");
        }
    }//GEN-LAST:event_btnEliminarMascotaYDuenioActionPerformed

    private void btnBuscarRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRelacionActionPerformed

        labelErrorBuscarMasco.setText("");
        
        //Veo si la tabla tiene registros para comparar y Buscar
        if ( TablaListaMascotas.getRowCount() > 0 ) {
            
            if ( validarTxtBuscarMascota() ) {
                
                /*
                RowFilter:   Row: fila, Filter: filtrar.
                La Clase RowFilter recibe un Modelo de Tabla y un Integer 
                (el Integer es para saber el Index de la fila en que esta).
        
                .regexFilter():
                Acepta se le pase un String y un int.
                String ( txtFiltrarMascota.getText() de aqui va a sacar la palabra a
                buscar), y 0, significa la COLUMNA en la Tabla donde debe buscar.
        
                Va a tomar lo ingresado en el txt y lo va a comparar con cada fila 
                de la columna 0, va a comparar/buscar y en caso de que haya 
                coincidencia.
                Con Integer, como obtuve sus index.
        
                Una vez tenga la fila o filas que coinciden con la palabra, se los pasa
                a sorter, y este los mostrara en la Tabla.
                Ya que sorter tiene asignado el modeloTablaRelacion, el mismo que se le
                pasa a la Tabla del form.
                */

                RowFilter<DefaultTableModel, Integer> rowFiltrar =  
                RowFilter.regexFilter(txtFiltrarMascota.getText(), 0);
                sorter.setRowFilter(rowFiltrar);
            
                /*Una vez que ya busco que me borre lo escrito en el txt*/
                txtFiltrarMascota.setText("");
                
            } else {
            
                //Mensaje en caso de no haber seleccionado un Registro
                mostrarMensaje("O no existe el registros o no respeto "
                        + "las Minusculas y Mayusculas!", 
                "Error", "Error al Buscar");
            }  
                
        } else {
            
            //Mensaje en caso de no haber seleccionado un Registro
            mostrarMensaje("No hay registros para comparar y buscar!", 
                "Error", "Error al Buscar");
        }   
    }//GEN-LAST:event_btnBuscarRelacionActionPerformed

    private void btnSacarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarTurnoActionPerformed
        
        //Veo si la tabla tiene registros para seleccionar
        if ( TablaListaMascotas.getRowCount() > 0 ) {
            
            //Veo que se haya seleccionado un registro para sacar turno
            if ( TablaListaMascotas.getSelectedRow() != -1 ) { 
                
                /*Obtengo el id de la Relacion, forma MIA, (SIN MOSTRAR el id de la Relacion 
                en la Tabla)*/
                //Obtengo el index de la fila Seleccionada en la Tabla.

                /*Con el .convertRowIndexToModel() logro que sin importar en que
                Orden Ascendente o Descendente este la Tabla, aun asi me traiga
                el Index de la fila seleccionada de forma que sin importar el 
                orden no afecte la coincidencia con la Lista de Mascotas 
                que traigo de la BD.*/
                int id_filaTabla = TablaListaMascotas.convertRowIndexToModel
                            (TablaListaMascotas.getSelectedRow());
                
                
                /*Obtengo el idRelacion del Objeto seleccionado en la Tabla*/
                /*Uso el metodo buscarMascoDueYRelaEditar para Obtener el idRelacion
                seleccionado en la Tabla*/
                /*int id_Rela = controlLogica.buscarMascoDueYRelaEditar(id_filaTabla);*/
                
                /*Obtengo la Relacion del Objeto seleccionado en la Tabla*/
                Relacion rela = controlLogica.buscarRelacion(id_filaTabla);

                /*Una vez obtenido, se lo mando al Form Sacar Turno, para que tome
                los datos necesarios para poder trabajar*/
                SacarTurno turnoo = new SacarTurno();
                turnoo.setVisible(true);
                turnoo.setLocationRelativeTo(null);
                turnoo.enviarRelacionTurno(rela);
                
                //Cierro el form
                /*DEBO PONER SI O SI "this.dispose()" porque de lo contrario,
                abre muchos form iguales pero con distinta informacion en la tabla*/
                this.dispose();


            }
            else {
            
                //Mensaje en caso de no haber seleccionado un Registro
                mostrarMensaje("No seleccionó ninguna mascota para Sacar Turno!", 
                        "Error", "Error al Sacar Turno");
            }            
        }
        else {
            
            //Mensaje en caso de no haber Registros en la Tabla
            mostrarMensaje("No hay registros en la tabla para Sacar Turno!", 
                        "Error", "Error al Sacar Turno");
        }  
    }//GEN-LAST:event_btnSacarTurnoActionPerformed

    Turno turno;
    private void btnAbonarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonarTurnoActionPerformed
        
        //Veo si la tabla tiene registros para Abonar
        if ( TablaListaTurnosAPagar.getRowCount() > 0 ) {
            
            //Veo que se haya seleccionado un registro para Abonar
            if ( TablaListaTurnosAPagar.getSelectedRow() != -1 ) { 
                
                /*.convertRowIndexToModel() : 
                Este metodo al yo seleccionar un Objeto 
                en la Tabla, toma el Indice de la Fila en el que se encuentra 
                ese Objeto seleccionado en la Tabla y lo convierte al Indice 
                del Elemento en el Modelo de Tabla. Ejemplo:
                Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila 
                en la Tabla es 2, con el .convertRowIndexToModel(), convierto 
                ese 2, en el Indice 7, ya que "Pepe" en el Modelo de Tabla, 
                ocupa ese Index. 
                Una vez lo seleccione en la Tabla, para Editar, en el Form de 
                Editar AHORA SI
                me traera a la Mascota "Pepe" y no otra.*/
                
                /*Primero traigo el Index de la Fila, luego lo convierto al
                Index del Modelo de la Tabla, y se lo paso a buscarTurno*/
                /*int id_filaTabla =  TablaListaTurnosAPagar.convertRowIndexToModel
                            (TablaListaTurnosAPagar.getSelectedRow());*/
                
                int id_filaTabla = Integer.parseInt(String.valueOf(TablaListaTurnosAPagar.getValueAt(
                                     TablaListaTurnosAPagar.getSelectedRow(), 0)));
                
                
                turno = controlLogica.buscarTurnoSeleccionadoTabla(id_filaTabla);
                
                txtNroTurno.setText(String.valueOf(turno.getIdTurno()));
                txtMascotaTurno.setText(turno.getMascota().mostrarMascota());
                
                if ( cmbDuenioPagarTurno.isEnabled() ) {
                    
                    /*Recargar el combo de Duenio de Nuevo Mascota y le pasa eso
                    al Combo de Pagar Turno*/
                    actualizarComboListaDuenio();
                    cmbDuenioPagarTurno.setSelectedIndex(0);
                }

                cargarTxtFecha();
                btnAceptarDatosPagar.setEnabled(true);

                //Volvemos a cargar la tabla desde la BD pero Actualizada
                /*Cargo la Lista de Turnos*/
                mostrarMensaje("Turno seleccionado! Ingrese precio y/o Dueño", 
                        "Info", "Turno seleccionado para Abonar");

            }
            else {
            
                //Mensaje en caso de no haber seleccionado un Registro
                mostrarMensaje("No seleccionó ningun turno para Abonar!", 
                        "Error", "Error al elejir Turno a Abonar");
            }            
        }
        else {
            
            //Mensaje en caso de no haber Registros en la Tabla
            mostrarMensaje("No hay registros en la tabla para Abonar!", 
                        "Error", "Error al elejir Turno a Abonar");
        }
    }//GEN-LAST:event_btnAbonarTurnoActionPerformed

    
    private void btnPagarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarTurnoActionPerformed
        
        if ( !(txtTotalAPagar.getText().isBlank() || 
               txtTotalAPagar.getText().isEmpty() ) ) {
            
            double total = Double.parseDouble(txtTotalAPagar.getText());

            controlLogica.modiFacturaTurno(total);
            
            mostrarMensaje("Turno Pagado correctamente!", 
                        "Info", "Turno Pagado");
            
            cmbDuenioPagarTurno.setSelectedIndex(0);
            cmbDuenioPagarTurno.setEnabled(true);
            txtPrecioTurno.setText("");
            btnPagarTurno.setEnabled(false);
            btnEliminarTurnoPagar.setEnabled(false);
            btnAceptarDatosPagar.setEnabled(false);
            txtNroTurno.setText("");
            txtMascotaTurno.setText("");
            
            /*Recargo la lista de Detalle de Venta*/
            cargarTablaDetalleVentaTurno(facturaUltima);
            
            /*Recargo la Tabla de Lista Turnos a Pagar*/
            cargarTablaTurnosAPagar();
            
            /*Reinicio el txtPagar*/
            txtTotalAPagar.setText("");
        }
    }//GEN-LAST:event_btnPagarTurnoActionPerformed

    
    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowIconified

    private void txtTotalAPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAPagarActionPerformed

    }//GEN-LAST:event_txtTotalAPagarActionPerformed

    public void cargarTxtFecha() {
    
        /*Obtengo la Fecha seleccionada en el JCalendar*/
        Date fechaIngresada = new Date();
            
        /*Con .getTime() convierto la fecha al Tipo de Dato long, y lo guardo
        en la variable long*/
        long fechaLong = fechaIngresada.getTime();
        
        /*Y con java.sql.Date hago que la fecha se vea en Formato sql, o sea:
        2025/02/10, y NO de la forma java.util.Date que es formate eeuu: 
        mon Sep 10 00:00:00 CDT 2025*/
        java.sql.Date fechaSql = new java.sql.Date(fechaLong);
        
        String fechaStr = String.valueOf(fechaSql);
        
        /*Cargo la Fecha para la Factura de los Turnos*/
        txtFechaFacturaTurno.setText(fechaStr);
        
        /*Cargo la Fecha para la Factura de los Productos*/
        txtFechaFactura.setText(fechaStr);
    }
    
    FacturaDeTurno facturaUltima = null;
    /*double precioTurno = 0;*/
    private void btnAceptarDatosPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarDatosPagarActionPerformed
        
        if( validarDatosFactura() ){
            
            double precioTurno = 0;
            
            /*No mando el precio a Factura, lo mando a DetalleVentaTurno*/
            precioTurno = Double.parseDouble(txtPrecioTurno.getText());

           /*Pregunto si esta Habilitado combo, de estarlo, entonces que me 
           permita CREAR una NUEVA FACTURA*/
            if ( cmbDuenioPagarTurno.isEnabled() ) {
                
                String fechaPagoTurno = txtFechaFacturaTurno.getText();
            
                /*Obtengo el nombre completo del Duenio seleccionado en el Combo*/
                String duenioStr = cmbDuenioPagarTurno.getSelectedItem().toString();
                int duenioInt = cmbDuenioPagarTurno.getSelectedIndex();
            
                /*Le paso los datos del duenio seleccionado en el combo y me trae
                el id del Duenio seleccionado*/
                Duenio due = controlLogica.buscarDuenio(duenioStr, duenioInt);
            
                /*Le paso el Objeto duenio y fecha de pago para Crear la Factura de
                Turno*/
                controlLogica.crearFacturaTurno(due, fechaPagoTurno);
            
                /*Traigo la Factura recien creada para pasarsela a DetalleVentaTurno*/
                facturaUltima = controlLogica.buscarUltimaFacturaTurno();
          
                mostrarMensaje("Cabecera de Factura creada correctamente!", 
                        "Info", "Crear Cabecera Factura");
            
            
               /*Reinicio el txtPrecioTurno y deshabilito el Combo de Duenio*/
               txtPrecioTurno.setText("");
               cmbDuenioPagarTurno.getSelectedIndex();
               cmbDuenioPagarTurno.setEnabled(false);
               
               /*Habilito el boton de Pagar y Eliminar*/
               btnPagarTurno.setEnabled(true);
               btnEliminarTurnoPagar.setEnabled(true);
            } else {
            
                /*Si quiero SEGUIR COMPRANDO, traigo la misma Ultima Factura y
                la asigno al Nuevo Turno a Pagar, por ende al Nuevo
                DetalleVentaTurno*/
                facturaUltima = controlLogica.buscarUltimaFacturaTurno();

                
                /*No hace falta esto aca, porque en el Boton Abonar Turno
                ya Obtengo el Turno seleccionado a Pagar, no necesito llamarlo 
                denuevo aca.*/
                /*int id_filaTabla =  TablaListaTurnos1.convertRowIndexToModel
                            (TablaListaTurnos1.getSelectedRow());               
                turno = controlLogica.buscarTurno(id_filaTabla);*/
            }
            crearDetalleVentaTurno(precioTurno, turno, facturaUltima);
            
            btnAceptarDatosPagar.setEnabled(false);
            labelErrorDuenioPagar.setText("");
            labelErrorPrecioTurno.setText("");
        }
    }//GEN-LAST:event_btnAceptarDatosPagarActionPerformed

    public void calcularTotalAPagar() {
    
        double precioUni = controlLogica.calcularPrecioTotalAPagarTurno(facturaUltima);
        
        txtTotalAPagar.setText(String.valueOf(precioUni));
    }
    
    private void btnPagarTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarTurnosActionPerformed

        presionarPagarTurnosVioleta();

        /*Cargo la Lista de Turnos de la Pestaña PagarTurnos*/
        cargarTablaTurnos();
        
        /*Que muestre la Pestaña Pagar Turnos*/
        TabedPestanas.setSelectedIndex(3);
    }//GEN-LAST:event_btnPagarTurnosActionPerformed

    private void btnEliminarTurnoPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTurnoPagarActionPerformed
        
        //Veo si la tabla tiene registros para eliminar
        if ( TablaDetalleVentaTurnos.getRowCount() > 0 ) {
            
            //Veo que se haya seleccionado un registro para eliminar
            if ( TablaDetalleVentaTurnos.getSelectedRow() != -1 ) { 
                
                
                /*.convertRowIndexToModel() : 
                Este metodo al yo seleccionar un Objeto 
                en la Tabla, toma el Indice de la Fila en el que se encuentra 
                ese Objeto seleccionado en la Tabla y lo convierte al Indice 
                del Elemento en el Modelo de Tabla. Ejemplo:
                Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila 
                en la Tabla es 2, con el .convertRowIndexToModel(), convierto 
                ese 2, en el Indice 7, ya que "Pepe" en el Modelo de Tabla, 
                ocupa ese Index. 
                Una vez lo seleccione en la Tabla, para Editar, en el Form de 
                Editar AHORA SI
                me traera a la Mascota "Pepe" y no otra.
        
                int id_filaRelacion = 
                TablaListaTurnos.convertRowIndexToModel(TablaListaTurnos.getSelectedRow()); 
                
                int id = Integer.parseInt( String.valueOf(TablaListaTurnos.getValueAt
                        (TablaListaTurnos.getSelectedRow(), 0) ) );
                */
                
                /*int cantFilas = modeloTablaDetalleVentaTurno.getRowCount();
                int id = TablaPagarTurnos.getSelectedRow();*/
                
                /*Obtengo el Id del Turno seleccionado en la Tabla*/
                int idDetalleTurno = Integer.parseInt( String.valueOf(TablaDetalleVentaTurnos.getValueAt
                        (TablaDetalleVentaTurnos.getSelectedRow(), 0) ) );
                
                controlLogica.borrarDetalleVentaTurnoEnLista(idDetalleTurno);

                //Muestro el mensaje de Borrado Exitoso
                mostrarMensaje("Detalle de Venta de Turno eliminado correctamente!", 
                        "Info", "Eliminar Detalle de Venta");
                
                //Volvemos a cargar la tabla desde la BD pero Actualizada
                /*Cargo la Lista de Detalle de Venta de Turno*/
                cargarTablaDetalleVentaTurno(facturaUltima);

                activarComboDuenioTurno();
                

            }
            else {
            
                //Mensaje en caso de no haber seleccionado un Registro
                mostrarMensaje("No seleccionó ningun Detalle de Venta de "
                        + "Turno para Eliminar!", 
                        "Error", "Error al Eliminar");
            }            
        }
        else {
            
            //Mensaje en caso de no haber Registros en la Tabla
            mostrarMensaje("No hay registros en la tabla para Eliminar!", 
                        "Error", "Error al Eliminar");
        }
    }//GEN-LAST:event_btnEliminarTurnoPagarActionPerformed

    private void btnPagarTurnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarTurnosMouseClicked
        
        presionarPagarTurnosVioleta();
    }//GEN-LAST:event_btnPagarTurnosMouseClicked

    public void presionarPagarTurnosVioleta() {
    
        //Una vez presionado con el mouse sobre el boton Pagar Turnos, se muestra
        //la pestaña de Pagar Turnos
        TabedPestanas.setSelectedIndex(3);
        
        btnTurnos.setContentAreaFilled(false);
        btnTurnos.setBackground(Color.white);
        btnTurnos.setForeground(Color.BLACK);
        
        btnTienda.setContentAreaFilled(false);
        btnTienda.setBackground(Color.white);
        btnTienda.setForeground(Color.BLACK);
        
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setBackground(Color.white);
        btnNuevo.setForeground(Color.BLACK);
        
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBackground(Color.white);
        btnSalir.setForeground(Color.BLACK);
        
        btnPagarTurnos.setContentAreaFilled(true);
        btnPagarTurnos.setBackground(new Color(133, 38, 233 ));
        btnPagarTurnos.setForeground(Color.white);
    }
    
    
    private void btnPagarTurnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarTurnosMouseEntered
        
        /*Cuando el mouse pase por Encima del BOTON, el panel de detras cambie de color*/
        PanelPagarTurnos.setBackground(Color.LIGHT_GRAY);
        PanelBotonTienda.setBackground(Color.white);
        PanelBotonSalir.setBackground(Color.white);
        PanelBotonTurnos.setBackground(Color.white);
        PanelBotonNuevo.setBackground(Color.white);
        
        btnInformacionProgramador.setContentAreaFilled(false);
        btnInformacionProgramador.setBackground(Color.white);
        btnInformacionProgramador.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnPagarTurnosMouseEntered

    private void btnIngresarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarProductosActionPerformed
        
        //Llamo al form de Registros para que se vuelva a abrir y cargar
        //con los registros desde la BD
        NuevoProducto producto = new NuevoProducto();
        producto.setVisible(true);
        producto.setLocationRelativeTo(null);

        //Cierro el form
        /*DEBO PONER SI O SI "this.dispose()" porque de lo contrario,
        abre muchos form iguales pero con distinta informacion en la tabla*/
        this.dispose();
    }//GEN-LAST:event_btnIngresarProductosActionPerformed

    private void btnRecargarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarProductosActionPerformed
        
        /*Recargo la Lista de Productos*/
        cargarTablaProductos();
    }//GEN-LAST:event_btnRecargarProductosActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        
        //Veo si la tabla tiene registros para editar
        if ( TablaListaProductos.getRowCount() > 0 ) {
            
            //Veo que se haya seleccionado un registro para editar
            if ( TablaListaProductos.getSelectedRow() != -1 ) { 

                /*Obtengo el id de la Relacion, forma MIA, (SIN MOSTRAR el id de la Relacion 
                en la Tabla)*/
                
                /*.convertRowIndexToModel() : 
                Este metodo al yo seleccionar un Objeto 
                en la Tabla, toma el Indice de la Fila en el que se encuentra ese Objeto
                seleccionado en la Tabla y lo convierte al Indice del Elemento en el Modelo
                de Tabla. Ejemplo:
                Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila en la Tabla
                es 2, con el .convertRowIndexToModel(), convierto ese 2, en el Indice
                7, ya que "Pepe" en el Modelo de Tabla, ocupa ese Index. 
                Una vez lo seleccione en la Tabla, para Editar, en el Form de Editar AHORA SI
                me traera a la Mascota "Pepe" y no otra.
                
                Debo usar el .convertRowIndexToModel() SI o SI, ya que puse un
                Sorteador/Ordenador de Objetos en el metodo .cargarTablaRelacion(),
                este me ordena la Tabla Lista Mascotas
                en base al Nombre de la Mascota en Ascendente por default y
                Descendente si es que lo quiero tambien.*/
                
                //Obtengo el index de la fila Seleccionada en la Tabla.
                int id_filaTabla = TablaListaProductos.convertRowIndexToModel
                            (TablaListaProductos.getSelectedRow());
                
                /*Obtengo el idProducto del Objeto seleccionado en la Tabla*/
                Producto produ = controlLogica.buscarProducto(id_filaTabla);

                //Llamo al form de Editar:
                ModificarProducto pantallaModiPro = new ModificarProducto();
                pantallaModiPro.setVisible(true);
                pantallaModiPro.setLocationRelativeTo(null);
                pantallaModiPro.enviarProducto(produ);
                
                
                //Cierro el form
                /*DEBO PONER SI O SI "this.dispose()" porque de lo contrario,
                abre muchos form iguales pero con distinta informacion en la tabla*/
                this.dispose();
            }
            else {
            
                //Mensaje en caso de no haber seleccionado un Registro
                mostrarMensaje("No seleccionó ninguna mascota para Editar!", 
                        "Error", "Error al Editar");
            }            
        }
        else {
            
            //Mensaje en caso de no haber Registros en la Tabla
            mostrarMensaje("No hay registros en la tabla para Editar!", 
                        "Error", "Error al Editar");
        }
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        
        //Veo si la tabla tiene registros para editar
        if ( TablaListaProductos.getRowCount() > 0 ) {
            
            //Veo que se haya seleccionado un registro para editar
            if ( TablaListaProductos.getSelectedRow() != -1 ) { 

                /*Obtengo el id de la Relacion, forma MIA, (SIN MOSTRAR el id de la Relacion 
                en la Tabla)*/
                
                /*.convertRowIndexToModel() : 
                Este metodo al yo seleccionar un Objeto 
                en la Tabla, toma el Indice de la Fila en el que se encuentra ese Objeto
                seleccionado en la Tabla y lo convierte al Indice del Elemento en el Modelo
                de Tabla. Ejemplo:
                Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila en la Tabla
                es 2, con el .convertRowIndexToModel(), convierto ese 2, en el Indice
                7, ya que "Pepe" en el Modelo de Tabla, ocupa ese Index. 
                Una vez lo seleccione en la Tabla, para Editar, en el Form de Editar AHORA SI
                me traera a la Mascota "Pepe" y no otra.
                
                Debo usar el .convertRowIndexToModel() SI o SI, ya que puse un
                Sorteador/Ordenador de Objetos en el metodo .cargarTablaRelacion(),
                este me ordena la Tabla Lista Mascotas
                en base al Nombre de la Mascota en Ascendente por default y
                Descendente si es que lo quiero tambien.*/
                
                //Obtengo el index de la fila Seleccionada en la Tabla.
                int id_filaTabla = TablaListaProductos.convertRowIndexToModel
                            (TablaListaProductos.getSelectedRow());
                
                /*Obtengo el idProducto del Objeto seleccionado en la Tabla*/
                Producto pro = controlLogica.buscarProducto(id_filaTabla);

                /*Le paso el IdProducto y elimino de la BD*/
                controlLogica.borrarProducto(pro.getIdProducto());
                
                //Mensaje en caso de no haber seleccionado un Registro
                mostrarMensaje("Producto eliminado correctamente!", 
                        "Info", "Eliminar Producto");
                
                /*Recargo la Lista de Productos*/
                cargarTablaProductos();
                
            }
            else {
            
                //Mensaje en caso de no haber seleccionado un Registro
                mostrarMensaje("No seleccionó ninguna mascota para Editar!", 
                        "Error", "Error al Editar");
            }            
        }
        else {
            
            //Mensaje en caso de no haber Registros en la Tabla
            mostrarMensaje("No hay registros en la tabla para Editar!", 
                        "Error", "Error al Editar");
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        labelErrorBuscarProducto.setText("");
        
        //Veo si la tabla tiene registros para comparar y Buscar
        if ( TablaListaProductos.getRowCount() > 0 ) {
            
            if ( validarTxtBuscarProducto() ) {
                
                /*
                RowFilter:   Row: fila, Filter: filtrar.
                La Clase RowFilter recibe un Modelo de Tabla y un Integer 
                (el Integer es para saber el Index de la fila en que esta).
        
                .regexFilter():
                Acepta se le pase un String y un int.
                String ( txtFiltrarMascota.getText() de aqui va a sacar la palabra a
                buscar), y 0, significa la COLUMNA en la Tabla donde debe buscar.
        
                Va a tomar lo ingresado en el txt y lo va a comparar con cada fila 
                de la columna 0, va a comparar/buscar y en caso de que haya 
                coincidencia.
                Con Integer, como obtuve sus index.
        
                Una vez tenga la fila o filas que coinciden con la palabra, se los pasa
                a sorter, y este los mostrara en la Tabla.
                Ya que sorter tiene asignado el modeloTablaRelacion, el mismo que se le
                pasa a la Tabla del form.
                */

                RowFilter<DefaultTableModel, Integer> rowFiltrarProducto =  
                RowFilter.regexFilter(txtBuscarProducto.getText(), 0);
                sorterProducto.setRowFilter(rowFiltrarProducto);
            
                /*Una vez que ya busco que me borre lo escrito en el txt*/
                txtBuscarProducto.setText("");
            }    
                
        } else {
            
            //Mensaje en caso de no haber seleccionado un Registro
            mostrarMensaje("No hay registros para comparar y buscar!", 
                "Error", "Error al Buscar");
        }   
    }//GEN-LAST:event_btnBuscarActionPerformed

    Producto producto;
    double stockActual = 0;
    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        
        //Veo si la tabla tiene registros para Abonar
        if ( TablaListaProductos.getRowCount() > 0 ) {
            
            //Veo que se haya seleccionado un registro para Abonar
            if ( TablaListaProductos.getSelectedRow() != -1 ) { 
                
                /*Deshabilito el boton de comprobante*/
                btnComprobante.setEnabled(false);
                
                /*.convertRowIndexToModel() : 
                Este metodo al yo seleccionar un Objeto 
                en la Tabla, toma el Indice de la Fila en el que se encuentra 
                ese Objeto seleccionado en la Tabla y lo convierte al Indice 
                del Elemento en el Modelo de Tabla. Ejemplo:
                Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila 
                en la Tabla es 2, con el .convertRowIndexToModel(), convierto 
                ese 2, en el Indice 7, ya que "Pepe" en el Modelo de Tabla, 
                ocupa ese Index. 
                Una vez lo seleccione en la Tabla, para Editar, en el Form de 
                Editar AHORA SI
                me traera a la Mascota "Pepe" y no otra.*/
                
                /*Tengo el Index del Modelo de la Tabla*/
                int id_filaTabla =  TablaListaProductos.convertRowIndexToModel
                            (TablaListaProductos.getSelectedRow());
                
                /*Con ese Index recorro y busco el Id del Producto seleccionado
                en la Tabla*/
                producto = controlLogica.buscarProducto(id_filaTabla);
                
                /*Obtengo el Stock del Producto seleccionado*/
                stockActual = controlLogica.productoTieneStock(producto);
                
                /*Si el Stock es mayor a cero que me permita tomar el producto 
                para hacer la compra, de lo contrario que me salte el mensaje
                de error*/
                if ( stockActual > 0 ) {
                    
                    txtProductoSeleccionado.setText(String.valueOf(producto.getNombre()));
                
                    /*Si el combo esta HABILITADO, entonces carga el combo*/
                    /*Si se Eliminaron todos los DetalleVenta de la tabla y quiere
                    seguir comprando u otro cliente quiere comprar, 
                    se activara el combo y se cargara*/
                    if ( cmbDuenioCompra.isEnabled() ) {
                    
                        cmbDuenioCompra.setSelectedIndex(0);
                    }

                    
                    cargarTxtFecha();
                    btnCalcular.setEnabled(true);
                
                    spinnerCantidad.setEnabled(true);
                    spinnerDescuentoProducto.setEnabled(true);
                    spinnerIvaProducto.setEnabled(true);

                    //Volvemos a cargar la tabla desde la BD pero Actualizada
                    /*Cargo la Lista de Turnos*/
                    mostrarMensaje("Producto seleccionado! Ingrese precio y Dueño", 
                        "Info", "Producto Agregado al Carrito");
                    
                } else {
                
                    mostrarMensaje("El Producto seleccionado no tiene Stock", 
                        "Error", "Error al Agregar el Producto al Carrito");
                }
                
            }
            else {
            
                //Mensaje en caso de no haber seleccionado un Registro
                mostrarMensaje("No seleccionó ningun Producto para Agregar al Carrito!", 
                        "Error", "Error al elejir Producto");
            }            
        }
        else {
            
            //Mensaje en caso de no haber Registros en la Tabla
            mostrarMensaje("No hay Productos en la tabla para Agregar al Carrito!", 
                        "Error", "Error al elejir Producto");
        }
    }//GEN-LAST:event_btnCarritoActionPerformed

    public void limpiarMensajesErrorCalcular() {
    
        labelErrorDuenioCompra.setText("");
        labelErrorCantidadComprar.setText("");
    }
    
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        
        if ( validarCantidadProductos() ) {
            
            /*Cuantos Productos va a comprar*/
            double cantidad = Double.parseDouble(spinnerCantidad.getValue().toString());
            
            
            /*Si tiene descuento POR Producto*/
            double descuentoProducto = Double.parseDouble(spinnerDescuentoProducto.getValue().toString());
        

            /*Si tiene IVA POR Producto*/
            double ivaProducto = Double.parseDouble(spinnerIvaProducto.getValue().toString());
        
            /*Le paso el Producto seleccionado en la Tabla, para poder acceder al 
            Precio del Producto, y todo lo demas para que calcule bien el Subtotal
            POR Producto*/
            String subtotal = controlLogica.calcularSubtotal(producto, cantidad, 
                descuentoProducto, ivaProducto);
        
            /*Muestro el resultado POR Producto*/
            txtCalcular.setText(String.valueOf(subtotal));
            
            btnCancelar.setEnabled(true);
            btnAceptarProducto.setEnabled(true);
            
            labelErrorDuenioCompra.setText("");
            labelErrorCantidadComprar.setText("");
            
        }   
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        /*Si el combo esta HABILITADO, entonces reinicialo a 0*/
        if ( cmbDuenioCompra.isEnabled() ) {
            
            cmbDuenioCompra.setSelectedIndex(0);
        }
        
        txtProductoSeleccionado.setText("");
        spinnerCantidad.setValue(0);
        spinnerDescuentoProducto.setValue(0);
        spinnerIvaProducto.setValue(0);
        txtCalcular.setText("");
        
        btnCancelar.setEnabled(false);
        btnAceptarProducto.setEnabled(false);
        
        labelErrorDuenioCompra.setText("");
        labelErrorCantidadComprar.setText("");

    }//GEN-LAST:event_btnCancelarActionPerformed

    Factura facturaUltimaProducto;
    private void btnAceptarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarProductoActionPerformed
        
        if ( validarDuenioCompra() ) {
            
            
            double subtotalProducto = 0, cantidad = 0, iva = 0, descuento = 0;
            
            /*No mando el precio a Factura, lo mando a DetalleVenta*/
            /*subtotalProducto = Double.parseDouble(txtCalcular.getText());*/
            
            /*Guarda el subtotal con . en la BD, ya que no acepta , */
            if ( txtCalcular.getText().contains(",") ) {
                
                subtotalProducto = Double.parseDouble(txtCalcular.getText().replaceAll(",", "\\."));
            }
            
            
            cantidad = Double.parseDouble(spinnerCantidad.getValue().toString());
            
            
            descuento = Double.parseDouble(spinnerDescuentoProducto.getValue().toString());
            
            iva = Double.parseDouble(spinnerIvaProducto.getValue().toString());

            /*Pregunto si esta Habilitado combo, de estarlo, entonces que me 
            permita CREAR una NUEVA FACTURA*/
            if ( cmbDuenioCompra.isEnabled() ) {
                
                String fechaFacturaProducto = txtFechaFactura.getText();
            
                /*Obtengo el nombre completo del Duenio seleccionado en el Combo*/
                String duenioStr = cmbDuenioCompra.getSelectedItem().toString();
                int duenioInt = cmbDuenioCompra.getSelectedIndex();
            
                /*Le paso los datos del duenio seleccionado en el combo y me trae
                el id del Duenio seleccionado*/
                Duenio duenio = controlLogica.buscarDuenio(duenioStr, duenioInt);
            
                /*Le paso el Objeto duenio y fecha de pago para Crear la Factura de
                Productos*/
                controlLogica.crearFacturaProducto(duenio, fechaFacturaProducto);
            
                /*Traigo la Factura recien creada para pasarsela a DetalleVenta
                POR Producto*/
                facturaUltimaProducto = controlLogica.buscarUltimaFacturaProducto();
          
                mostrarMensaje("Cabecera de Factura creada correctamente!", 
                        "Info", "Crear Cabecera Factura");
            
            
                /*Reinicio los txt y deshabilito el Combo de Duenio*/
                txtProductoSeleccionado.setText("");
               
                /*Que Deshabilite el Combo pero se quede mostrando el Duenio
                ya seleccionado*/
                cmbDuenioCompra.setEnabled(false);
               
                btnCancelar.setEnabled(false);
                btnAceptarProducto.setEnabled(false);
                btnCalcular.setEnabled(false);
               
                /*Habilito el boton de Pagar y Eliminar*/
                btnPagarCompra.setEnabled(true);
                btnEliminarDetalleProducto.setEnabled(true);
                btnEditarDetalleProducto.setEnabled(true);
                btnResultadoFinalCompra.setEnabled(true);
               
            } else {
            
                /*Si quiero SEGUIR COMPRANDO, traigo la misma Ultima Factura y
                la asigno al Nuevo Turno a Pagar, por ende al Nuevo
                DetalleVentaTurno*/
                facturaUltimaProducto = controlLogica.buscarUltimaFacturaProducto();
            }
            
            /*Cree el primer DetalleVenta POR Producto y lo traje*/
            controlLogica.crearDetalleVentaProducto(subtotalProducto, cantidad, 
                descuento, iva, producto, facturaUltimaProducto);
            
            /*Prueba*/
            controlLogica.modiAgregarDetalleAFactura(facturaUltimaProducto);
            
            /*Una vez creado Recargo la Tabla de DetalleVentaTurno*/
            cargarTablaDetalleVentaProducto(facturaUltimaProducto);
            
            spinnerCantidad.setValue(0);
            spinnerDescuentoProducto.setValue(0);
            spinnerIvaProducto.setValue(0);
            txtCalcular.setText("");
            
            labelErrorDuenioCompra.setText("");
            labelErrorCantidadComprar.setText("");
            txtProductoSeleccionado.setText("");
        }
    }//GEN-LAST:event_btnAceptarProductoActionPerformed

    private void btnPagarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarCompraActionPerformed
        
        if ( validarCompra() ) {
            
            /*Una vez calculado el Total de la Compra, traigo el valor*/
            /*double total = Double.parseDouble(txtTotalPagar.getText());*/
            double total = 0;
            
            if ( txtTotalPagar.getText().contains(",") ) {
                
                total = Double.parseDouble(txtTotalPagar.getText().replaceAll(",", "\\."));
            }
            
            /*descuentoCompra
            ivaCompra*/

            /*Y se lo paso para modificar en la Factura el TOTAL de Compra*/
            controlLogica.modiFactura(subTotal, total, descuentoCompra, ivaCompra);

            mostrarMensaje("Compra realizada correctamente!", 
                        "Info", "Comprar Productos");

            /*Traigo la Lista de DetalleVenta, de Producto ya vendidos*/
            List<DetalleVenta> listaDetalleProducto = 
                controlLogica.traerListaDetalleVentaProducto2(facturaUltimaProducto);
            
            /*Una vez tengo la Lista de Productos Vendidos. 
            Habilito el boton de ticket*/
            btnComprobante.setEnabled(true);
            
            
            /*Y voy a restar la cantidad Vendida al Stock Actual de cada Producto*/
            controlLogica.restarStockProductoVendido(listaDetalleProducto);
            
            /*Recargo la Lista de Productos con el Stock Actual luego de la Venta*/
            cargarTablaProductos();
            
            /*Le mando el 'cambiarDuenio = false', para que me cargue el combo y 
            se active*/
            cambiarDuenio = false;
            cmbDuenioCompra.setSelectedIndex(0);
            cmbDuenioCompra.setEnabled(true);
            
            txtProductoSeleccionado.setText("");
            
            spinnerCantidad.setValue(0);
            spinnerCantidad.setEnabled(false);
            
            spinnerDescuentoProducto.setValue(0);
            spinnerDescuentoProducto.setEnabled(false);
            
            spinnerIvaProducto.setValue(0);
            spinnerIvaProducto.setEnabled(false);
            
            btnEliminarDetalleProducto.setEnabled(false);
            btnEditarDetalleProducto.setEnabled(false);
            
            spinnerDescuentoCompra.setValue(0);
            spinnerIvaCompra.setValue(0);

            btnPagarCompra.setEnabled(false);
            
            /*Recargo la lista de Detalle de Venta*/
            cargarTablaDetalleVentaProducto(facturaUltimaProducto);
            
            txtSubTotal.setText("");
            txtTotalPagar.setText("");
            
            
        }
    }//GEN-LAST:event_btnPagarCompraActionPerformed

    private void btnEliminarDetalleProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDetalleProductoActionPerformed
        
        //Veo si la tabla tiene registros para eliminar
        if ( TablaCompra.getRowCount() > 0 ) {
            
            //Veo que se haya seleccionado un registro para eliminar
            if ( TablaCompra.getSelectedRow() != -1 ) { 
                
                
                /*.convertRowIndexToModel() : 
                Este metodo al yo seleccionar un Objeto 
                en la Tabla, toma el Indice de la Fila en el que se encuentra 
                ese Objeto seleccionado en la Tabla y lo convierte al Indice 
                del Elemento en el Modelo de Tabla. Ejemplo:
                Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila 
                en la Tabla es 2, con el .convertRowIndexToModel(), convierto 
                ese 2, en el Indice 7, ya que "Pepe" en el Modelo de Tabla, 
                ocupa ese Index. 
                Una vez lo seleccione en la Tabla, para Editar, en el Form de 
                Editar AHORA SI
                me traera a la Mascota "Pepe" y no otra.
        
                int id_filaRelacion = 
                TablaListaTurnos.convertRowIndexToModel(TablaListaTurnos.getSelectedRow()); 
                
                int id = Integer.parseInt( String.valueOf(TablaListaTurnos.getValueAt
                        (TablaListaTurnos.getSelectedRow(), 0) ) );
                */
                
                /*Obtengo el id del Producto seleccionado en la Tabla*/
                int idDetalleProducto = Integer.parseInt( String.valueOf(TablaCompra.getValueAt
                        (TablaCompra.getSelectedRow(), 0) ) );
                
                controlLogica.borrarDetalleVentaProductoEnLista(idDetalleProducto);
                
                //Muestro el mensaje de Borrado Exitoso
                mostrarMensaje("Producto Eliminado correctamente del Detalle de Venta!", 
                        "Info", "Eliminar Producto del Detalle de Venta");
                
                txtTotalPagar.setText("");
                
                //Volvemos a cargar la tabla desde la BD pero Actualizada
                /*Cargo la Lista de Detalle de Venta de Turno*/
                cargarTablaDetalleVentaProducto(facturaUltimaProducto);

                activarComboDuenio();
                
            }
            else {
            
                //Mensaje en caso de no haber seleccionado un Registro
                mostrarMensaje("No seleccionó ningun Producto en el "
                        + "Detalle de Venta para Eliminar!", 
                        "Error", "Error al Eliminar");
            }            
        }
        else {
            
            //Mensaje en caso de no haber Registros en la Tabla
            mostrarMensaje("No hay registros en la tabla para Eliminar!", 
                        "Error", "Error al Eliminar");
        }
    }//GEN-LAST:event_btnEliminarDetalleProductoActionPerformed

    private void btnResultadoFinalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoFinalCompraActionPerformed
        
        calcularTotalAPagarCompra();
    }//GEN-LAST:event_btnResultadoFinalCompraActionPerformed

    private void btnEditarDetalleProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDetalleProductoActionPerformed
        
        //Veo si la tabla tiene registros para eliminar
        if ( TablaCompra.getRowCount() > 0 ) {
            
            //Veo que se haya seleccionado un registro para eliminar
            if ( TablaCompra.getSelectedRow() != -1 ) { 
                
                /*.convertRowIndexToModel() : 
                Este metodo al yo seleccionar un Objeto 
                en la Tabla, toma el Indice de la Fila en el que se encuentra 
                ese Objeto seleccionado en la Tabla y lo convierte al Indice 
                del Elemento en el Modelo de Tabla. Ejemplo:
                Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila 
                en la Tabla es 2, con el .convertRowIndexToModel(), convierto 
                ese 2, en el Indice 7, ya que "Pepe" en el Modelo de Tabla, 
                ocupa ese Index. 
                Una vez lo seleccione en la Tabla, para Editar, en el Form de 
                Editar AHORA SI
                me traera a la Mascota "Pepe" y no otra.
        
                int id_filaRelacion = 
                TablaListaTurnos.convertRowIndexToModel(TablaListaTurnos.getSelectedRow()); 
                
                int id = Integer.parseInt( String.valueOf(TablaListaTurnos.getValueAt
                        (TablaListaTurnos.getSelectedRow(), 0) ) );
                */
                
                /*Obtengo ek id del Producto seleccionado en la Tabla*/
                int idDetalleProducto = Integer.parseInt( String.valueOf(TablaCompra.getValueAt
                        (TablaCompra.getSelectedRow(), 0) ) );
                
                
                DetalleVenta deta = controlLogica.buscarDetalleVentaProducto
                                  (idDetalleProducto, facturaUltimaProducto);
                
                EditarDetalleVenta editDetalleVentaPro = new EditarDetalleVenta();
                editDetalleVentaPro.setVisible(true);
                editDetalleVentaPro.setLocationRelativeTo(null);
                editDetalleVentaPro.cargarDatos(deta);
                this.dispose();

            }
            else {
            
                //Mensaje en caso de no haber seleccionado un Registro
                mostrarMensaje("No seleccionó ningun Producto en el "
                        + "Detalle de Venta para Editar!", 
                        "Error", "Error al Editar");
            }            
        }
        else {
            
            //Mensaje en caso de no haber Registros en la Tabla
            mostrarMensaje("No hay registros en la tabla para Editar!", 
                        "Error", "Error al Editar");
        }
    }//GEN-LAST:event_btnEditarDetalleProductoActionPerformed

    private void btnlImagenMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlImagenMenuActionPerformed
        
        /*Llamo al Form Menu*/
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnlImagenMenuActionPerformed

    private void btnCancelarNuevaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNuevaMascotaActionPerformed
        
        /*Que Habilite el Combo Mascota*/
        cmbIngresarMascota.setEnabled(true);
        
        /*Que DESHABILITE todo 
        para poder Ingresar otra Mascota*/
        deshabilitarIngresoMascota();
    }//GEN-LAST:event_btnCancelarNuevaMascotaActionPerformed

    private void btnCancelarDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDuenioActionPerformed
        
        /*Que Habilite el Combo Duenio*/
        cmbDuenio.setEnabled(true);
        
        /*Que DESHABILITE todo 
        para poder Ingresar otro Duenio*/
        deshabilitarIngresoDuenio();
    }//GEN-LAST:event_btnCancelarDuenioActionPerformed

    private void btnInformacionProgramadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionProgramadorMouseEntered

        btnInformacionProgramador.setContentAreaFilled(true);
        btnInformacionProgramador.setBackground(new Color(133, 38, 233 ));
        btnInformacionProgramador.setForeground(Color.white);

        btnPagarTurnos.setContentAreaFilled(false);
        btnPagarTurnos.setBackground(Color.white);
        btnPagarTurnos.setForeground(Color.BLACK);

        btnTurnos.setContentAreaFilled(false);
        btnTurnos.setBackground(Color.white);
        btnTurnos.setForeground(Color.BLACK);

        btnTienda.setContentAreaFilled(false);
        btnTienda.setBackground(Color.white);
        btnTienda.setForeground(Color.BLACK);

        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setBackground(Color.white);
        btnNuevo.setForeground(Color.BLACK);

        btnSalir.setContentAreaFilled(false);
        btnSalir.setBackground(Color.white);
        btnSalir.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnInformacionProgramadorMouseEntered

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        presionarNuevoVioleta();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobanteActionPerformed

        Factura factura = controlLogica.buscarUltimaFacturaProducto();
        
        // Creo el reporte
        ReporteVentaa reporte = new ReporteVentaa();
        JasperPrint print = reporte.mostrarReporte(factura);
        
        
        if(print == null) {
            JOptionPane.showMessageDialog(this, "No se pudo generar el comprobante.");
        }
        
    }//GEN-LAST:event_btnComprobanteActionPerformed

    private void txtNombreMascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMascotaKeyTyped
        //Para controlar que solo se ingresen Letras en el txt
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)  ) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreMascotaKeyTyped

    private void txtRazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazaKeyTyped
        ///Para controlar que solo se ingresen Letras en el txt
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
    
        cmbIngresarMascota.setSelectedIndex(0);
        txtNombreMascota.setText("");
        txtRaza.setText("");
        txtEspecie.setText("");
        txtColor.setText("");
        
        cmbAlergico.setSelectedIndex(0);
        cmbAtencion.setSelectedIndex(0);
        txtObservaciones.setText("");
        
        cmbDuenio.setSelectedIndex(0);
        txtDuenio.setText("");
        txtApellidoDuenio.setText("");
        txtCelular.setText("");
        
        /*Limpiar mensajes de advertencia*/
        labelErrorMascota.setText("");
        labelErrorRaza.setText("");
        labelErrorEspecie.setText("");
        labelErrorColor.setText("");
        labelErrorAlergico.setText("");
        labelErrorAtencion.setText("");
        labelErrorComboDuenio.setText("");
        labelErrorIngresarMascota.setText("");
        labelErrorDuenio.setText("");
        labelErrorApellido.setText("");
        labelErrorCelular.setText("");
    }

    public void mostrarMensaje (String mensaje, String tipoMensaje, String titulo) {
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorPagarTurnos;
    private javax.swing.JPanel PagarTurnos;
    private javax.swing.JPanel PanelBotonNuevo;
    private javax.swing.JPanel PanelBotonSalir;
    private javax.swing.JPanel PanelBotonTienda;
    private javax.swing.JPanel PanelBotonTurnos;
    private javax.swing.JPanel PanelComprar;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelContenedorTurnos;
    private javax.swing.JPanel PanelDuenio;
    private javax.swing.JPanel PanelFondoPerro;
    private javax.swing.JPanel PanelIngresoNuevo;
    private javax.swing.JPanel PanelListaMascotas;
    private javax.swing.JPanel PanelListaProductos;
    private javax.swing.JPanel PanelListaTurnos;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelNuevaMascota;
    private javax.swing.JPanel PanelPagarTurno;
    private javax.swing.JPanel PanelPagarTurnos;
    private javax.swing.JPanel PanelProductoComprados;
    private javax.swing.JPanel PanelProductosYCompra;
    private javax.swing.JPanel PanelTurnos;
    private javax.swing.JPanel TabedContenedorProductos;
    private javax.swing.JPanel TabedIngresoMascota;
    private javax.swing.JPanel TabedListaMascotasYTurnos;
    private javax.swing.JTabbedPane TabedPestanas;
    private javax.swing.JTable TablaCompra;
    private javax.swing.JTable TablaDetalleVentaTurnos;
    private javax.swing.JTable TablaListaMascotas;
    private javax.swing.JTable TablaListaProductos;
    private javax.swing.JTable TablaListaTurnos;
    private javax.swing.JTable TablaListaTurnosAPagar;
    private javax.swing.JLabel TitutoIngresoMascota;
    private javax.swing.JButton btnAbonarTurno;
    private javax.swing.JButton btnAceptarDatosPagar;
    private javax.swing.JButton btnAceptarDuenio;
    private javax.swing.JButton btnAceptarMascota;
    private javax.swing.JButton btnAceptarProducto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarRelacion;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarDuenio;
    private javax.swing.JButton btnCancelarNuevaMascota;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnComprobante;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarDetalleProducto;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEliminarDetalleProducto;
    private javax.swing.JButton btnEliminarMascotaYDuenio;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarTurnoPagar;
    private javax.swing.JButton btnGuardarMascotaDuenio;
    private javax.swing.JButton btnInformacionProgramador;
    private javax.swing.JButton btnIngresarDuenio;
    private javax.swing.JButton btnIngresarMascota;
    private javax.swing.JButton btnIngresarProductos;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPagarCompra;
    private javax.swing.JButton btnPagarTurno;
    private javax.swing.JButton btnPagarTurnos;
    private javax.swing.JButton btnRecargarListaMascota;
    private javax.swing.JButton btnRecargarProductos;
    private javax.swing.JButton btnResultadoFinalCompra;
    private javax.swing.JButton btnSacarTurno;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTienda;
    private javax.swing.JButton btnTurnos;
    private javax.swing.JButton btnlImagenMenu;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencion;
    private javax.swing.JComboBox<String> cmbDuenio;
    private javax.swing.JComboBox<String> cmbDuenioCompra;
    private javax.swing.JComboBox<String> cmbDuenioPagarTurno;
    private javax.swing.JComboBox<String> cmbIngresarMascota;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labelBurbujaDerecha1;
    private javax.swing.JLabel labelBurbujaDerecha2;
    private javax.swing.JLabel labelBurbujaDerecha3;
    private javax.swing.JLabel labelBurbujaFlotanteDerecha;
    private javax.swing.JLabel labelErrorAlergico;
    private javax.swing.JLabel labelErrorApellido;
    private javax.swing.JLabel labelErrorAtencion;
    private javax.swing.JLabel labelErrorBuscarMasco;
    private javax.swing.JLabel labelErrorBuscarProducto;
    private javax.swing.JLabel labelErrorCantidadComprar;
    private javax.swing.JLabel labelErrorCelular;
    private javax.swing.JLabel labelErrorColor;
    private javax.swing.JLabel labelErrorComboDuenio;
    private javax.swing.JLabel labelErrorDuenio;
    private javax.swing.JLabel labelErrorDuenioCompra;
    private javax.swing.JLabel labelErrorDuenioPagar;
    private javax.swing.JLabel labelErrorEspecie;
    private javax.swing.JLabel labelErrorIngresarMascota;
    private javax.swing.JLabel labelErrorMascota;
    private javax.swing.JLabel labelErrorPrecioTurno;
    private javax.swing.JLabel labelErrorRaza;
    private javax.swing.JLabel labelErrorSubtotal;
    private javax.swing.JLabel labelGatoGris;
    private javax.swing.JLabel labelGatoNaranja;
    private javax.swing.JLabel labelPerritoPug;
    private javax.swing.JLabel labelTituloListaTurnos;
    private javax.swing.JLabel labelTituloRegistrarTurno;
    private javax.swing.JLabel nombreMascota;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JSpinner spinnerDescuentoCompra;
    private javax.swing.JSpinner spinnerDescuentoProducto;
    private javax.swing.JSpinner spinnerIvaCompra;
    private javax.swing.JSpinner spinnerIvaProducto;
    private javax.swing.JTextField txtApellidoDuenio;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtCalcular;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDuenio;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtFechaFactura;
    private javax.swing.JTextField txtFechaFacturaTurno;
    private javax.swing.JTextField txtFiltrarMascota;
    private javax.swing.JTextField txtMascotaTurno;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtNroTurno;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtPrecioTurno;
    private javax.swing.JTextField txtProductoSeleccionado;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotalAPagar;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables

    private boolean validarDuenio() {
        
        boolean valido = true;
        
        if ( txtDuenio.getText().isEmpty() ) {
            
            valido = false;
            labelErrorDuenio.setText("• Campo Requerido");
        }
        
        if ( txtApellidoDuenio.getText().isEmpty() ) {
            
            valido = false;
            labelErrorApellido.setText("• Campo Requerido");
        }
        
        if ( txtCelular.getText().isEmpty() ) {
            
            valido = false;
            labelErrorCelular.setText("• Campo Requerido");
        }
        
        return valido;
    }

    private boolean validarMascotaYDuenio() {
        
        boolean valido = true;
        
        if ( cmbDuenio.isEnabled() && !(cmbDuenio.getSelectedIndex() > 0) ) {
            
            labelErrorComboDuenio.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( cmbIngresarMascota.isEnabled() && !(cmbIngresarMascota.getSelectedIndex() > 0) ) {
            
            labelErrorIngresarMascota.setText("• Campo Requerido");
            valido = false;
        }
        
        return valido;
    }

    private void habilitarIngresoMascota() {
        
        /*Que HABILITE todo 
        para poder Ingresar otra Mascota*/
        txtNombreMascota.setEnabled(true);
        txtRaza.setEnabled(true);
        txtEspecie.setEnabled(true);
        txtColor.setEnabled(true);
        cmbAlergico.setEnabled(true);
        cmbAtencion.setEnabled(true);
        txtObservaciones.setEnabled(true);
        btnAceptarMascota.setEnabled(true);
        btnCancelarNuevaMascota.setEnabled(true);
    }

    private boolean validarAceptarMascota() {
        
        boolean valido = true;
        
        if ( txtNombreMascota.getText().isEmpty() ) {
            
            labelErrorMascota.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtRaza.getText().isEmpty() || txtRaza.getText().isBlank() ) {
            
            labelErrorRaza.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtEspecie.getText().isEmpty() || txtRaza.getText().isBlank() ) {
            
            labelErrorEspecie.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtColor.getText().isEmpty() ) {
            
            labelErrorColor.setText("• Campo Requerido");
            valido = false;
        }
        
        if (  !(cmbAlergico.getSelectedIndex() > 0)  ) {
            
            labelErrorAlergico.setText("• Campo Requerido");
            valido = false;
        }
        
        if (  !(cmbAtencion.getSelectedIndex() > 0)  ) {
            
            labelErrorAtencion.setText("• Campo Requerido");
            valido = false;
        }
        
        return valido;
    }

    private void deshabilitarIngresoMascota() {
        
        /*Como ya ingrese a la mascota, que DESHABILITE todo 
        para que no vuelvan a Ingresar otra Mascota*/
        txtNombreMascota.setEnabled(false);
        txtRaza.setEnabled(false);
        txtEspecie.setEnabled(false);
        txtColor.setEnabled(false);
        cmbAlergico.setSelectedIndex(0);
        cmbAlergico.setEnabled(false);
        cmbAtencion.setSelectedIndex(0);
        cmbAtencion.setEnabled(false);
        txtObservaciones.setEnabled(false);
        btnAceptarMascota.setEnabled(false);
        btnCancelarNuevaMascota.setEnabled(false);
        
        btnGuardarMascotaDuenio.setEnabled(true);
        
        txtNombreMascota.setText("");
        txtRaza.setText("");
        txtEspecie.setText("");
        txtColor.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtencion.setSelectedIndex(0);
        txtObservaciones.setText("");
        
        labelErrorMascota.setText("");
        labelErrorRaza.setText("");
        labelErrorEspecie.setText("");
        labelErrorColor.setText("");
        labelErrorAlergico.setText("");
        labelErrorAtencion.setText("");
    }

    private void actualizarComboListaMascota() {
        
        /*Otra forma:*/
        DefaultComboBoxModel modeloComboMascota = new DefaultComboBoxModel();
        
        List<Mascota> listaMascotas = controlLogica.traerListaMascotas();
        
        modeloComboMascota.addElement("<Seleccione>");
        
        if(listaMascotas.size() > 0){
            for(Mascota mascota: listaMascotas){
                
                modeloComboMascota.addElement(mascota.mostrarMascota());
            }
        }
        /*Combo Mascota de Ingresar Nueva Mascota*/
        cmbIngresarMascota.setModel(modeloComboMascota);
    }

    private void cargarTablaRelacion() {
        
        //Definir el modelo que queremos que tenga la tabla:
        DefaultTableModel modeloTablaRelacion = new DefaultTableModel() {
        
            @Override
            public boolean isCellEditable (int row, int column) {
            
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas:
        String titulos[] = {"Nombre", "Raza", "Especie", "Color", "Alergico", 
            "At. Esp.", "Dueño", "Cel"};
        /*Sin Mostrar el "Id_Cliente" de la Mascota,*/
        modeloTablaRelacion.setColumnIdentifiers(titulos);

        //Carga de los datos desde la BD:
        List<Relacion> listaRelaciones = controlLogica.traerListaRelaciones();
        
        //Pregunto si la lista tiene datos:
        if ( listaRelaciones != null ) { 

            //Si tiene datos, Recorro la lista:
            for( Relacion rela: listaRelaciones ) {
            
                //Traigo cada Registro y ordeno como se va a guardar en el array Objeto
                //y en ese mismo orden es como se va a mostrar en la Tabla:
                Object[] objeto = {

                    rela.getMascota().getNombre(),
                    rela.getMascota().getRaza(),
                    rela.getMascota().getEspecie(),
                    rela.getMascota().getColor(),
                    rela.getMascota().getAlergico(),
                    rela.getMascota().getAtencion(),
                    rela.getDuenio().mostrarNombreCompleto(),
                    rela.getDuenio().getCelular()
                    
                };

                //Le paso el array Objeto ordenado para ponerlo en la Tabla:
                modeloTablaRelacion.addRow(objeto);
            }  
        }
        TablaListaMascotas.setModel(modeloTablaRelacion);
        
        /*Para poder Ordenar la tabla Mascotas, por el nombre de la Mascota
        en Ascendente por Default, pero tambien puede ordenarse en Descendente*/
        
        /*TableRowSorter es un sorteador/ordenador de FILAS de una Tabla.
        
        Con TableRowSorter creo la Instancia de esa Clase 
        (private al comienzo de la Clase), le paso el tipo de
        Modelo de Tabla ---> DefaultTableModel, a la Instancia la llamo sorter,
        y le paso por ultimo el nombre del modelo de tabla ---> modeloTablaRelacion.
        
        A la tabla que tengo en el form ---> TablaListaMascotas, le agrego el sorteador,
        o sea .setRowSorter(sorter);
        
        Dejando solo esto primero, se agrega las flechas de ordenar a CADA COLUMNA
        de la tabla.
        */
        sorter = new TableRowSorter<>(modeloTablaRelacion);
        TablaListaMascotas.setRowSorter(sorter);
        
        /*Pero si quiero que la tabla se ordene en base a UNA SOLA COLUMNA, que
        es el nombre de la Mascota, entonces...
        
        La Clase SortKey: ---> Sort: sortear, Key: claves
        Crea una clave de ordenación para un atributo. Las entradas 
        (los nombres de Mascota) se ordenarán
        según el atributo especificado (son String) y
        en el orden de clasificación especificado (o sea Ascendente).
        
        Creo una Lista que contendra Objetos del tipo de Clase SortKey.
        Esta Lista guardara la clave de sorteo.
        
        La lista se llamara sortKeys, y le agrego un nuevo Objeto SortKey --->
        sortKeys.add(new SortKey(0, SortOrder.ASCENDING));
        
        (0, SortOrder.ASCENDING), esto dice: 0 (es la columna que va a tomar 
        para ordenar, en nuestro caso Nombre Mascota esta en la columna 0), 
        y SortOrder.ASCENDING, le digo que Ordene de forma Ascendente.
        
        Entonces resumiendo, la Lista guardara la clave de sorteo, es decir,
        va a tomar la columna 0(nombre mascota, que son String) y la va a 
        ordenar en forma Ascendente.
        
        Y por ultimo al Objeto TableRowSorter: Sorteador de las Fila de una Tabla,
        o sea sorter, sorter.setSortKeys(sortKeys); le digo que sus claves 
        de ordenacion o como debe ordenarse es asi.
        */
        List<SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
        /*Con esto logro ordenar la tabla por defecto por una sola columna.
        
        El problema que nos causa es que al sortear/ordenar, el orden de Index
        de la tabla no coincide con el index de la Lista que trae cada Objeto 
        Relacion, o sea si en la tabla selecciono a la mascota "Pepe" para editar,
        en el form de editar me trae a la mascota "Pancho", esto es porque ya
        los index no coinciden entre la tabla y la lista.
        
        Para solucionar esto usamos:
        .convertRowIndexToModel() : 
        Este metodo al yo seleccionar un Objeto 
        en la Tabla, toma el Indice de la Fila en el que se encuentra ese Objeto
        seleccionado en la Tabla y lo convierte al Indice del Elemento en el Modelo
        de Tabla. Ejemplo:
        Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila en la Tabla
        es 2, con el .convertRowIndexToModel(), convierto ese 2, en el Indice
        7, ya que "Pepe" en el Modelo de Tabla, ocupa ese Index. 
        Una vez lo seleccione en la Tabla, para Editar, en el Form de Editar AHORA SI
        me traera a la Mascota "Pepe" y no otra.
        
        int id_filaRelacion = 
        TablaListaMascotas.convertRowIndexToModel(TablaListaMascotas.getSelectedRow()); 
        */
      }
    
    public void cargarTablaTurnos() {
    
        //Definir el modelo que queremos que tenga la tabla:
        DefaultTableModel modeloTablaTurno = new DefaultTableModel() {
        
            @Override
            public boolean isCellEditable (int row, int column) {
            
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas:
        String titulos[] = {"Id", "Mascota", "Dueño", "Fecha", "Aten. Medica", 
            "Peluqueria", "Descripciòn"};
        /*Sin Mostrar el "Id_Cliente" de la Mascota,*/
        modeloTablaTurno.setColumnIdentifiers(titulos);
        
        //Carga de los datos desde la BD:
        List<Turno> listaTurnos = controlLogica.traerListaTurnos();
        
        //Pregunto si la lista tiene datos:
        if ( listaTurnos != null ) { 

            //Si tiene datos, Recorro la lista:
            for( Turno turno: listaTurnos ) {
                
                /*Obtengo la fecha de cada Turno, y la paso a una variable Long
                gracias a .getTIime(), y luego con java.sql.Date le doy el 
                formato "yyyy-MM-dd".
                Y le paso al objeto la varible que contiene ese formato*/
                long fechaLong = turno.getFechaTurno().getTime();
                java.sql.Date fechaSql = new java.sql.Date(fechaLong);
            
                //Traigo cada Registro y ordeno como se va a guardar en el array Objeto
                //y en ese mismo orden es como se va a mostrar en la Tabla:
                Object[] objeto = {

                    turno.getIdTurno(),
                    turno.getMascota().mostrarMascota(),
                    turno.getDuenio().mostrarDatos() ,
                    fechaSql,
                    turno.getAtencionMedica(),
                    turno.getPeluqueria(),
                    turno.getDescripcion()
                };
                
                //Le paso el array Objeto ordenado para ponerlo en la Tabla:
                modeloTablaTurno.addRow(objeto);
            }
        }
        TablaListaTurnos.setModel(modeloTablaTurno);
        /*TablaListaTurnos1.setModel(modeloTablaTurno);*/
        
        /*Para poder Ordenar la tabla Turnos, por la Fecha
        en Descendente por Default, pero tambien puede ordenarse en Ascendente*/
        
        /*TableRowSorter es un sorteador/ordenador de FILAS de una Tabla.
        
        Con TableRowSorter creo la Instancia de esa Clase 
        (private al comienzo de la Clase), le paso el tipo de
        Modelo de Tabla ---> DefaultTableModel, a la Instancia la llamo sorter,
        y le paso por ultimo el nombre del modelo de tabla ---> modeloTablaTurno.
        
        A la tabla que tengo en el form ---> TablaListaTurnos, le agrego el sorteador,
        o sea .setRowSorter(sorter);
        
        Dejando solo esto primero, se agrega las flechas de ordenar a CADA COLUMNA
        de la tabla.
        */
        sorterTurno = new TableRowSorter<>(modeloTablaTurno);
        TablaListaTurnos.setRowSorter(sorterTurno);
        /*TablaListaTurnos1.setRowSorter(sorterTurno);*/
        /*Pero si quiero que la tabla se ordene en base a UNA SOLA COLUMNA, que
        es la Fecha, entonces...
        
        La Clase SortKey: ---> Sort: sortear, Key: claves
        Crea una clave de ordenación para un atributo. Las entradas 
        (las Fechas) se ordenarán
        según el atributo especificado (son Date) y
        en el orden de clasificación especificado (o sea Descendente).
        
        Creo una Lista que contendra Objetos del tipo de Clase SortKey.
        Esta Lista guardara la clave de sorteo.
        
        La lista se llamara sortKeys, y le agrego un nuevo Objeto SortKey --->
        sortKeys.add(new SortKey(0, SortOrder.DESCENDING));
        
        (0, SortOrder.DESCENDING), esto dice: 0 (es la columna que va a tomar 
        para ordenar, en nuestro caso la Fecha del Turno esta en la columna 0), 
        y SortOrder.DESCENDING, le digo que Ordene de forma Descendente.
        
        Entonces resumiendo, la Lista guardara la clave de sorteo, es decir,
        va a tomar la columna 0(feha, que son Date) y la va a 
        ordenar en forma Descendente.
        
        Y por ultimo al Objeto TableRowSorter: Sorteador de las Fila de una Tabla,
        o sea sorter, sorter.setSortKeys(sortKeys); le digo que sus claves 
        de ordenacion o como debe ordenarse es asi.
        */
        List<SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new SortKey(3, SortOrder.DESCENDING));
        sorterTurno.setSortKeys(sortKeys);
        /*Con esto logro ordenar la tabla por defecto por una sola columna.
        
        El problema que nos causa es que al sortear/ordenar, el orden de Index
        de la tabla no coincide con el index de la Lista que trae cada Objeto 
        Relacion, o sea si en la tabla selecciono a la mascota "Pepe" para editar,
        en el form de editar me trae a la mascota "Pancho", esto es porque ya
        los index no coinciden entre la tabla y la lista.
        
        Para solucionar esto usamos:
        .convertRowIndexToModel() : 
        Este metodo al yo seleccionar un Objeto 
        en la Tabla, toma el Indice de la Fila en el que se encuentra ese Objeto
        seleccionado en la Tabla y lo convierte al Indice del Elemento en el Modelo
        de Tabla. Ejemplo:
        Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila en la Tabla
        es 2, con el .convertRowIndexToModel(), convierto ese 2, en el Indice
        7, ya que "Pepe" en el Modelo de Tabla, ocupa ese Index. 
        Una vez lo seleccione en la Tabla, para Editar, en el Form de Editar AHORA SI
        me traera a la Mascota "Pepe" y no otra.
        
        int id_filaRelacion = 
        TablaListaMascotas.convertRowIndexToModel(TablaListaMascotas.getSelectedRow()); 
        */
    }



    public void mostrarPestanaListaMascotas() {
        
        presionarTurnosVioleta();
        
        /*Recargo la Lista de Mascotas*/
        cargarTablaRelacion();
        
        recargarTodosCombos();
        
        /*Cargo la Tabla de la Pestaña de Turnos, la Tabla de Lista de Turnos*/
        cargarTablaTurnos();
    }

    private void recargarTodosCombos() {
    
        /*Recargo todos los combos*/
        /*Recargo los Combos de la Pestaña de Nuevo*/
        actualizarComboListaDuenio();
        actualizarComboListaMascota();
    }
    
    

    private boolean validarTxtBuscarMascota() {
        
        boolean valido = true;
        
        if ( txtFiltrarMascota.getText().isEmpty() ||
            txtFiltrarMascota.getText().isBlank() ) {
            
            labelErrorBuscarMasco.setText("• Campo Requerido");
            txtFiltrarMascota.setText("");
            valido = false;
        }
        
        return valido;
    }

    DefaultTableModel modeloTablaDetalleVentaTurno;
    private void cargarTablaDetalleVentaTurno(FacturaDeTurno facturaUltima) {
        
        //Definir el modelo que queremos que tenga la tabla:
        /*DefaultTableModel*/ modeloTablaDetalleVentaTurno = new DefaultTableModel() {
        
            @Override
            public boolean isCellEditable (int row, int column) {
            
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas:
        String titulos[] = {"Nro. Detalle", "Nro. Factura","Turno", "Mascota", "Fecha",
            "Aten. Medica", "Peluqueria", "Precio" };
        /*Sin Mostrar el "Id_Cliente" de la Mascota,*/
        modeloTablaDetalleVentaTurno.setColumnIdentifiers(titulos);
        
        /*Carga de los datos desde la BD, traigo solo los Detalle de Venta cuyo
        IdFactura sea el que le paso: */
        List<DetalleVentaTurno> listaDetalleVentaTurnos2 = 
                controlLogica.traerListaDetalleVentaTurnos2(facturaUltima);
        
        //Pregunto si la lista tiene datos:
        /* Y tambien Pregunto si esta Habilitado el Boton Pagar, de estarlo, entonces que me 
        permita mostrar los Detalles de Venta, de lo contrario, si esta
        deshabilitado, que no me muestre nada en la Tabla*/
        if ( (listaDetalleVentaTurnos2 != null) && btnPagarTurno.isEnabled() ) { 

            //Si tiene datos, Recorro la lista:
            for( DetalleVentaTurno detalleVentaTurno: listaDetalleVentaTurnos2 ) {
                
                /*Obtengo la fecha de cada Turno, y la paso a una variable Long
                gracias a .getTIime(), y luego con java.sql.Date le doy el 
                formato "yyyy-MM-dd".
                Y le paso al objeto la varible que contiene ese formato*/
                long fechaLong = detalleVentaTurno.getTurno().getFechaTurno().getTime();
                java.sql.Date fechaSqlTurno = new java.sql.Date(fechaLong);
            
                //Traigo cada Registro y ordeno como se va a guardar en el array Objeto
                //y en ese mismo orden es como se va a mostrar en la Tabla:
                Object[] objeto = {

                    detalleVentaTurno.getIdDetalleVentaTurno(),
                    detalleVentaTurno.getFacturaDeTurno().getIdFacturaTurno(),
                    detalleVentaTurno.getTurno().getIdTurno(),
                    detalleVentaTurno.getTurno().getMascota().mostrarMascota(),
                    fechaSqlTurno,
                    detalleVentaTurno.getTurno().getAtencionMedica(),
                    detalleVentaTurno.getTurno().getPeluqueria(),
                    detalleVentaTurno.getPrecio()
                };
                
                //Le paso el array Objeto ordenado para ponerlo en la Tabla:
                modeloTablaDetalleVentaTurno.addRow(objeto);  
            }
        }
        TablaDetalleVentaTurnos.setModel(modeloTablaDetalleVentaTurno);

        calcularTotalAPagar();
    }
    

    private void crearDetalleVentaTurno(Double precioTurno, Turno turno,
            FacturaDeTurno facturaUltima) {
        
        /*Cree el primer DetalleVentaTurno*/
        controlLogica.crearDetalleVentaTurno(precioTurno, turno, facturaUltima);
        
        /*Una vez creado Recargo la Tabla de DetalleVentaTurno*/
        cargarTablaDetalleVentaTurno(facturaUltima);
    }

    private boolean validarDatosFactura() {
        
        boolean valido = true;
        
        if ( txtPrecioTurno.getText().isBlank() || 
            txtPrecioTurno.getText().isEmpty() ) {
            
            labelErrorPrecioTurno.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( cmbDuenioPagarTurno.isEnabled() && 
             !(cmbDuenioPagarTurno.getSelectedIndex() > 0) ) {
            
            labelErrorDuenioPagar.setText("• Campo Requerido");
            valido = false;  
        }
        
        return valido; 
    }

    public void mostrarPestanaProductos() {
        
        
        /*Recargo la Lista de Productos*/
        cargarTablaProductos();
        
        /*Que el boton Tienda aparesca Seleccionado y Muestre la Pestaña Tienda*/
        presionarTiendaVioleta();
    }

    public void cargarTablaProductos() {
        
        //Definir el modelo que queremos que tenga la tabla:
        DefaultTableModel modeloTablaProductos = new DefaultTableModel() {
        
            @Override
            public boolean isCellEditable (int row, int column) {
            
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas:
        String titulos[] = {"Producto", "Especie", "Precio", "Stock", 
            "Descripciòn"};
        /*Sin Mostrar el "Id_Cliente" de la Mascota,*/
        modeloTablaProductos.setColumnIdentifiers(titulos);
        
        //Carga de los datos desde la BD:
        List<Producto> listaProductos = controlLogica.traerListaProductos();
        
        //Pregunto si la lista tiene datos:
        if ( listaProductos != null ) { 

            //Si tiene datos, Recorro la lista:
            for( Producto producto: listaProductos ) {
            
                //Traigo cada Registro y ordeno como se va a guardar en el array Objeto
                //y en ese mismo orden es como se va a mostrar en la Tabla:
                Object[] objeto = {

                    /*producto.getIdProducto(),*/
                    producto.getNombre(),
                    producto.getEspecie(),
                    producto.getPrecio(),
                    producto.getStock(),
                    producto.getDescripcion()
                };
                
                //Le paso el array Objeto ordenado para ponerlo en la Tabla:
                modeloTablaProductos.addRow(objeto);
            }
        }
        TablaListaProductos.setModel(modeloTablaProductos);
        
        /*Para poder Ordenar la tabla Productos, por la Fecha
        en Descendente por Default, pero tambien puede ordenarse en Ascendente*/
        
        /*TableRowSorter es un sorteador/ordenador de FILAS de una Tabla.
        
        Con TableRowSorter creo la Instancia de esa Clase 
        (private al comienzo de la Clase), le paso el tipo de
        Modelo de Tabla ---> DefaultTableModel, a la Instancia la llamo sorter,
        y le paso por ultimo el nombre del modelo de tabla ---> modeloTablaTurno.
        
        A la tabla que tengo en el form ---> TablaListaProductos, le agrego el sorteador,
        o sea .setRowSorter(sorter);
        
        Dejando solo esto primero, se agrega las flechas de ordenar a CADA COLUMNA
        de la tabla.
        */
        sorterProducto = new TableRowSorter<>(modeloTablaProductos);
        TablaListaProductos.setRowSorter(sorterProducto);

        /*Pero si quiero que la tabla se ordene en base a UNA SOLA COLUMNA, que
        es la Fecha, entonces...
        
        La Clase SortKey: ---> Sort: sortear, Key: claves
        Crea una clave de ordenación para un atributo. Las entradas 
        (las Fechas) se ordenarán
        según el atributo especificado (son Date) y
        en el orden de clasificación especificado (o sea Descendente).
        
        Creo una Lista que contendra Objetos del tipo de Clase SortKey.
        Esta Lista guardara la clave de sorteo.
        
        La lista se llamara sortKeys, y le agrego un nuevo Objeto SortKey --->
        sortKeys.add(new SortKey(0, SortOrder.DESCENDING));
        
        (0, SortOrder.DESCENDING), esto dice: 0 (es la columna que va a tomar 
        para ordenar, en nuestro caso la Fecha del Turno esta en la columna 0), 
        y SortOrder.DESCENDING, le digo que Ordene de forma Descendente.
        
        Entonces resumiendo, la Lista guardara la clave de sorteo, es decir,
        va a tomar la columna 0(feha, que son Date) y la va a 
        ordenar en forma Descendente.
        
        Y por ultimo al Objeto TableRowSorter: Sorteador de las Fila de una Tabla,
        o sea sorter, sorter.setSortKeys(sortKeys); le digo que sus claves 
        de ordenacion o como debe ordenarse es asi.
        */
        List<SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new SortKey(0, SortOrder.ASCENDING));
        sorterProducto.setSortKeys(sortKeys);
        /*Con esto logro ordenar la tabla por defecto por una sola columna.
        
        El problema que nos causa es que al sortear/ordenar, el orden de Index
        de la tabla no coincide con el index de la Lista que trae cada Objeto 
        Relacion, o sea si en la tabla selecciono a la mascota "Pepe" para editar,
        en el form de editar me trae a la mascota "Pancho", esto es porque ya
        los index no coinciden entre la tabla y la lista.
        
        Para solucionar esto usamos:
        .convertRowIndexToModel() : 
        Este metodo al yo seleccionar un Objeto 
        en la Tabla, toma el Indice de la Fila en el que se encuentra ese Objeto
        seleccionado en la Tabla y lo convierte al Indice del Elemento en el Modelo
        de Tabla. Ejemplo:
        Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila en la Tabla
        es 2, con el .convertRowIndexToModel(), convierto ese 2, en el Indice
        7, ya que "Pepe" en el Modelo de Tabla, ocupa ese Index. 
        Una vez lo seleccione en la Tabla, para Editar, en el Form de Editar AHORA SI
        me traera a la Mascota "Pepe" y no otra.
        
        int id_filaRelacion = 
        TablaListaMascotas.convertRowIndexToModel(TablaListaMascotas.getSelectedRow()); 
        */
    }

    private boolean validarTxtBuscarProducto() {
        
        boolean valido = true;
        
        if ( txtBuscarProducto.getText().isEmpty() ||
            txtBuscarProducto.getText().isBlank() ) {
            
            labelErrorBuscarProducto.setText("• Campo Requerido");
            txtBuscarProducto.setText("");
            valido = false;
        }
        
        return valido;
    }

    private boolean validarCantidadProductos() {
       
        boolean valido = true;
        
        /*--------------Controlo el Stock del Producto seleccionado en la Tabla*/
        double canti = Double.parseDouble(spinnerCantidad.getValue().toString());

        if ( canti > stockActual ) {
            
            labelErrorCantidadComprar.setText
            (strToHtml("• La cantidad debe ser menor o igual al Stock actual"));
            valido = false;
        }

        if ( spinnerCantidad.getValue().toString().equals("0")) {
            
            labelErrorCantidadComprar.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( cmbDuenioCompra.isEnabled() && 
             !(cmbDuenioCompra.getSelectedIndex() > 0) ) {
            
            labelErrorDuenioCompra.setText("• Campo Requerido");
            valido = false;  
        }
        
        return valido;
    }

    private boolean validarDuenioCompra() {
        
        boolean valido = true;
        double nroCalcular = 0;
        
        if ( txtCalcular.getText().contains(",") ) {
            
            nroCalcular = Double.parseDouble(
                txtCalcular.getText().replaceAll(",", "\\."));
        }
        
        /*Si el combo esta habilitado y no se selecciono un Duenio*/
        if ( cmbDuenioPagarTurno.isEnabled() && 
             !(cmbDuenioCompra.getSelectedIndex() > 0) ) {
            
            labelErrorDuenioCompra.setText("• Campo Requerido");
            valido = false;
        }
        return valido;
    }

    DefaultTableModel modeloTablaDetalleVentaProducto;
    private void cargarTablaDetalleVentaProducto(Factura facturaUltimaProducto) {

        //Definir el modelo que queremos que tenga la tabla:
        /*DefaultTableModel*/ modeloTablaDetalleVentaProducto = new DefaultTableModel() {
        
            @Override
            public boolean isCellEditable (int row, int column) {
            
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas:
        String titulos[] = {"Nro. Detalle", "Nro. Factura","Producto", "Precio Uni.", 
            "Cantidad", "Descuento", "Iva", "SubTotal", "Total" };
        /*Sin Mostrar el "Id_Cliente" de la Mascota,*/
        modeloTablaDetalleVentaProducto.setColumnIdentifiers(titulos);
        
        /*Carga de los datos desde la BD, traigo solo los Detalle de Venta cuyo
        IdFactura sea el que le paso: */
        List<DetalleVenta> listaDetalleVentaProducto = 
                controlLogica.traerListaDetalleVentaProducto2(facturaUltimaProducto);
        
        //Pregunto si la lista tiene datos:
        /* Y tambien Pregunto si esta Habilitado el Boton Pagar, de estarlo, entonces que me 
        permita mostrar los Detalles de Venta, de lo contrario, si esta
        deshabilitado, que no me muestre nada en la Tabla*/
        if ( (listaDetalleVentaProducto != null) && btnPagarCompra.isEnabled() ) { 

            //Si tiene datos, Recorro la lista:
            for( DetalleVenta detalleVenta: listaDetalleVentaProducto ) {
                
            
                //Traigo cada Registro y ordeno como se va a guardar en el array Objeto
                //y en ese mismo orden es como se va a mostrar en la Tabla:
                Object[] objeto = {

                    detalleVenta.getIdDetalleVenta(),
                    detalleVenta.getFactura().getIdFactura(),
                    detalleVenta.getProducto().getNombre(),
                    detalleVenta.getProducto().getPrecio(),
                    detalleVenta.getCantidad(),
                    detalleVenta.getDescuento(),
                    detalleVenta.getIva(),
                    detalleVenta.getSubTotal(),
                    detalleVenta.getTotal()
                };
                
                //Le paso el array Objeto ordenado para ponerlo en la Tabla:
                modeloTablaDetalleVentaProducto.addRow(objeto);  
            }
        } 
        TablaCompra.setModel(modeloTablaDetalleVentaProducto);
        calcularSubTotalProductos();

    }

    double descuentoCompra = 0;
    double ivaCompra = 0;
    public void calcularTotalAPagarCompra() {

        //===================================================================
        /*TOTAL de todos los Productos a comprar aplicando o no Descuento y/o
        IVA por la Compra*/
        descuentoCompra = Double.parseDouble(spinnerDescuentoCompra.getValue().toString());

        ivaCompra = Double.parseDouble(spinnerIvaCompra.getValue().toString());
        
        /*subTotal = controlLogica.calcularTotalProductos(facturaUltimaProducto);*/
        
        String total = controlLogica.calcularTotalCompra(subTotal, 
                descuentoCompra, ivaCompra);
                
        txtTotalPagar.setText(String.valueOf(total));
    }

    
    
    private boolean validarCompra() {
        
        boolean valido = true;

        double nroSubtotal = Double.parseDouble(txtSubTotal.getText());
        double nroTotal = 0;
        
        if ( txtSubTotal.getText().isEmpty() 
             || txtSubTotal.getText().isBlank() 
             || nroSubtotal < 1) {

            labelErrorSubtotal.setText(
            strToHtml("SubTotal debe ser Mayor a 0, elija Productos") );
            valido = false;   
        }
        
        if ( txtTotalPagar.getText().contains(",") ) {
            
            nroTotal = Double.parseDouble(
                txtTotalPagar.getText().replaceAll(",", "\\."));
        }
        
        if ( txtTotalPagar.getText().isEmpty()
             || txtTotalPagar.getText().isBlank() 
             || nroTotal < 1 ) {
            
            mostrarMensaje("Presione antes 'Calcular' para sacar el Total a Pagar,"
                    + " y este debe ser mayor a 0", 
                "Error", "Pagar Total");
            valido = false;
 
        }
        return valido;
    }

    double subTotal = 0;
    private void calcularSubTotalProductos() {
        
        subTotal = controlLogica.calcularTotalProductos(facturaUltimaProducto);
        
        txtSubTotal.setText(String.valueOf(subTotal));

    }

    boolean cambiarDuenio = false;
    Duenio dueFactura;
    public void mostrarPestanaDetalleVentaProductos(Factura factura, 
            boolean duenioCambiado, Duenio duenioFactura) {

        facturaUltimaProducto = factura;
        cambiarDuenio = duenioCambiado;
        dueFactura = duenioFactura;
        
        btnPagarCompra.setEnabled(true);
        btnEliminarDetalleProducto.setEnabled(true);
        btnEditarDetalleProducto.setEnabled(true);

        
        /*Recargo la Lista de Detalle de Venta Productos*/
        /*Una vez creado Recargo la Tabla de DetalleVentaTurno*/
        cargarTablaDetalleVentaProducto(facturaUltimaProducto);
        

        txtTotalPagar.setText("");
        
        /*Que el boton Tienda aparesca Seleccionado y Muestre la Pestaña Tienda*/
        presionarTiendaVioleta();
    }

    public void mostrarIngresoMascota() {
        
        TabedPestanas.setSelectedIndex(0);
        
        btnPagarTurnos.setContentAreaFilled(false);
        btnPagarTurnos.setBackground(Color.white);
        btnPagarTurnos.setForeground(Color.BLACK);

        btnTienda.setContentAreaFilled(false);
        btnTienda.setBackground(Color.white);
        btnTienda.setForeground(Color.BLACK);

        btnTurnos.setContentAreaFilled(false);
        btnTurnos.setBackground(Color.white);
        btnTurnos.setForeground(Color.BLACK);

        btnSalir.setContentAreaFilled(false);
        btnSalir.setBackground(Color.white);
        btnSalir.setForeground(Color.BLACK);

        btnNuevo.setContentAreaFilled(true);
        btnNuevo.setBackground(new Color(133, 38, 233 ));
        btnNuevo.setForeground(Color.white);
    }

    public void mostrarPestanaPagarTurnos() {
       
        TabedPestanas.setSelectedIndex(3);
        
        btnPagarTurnos.setContentAreaFilled(true);
        btnPagarTurnos.setBackground(new Color(133, 38, 233 ));
        btnPagarTurnos.setForeground(Color.white);

        btnTurnos.setContentAreaFilled(false);
        btnTurnos.setBackground(Color.white);
        btnTurnos.setForeground(Color.BLACK);

        btnTienda.setContentAreaFilled(false);
        btnTienda.setBackground(Color.white);
        btnTienda.setForeground(Color.BLACK);

        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setBackground(Color.white);
        btnNuevo.setForeground(Color.BLACK);

        btnSalir.setContentAreaFilled(false);
        btnSalir.setBackground(Color.white);
        btnSalir.setForeground(Color.BLACK);
        
        /*Cargo la Lista de Turnos de la Pestaña PagarTurnos*/
        cargarTablaTurnos();
    }

    List<DetalleVenta> listaEsNull;
    private void activarComboDuenio() {
        
        listaEsNull = 
            controlLogica.traerListaDetalleVentaProducto2(facturaUltimaProducto);

        if ( listaEsNull == null || listaEsNull.isEmpty() ) {
            
            /*Le mando el "false" para que en caso de que antes de eliminar se
            haya hecho una Edicion y luego si decidio borrar, que me cargue el combo.
            
            Con el 'false' se activa el if, y me carga el combo. Luego vuelvo aca,
            y le digo que lo Habilite y muestre el index 0*/
            cambiarDuenio = false;
            
            /*Y aca lo habilito*/
            cmbDuenioCompra.setEnabled(true);
            cmbDuenioCompra.setSelectedIndex(0);
        }
    }

    List<DetalleVentaTurno> listaEsVacia;
    private void activarComboDuenioTurno() {
        
        listaEsVacia = controlLogica.traerListaDetalleVentaTurnos2(facturaUltima);
        
        if ( listaEsVacia.isEmpty() ) {
            

            cmbDuenioPagarTurno.setEnabled(true);
            cmbDuenioPagarTurno.setSelectedIndex(0);
        }
    }

    private void cargarTablaTurnosAPagar() {
        
        //Definir el modelo que queremos que tenga la tabla:
        DefaultTableModel modeloTablaTurnoAPagar = new DefaultTableModel() {
        
            @Override
            public boolean isCellEditable (int row, int column) {
            
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas:
        String titulos[] = {"Id", "Mascota", "Dueño", "Fecha", "Aten. Medica", 
            "Peluqueria", "Descripciòn"};
        /*Sin Mostrar el "Id_Cliente" de la Mascota,*/
        modeloTablaTurnoAPagar.setColumnIdentifiers(titulos);
        
        List<Turno> listaTurnosAPagar = controlLogica.buscarTurnosAPagar();
        
        //Pregunto si la lista tiene datos:
        if ( listaTurnosAPagar != null ) { 

            //Si tiene datos, Recorro la lista:
            for( Turno tur: listaTurnosAPagar ) {
                
                /*Obtengo la fecha de cada Turno, y la paso a una variable Long
                gracias a .getTIime(), y luego con java.sql.Date le doy el 
                formato "yyyy-MM-dd".
                Y le paso al objeto la varible que contiene ese formato*/
                long fechaLong = tur.getFechaTurno().getTime();
                java.sql.Date fechaSql = new java.sql.Date(fechaLong);
            
                //Traigo cada Registro y ordeno como se va a guardar en el array Objeto
                //y en ese mismo orden es como se va a mostrar en la Tabla:
                Object[] objeto = {

                    tur.getIdTurno(),
                    tur.getMascota().mostrarMascota(),
                    tur.getDuenio().mostrarDatos() ,
                    fechaSql,
                    tur.getAtencionMedica(),
                    tur.getPeluqueria(),
                    tur.getDescripcion()
                };
                
                //Le paso el array Objeto ordenado para ponerlo en la Tabla:
                modeloTablaTurnoAPagar.addRow(objeto);
            }
        }
        TablaListaTurnosAPagar.setModel(modeloTablaTurnoAPagar);

        
        /*Para poder Ordenar la tabla Turnos, por la Fecha
        en Descendente por Default, pero tambien puede ordenarse en Ascendente*/
        
        /*TableRowSorter es un sorteador/ordenador de FILAS de una Tabla.
        
        Con TableRowSorter creo la Instancia de esa Clase 
        (private al comienzo de la Clase), le paso el tipo de
        Modelo de Tabla ---> DefaultTableModel, a la Instancia la llamo sorter,
        y le paso por ultimo el nombre del modelo de tabla ---> modeloTablaTurno.
        
        A la tabla que tengo en el form ---> TablaListaTurnos, le agrego el sorteador,
        o sea .setRowSorter(sorter);
        
        Dejando solo esto primero, se agrega las flechas de ordenar a CADA COLUMNA
        de la tabla.
        */
        /*sorterTurnoAPagar = new TableRowSorter<>(modeloTablaTurnoAPagar);
        TablaListaTurnosAPagar.setRowSorter(sorterTurnoAPagar);

        /*Pero si quiero que la tabla se ordene en base a UNA SOLA COLUMNA, que
        es la Fecha, entonces...
        
        La Clase SortKey: ---> Sort: sortear, Key: claves
        Crea una clave de ordenación para un atributo. Las entradas 
        (las Fechas) se ordenarán
        según el atributo especificado (son Date) y
        en el orden de clasificación especificado (o sea Descendente).
        
        Creo una Lista que contendra Objetos del tipo de Clase SortKey.
        Esta Lista guardara la clave de sorteo.
        
        La lista se llamara sortKeys, y le agrego un nuevo Objeto SortKey --->
        sortKeys.add(new SortKey(0, SortOrder.DESCENDING));
        
        (0, SortOrder.DESCENDING), esto dice: 0 (es la columna que va a tomar 
        para ordenar, en nuestro caso la Fecha del Turno esta en la columna 0), 
        y SortOrder.DESCENDING, le digo que Ordene de forma Descendente.
        
        Entonces resumiendo, la Lista guardara la clave de sorteo, es decir,
        va a tomar la columna 0(feha, que son Date) y la va a 
        ordenar en forma Descendente.
        
        Y por ultimo al Objeto TableRowSorter: Sorteador de las Fila de una Tabla,
        o sea sorter, sorter.setSortKeys(sortKeys); le digo que sus claves 
        de ordenacion o como debe ordenarse es asi.
        */
        /*List<SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new SortKey(3, SortOrder.DESCENDING));
        sorterTurnoAPagar.setSortKeys(sortKeys);
        /*Con esto logro ordenar la tabla por defecto por una sola columna.
        
        El problema que nos causa es que al sortear/ordenar, el orden de Index
        de la tabla no coincide con el index de la Lista que trae cada Objeto 
        Relacion, o sea si en la tabla selecciono a la mascota "Pepe" para editar,
        en el form de editar me trae a la mascota "Pancho", esto es porque ya
        los index no coinciden entre la tabla y la lista.
        
        Para solucionar esto usamos:
        .convertRowIndexToModel() : 
        Este metodo al yo seleccionar un Objeto 
        en la Tabla, toma el Indice de la Fila en el que se encuentra ese Objeto
        seleccionado en la Tabla y lo convierte al Indice del Elemento en el Modelo
        de Tabla. Ejemplo:
        Si en la Tabla seleccione la Mascota "Pepe" y su Indice de Fila en la Tabla
        es 2, con el .convertRowIndexToModel(), convierto ese 2, en el Indice
        7, ya que "Pepe" en el Modelo de Tabla, ocupa ese Index. 
        Una vez lo seleccione en la Tabla, para Editar, en el Form de Editar AHORA SI
        me traera a la Mascota "Pepe" y no otra.
        
        int id_filaRelacion = 
        TablaListaMascotas.convertRowIndexToModel(TablaListaMascotas.getSelectedRow()); 
        */
    }


}
