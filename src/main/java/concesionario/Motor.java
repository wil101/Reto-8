
package concesionario;

/**
 *
 * @author wilmar.osorio1
 */
public class Motor {
    int peso,clindraje;
    String marca,referencia,descripcion;

    public void setPeso(int peso) throws NumeroInvalidoException{
        if(peso >= 0){
            this.peso = peso;
        }else{
            throw new NumeroInvalidoException();
        }
        
    }
    
}
