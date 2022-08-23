package concesionario;
//hecho por Emanuel Lopez
public class Llanta {
    private String marca;
    private int referencia;
    private int peso;

    public void setPeso(int peso)throws NumeroInvalidoException{
        if(peso >= 0){
            this.peso = peso;
        }else {
            throw new NumeroInvalidoException();
        }
    }
    
}
