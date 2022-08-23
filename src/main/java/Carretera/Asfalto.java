package Carretera;
/*
 * @author emanuel.lopezh
 */
public class Asfalto extends TramoGenerico {
    
    private String proveedor;
    private int velMax;
    private boolean adelantar;
    public static final double ANCHO = 8;
    public static final double ESPESOR = 0.25;
    public static final int VELOCIDADMAXIMA = 150;

    public Asfalto(double xInit, double yInit, double xFinal, double yFinal, String proveedor) {
        this.xInit = xInit;
        this.yInit = yInit;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
        this.proveedor = proveedor;
    }

    public boolean isAdelantar() {
        return true;
    }

    public int getVelMax() {
        return VELOCIDADMAXIMA;
    }
   
    @Override
    public double getLongitud() {
        double longitud = Math.sqrt(Math.pow((this.xFinal - this.xInit), 2) + Math.pow((yInit - yFinal), 2));
        return longitud;
    }

    @Override
    public double getArea() {
        return getLongitud()*ANCHO;
    }

    @Override
    public double getVolumen() {
        return getArea()*ESPESOR;
    }
    
    
}
