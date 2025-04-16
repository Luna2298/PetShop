package com.mycompany.petshop.igu;


import com.mycompany.petshop.logica.Factura;
import net.sf.jasperreports.engine.*;
/*
Esa advertencia suele aparecer en NetBeans (y otros IDEs) cuando usás un import 
con asterisco (*), que importa todas las clases del paquete. Técnicamente es 
válido y funciona, pero el IDE te sugiere hacerlo de forma más específica 
para mejor legibilidad y rendimiento en compilación.

Si preferís dejar el *, no es un error y el código funciona igual. 
Solo es una sugerencia del IDE para mejorar estilo y organización.*/

/*import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperViewer;
import net.sf.jasperreports.engine.JasperPrintManager;*/


import net.sf.jasperreports.view.JasperViewer;
import java.sql.Connection;
import java.sql.DriverManager;

import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ReporteVentaa {

    public JasperPrint mostrarReporte(Factura factura) {
        
        JasperPrint print = null;
        try {
            // Ruta del archivo compilado
            JasperReport reporte = JasperCompileManager.compileReport("ruta/archivo/ReporteDetalleVenta.jrxml");

            // Parámetros cabecera del reporte
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("idFactura", factura.getIdFactura()); // si en el reporte filtrás por venta
            parametros.put("duenio", factura.getDuenio().mostrarNombreCompleto());
            parametros.put("subTotalCompra", factura.getSubTotalCompra());
            parametros.put("descuentoCompra", factura.getDescuentoCompra());
            parametros.put("ivaCompra", factura.getIvaCompra());
            parametros.put("totalPagar", factura.getTotalPagar());
            parametros.put("listaDetalleVenta", factura.getListaDetalleVenta());

            // Fuente de datos: los productos de la venta
            /*JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(factura.getListaDetalleVenta());*/
            
            // Conexión a la base de datos
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/petshop", "root", "...");

            /*JasperPrint print = JasperFillManager.fillReport(reporte, parametros, conn);*/
            print = JasperFillManager.fillReport(reporte, parametros, new JREmptyDataSource());

            //Mostrar el reporte al usuario desde un visor
            JasperViewer.viewReport(print, false); // false para no cerrar la app al cerrar el reporte


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return print;
    }
}


