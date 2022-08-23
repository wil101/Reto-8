/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemon;

/**
 *
 * @author WilmarOS
 */
public class Wartortle extends Pokemon {

    private String nombre;
    private Byte nivel;
    private int salud;
   
    public Wartortle(String nombre, Byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public Byte getNivel() {
        return this.nivel;
    }

    public int getSalud() {
        return this.salud;
    }
    
    

     @Override
    public Pokemon evolucionar() {
        Blastoise blas = new Blastoise(this.nombre, this.nivel, this.salud);
        return blas;
    }

    @Override
    public String gritar() {
         return "Wartortle!";
    }
}
