/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajo3;

/**
 *
 * @author Usuario R
 */
public class Trabajo3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        var cliente = new ClienteComercio("Fernando","0150848934");
        var factura = new FacturaComercio(cliente.getNombre(), cliente.getCedula());
        
        factura.mostrarInfo();
        
        var cliente2 = new ClienteComercio("Cesar","0150848123");
        var factura2 = new FacturaComercio(cliente2.getNombre(), cliente2.getCedula());
        factura2.mostrarInfo();
        
        var cliente3 = new ClienteComercio("Erika","0148748934");
        var factura3 = new FacturaComercio(cliente3.getNombre(), cliente3.getCedula());
        factura3.mostrarInfo();
        
        var cliente4 = new ClienteComercio("Jonnathan","0193848934");
        var factura4 = new FacturaComercio(cliente4.getNombre(), cliente4.getCedula());
        factura4.mostrarInfo();
        
        var cliente5 = new ClienteComercio("Danie","0167848934");
        var factura5 = new FacturaComercio(cliente5.getNombre(), cliente5.getCedula());
        factura5.mostrarInfo();
        
        var cliente6 = new ClienteComercio("Henrry","01678848934");
        var factura6 = new FacturaComercio(cliente6.getNombre(), cliente6.getCedula());
        factura6.mostrarInfo();
        
        
        
        
        
        
    }
}
