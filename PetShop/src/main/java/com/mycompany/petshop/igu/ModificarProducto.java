package com.mycompany.petshop.igu;

import com.mycompany.petshop.logica.ControladoraLogica;
import com.mycompany.petshop.logica.Producto;
import java.awt.event.KeyEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;


public class ModificarProducto extends javax.swing.JFrame {

    ControladoraLogica controlLogica = new ControladoraLogica();
    
    public ModificarProducto() {
        initComponents();
        
        //Instancio la clase del Modelo de Spinner
        SpinnerNumberModel spinner = new SpinnerNumberModel();
        
        //Valor maximo que se le puede Ingresar al Spinner
        spinner.setMaximum(1000);
        
        //Valor minimo que se le puede Ingresar al Spinner
        spinner.setMinimum(0);
        
        //Le aplico las Caracterìsticas ANTERIORES Mencionadas
        //al Modelo del Spinner que tengo en el Form
        spinnerStock.setModel(spinner);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtEspecieProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        spinnerStock = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        labelErrorProducto = new javax.swing.JLabel();
        labelErrorEspecie = new javax.swing.JLabel();
        labelErrorPrecio = new javax.swing.JLabel();
        labelErrorStock = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Editar Producto");
        PanelContenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Producto:");
        PanelContenedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Producto para que Especie:");
        PanelContenedor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");
        PanelContenedor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Stock:");
        PanelContenedor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 50, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Descripcion:");
        PanelContenedor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyTyped(evt);
            }
        });
        PanelContenedor.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, -1));

        txtEspecieProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEspecieProductoKeyTyped(evt);
            }
        });
        PanelContenedor.add(txtEspecieProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 110, -1));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        PanelContenedor.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 110, -1));
        PanelContenedor.add(spinnerStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 110, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        PanelContenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 230, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Limpiarnegro24.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Limpiarvioleta24-CORREJIDO.png"))); // NOI18N
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelContenedor.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 70, 50));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Guardarnegro24.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Guardarvioleta24-CORREJIDO.png"))); // NOI18N
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        PanelContenedor.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 70, 50));

        labelErrorProducto.setForeground(new java.awt.Color(255, 0, 0));
        PanelContenedor.add(labelErrorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 110, 20));

        labelErrorEspecie.setForeground(new java.awt.Color(255, 0, 0));
        PanelContenedor.add(labelErrorEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 110, 20));

        labelErrorPrecio.setForeground(new java.awt.Color(255, 0, 0));
        PanelContenedor.add(labelErrorPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 110, 20));

        labelErrorStock.setForeground(new java.awt.Color(255, 0, 0));
        PanelContenedor.add(labelErrorStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 110, 20));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volverNegro64.png"))); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.setBorder(null);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setFocusPainted(false);
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/volverVioletaSinFondo64.png"))); // NOI18N
        btnAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        PanelContenedor.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 70, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if ( validarProducto() ) {

            String nombre = txtNombreProducto.getText();
            String especie = txtEspecieProducto.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            double stock = Double.parseDouble(spinnerStock.getValue().toString());
            String descripcion = txtDescripcion.getText();

            /*Creo el Producto en la BD*/
            controlLogica.modificarProducto(proBandera, nombre, especie, precio, 
                    stock, descripcion);

            //Una vez guardado en BD limpio todo el Formulario
            limpiar();

            //Una vez guardada en la BD el Producto, muestro el Mensaje:
            mostrarMensaje("Producto editado correctamente!",
                "Info", "Editar de Producto");

            /*Vuelvo a la Pestana de Lista de Productos y la lista de Actualiza*/
            volverPestanaProductos();
            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
    
        JOptionPane optionPane = new JOptionPane(mensaje);
        
        if ( tipo.equalsIgnoreCase("Info") ) {
            
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            
        } else if ( tipo.equalsIgnoreCase("Error") ) {
            
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    private boolean validarProducto() {
        
        boolean valido = true;
        
        if ( txtNombreProducto.getText().isEmpty() ||
            txtNombreProducto.getText().isBlank() ) {
            
            labelErrorProducto.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtEspecieProducto.getText().isEmpty() ||
            txtEspecieProducto.getText().isBlank() ) {
            
            labelErrorEspecie.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( txtPrecio.getText().isEmpty() ||
            txtPrecio.getText().isBlank() ) {
            
            labelErrorPrecio.setText("• Campo Requerido");
            valido = false;
        }
        
        if ( spinnerStock.getValue().toString().equalsIgnoreCase("0") ) {
            
            labelErrorStock.setText("• Campo Requerido");
            valido = false;
        }
        
        return valido;
    }
    
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        volverPestanaProductos();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyTyped
        //Para controlar que solo se ingresen Letras en el txt
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)  ) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreProductoKeyTyped

    private void txtEspecieProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEspecieProductoKeyTyped
        //Para controlar que solo se ingresen Letras en el txt
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)  ) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txtEspecieProductoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        //Para que controlar que solo se ingrese nros.
        int tecla = evt.getKeyChar();
        boolean numero = tecla >= 48 && tecla <= 57;
        
        if (!numero) {
            
            evt.consume();
        }
        
        //Solo permite ingresar hasta 14 nros.
        if (txtPrecio.getText().trim().length() == 14) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void volverPestanaProductos() {
        
        //Llamo al form de Registros para que se vuelva a abrir y cargar
        //con los registros desde la BD
        Principal princi = new Principal();
        princi.setVisible(true);
        princi.setLocationRelativeTo(null);
        
        /*Una vez abra el Form Principal, me mande al metodo, que me mostrara
        la pestaña de Lista de Mascotas*/
        princi.mostrarPestanaProductos();

        //Cierro el form
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelErrorEspecie;
    private javax.swing.JLabel labelErrorPrecio;
    private javax.swing.JLabel labelErrorProducto;
    private javax.swing.JLabel labelErrorStock;
    private javax.swing.JSpinner spinnerStock;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtEspecieProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        
        txtNombreProducto.setText("");
        txtEspecieProducto.setText("");
        txtPrecio.setText("");
        spinnerStock.setValue(0);
        txtDescripcion.setText("");
        
        labelErrorProducto.setText("");
        labelErrorEspecie.setText("");
        labelErrorPrecio.setText("");
        labelErrorStock.setText("");
    }

    Producto proBandera;
    public void enviarProducto(Producto produ) {

        proBandera = produ;
        
        /*Traigo todos los datos del Producto elejido en la Tabla Productos*/
        txtNombreProducto.setText(produ.getNombre());
        txtEspecieProducto.setText(produ.getEspecie());
        txtPrecio.setText(String.valueOf(produ.getPrecio()));
        spinnerStock.setValue(produ.getStock());
        txtDescripcion.setText(produ.getDescripcion());
    }
}
