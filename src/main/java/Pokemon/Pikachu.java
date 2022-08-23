package Pokemon;

/**
 * @author emanuel.lopezh
 */
public class Pikachu extends Pokemon{
    private String nombre;
    private Byte nivel;
    private int salud;

    public Pikachu(String nombre, Byte nivel, int salud) {
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
    public Pokemon evolucionar() {
        Raichu raich = new Raichu(this.nombre, this.nivel, this.salud);
        return raich;
    }

    @Override
    public String gritar() {
        return "Pikachu!";
    }
    
}
