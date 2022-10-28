/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo3;

import java.util.Scanner;

/**
 *
 * @author Usuario R
 */
public class FacturaComercio {

    private String nombre;
    private String cedula;
    private String participa;
    private float total;
    //private Cliente factura;

    public FacturaComercio(String _nombre, String _cedula) {
        nombre = _nombre;
        cedula = _cedula;
        //precioTotal = _precioTotal;        
    }

    public float obtenerTotal() {
        //Scanner entrada = new Scanner(System.in);
        
        //System.out.print("Ingrese el número de productos: ");
        var numeroProductos = 3;

        //System.out.print("Ingrese el costo del producto: ");
        var costoProductos = 5;

        total = costoProductos * numeroProductos;

        participa = participaSorteo(total);

        return total;
    }

    public String participaSorteo(float total) {
        var retorno = "No";

        if (total >= 20) {
            retorno = "Si";
        }
        return retorno;
    }

    public void mostrarInfo() {
        System.out.println("------ Factura ------ ");
        System.out.println("Cliente: " + nombre
                + "\nCedula: " + cedula
                + "\nPrecioTotal: " + obtenerTotal()
                + "\nParticipa en sorte: " + participa);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public float getTotal() {
        return total;
    }

    public String getParticipa() {
        return participa;
    }

}
