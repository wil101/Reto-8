package Pokemon;

/**
 * @author emanuel.lopezh
 */
public class Charmander extends Pokemon{
    
    private String nombre;
    private Byte nivel;
    private int salud;

    public Charmander(String nombre, Byte nivel, int salud) {
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
        Charmeleon charm = new Charmeleon(this.nombre, this.nivel, this.salud);
        return charm;
    }

    @Override
    public String gritar() {
         return "Charmander!";
    }

    
}
