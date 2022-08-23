
package Pokemon;

/**
 *
 * @author WilmarOS
 */
public class Blastoise extends Pokemon{
    private String nombre;
    private Byte nivel;
    private int salud;
    
    public Blastoise(String nombre, Byte nivel, int salud) {
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
    public Pokemon evolucionar() throws NoEvolutionException{
        throw new NoEvolutionException();
    }

    @Override
    public String gritar() {
         return "Blastoise!";
    }
}
