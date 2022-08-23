
package Pokemon;

/**
 *
 * @author WilmarOS
 */
public class Pokebola {
    
    private String Tamaño;
    private Pokemon pokemon;
    private Byte nivel;    

    public Pokebola(String Tamaño, Pokemon pokemon, Byte nivel) {
        this.Tamaño = Tamaño;
        this.pokemon = pokemon;
        this.nivel = nivel;
    }

    public Pokebola(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Byte getNivel() {
        return nivel;
    }

    public void setNivel(Byte nivel) {
        this.nivel = nivel;
    }
    
    public void getTamañoPokebola(){
        String tamaño = "";
        if(nivel > 0 && nivel  <= 20){
            tamaño = "pequeño";
        }else if(nivel > 21 && nivel <= 40){
            tamaño = "meadiano";
        }else if(nivel > 41 && nivel <= 60){
            tamaño = "grande";
        }
        System.out.println("el tamaño de la pokebola es" + tamaño);
    }
    
    
    
}

