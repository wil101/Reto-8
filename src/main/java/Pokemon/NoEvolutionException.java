package Pokemon;
/**
 * @author emanuel.lopezh
 */
public class NoEvolutionException extends Exception{

    public NoEvolutionException() throws NoEvolutionException{
        super("NoEvolutionException: El Pokemon no puede evolucionar más");
    }
    
}
