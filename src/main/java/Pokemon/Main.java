package Pokemon;

public class Main {
    public static void main(String[] args){
        
    Charmander charmander = new Charmander("L", (byte)5, 1200);
    
    Pokemon charmeleon = charmander.evolucionar();

    Pokemon charizard = null;
        try {
            charizard = charmeleon.evolucionar();
            charizard.evolucionar();
        } catch (NoEvolutionException ex){
            System.out.println(ex.getMessage());
        }
    
    Squirtle squirtle = new Squirtle("lila", (byte)18 ,2000);

    Pokemon wartortle = squirtle.evolucionar();

    Pokemon blastoise = null;
        try {
            blastoise = wartortle.evolucionar();
            blastoise.evolucionar();
        } catch (NoEvolutionException ex) {
            System.out.println(ex.getMessage());
        }
        
    Pikachu pikachu = new Pikachu("pi", (byte)15 , 1800);
    
    Pokemon raichu = pikachu.evolucionar();
        try {
            raichu.evolucionar();
        } catch (NoEvolutionException ex) {
            System.out.println(ex.getMessage());
        }

    Pokebola pokebola = new Pokebola(charmander);

    Pokebola pokebola1 = new Pokebola(squirtle);

    Pokebola pokebola2 = new Pokebola(pikachu);
      
    System.out.println(charmander.gritar());
    System.out.println(charmeleon.gritar());
    System.out.println(charizard.gritar());
    System.out.println(squirtle.gritar());
    System.out.println(wartortle.gritar());
    System.out.println(blastoise.gritar());
    System.out.println(pikachu.gritar());
    System.out.println(raichu.gritar());
        
    }
}
