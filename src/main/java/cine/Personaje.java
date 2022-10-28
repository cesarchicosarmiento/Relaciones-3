/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author Usuario R
 */
public class Personaje {

    private String nombre;
    private String tipo;
    private String genero;
    private Pelicula pelicula;
    private Actor actor;

    public Personaje(String nombre, String tipo, String genero, Actor actor, Pelicula pelicula) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
        this.actor = actor;
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void mostrarInfo() {
        System.out.println("\nNombre del personaje: " + nombre
                + "\ntipo: " + tipo
                + "\nGénero: " + genero
                + "\nActor: " + this.getActor().getNombre()
                + "\nPelicula: " + this.getPelicula().getNombre());

    }

}
