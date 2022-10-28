/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author Usuario R
 */
public class Actor {
   private String nombre;
   private int numPremios;
   private int numPersonajes;

    public Actor(String nombre, int numPremios, int numPersonajes) {
        this.nombre = nombre;
        this.numPremios = numPremios;
        this.numPersonajes = numPersonajes;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPremios() {
        return numPremios;
    }

    public int getNumPersonajes() {
        return numPersonajes;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre
        +"\nNumero de premios: " + numPremios
        +"\nNumero de personajes: " + numPersonajes);
    }
    
   
   
    
   
   
           
           
           
           
}
