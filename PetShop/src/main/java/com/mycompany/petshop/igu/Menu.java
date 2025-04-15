package com.mycompany.petshop.igu;

import com.mycompany.petshop.logica.ControladoraLogica;
import com.mycompany.petshop.logica.DetalleVenta;
import com.mycompany.petshop.logica.DetalleVentaTurno;
import com.mycompany.petshop.logica.Factura;
import com.mycompany.petshop.logica.FacturaDeTurno;
import java.awt.Color;
import java.util.List;


public class Menu extends javax.swing.JFrame {

    ControladoraLogica controlLogica = new ControladoraLogica();
    
    public Menu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor = new javax.swing.JPanel();
        PanelMenu = new javax.swing.JPanel();
        PanelBotonNuevo = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        PanelBotonTurnos = new javax.swing.JPanel();
        btnTurnos = new javax.swing.JButton();
        PanelBotonSalir = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        PanelBotonTienda = new javax.swing.JPanel();
        btnTienda = new javax.swing.JButton();
        PanelPagarTurnos = new javax.swing.JPanel();
        btnPagarTurnos = new javax.swing.JButton();
        btnInformacionProgramador = new javax.swing.JButton();
        btnImagenMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelContenedor.setPreferredSize(new java.awt.Dimension(230, 630));
        PanelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        PanelBotonNuevoLayout.setVerticalGroup(
            PanelBotonNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        PanelMenu.add(PanelBotonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 230, 60));

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
            .addComponent(btnTurnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelBotonTurnosLayout.setVerticalGroup(
            PanelBotonTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTurnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        PanelMenu.add(PanelBotonTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 60));

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

        btnInformacionProgramador.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnInformacionProgramador.setForeground(new java.awt.Color(0, 0, 0));
        btnInformacionProgramador.setText("©2025. Luna, Maria Ines");
        btnInformacionProgramador.setBorder(null);
        btnInformacionProgramador.setContentAreaFilled(false);
        btnInformacionProgramador.setFocusPainted(false);
        btnInformacionProgramador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInformacionProgramadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInformacionProgramadorMouseEntered(evt);
            }
        });
        PanelMenu.add(btnInformacionProgramador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 230, 20));

        btnImagenMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PeluqueriaMiFielAmigo200x200.png"))); // NOI18N
        btnImagenMenu.setBorder(null);
        btnImagenMenu.setContentAreaFilled(false);
        btnImagenMenu.setFocusPainted(false);
        btnImagenMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelMenu.add(btnImagenMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 240));

        PanelContenedor.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked

        this.dispose();
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseEntered

        btnNuevo.setContentAreaFilled(true);
        btnNuevo.setBackground(new Color(133, 38, 233 ));
        btnNuevo.setForeground(Color.white);
        
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
        
        btnInformacionProgramador.setContentAreaFilled(false);
        btnInformacionProgramador.setBackground(Color.white);
        btnInformacionProgramador.setForeground(Color.BLACK);
        
        /*Cuando el mouse pase por Encima del BOTON, el panel de detras cambie de color*/
        /*PanelBotonNuevo.setBackground(Color.LIGHT_GRAY);
        PanelBotonSalir.setBackground(Color.white);
        PanelBotonTienda.setBackground(Color.white);
        PanelBotonTurnos.setBackground(Color.white);
        PanelPagarTurnos.setBackground(Color.white);*/
    }//GEN-LAST:event_btnNuevoMouseEntered

    private void btnTurnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTurnosMouseClicked

        this.dispose();
    }//GEN-LAST:event_btnTurnosMouseClicked

    private void btnTurnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTurnosMouseEntered

        btnTurnos.setContentAreaFilled(true);
        btnTurnos.setBackground(new Color(133, 38, 233 ));
        btnTurnos.setForeground(Color.white);
        
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
        
        btnInformacionProgramador.setContentAreaFilled(false);
        btnInformacionProgramador.setBackground(Color.white);
        btnInformacionProgramador.setForeground(Color.BLACK);
        
        /*Cuando el mouse pase por Encima del BOTON, el panel de detras cambie de color*/
        /*PanelBotonTurnos.setBackground(Color.LIGHT_GRAY);
        PanelBotonSalir.setBackground(Color.white);
        PanelBotonTienda.setBackground(Color.white);
        PanelBotonNuevo.setBackground(Color.white);
        PanelPagarTurnos.setBackground(Color.white);*/
    }//GEN-LAST:event_btnTurnosMouseEntered

    private void btnTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnosActionPerformed

        /*Llamo al Form Principal*/
        Principal princi = new Principal();
        princi.setVisible(true);
        princi.setLocationRelativeTo(null);
        princi.mostrarPestanaListaMascotas();
        this.dispose();
    }//GEN-LAST:event_btnTurnosActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked

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

    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered

        btnSalir.setContentAreaFilled(true);
        btnSalir.setBackground(new Color(133, 38, 233 ));
        btnSalir.setForeground(Color.white);
        
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
        
        
        btnInformacionProgramador.setContentAreaFilled(false);
        btnInformacionProgramador.setBackground(Color.white);
        btnInformacionProgramador.setForeground(Color.BLACK);
        
        /*Cuando el mouse pase por Encima del BOTON, el panel de detras cambie de color*/
        /*PanelBotonSalir.setBackground(Color.LIGHT_GRAY);
        PanelBotonTienda.setBackground(Color.white);
        PanelBotonTurnos.setBackground(Color.white);
        PanelBotonNuevo.setBackground(Color.white);
        PanelPagarTurnos.setBackground(Color.white);*/
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
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

    private void btnTiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiendaMouseClicked

        this.dispose();
    }//GEN-LAST:event_btnTiendaMouseClicked

    private void btnTiendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiendaMouseEntered

        btnTienda.setContentAreaFilled(true);
        btnTienda.setBackground(new Color(133, 38, 233 ));
        btnTienda.setForeground(Color.white);

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
        
        btnInformacionProgramador.setContentAreaFilled(false);
        btnInformacionProgramador.setBackground(Color.white);
        btnInformacionProgramador.setForeground(Color.BLACK);
        
        /*Cuando el mouse pase por Encima del BOTON, el panel de detras cambie de color*/
        /*PanelBotonTienda.setBackground(Color.LIGHT_GRAY);
        PanelBotonSalir.setBackground(Color.white);
        PanelBotonTurnos.setBackground(Color.white);
        PanelBotonNuevo.setBackground(Color.white);
        PanelPagarTurnos.setBackground(Color.white);*/
    }//GEN-LAST:event_btnTiendaMouseEntered

    private void btnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiendaActionPerformed

        /*Que muestre la Pestaña Productos de la Tienda*/
        /*TabedPestanas.setSelectedIndex(2);*/

        /*Llamo al Form Principal*/
        Principal princi = new Principal();
        princi.setVisible(true);
        princi.setLocationRelativeTo(null);
        princi.mostrarPestanaProductos();
        this.dispose();
        
        
        /*Cargo la Tabla de la Pestaña de Turnos, la Tabla de Lista de Turnos*/
        /*cargarTablaTurnos();*/
    }//GEN-LAST:event_btnTiendaActionPerformed

    private void btnPagarTurnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarTurnosMouseClicked

        this.dispose();
    }//GEN-LAST:event_btnPagarTurnosMouseClicked

    private void btnPagarTurnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarTurnosMouseEntered

        /*Cuando el mouse pase por Encima del BOTON, el panel de detras cambie de color*/
        /*Color.LIGHT_GRAY*/
        /*PanelPagarTurnos.setBackground(Color.LIGHT_GRAY);
        PanelBotonTienda.setBackground(Color.white);
        PanelBotonSalir.setBackground(Color.white);
        PanelBotonTurnos.setBackground(Color.white);
        PanelBotonNuevo.setBackground(Color.white);*/
        
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
        
        btnInformacionProgramador.setContentAreaFilled(false);
        btnInformacionProgramador.setBackground(Color.white);
        btnInformacionProgramador.setForeground(Color.BLACK);

    }//GEN-LAST:event_btnPagarTurnosMouseEntered

    private void btnPagarTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarTurnosActionPerformed

        /*Llamo al Form Principal*/
        Principal princi = new Principal();
        princi.setVisible(true);
        princi.setLocationRelativeTo(null);
        princi.mostrarPestanaPagarTurnos();
        this.dispose();

    }//GEN-LAST:event_btnPagarTurnosActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        /*Llamo al Form Principal*/
        Principal princi = new Principal();
        princi.setVisible(true);
        princi.setLocationRelativeTo(null);
        princi.mostrarIngresoMascota();
        this.dispose();
    }//GEN-LAST:event_btnNuevoActionPerformed

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

    private void btnInformacionProgramadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionProgramadorMouseClicked

    }//GEN-LAST:event_btnInformacionProgramadorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotonNuevo;
    private javax.swing.JPanel PanelBotonSalir;
    private javax.swing.JPanel PanelBotonTienda;
    private javax.swing.JPanel PanelBotonTurnos;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelPagarTurnos;
    private javax.swing.JButton btnImagenMenu;
    private javax.swing.JButton btnInformacionProgramador;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPagarTurnos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTienda;
    private javax.swing.JButton btnTurnos;
    // End of variables declaration//GEN-END:variables
}
