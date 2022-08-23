package Pokemon;

/**
 * @author emanuel.lopezh
 */
public class Charizard extends Pokemon{
    
    private String nombre;
    private Byte nivel;
    private int salud;

    public Charizard(String nombre, Byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public int getSalud() {
        return this.salud;
    }

    public Byte getNivel() {
        return this.nivel; 
    }

    public String getNombre() {
        return this.nombre;
    }
    
    @Override
    public String gritar() {
        return "Charizard!";
    }

    @Override
    public Pokemon evolucionar() throws NoEvolutionException{
        throw new NoEvolutionException();
    }
}
