package Carretera;
/**
 * @author emanuel.lopezh
 */
public class Main {
    public static void main(String[] args){
        
        /*Los tipos de material para la carretera sin asfaltar son:
        piedra, arena y balastto*/
        
        Asfalto tramo1 = new Asfalto(1, 2, 5, 7.48, "yo");
        SinAsfalto tramo2 = new SinAsfalto(5, 7.48, 10.12, 13.16, "piedra", 0.26);
        System.out.println("longitud del tramo 1 " + tramo1.getLongitud());
        System.out.println("longitud del tramo 2 " + tramo2.getLongitud());
        System.out.println("área del tramo 1 " + tramo1.getArea());
        System.out.println("área del tramo 2 " + tramo2.getArea());
        System.out.println("volumen del tramo 1 " + tramo1.getVolumen());
        System.out.println("volumen del tramo 2 " + tramo2.getVolumen());
        
        CarreteraCompleta carretera = new CarreteraCompleta();
        System.out.println("");
        carretera.aniadirCarretera(tramo1);
        carretera.aniadirCarretera(tramo2);
 
        System.out.println("Longitud total " + carretera.getLongitudTotal());
        System.out.println("Área total " + carretera.getAreaTotal());
        System.out.println("Volumen total " + carretera.getVolumenTotal());
        System.out.println("Volumen asfaltado " + carretera.getVolumenAsfalto());
        System.out.println("Volumen sin asfalto " + carretera.getVolumenSinAsfalto());
        System.out.println(carretera.getTramosConectados());
        
        
        
    }
}
