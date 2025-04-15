package com.mycompany.petshop;

import com.mycompany.petshop.igu.Menu;
import com.mycompany.petshop.igu.Principal;
import com.mycompany.petshop.logica.ControladoraLogica;
import com.mycompany.petshop.logica.Producto;


public class PetShop {

    public static void main(String[] args) {
        
        /*ControladoraLogica controLogica = new ControladoraLogica();
        
        Producto pro = new Producto();
        pro.setNombre("Pipetas Power Ultra");
        pro.setPrecio(3000);
        pro.setStock(50);
        pro.setDescripcion("de 5 a 10kg");
        pro.setEspecie("Perro");
        
        controLogica.crearProducto(pro);*/
        
        /*Abro el Form*/
        /*Principal princi = new Principal();
        princi.setVisible(true);
        princi.setLocationRelativeTo(null);*/
        
        /*Llamo al Form Menu*/
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
}
