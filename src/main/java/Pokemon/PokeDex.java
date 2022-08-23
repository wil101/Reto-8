package Pokemon;

/**
 * @author emanuel.lopezh
 */

public interface PokeDex {
    
    public String consultar(Pokemon pokemon);
    public byte getNivel(Pokemon pokemon);
    public String getDescripcion(Pokemon pokemon);
    public String getOrigen(Pokemon pokemon);
    public String getColor(Pokemon pokemon);
    public String getTipo(Pokemon pokemon);
    public int getAnios(Pokemon pokemon);
    public int getSalud(Pokemon pokemon);
}
