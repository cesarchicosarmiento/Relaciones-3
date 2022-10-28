/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo3;

/**
 *
 * @author Usuario R
 */
public class ClienteComercio {
    private String nombre;    
    private String cedula;

    public ClienteComercio(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre
        +"Cedula: " + cedula);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
    
    
    
}
