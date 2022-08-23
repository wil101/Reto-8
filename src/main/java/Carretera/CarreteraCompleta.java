package Carretera;
/**
 * @author wilmar.osorio1
 */
import java.util.ArrayList;
import java.util.List;

public class CarreteraCompleta {

    List<TramoGenerico> tramosCarreteras = new ArrayList<>();

//    public void aniadirCarreteraAsfaltada(Asfalto carretera) {
//        tramosCarreteras.add(carretera);
//    }
//
//    public void aniadirCarreteraSinAsfaltar(SinAsfalto carretera) {
//        tramosCarreteras.add(carretera);
//    }
    
    public void aniadirCarretera(TramoGenerico carretera) {
        tramosCarreteras.add(carretera);
    }

    public double getLongitudTotal() {
        double longitudTotal = 0;
        for (int i = 0; i < tramosCarreteras.size(); i++) {
            longitudTotal += tramosCarreteras.get(i).getLongitud();
        }

        return longitudTotal;
    }

    public double getAreaTotal() {
        double areaTotal = 0;
        for (int i = 0; i < tramosCarreteras.size(); i++) {
            areaTotal += tramosCarreteras.get(i).getArea();
        }
        return areaTotal;
    }

    public double getVolumenTotal() {
        double volumenTotal = 0;
        for (int i = 0; i < tramosCarreteras.size(); i++) {
            volumenTotal += tramosCarreteras.get(i).getVolumen();
        }
        return volumenTotal;
    }
 
    public double getVolumenAsfalto() {
        double volumenAsfalto = 0;
        for (int i = 0; i < tramosCarreteras.size(); i++) {
           if(tramosCarreteras.get(i).getClass().getSimpleName().equals("Asfalto")){
               volumenAsfalto += tramosCarreteras.get(i).getVolumen();
           } 
        }
        return volumenAsfalto;    
    }
    
    public double getVolumenSinAsfalto() {
        double volumenSinAsfalto = 0;
        for (int i = 0; i < tramosCarreteras.size(); i++) {
            if(tramosCarreteras.get(i).getClass().getSimpleName().equals("SinAsfalto")){
                volumenSinAsfalto += tramosCarreteras.get(i).getVolumen();
            }         
        }
        return volumenSinAsfalto;
    }

    
    public String getTramosConectados(){
        boolean band = false;
        int s = 1;
        String conectado = "";
        for (int i = 0; i < tramosCarreteras.size() - 1; i++) {
            band = (tramosCarreteras.get(i + 1).xInit() == tramosCarreteras.get(i).xFinal()
                    && tramosCarreteras.get(i + 1).yInit() == tramosCarreteras.get(i).yFinal());
            if(band == true){
                s++;
            }
        }
        if(s > 0){
            conectado = "Hay " + s + " tramos conectados";
        } else {
            conectado = "No hay tramos conectados";
        }
        return conectado;
    }

}
