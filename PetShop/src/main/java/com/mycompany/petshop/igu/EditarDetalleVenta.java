package com.mycompany.petshop.igu;

import com.mycompany.petshop.logica.ControladoraLogica;
import com.mycompany.petshop.logica.DetalleVenta;
import com.mycompany.petshop.logica.Duenio;
import com.mycompany.petshop.logica.Factura;
import com.mycompany.petshop.logica.Producto;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;


public class EditarDetalleVenta extends javax.swing.JFrame {

    ControladoraLogica controlLogica = new ControladoraLogica();

    public EditarDetalleVenta() {
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
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbDuenioCompraDeta = new javax.swing.JComboBox<>();
        labelErrorDuenioCompra = new javax.swing.JLabel();
        spinnerCantidad = new javax.swing.JSpinner();
        spinnerDescuentoProducto = new javax.swing.JSpinner();
        spinnerIvaProducto = new javax.swing.JSpinner();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        labelErrorCantidadComprar = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFechaFactura = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        txtCalcular = new javax.swing.JTextField();
        btnAceptarProducto = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbProductoSeleccionado = new javax.swing.JComboBox<>();
        labelErrorProducto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setText("IVA x Producto:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel23.setText("Descuento x Producto:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel22.setText("Cantidad:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel21.setText("Producto Seleccionado:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel15.setText("Buscar Dueño:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.add(cmbDuenioCompraDeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 160, -1));

        labelErrorDuenioCompra.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(labelErrorDuenioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 110, 20));
        jPanel1.add(spinnerCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 110, -1));
        jPanel1.add(spinnerDescuentoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 110, -1));
        jPanel1.add(spinnerIvaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, -1));

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel36.setText("%");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel35.setText("%");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        labelErrorCantidadComprar.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(labelErrorCantidadComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 230, 30));

        jLabel16.setText("Fecha Factura:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        txtFechaFactura.setDisabledTextColor(new java.awt.Color(153, 0, 153));
        txtFechaFactura.setEnabled(false);
        jPanel1.add(txtFechaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 130, -1));

        btnCalcular.setText("Calcular :");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 120, 30));

        txtCalcular.setDisabledTextColor(new java.awt.Color(153, 0, 153));
        txtCalcular.setEnabled(false);
        jPanel1.add(txtCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 120, -1));

        btnAceptarProducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAceptarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkNegroNuevo24.png"))); // NOI18N
        btnAceptarProducto.setText("Aceptar");
        btnAceptarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptarProducto.setEnabled(false);
        btnAceptarProducto.setFocusPainted(false);
        btnAceptarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/checkVioletaNuevo24-CORREJIDO.png"))); // NOI18N
        btnAceptarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 120, 30));

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 120, 30));

        jPanel1.add(cmbProductoSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 160, -1));

        labelErrorProducto.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(labelErrorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 110, 20));

        PanelContenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 790, 190));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Editar Detalle de Venta");
        PanelContenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public String strToHtml (String texto) {
    
        return "<html><p>" + texto + "</p></html>";
    }
    
    public void limpiarMensajesError(){
    
        labelErrorDuenioCompra.setText("");
        labelErrorProducto.setText("");
        labelErrorCantidadComprar.setText("");
    }
    
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        limpiarMensajesError();
        
        if ( validarCantidadProductos() ) {

            /*Cuantos Productos va a comprar*/
            double cantidad = Double.parseDouble(spinnerCantidad.getValue().toString());

            /*Si tiene descuento POR Producto*/
            double descuentoProducto = Double.parseDouble(spinnerDescuentoProducto.getValue().toString());

            /*Si tiene IVA POR Producto*/
            double ivaProducto = Double.parseDouble(spinnerIvaProducto.getValue().toString());
            
            
            /*-------------------------------------------------------*/
            /*Obtengo el nombre completo del Producto seleccionado en el Combo*/
            /*String productoStr = cmbProductoSeleccionado.getSelectedItem().toString();
            int productoInt = cmbProductoSeleccionado.getSelectedIndex();

            /*Le paso los datos del producto seleccionado en el combo y me trae
            el id del Producto seleccionado*/
            /*Producto producto = controlLogica.buscarProducto(productoStr, productoInt);

            /*Le paso el Producto seleccionado en la Tabla, para poder acceder al
            Precio del Producto, y todo lo demas para que calcule bien el Subtotal
            POR Producto*/
            String subtotal = controlLogica.calcularSubtotal(producto, cantidad,
                descuentoProducto, ivaProducto);

            /*Muestro el resultado POR Producto*/
            txtCalcular.setText(String.valueOf(subtotal));

            btnAceptarProducto.setEnabled(true);
            btnCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    Producto producto;
    private boolean validarCantidadProductos() {
       
        boolean valido = true;
        double stock = 0;
        double cantidad = 0;
        
        /*-------------------------Controlar Duenio---------------------------*/
        if ( !(cmbDuenioCompraDeta.getSelectedIndex() > 0) ) {
            
            labelErrorDuenioCompra.setText("• Campo Requerido");
            valido = false;  
        }
        
        /*-------------------------Controlar Producto---------------------------*/
        if ( !(cmbProductoSeleccionado.getSelectedIndex() > 0) ) {
            
            labelErrorProducto.setText("• Campo Requerido");
            valido = false; 
            
        } else {
        
            /*Traigo el Producto seleccionado en el Combo*/
            String productoStr = cmbProductoSeleccionado.getSelectedItem().toString();
            int productoInt = cmbProductoSeleccionado.getSelectedIndex();

            /*Busco y Obtengo el Producto*/
            producto = controlLogica.buscarProducto(productoStr, productoInt);
        
            /*Obtengo el Stock del Producto Actual del Combo*/
            stock = controlLogica.productoTieneStock(producto);
        }
        
        /*-------------------------Controlar Stock del Producto---------------------------*/
       
        
        if ( spinnerCantidad.getValue().toString().equals("0") ) {
            
            labelErrorCantidadComprar.setText("• Campo Requerido");
            valido = false;
            
        } else {
        
            cantidad = Double.parseDouble(spinnerCantidad.getValue().toString());
        }
        
        
        if ( stock == 0 ) {
            
            labelErrorCantidadComprar.setText
            (strToHtml("• No hay stock del Producto"));
            valido = false;
            
        } else if ( cantidad > stock ) {
            
            labelErrorCantidadComprar.setText
            (strToHtml("• La cantidad debe ser menor o igual al Stock actual"));
            valido = false;
        }  
        
        return valido;
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        volverPestanaDetalleVentaProductos();

    }//GEN-LAST:event_btnCancelarActionPerformed

    boolean duenioCambiado = false;
    Duenio duenioFactura;
    private void btnAceptarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarProductoActionPerformed

        if ( validarDuenioCompra() ) {

            double subtotalProducto = 0, cantidad = 0, iva = 0, descuento = 0;

            /*No mando el precio a Factura, lo mando a DetalleVenta*/

            if ( txtCalcular.getText().contains(",") ) {

                subtotalProducto = Double.parseDouble(txtCalcular.getText().replaceAll(",", "\\."));
            }

            cantidad = Double.parseDouble(spinnerCantidad.getValue().toString());

            descuento = Double.parseDouble(spinnerDescuentoProducto.getValue().toString());

            iva = Double.parseDouble(spinnerIvaProducto.getValue().toString());

            String fechaFacturaProducto = txtFechaFactura.getText();

            /*Obtengo el nombre completo del Duenio seleccionado en el Combo*/
            String duenioStr = cmbDuenioCompraDeta.getSelectedItem().toString();
            int duenioInt = cmbDuenioCompraDeta.getSelectedIndex();

            /*Le paso los datos del duenio seleccionado en el combo y me trae
            el id del Duenio seleccionado*/
            Duenio duenio = controlLogica.buscarDuenio(duenioStr, duenioInt);
                
            /*-------------------------------------------------------*/
            /*Obtengo el nombre completo del Duenio seleccionado en el Combo*/
            /*String productoStr = cmbProductoSeleccionado.getSelectedItem().toString();
            int productoInt = cmbProductoSeleccionado.getSelectedIndex();

            Producto producto = controlLogica.buscarProductoCombo(productoStr, productoInt);*/
            
            /*Edito el duenio en la Factura*/
            controlLogica.editarDuenioEnFactura(factura, duenio);
            duenioCambiado = true;
            duenioFactura = duenio;

            /*Cree el primer DetalleVenta POR Producto*/
            controlLogica.editarDetalleVentaProducto(detalleVenta, subtotalProducto, cantidad,
                descuento, iva, producto);

            limpiar();
            
            //Una vez guardada en la BD el Producto, muestro el Mensaje:
            mostrarMensaje("Detalle de Venta del Producto editado correctamente!",
                "Info", "Editar de Detalle de Venta del Producto");
            
            
            //Llamo al form de Registros para que se vuelva a abrir y cargar
           //con los registros desde la BD
           Principal princi = new Principal();
           princi.setVisible(true);
           princi.setLocationRelativeTo(null);
        
           /*Una vez abra el Form Principal, me mande al metodo, que me mostrara
           la pestaña de Lista de Mascotas*/
           princi.mostrarPestanaDetalleVentaProductos(factura, duenioCambiado, duenioFactura);

           //Cierro el form
           this.dispose();
 
        }
    }//GEN-LAST:event_btnAceptarProductoActionPerformed

    private boolean validarDuenioCompra() {
        
        boolean valido = true;
        
        /*if ( txtCalcular.getText().isBlank() 
             || txtCalcular.getText().isEmpty() ) {
             
            labelErrortxtCalcular.setText("• Campo Requerido");
            valido = false;
        }*/
        
        /*Si no se selecciono un Duenio*/
        if ( !(cmbDuenioCompraDeta.getSelectedIndex() > 0) ) {
            
            labelErrorDuenioCompra.setText("• Campo Requerido");
            valido = false;
        }
        
        /*Si no se selecciono un Producto*/
        if ( !(cmbProductoSeleccionado.getSelectedIndex() > 0) ) {
            
            labelErrorProducto.setText("• Campo Requerido");
            valido = false;
        }
        return valido;
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
    
    private void volverPestanaDetalleVentaProductos() {
        
        //Llamo al form de Registros para que se vuelva a abrir y cargar
        //con los registros desde la BD
        Principal princi = new Principal();
        princi.setVisible(true);
        princi.setLocationRelativeTo(null);
        
        /*Una vez abra el Form Principal, me mande al metodo, que me mostrara
        la pestaña de Lista de Mascotas*/
        duenioFactura = duenioSinEditar;
        
        /*A pesar de que no se Cambio el Duenio en la Factura, le mando true,
        para que me conserve el Duenio que ya se habia seleccionado al Crear
        la factura*/
        duenioCambiado = true;
        princi.mostrarPestanaDetalleVentaProductos(factura, duenioCambiado, duenioFactura);

        //Cierro el form
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JButton btnAceptarProducto;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbDuenioCompraDeta;
    private javax.swing.JComboBox<String> cmbProductoSeleccionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelErrorCantidadComprar;
    private javax.swing.JLabel labelErrorDuenioCompra;
    private javax.swing.JLabel labelErrorProducto;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JSpinner spinnerDescuentoProducto;
    private javax.swing.JSpinner spinnerIvaProducto;
    private javax.swing.JTextField txtCalcular;
    private javax.swing.JTextField txtFechaFactura;
    // End of variables declaration//GEN-END:variables

    Factura factura;
    DetalleVenta detalleVenta;
    Duenio duenioSinEditar;
    public void cargarDatos(DetalleVenta deta) {
        
        cargarComboDuenioModi();
        cargarComboProductoModi();
        
        detalleVenta = deta;
        int idDetalleVentaProducto = deta.getIdDetalleVenta();

        factura = deta.getFactura();
        
        cmbDuenioCompraDeta.setSelectedItem(deta.getFactura().getDuenio().mostrarNombreCompleto());
        duenioSinEditar = deta.getFactura().getDuenio();
        
        cmbProductoSeleccionado.setSelectedItem(deta.getProducto().getNombre());
        spinnerCantidad.setValue(deta.getCantidad());
        spinnerDescuentoProducto.setValue(deta.getDescuento());
        spinnerIvaProducto.setValue(deta.getIva());
        txtFechaFactura.setText(deta.getFactura().getFechaFactura());
    }
    
    private void cargarComboDuenioModi() {
    
        /*Otra forma:*/
        DefaultComboBoxModel modeloComboDuenioFactura = new DefaultComboBoxModel();
        
        List<Duenio> listaDuenios = controlLogica.traerListaDuenios();
        
        modeloComboDuenioFactura.addElement("<Seleccione>");
        
        if(listaDuenios.size() > 0){
            for(Duenio duenio: listaDuenios){
                
                modeloComboDuenioFactura.addElement(duenio.mostrarNombreCompleto());
            }
        }
        
        cmbDuenioCompraDeta.setModel(modeloComboDuenioFactura);
    }
    
    private void cargarComboProductoModi() {
    
        /*Otra forma:*/
        DefaultComboBoxModel modeloComboProducto = new DefaultComboBoxModel();
        
        List<Producto> listaProductos = controlLogica.traerListaProductos();
        
        modeloComboProducto.addElement("<Seleccione>");
        
        if(listaProductos.size() > 0){
            for(Producto pro: listaProductos){
                
                modeloComboProducto.addElement(pro.getNombre());
            }
        }
        
        cmbProductoSeleccionado.setModel(modeloComboProducto);
    }

    private void limpiar() {
       
        spinnerCantidad.setValue(0);
        spinnerDescuentoProducto.setValue(0);
        spinnerIvaProducto.setValue(0);
        txtCalcular.setText("");
        
        cmbProductoSeleccionado.setSelectedIndex(0);
        cmbDuenioCompraDeta.setSelectedIndex(0);

        labelErrorDuenioCompra.setText("");
        labelErrorCantidadComprar.setText("");
    }
}
