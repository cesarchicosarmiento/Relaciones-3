/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author Usuario R
 */
public class Pelicula {

    private String nombre;
    private String nominaciones;
    private float recaudaciones;

    public Pelicula(String nombre, String nominaciones, float recaudaciones) {
        this.nombre = nombre;
        this.nominaciones = nominaciones;
        this.recaudaciones = recaudaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNominaciones() {
        return nominaciones;
    }

    public void setNominaciones(String nominaciones) {
        this.nominaciones = nominaciones;
    }

    public float getRecaudaciones() {
        return recaudaciones;
    }

    public void setRecaudaciones(float recaudaciones) {
        this.recaudaciones = recaudaciones;
    }

    public void mostrarInfo(){
        System.out.println("\nNombre: " + nombre
        +"\nNominaciones: " + nominaciones
        +"\nRecaudaciones: " + recaudaciones + " millones");
    }
    
}
