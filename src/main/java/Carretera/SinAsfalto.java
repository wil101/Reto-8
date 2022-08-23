package Carretera;
/**
 * @author emanuel.lopezh
 */
public class SinAsfalto extends TramoGenerico{
   
    private String material;
    private double espesor;
    public static final double ANCHO = 6;

    public SinAsfalto(double xInit, double yInit, double xFinal, double yFinal, String material, double espesor) {
        this.xInit = xInit;
        this.yInit = yInit;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
        
        switch (material){
            case "piedra":
                this.material = "piedra";
                break;
            case "arena":
                this.material = "arena";
                break;
            case "balastro":
                this.material = "balastro";
                break;
            default:
                this.material = "piedra";
                break;
        }

        this.espesor = espesor;
    }

    @Override
    public double getLongitud() {
        return Math.sqrt(Math.pow((this.xFinal - this.xInit), 2) + Math.pow((yInit - yFinal), 2));
    }

    @Override
    public double getArea() {
        return getLongitud()*ANCHO;
    }

    @Override
    public double getVolumen() {
        return getArea()*this.espesor;
    }    
    
}
