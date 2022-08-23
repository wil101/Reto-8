
package Pokemon;

/**
 *
 * @author WilmarOS
 */
public class Squirtle extends Pokemon{
    
    private String nombre;
    private Byte nivel;
    private int salud;

    public Squirtle(String nombre, Byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    
   public String getNombre() {
        return nombre;
    }

    public Byte getNivel() {
        return nivel;
    }

    public int getSalud() {
        return salud;
    }
    
    

     @Override
    public Pokemon evolucionar() {
        Wartortle bolaAzul = new Wartortle(this.nombre, this.nivel, this.salud);
        return bolaAzul;
    }

    @Override
    public String gritar() {
         return "Squirtle!";
    }
    
    
}
