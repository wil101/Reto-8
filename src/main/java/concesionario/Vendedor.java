
package concesionario;

/**
 *
 * @author wilmar.osorio1
 */
public class Vendedor {
    private String nombre, apellido, descripcion;
    private int numeroDeDocumento, edad, totalVendido, anioDeIngreso = 0;

    public Vendedor(String nombre, String apellido, String descripcion, 
            int numeroDeDocumento, int edad, int totalVendido, int anioDeIngreso) throws NumeroInvalidoException {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.numeroDeDocumento = numeroDeDocumento;
        this.edad = edad;
        this.totalVendido = totalVendido;
        if(anioDeIngreso > 2022) throw new NumeroInvalidoException();
        else this.anioDeIngreso = anioDeIngreso;
    }

    public void setEdad(int edad) throws NumeroInvalidoException{
        if(edad >= 0){
            this.edad = edad;
        }else {
            throw new NumeroInvalidoException();
        }
    }
   
    
    
    public String calcularProductividad(){
        if(totalVendido == 0){
            return "Novato";
        }else if(totalVendido > 0 && totalVendido <= 500000000){
            return "Principiante";
        }else if(totalVendido > 500000000 && totalVendido <= 2000000000){
            return "Intermedio";
        }else if(totalVendido > 2000000000){
            return "Avanzado";
        }else{
            return null;
        }
    }
   
    public boolean verificarAnio(){
        return anioDeIngreso != 0;
    }
   
    public String definirVendedor(){
        String cal;
        int valorTrabajador, experiencia, calidadTrabajador, anios;
        while(verificarAnio()){
            cal = calcularProductividad();
            switch (cal) {
                case "Novato":
                    valorTrabajador = 1;
                    break;
                case "Principiante":
                    valorTrabajador = 2;
                    break;
                case "Intermedio":
                    valorTrabajador = 3;
                    break;
                case "Avanzado":
                    valorTrabajador = 4;
                    break;
                default:
                    valorTrabajador = 0;
                    break;
            }
            anios = 2022 - anioDeIngreso;
            if(anios >= 0 && anios < 2){
                experiencia = 4;
            }else if(anios >= 2 && anios < 5){
                experiencia = 3;
            }else if(anios >= 5 && anios < 10){
                experiencia = 2;
            }else if(anios >= 10){
                experiencia = 1;
            }else{
                experiencia = 0;
            }
            calidadTrabajador = valorTrabajador*experiencia;
            if(calidadTrabajador > 0 && calidadTrabajador <= 4){
                return "Malo";
            }else if(calidadTrabajador > 4 && calidadTrabajador <= 8){
                return "Regular";
            }else if(calidadTrabajador > 8 && calidadTrabajador <= 12){
                return "Bueno";
            }else if(calidadTrabajador > 12 && calidadTrabajador <= 16){
                return "Excelente";
            }else{
                return null;
            }
           
        }
        return null;
    }
}
