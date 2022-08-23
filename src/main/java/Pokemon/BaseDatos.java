package Pokemon;

/* 
* @author emanuel.lopezh
*/

public class BaseDatos {
    
    public String getOrigen(String pokemon){     
        String origen = "";
        switch (pokemon) {
            case "charmander":
                origen = "Región volcánica";
                break;
            case "charmeleon":
                origen = "Región volcánica";
                break;
            case "charizard":
                origen = "Región volcánica";
                break;
            case "squirtle":
                origen = "La costa";
                break;
            case "wartortle":
                origen = "La costa";
                break;
            case "blastoise":
                origen = "La costa";
                break;
        }
        return origen;
    }
    
    public String getColor(String pokemon){
        String color = "";
        switch (pokemon){
            case "charmander":
                color = "Naranjado";
                break;
            case "charmeleon":
                color = "Rojo";
                break;
            case "charizard":
                color = "Naranjado con amarillo";
                break;
            case "squirtle":
                color = "Verde marino con amarillo";
                break;
            case "wartortle":
                color = "Azul oscuro";
                break;
            case "blastoise":
                color = "Azul clarito con café";
                break;
            case "pikachu":
                color = "Amarillo";
                break;
            case "raichu":
                color = "Naranjado con café";
                break;
        }
        return color;
    }
    
    public String getTipo(String pokemon){
        String tipo = "";
        switch (pokemon){
            case "charmander":
                tipo = "fuego";
                break;
            case "charmeleon":
                tipo = "fuego";
                break;
            case "charizard":
                tipo = "fuego";
                break;
            case "squirtle":
                tipo = "awa";
                break;
            case "wartortle":
                tipo = "awa";
                break;
            case "blastoise":
                tipo = "awa";
                break;
            case "pikachu":
                tipo = "trueno";
                break;
            case "raichu":
                tipo = "trueno";
                break;
        }
        return tipo;
    }
    
    public String getDescripcion(String pokemon){
        String descripcion = "";
        switch (pokemon){
            case "charmander":
                descripcion = "Le gusta comer mango";
                break;
            case "charmeleon":
                descripcion = "Le gusta comer manzana";
                break;
            case "charizard":
                descripcion = "Le gusta comer sandía";
                break;
            case "squirtle":
                descripcion = "Le gusta comer pera";
                break;
            case "wartortle":
                descripcion = "Le gusta comer moras";
                break;
            case "blastoise":
                descripcion = "le gusta comer bananos";
                break;
            case "pikachu":
                descripcion = "le gusta comer melocotón";
                break;
            case "raichu":
                descripcion = "le gusta comer fresas";
                break;
        }
        return descripcion;
    }
    
    public int getAnios(String pokemon){
        return 2000;
    }
    
}
