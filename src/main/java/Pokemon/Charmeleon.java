package Pokemon;

/**
 * @author emanuel.lopezh
 */
public class Charmeleon extends Pokemon{

    private String nombre;
    private Byte nivel;
    private int salud;

    public Charmeleon(String nombre, Byte nivel, int salud) {
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
        return "Charmeleon!";
    }

    @Override
    public Pokemon evolucionar() {
        Charizard chariz = new Charizard(this.nombre, this.nivel, this.salud);
        return chariz;
    }
    
}