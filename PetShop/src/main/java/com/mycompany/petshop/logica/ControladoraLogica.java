package com.mycompany.petshop.logica;

import com.mycompany.petshop.persistencia.ControladoraPersistencia;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JComboBox;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    /*Lista de Duenios*/
    public List<Duenio> traerListaDuenios() {
        
        return controlPersis.traerListaDuenios();
    }

    /*Biiieenn revisado, es correcto*/
    public List<Mascota> traerListaMascotas() {
        
        return controlPersis.traerListaMascotas();
    }

    /*Biiieenn revisado, es correcto*/
    public List<Relacion> traerListaRelaciones() {
        
        return controlPersis.traerListaRelaciones();
    }

    /*Biiieenn revisado, es correcto*/
    public List<Turno> traerListaTurnos() {
        
        return controlPersis.traerListaTurnos();
    }


    public List<Producto> traerListaProductos() {
        
        return controlPersis.traerListaProductos();
    }

    /*Biieenn revisa, esta correcto*/
    public List<Turno> buscarTurnosAPagar() {

        /*Traigo la Lista Completa de Turnos*/
        List<Turno> listaTurnosCompleta = this.traerListaTurnos();
        
        /*Traigo la Lista Completa de DetalleVentaTurno*/
        List<DetalleVentaTurno> listaDetalleVentaTurno = this.traerListaDetalleVentaTurnos();
        
        /*Lista Vacia que se llenara con cada Turno No Pago*/
        List<Turno> listaTurnoSinPagar = new ArrayList();
        
        
        /*Recorro cada DetalleVentaTurno*/
        for (int iDeta = 0; iDeta < listaDetalleVentaTurno.size(); iDeta++) {
            
            /*Recorro cada Turno*/
            for (int iTurno = 0; iTurno < listaTurnosCompleta.size(); iTurno++) {
                
                /*Si el idTurno EXISTE en DetalleVentaTurno, quiere decir que 
                YA se Pago el Turno ese, por ende, quiero lo Elimine de la Lista
                De Turnos Completa.*/
                if ( listaDetalleVentaTurno.get(iDeta).getTurno().getIdTurno() ==
                     listaTurnosCompleta.get(iTurno).getIdTurno() ) {
                    
                    
                    /*Una vez encontrado, lo borro de la listaTurnoCompleta, de
                    esta forma en la lista solo me quedaran los Turnos que NO
                    estan Pagos todavia*/
                    listaTurnosCompleta.remove(iTurno);
                }
            }
        }
        listaTurnoSinPagar = listaTurnosCompleta;
        
        return listaTurnoSinPagar;
    }

    /*Biiiieeennn revisado, es correcto*/
    public void guardarMascota(String nombre, String raza, String especie, 
            String color, String alergico, String atencion, String observacion) {
        
        /*Creo la Mascota*/
        Mascota masco = new Mascota();
        masco.setNombre(nombre);
        /*masco.setRaza(raza);
        masco.setEspecie(especie);*/
        masco.setEspecie(especie);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion(atencion);
        masco.setObservacion(observacion);
        
        controlPersis.guardarMascota(masco);
    }

    /*Biieeennn revisado, es correcto*/
    public void guardarDuenio(String nombre, String apellido, String celular) {

        /*Creo un Duenio*/
        Duenio duenio = new Duenio();
        
        /*Paso valores al Duenio*/
        duenio.setNombre(nombre);
        duenio.setApellido(apellido);
        duenio.setCelular(celular);
        
        
        /*Guardo el Duenio*/
        controlPersis.guardarDuenio(duenio);
        
    }


    /*Biieenn revisado, esta correcto*/
    public Duenio buscarDuenio(String duenioStr, int duenioInt) {
        
        Duenio duenio = null;
        
        /*Creo una lista de Duenios VACIA*/
        List<Duenio> listaDuenios = new ArrayList();
        listaDuenios.add(0, duenio);
        
        /*Traigo la Lista de Duenios completa*/
        List<Duenio> listaDuenioCompleta = this.traerListaDuenios();
        
        /*SI o SI USAR ASI*/
        for ( Duenio du:  listaDuenioCompleta) {
            
            listaDuenios.add(du);
        }

        
        /*Variable tendra el idDuenio que busco*/
        int idDuenio = 0;
        
        /*Recorro la Lista para encontrar al Duenio seleccionado en el combo*/
        for (int i = 0; i < listaDuenios.size(); i++) {
            
            if ( i == duenioInt && 
                listaDuenios.get(i).mostrarNombreCompleto().
                equalsIgnoreCase(duenioStr)) {
                
                
                /*Obtengo la Duenio*/
                idDuenio = listaDuenios.get(i).getIdDuenio();
                break;
            } 
        }
        return this.traerDuenio(idDuenio);
    }


    /*Biieenn revisado, esta correcto*/
    public Duenio traerDuenio(int duenioInt) {

        return controlPersis.traerDuenio(duenioInt);
    }


    /*Biieenn revisado, esta correcto*/
    public Mascota buscarMascota(int mascoInt, String mascotaStr) {
        
        Mascota masco = null;
        
        /*Creo una lista de Mascotas VACIA*/
        List<Mascota> listaMascotas = new ArrayList();
        listaMascotas.add(0, masco);
        
        /*Traigo la Lista de Mascotas completa*/
        List<Mascota> listaMascotaCompleta = this.traerListaMascotas();
        
        /*SI o SI USAR ASI*/
        for ( Mascota mas: listaMascotaCompleta) {
            
            listaMascotas.add(mas);
        }

        /*Variable tendra el idMascota que busco*/
        int idMascota = 0;
        
        /*Recorro la Lista para encontrar a la Mascota seleccionada en el combo*/
        for (int i = 0; i < listaMascotas.size(); i++) {
            
            if ( i == mascoInt && 
                listaMascotas.get(i).mostrarMascota().
                equalsIgnoreCase(mascotaStr)) {
                
                
                /*Obtengo a la Mascota*/
                idMascota = listaMascotas.get(i).getIdMascota();
                break;
            } 
        }
        return this.traerMascota(idMascota);
    }


    /*Biieenn revisado, esta correcto*/
    private Mascota traerMascota(int idMascota) {
        
        return controlPersis.traerMascota(idMascota);
    }

    public void guardarRelacionn(Duenio duenio, Mascota masco) {
        
        Relacion rela = new Relacion();
        rela.setDuenio(duenio);
        rela.setMascota(masco);
        
        controlPersis.guardarRelacionn(rela);
    }

    /*Bieiieennn revisado, es correto*/
    public Relacion buscarRelacion(int id_filaTabla) {
        
        /*Traigo una Lista de Relaciones*/
        List<Relacion> listaRelaciones = this.traerListaRelaciones();
        int idRelacion = 0;
        
        /*Recorro la lista de Relaciones*/
        for (int i = 0; i < listaRelaciones.size(); i++) {
            
            /*Busco el Objeto Relacion seleccionado en la Tabla*/
            if ( i == id_filaTabla ) {
                
                /*Obtengo el Objeto Relacion seleccionado en la Tabla*/
                Relacion rela = listaRelaciones.get(i);

                /*Del Objeto Relacion Obtenido, Busco su idRelacion*/
                idRelacion = rela.getIdRelacion();
                
                /*Del Objeto Relacion Obtenido, Busco su idRelacion*/
                idRelacion = rela.getIdRelacion();
                
                break;
            }
        }
        return this.traerUnaRelacion(idRelacion);
    }

    /*Biiieenn revisado, es correcto*/
    public Relacion traerUnaRelacion(int id) {
        
        return controlPersis.traerUnaRelacion(id);
    }

    public void modificarMascotaEnRelacion(Relacion rela, Mascota masco) {
        
        /*Le paso la Mascota elejida del combo*/
        rela.setMascota(masco);
        controlPersis.modificarMascotaEnRelacion(rela);
    }

    public void modificarDuenioEnRelacion(Relacion rela, Duenio due) {
        
        /*Le paso el Duenio elejido del combo*/
        rela.setDuenio(due);
        controlPersis.modificarDuenioEnRelacion(rela);
    }


    /*Biieeenn revisado, funciona correctamente*/
    public void modiDuenio(Duenio duenio, String nombre, String apellido, String celular) {
        
        duenio.setNombre(nombre);
        duenio.setApellido(apellido);
        duenio.setCelular(celular);
        
        controlPersis.modiDuenio(duenio);
    }


    /*Biieeenn revisado, funciona correctamente*/
    public void modiMascota(Mascota ma, String nombre, String raza, 
            String especie, String color, String alergico, String atencion, 
            String observacion) {
        
        ma.setNombre(nombre);
        ma.setRaza(raza);
        ma.setEspecie(especie);
        ma.setColor(color);
        ma.setAlergico(alergico);
        ma.setAtencion(atencion);
        ma.setObservacion(observacion);
        
        controlPersis.modiMascota(ma);
    }


    /*Biieenn revisado, es correcto*/
    public void borrarRelacion(Relacion rela) {
        
        controlPersis.borrarRelacion(rela.getIdRelacion());
    }


    public void guardarTurno(Mascota mascota, Duenio duenio, Date fechaSql, 
            String atencion, String peluqueria, String descripcion) {
        
        Turno turno = new Turno();
        turno.setFechaTurno(fechaSql);
        turno.setDuenio(duenio);
        turno.setMascota(mascota);
        turno.setAtencionMedica(atencion);
        turno.setPeluqueria(peluqueria);
        turno.setDescripcion(descripcion);
        
        controlPersis.guardarTurno(turno);
    }

    /*Biieenn revisado, esta correcto*/
    public Turno buscarTurnoSeleccionadoTabla(int idTurno) {
        
        /*Traigo la Lista de Turnos Sin Pagar*/
        List<Turno> listaTurnosSinPagar = this.buscarTurnosAPagar();
        Turno turno = null;
        
        /*Recorro la lista de Turnos*/
        for (Turno tur: listaTurnosSinPagar) {
            
            /*Busco el Objeto Turno seleccionado en la Tabla.
            Veo que coincidan los Id*/
            if ( tur.getIdTurno() == idTurno ) {
                
                /*Obtengo el Objeto Turno seleccionado en la Tabla*/
                turno = tur;
                break;
            }
        }
        return turno;  
    }


    /*Biieenn revisado, esta correcto*/
    public Turno traerTurno(int idTurnoAPagar) {
        
        return controlPersis.traerTurno(idTurnoAPagar);
    }


    /*Biieenn revisado, esta correcto*/
    public void crearFacturaTurno(Duenio due,
            String fechaPagoTurno) {
        
        FacturaDeTurno facturaTurno = new FacturaDeTurno();
        facturaTurno.setFechaPagoTurno(fechaPagoTurno);
        facturaTurno.setDuenio(due);
        
        controlPersis.crearFacturaDeTurno(facturaTurno);
    }

    private List<FacturaDeTurno> traerListaFacturaTurno() {
        
        return controlPersis.traerListaFacturaTurnos();
    }


    /*Bien revisado, esta correcto*/
    public FacturaDeTurno buscarUltimaFacturaTurno() {

        FacturaDeTurno fa = null;
        List<FacturaDeTurno> listaFacturasDeTurnos = this.traerListaFacturaTurno();
        
        if ( listaFacturasDeTurnos != null ) {
            
            fa = listaFacturasDeTurnos.get(listaFacturasDeTurnos.size() - 1);
            
        }
        return this.traerUltimaFacturaTurno(fa.getIdFacturaTurno());
    }


    /*Bien revisado, esta correcto*/
    private FacturaDeTurno traerUltimaFacturaTurno(int idFacturaTurno) {
        
        return controlPersis.traerUltimaFacturaTurno(idFacturaTurno);
    }


    public void crearDetalleVentaTurno(Double precioTurno, Turno turno, 
            FacturaDeTurno facturaUltima) {
        
        
        /*Turno tur = this.traerTurno(comodin);*/
        
        DetalleVentaTurno detalleVentaTurno = new DetalleVentaTurno();
        
        detalleVentaTurno.setPrecio(precioTurno);
        detalleVentaTurno.setTurno(turno);
        detalleVentaTurno.setFacturaDeTurno(facturaUltima);
        
        controlPersis.crearDetalleVentaTurno(detalleVentaTurno);
    }


    public List<DetalleVentaTurno> traerListaDetalleVentaTurnos() {
        
        return controlPersis.traerListaDetalleVentaTurnos();
    }

    public List<DetalleVentaTurno> traerListaDetalleVentaTurnos2(FacturaDeTurno facturaUltima) {
        
        /*Traigo la Lista Completa de DetalleVentaTurno*/
        List<DetalleVentaTurno> listaDetalleCompleta = this.traerListaDetalleVentaTurnos();
        
        /*Esta lista tendra los DetalleVentaTurno cuyo IdFactura sea la que le pido*/
        List<DetalleVentaTurno> listaDetalleFactura= new ArrayList();
        
        for ( DetalleVentaTurno deta: listaDetalleCompleta ) {
        
            if ( deta.getFacturaDeTurno().getIdFacturaTurno() ==
                 facturaUltima.getIdFacturaTurno() ) {
                
                listaDetalleFactura.add(deta);
            }
        }
        return listaDetalleFactura;
    }


    /*Bieeeennn revisado, esta correcto*/
    public void borrarDetalleVentaTurnoEnLista(int idDetalleTurno) {
        
        controlPersis.borrarDetalleVentaTurnoEnLista(idDetalleTurno);
    }


    public void crearProducto(String nombre, String especie, double precio, 
            double stock, String descripcion) {
        
        Producto pro = new Producto();
        pro.setNombre(nombre);
        pro.setEspecie(especie);
        pro.setPrecio(precio);
        pro.setStock(stock);
        pro.setDescripcion(descripcion);
        
        controlPersis.crearProducto(pro);
    }


    public Producto buscarProducto(int id_filaTabla) {
        
        /*Traigo una Lista de Productos*/
        List<Producto> listaProductos = this.traerListaProductos();
        Producto pro;
        int idProducto = 0;
        
        /*Recorro la lista de Productos*/
        for (int i = 0; i < listaProductos.size(); i++) {
            
            /*Busco el Objeto Producto seleccionado en la Tabla*/
            if ( i == id_filaTabla ) {
                
                /*Obtengo el Objeto Producto seleccionado en la Tabla*/
                pro = listaProductos.get(i);

                /*Del Objeto Relacion Obtenido, Busco su idProduto*/
                idProducto = pro.getIdProducto();
                
                break;
            }
        }
        
        /*return idProducto;*/
        return this.traerProducto(idProducto);
    }

    /*Biieenn revisado, esta correcto*/
    public Producto buscarProducto(String productoStr, int productoInt) {
       
        Producto producto = null;
        
        /*Creo una lista de Productos VACIA*/
        List<Producto> listaProductos = new ArrayList();
        listaProductos.add(0, producto);
        
        /*Traigo la Lista de Productos completa*/
        List<Producto> listaProductoCompleta = this.traerListaProductos();
        
        /*Recorro la listaProductoCompleta y la agrego a la listaProductos VACIA
        que solo tiene agregado el index 0 con un valor null*/
        for (Producto pro: listaProductoCompleta) {
            
            listaProductos.add(pro);
        }
        
        /*Variable tendra el idProducto que busco*/
        int idProducto = 0;
        
        /*Recorro la Lista para encontrar al Producto seleccionado en el combo*/
        for (int i = 0; i < listaProductos.size(); i++) {
            
            if ( i == productoInt && 
                listaProductos.get(i).getNombre().
                equalsIgnoreCase(productoStr)) {
                
                
                /*Obtengo la Producto*/
                idProducto = listaProductos.get(i).getIdProducto();
                break;
            } 
        }
        return this.traerProducto(idProducto);
    }


    /*Biienn revisado, esta correcto*/
    public Producto traerProducto(int id_Producto) {
        
        return controlPersis.traerProducto(id_Producto);
    }


    public void modificarProducto(Producto proBandera, String nombre, 
            String especie, double precio, double stock, String descripcion) {
        
        proBandera.setNombre(nombre);
        proBandera.setEspecie(especie);
        proBandera.setPrecio(precio);
        proBandera.setStock(stock);
        proBandera.setDescripcion(descripcion);
        
        controlPersis.modificarProducto(proBandera);
    }


    /*Biieenn revisado, esta correcto*/
    public void borrarProducto(int id_Producto) {
       
        controlPersis.borrarProducto(id_Producto);
    }


    public double productoTieneStock(Producto produ) {
        
        return produ.getStock();
    }



    /*Bien revisado, esta correcto*/
    public String calcularSubtotal(Producto producto, double cantidad, 
            double descuentoProducto, double ivaProducto) {
        
        /*Obtengo el Precio del Producto seleccionado*/
        double precio = producto.getPrecio();

            
        /* -----------  Calculo el Descuento por Producto  ------------- */
        double resultadoDescuento = (precio * descuentoProducto) / 100;


        /* -----------  Calculo el IVA por Producto  ------------- */
        double resultadoIva = (precio * ivaProducto) / 100;

        
        /* -----------  Calculo el SubTotal por Producto  ------------- */
        
        double resultado = ((precio - resultadoDescuento) + resultadoIva) * cantidad;
        
       
        DecimalFormat df = new DecimalFormat("#.00");
        
        /*Para que luego de la coma, solo muestre 2 digitos.*/
        String subtotalStr = df.format(resultado);

        return subtotalStr;
    }

    public void crearFacturaProducto(Duenio due, String fechaFacturaProducto) {
       
        Factura factura = new Factura();
        
        factura.setDuenio(due);
        factura.setFechaFactura(fechaFacturaProducto);
        
        /*Prueba*/
        List<DetalleVenta> listaDetalleEnFactura = new ArrayList();
        factura.setListaDetalleVenta(listaDetalleEnFactura);
        
        controlPersis.crearFacturaProducto(factura);
    }

    public List<Factura> traerListaFacturas() {
        
        return controlPersis.traerListaFacturas();
    }

    /*Bien revisado, esta correcto*/
    public Factura buscarUltimaFacturaProducto() {
        
        Factura facturaProducto = null;
        List<Factura> listaFacturasProductos = this.traerListaFacturas();
        
        return facturaProducto = listaFacturasProductos.get(listaFacturasProductos.size() - 1);

    }


    /*Bien revisado, esta correcto*/
    private Factura traerUltimaFacturaProducto(int idFactura) {
        
        return controlPersis.traerUltimaFacturaProducto(idFactura);
    }


    public void crearDetalleVentaProducto(double subtotalProducto, 
            double cantidad, double descuento, double iva, 
            Producto producto, Factura facturaUltimaProducto) {
        
        DetalleVenta detaVenta = new DetalleVenta();
        detaVenta.setCantidad(cantidad);
        detaVenta.setDescuento(descuento);
        detaVenta.setIva(iva);
        detaVenta.setSubTotal(subtotalProducto);
        detaVenta.setTotal(subtotalProducto);
        detaVenta.setFactura(facturaUltimaProducto);
        detaVenta.setProducto(producto);
        
        controlPersis.crearDetalleVentaProducto(detaVenta);
        
    }


    /*Biieenn revisado, esta correcto*/
    public List<DetalleVenta> traerListaDetalleVenta() {
        
        return controlPersis.traerListaDetalleVenta();
    }


    /*Biieenn revisado, esta correcto*/
    public List<DetalleVenta> traerListaDetalleVentaProducto2(Factura facturaUltimaProducto) {
        
        /*Traigo la Lista Completa de DetalleVenta*/
        List<DetalleVenta> listaDetalleCompleta = this.traerListaDetalleVenta();
        
        /*Esta lista tendra los DetalleVenta cuyo IdFactura sea la que le pido*/
        List<DetalleVenta> listaDetalleFactura = new ArrayList();
        
        for (int i = 0; i < listaDetalleCompleta.size(); i++) {
            
            if ( facturaUltimaProducto.getIdFactura() ==
                 listaDetalleCompleta.get(i).getIdFactura() ) {
                
                listaDetalleFactura.add(listaDetalleCompleta.get(i));
            }
        }
        return listaDetalleFactura;
    }



    /*Biieenn revisado, esta correcto*/
    public void borrarDetalleVentaProductoEnLista(int idDetalleProducto) {
        
        controlPersis.borrarDetalleVentaProductoEnLista(idDetalleProducto);
    }


    /*Biiieenn revisado, esta correcto*/
    public DetalleVenta buscarDetalleVentaProducto(int idDetalleProducto, Factura facturaUltimaProducto) {
      
        /*Traigo la Lista de Detalle de Venta cuya Ultima Factura Creada, sea
        la que le paso*/
        List<DetalleVenta> listaDetalleVentaProductos = 
                this.traerListaDetalleVentaProducto2(facturaUltimaProducto);
        
        DetalleVenta de = null;
        
        /*Recorro la lista*/
        for( DetalleVenta deta: listaDetalleVentaProductos ) {
        
            if ( deta.getIdDetalleVenta() == idDetalleProducto ) {
                
                de = deta;
                break;
            }
        }
        
        return de;
    }


    /*Bien revisado, esta correcto*/
    public void editarDuenioEnFactura(Factura factura, Duenio duenio) {
        
        factura.setDuenio(duenio);
        
        controlPersis.editarDuenioEnFactura(factura);
    }


    /*Bien revisado, esta correcto*/
    public void editarDetalleVentaProducto(DetalleVenta detalleVenta, 
            double subtotalProducto, double cantidad, double descuento, 
            double iva, Producto producto) {
        
        detalleVenta.setCantidad(cantidad);
        detalleVenta.setDescuento(descuento);
        detalleVenta.setIva(iva);
        detalleVenta.setSubTotal(subtotalProducto);
        detalleVenta.setTotal(subtotalProducto);
        detalleVenta.setProducto(producto);
        
        controlPersis.editarDetalleVentaProducto(detalleVenta);
    }



    /*Bien revisado, esta correcto*/
    public String calcularTotalCompra(double subTotal, double descuentoCompra, double ivaCompra) {
        
        /*Calcular DESCUENTO de COMPRA*/
        double resultadoDescuentoCompra = (subTotal * descuentoCompra) / 100;
        
        /*Calcular IVA de COMPRA*/
        double resultadoIVACompra = (subTotal * ivaCompra) / 100;
        
        double resultadoFinal = (subTotal - resultadoDescuentoCompra) + resultadoIVACompra;
        
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        /*Para que luego de la coma, solo muestre 2 digitos.*/
        String totalStr = df.format(resultadoFinal);
        
        return totalStr;  
    }


    /*Biieenn revisado, esta correcto*/
    public void modiFactura(double subTotal, double total, double descuentoCompra, double ivaCompra) {
        
        Factura factura = this.buscarUltimaFacturaProducto();

        factura.setSubTotalCompra(subTotal);
        factura.setDescuentoCompra(descuentoCompra);
        factura.setIvaCompra(ivaCompra);
        factura.setTotalPagar(total);
        
        controlPersis.modiFactura(factura);
    }


    public void restarStockProductoVendido(List<DetalleVenta> listaDetalleProducto) {
        
        for (DetalleVenta de: listaDetalleProducto) {
            
            /*Traigo el Stock del Producto*/
            double stock = de.getProducto().getStock();
            
            /*Traigo cuanto se vendio de ese Producto en DetalleVenta*/
            double cantiVendida = de.getCantidad();
            
            /*Hago la resta*/
            double resultadoResta = stock - cantiVendida;
            
            /*Envio el producto y resultado para que se edite*/
            this.modificarStockProducto(de.getProducto(), resultadoResta);
        }
    }


    private void modificarStockProducto(Producto producto, double resultadoResta) {
        
        /*Edito el Stock al Producto*/
        producto.setStock(resultadoResta);
        
        controlPersis.modificarStockProducto(producto);
    }

    
    /*Biiiennn revisado, esta correcto*/
    public List<FacturaDeTurno> buscarFacturasTotalConCeroTurno() {
        
         /*Lista Completa de Facturas*/
        List<FacturaDeTurno> listaFacturas = this.traerListaFacturaTurno();
        
        /*Esta lista tendra todas las facturas con Total Cero, que no se usaron
        en el dia*/
        List<FacturaDeTurno> listaFacturasConTotalCeroTurno = new ArrayList();
        
        for (FacturaDeTurno fa: listaFacturas) {
            
            if ( fa.getTotalPagarTurno() == 0 ) {
                
                listaFacturasConTotalCeroTurno.add(fa);
            }
        }
        
        return listaFacturasConTotalCeroTurno;
    }

    public void borrarFacturasSinUsarTurno(List<FacturaDeTurno> listaFacturasSinUsarTurno) {
        
        for (FacturaDeTurno fa: listaFacturasSinUsarTurno) {
            
            int id = fa.getIdFacturaTurno();
            controlPersis.borrarFacturaTurno(id);
        }
    }
    
    
    public void borrarDetallesConFacturaNull(List<DetalleVenta> listaDetalleVentaProductoSinFactura) {
        
        for (DetalleVenta de: listaDetalleVentaProductoSinFactura) {
            
            if ( de.getFactura() == null ) {
                
                this.borrarDetalleVentaProductoEnLista(de.getIdDetalleVenta());
            }
        }
    }

    /*Biienn revisado, esta correcto*/
    public void borrarDetallesVentaTurnosConFacturaNull(List<DetalleVentaTurno> listaDetalleVentaTurnoSinFactura) {
        
        for (DetalleVentaTurno deTurno: listaDetalleVentaTurnoSinFactura) {
            
            if ( deTurno.getFacturaDeTurno() == null ) {
                
                this.borrarDetalleVentaTurnoEnLista(deTurno.getIdDetalleVentaTurno());
            }
        }
    }

    public List<Factura> buscarFacturasTotalConCero() {
       
        /*Lista Completa de Facturas*/
        List<Factura> listaFacturas = this.traerListaFacturas();
        
        /*Esta lista tendra todas las facturas con Total Cero, que no se usaron
        en el dia*/
        List<Factura> listaFacturasConTotalCero = new ArrayList();
        
        for (Factura fa: listaFacturas) {
            
            if ( fa.getTotalPagar() == 0 ) {
                
                listaFacturasConTotalCero.add(fa);
            }
        }
        
        return listaFacturasConTotalCero;
    }

    public void borrarFacturasSinUsar(List<Factura> listaFacturasSinUsar) {
        
        for (Factura fa: listaFacturasSinUsar) {
            
            int id = fa.getIdFactura();
            controlPersis.borrarFactura(id);
        }
    }


    /*Biieenn revisado, esta correcto*/
    public void modiFacturaTurno(double total) {
        
        FacturaDeTurno fac = this.buscarUltimaFacturaTurno();

        fac.setTotalPagarTurno(total);
        controlPersis.modiFacturaTurno(fac);
    }
    
    
    public double calcularTotalProductos(Factura facturaUltimaProducto) {

        /*Traigo la Lista de DetalleVentaTurno cuya idFactura sea la que le paso*/
        List<DetalleVenta> listaDetalleDeFactura = this.traerListaDetalleVentaProducto2(facturaUltimaProducto);
        
        double total = 0.0;
        
        /*Recorro la lista y obtengo su precio*/
        for ( DetalleVenta de: listaDetalleDeFactura ) {
            
            /*Sumo cada precio y calculo el total*/
            total += de.getTotal();
        }
        
        return total;
    }
    
    
     public double calcularPrecioTotalAPagarTurno(FacturaDeTurno facturaUltima) {
        
        /*Traigo la Lista de DetalleVentaTurno cuya idFactura sea la que le paso*/
        List<DetalleVentaTurno> listaDetalleDeFactura = this.traerListaDetalleVentaTurnos2(facturaUltima);
        
        double total = 0.0;
        
        /*Recorro la lista y obtengo su precio*/
        for ( DetalleVentaTurno de: listaDetalleDeFactura ) {
            
            /*Sumo cada precio y calculo el total*/
            total += de.getPrecio();
        }
        
        return total;
    }

    public void agregarDetalleAListaDeFactura(Factura facturaUltimaProducto, DetalleVenta de) {
       
        List<DetalleVenta> listaDetalleEnFactura = new ArrayList<>();
        listaDetalleEnFactura.add(de);
        
        facturaUltimaProducto.setListaDetalleVenta(listaDetalleEnFactura);
        controlPersis.agregarDetalleAListaDeFactura(facturaUltimaProducto);
        
    }

    public double calcularTotalListaDetalleFactura(Factura facturaUltimaProducto) {
        
        List<DetalleVenta> listaDetalleEnFactura = facturaUltimaProducto.getListaDetalleVenta();
        
        double total = 0.0;
        
        /*Recorro la lista y obtengo su precio*/
        for ( DetalleVenta de: listaDetalleEnFactura ) {
            
            /*Sumo cada precio y calculo el total*/
            total += de.getTotal();
        }
        
        return total;
    }

    public DetalleVenta buscarUltimoDetalleVenta(Factura facturaUltimaProducto) {
        
        DetalleVenta deta = null;
        List<DetalleVenta> listaDetalleVenta = this.traerListaDetalleVenta();
        
        DetalleVenta de = listaDetalleVenta.get(listaDetalleVenta.size() - 1);
        
        if ( de.getFactura().getIdFactura() == facturaUltimaProducto.getIdFactura() ) {
            
            deta = de;
   
        } 
        return deta;
    }

    
    /*PRUEBA*/
    public void modiAgregarDetalleAFactura(Factura facturaUltimaProducto) {
        
        List<DetalleVenta> listaDetalleVentaCompleta = this.traerListaDetalleVentaProducto2(facturaUltimaProducto);
        facturaUltimaProducto.setListaDetalleVenta(listaDetalleVentaCompleta);
        
        controlPersis.agregarDetalleAListaDeFactura(facturaUltimaProducto);
    }

}
