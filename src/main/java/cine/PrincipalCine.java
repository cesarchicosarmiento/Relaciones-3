/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author Usuario R
 */
public class PrincipalCine {
    public static void main(String[] args){
        var actor = new Actor("Leonardo Dicaprio",1,1);
        var pelicula = new Pelicula("Lobo de Wallstreet","ninguna",15);
        var personaje = new Personaje("Leo", "real","drama", actor, pelicula);
        
        System.out.println("    --- Personaje --- ");
        personaje.mostrarInfo();
        System.out.println("    --- Película --- ");
        pelicula.mostrarInfo();
        System.out.println("    --- Actor ---");
        actor.mostrarInfo();
        
        var actor2 = new Actor("Emma Wa",5,45);
        var pelicula2 = new Pelicula("Harry Poter","ninguna",145);
        var personaje2 = new Personaje("Emma ", "real","ciencia ficción", actor, pelicula);
        
        System.out.println("    --- Personaje --- ");
        personaje2.mostrarInfo();
        System.out.println("    --- Película --- ");
        pelicula2.mostrarInfo();
        System.out.println("    --- Actor ---");
        actor2.mostrarInfo();
        
        var actor3 = new Actor("Adian Lesson",6,34);
        var pelicula3 = new Pelicula("Sin escaleras","ninguna",345);
        var personaje3 = new Personaje("Kenny", "real","accion y drama", actor, pelicula);
        
        System.out.println("    --- Personaje --- ");
        personaje3.mostrarInfo();
        System.out.println("    --- Película --- ");
        pelicula3.mostrarInfo();
        System.out.println("    --- Actor ---");
        actor3.mostrarInfo();
        
        var actor4 = new Actor("Will Smith",11,28);
        var pelicula4 = new Pelicula("Independencia","mejor edicion ",78);
        var personaje4 = new Personaje("Jackson ", "real","ciencia ficcion", actor, pelicula);
        
        System.out.println("    --- Personaje --- ");
        personaje4.mostrarInfo();
        System.out.println("    --- Película --- ");
        pelicula4.mostrarInfo();
        System.out.println("    --- Actor ---");
        actor4.mostrarInfo();
        
        var actor5 = new Actor("Adam Levin",8,23);
        var pelicula5 = new Pelicula("Son como niños","ninguna",134);
        var personaje5 = new Personaje("Eddie", "real","comedia", actor, pelicula);
        
        System.out.println("    --- Personaje --- ");
        personaje5.mostrarInfo();
        System.out.println("    --- Película --- ");
        pelicula5.mostrarInfo();
        System.out.println("    --- Actor ---");
        actor5.mostrarInfo();
        
        var actor6 = new Actor("Brad Pitt",1,1);
        var pelicula6 = new Pelicula("La gran estafa","mejor drama",223);
        var personaje6 = new Personaje("Lobo de wallstreet", "real","drama", actor, pelicula);
        
        System.out.println("    --- Personaje --- ");
        personaje6.mostrarInfo();
        System.out.println("    --- Película --- ");
        pelicula6.mostrarInfo();
        System.out.println("    --- Actor ---");
        actor6.mostrarInfo();
        
        
        
                
    }
}
