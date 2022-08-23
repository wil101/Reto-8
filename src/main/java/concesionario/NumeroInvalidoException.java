
package concesionario;

/**
 *
 * @author wilmar.osorio1
 */

//Se cambia el nombre de la excepcion de numeroInvalido a NumeroInvalidoException
public class NumeroInvalidoException extends Exception{
    
    public NumeroInvalidoException(){
        super("numeroInvalido: el numero que ingresaste no es valido");
    }
    
}
