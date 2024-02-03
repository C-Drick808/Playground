package AbstractFactory;

import AbstractFactory.CharmanderFactory;
import AbstractFactory.Pokedex;
import AbstractFactory.PokemonFactory;

public class testDesign {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory(){

    // Pokemon charmander
        Pokedex charmander = PokemonFactory.getPokedex(new CharmanderFactory(4,"Charmander", "Fire",
                "Lizard Pokemon",0.6F,8.5F,"Blaze",39,52, 43,60,
                50,65,309));
    // Pokemon Bulbasur
        Pokedex bulbasur = PokemonFactory.getPokedex(new BulbasurFactory(1,"Bulbasur","Grass",
                "Seed Pokemon",0.7F,6.9F,"Overgrow", 45,49,49,
                65,65,45,318));
     // Pokemon Squirtle
        Pokedex squirtle = PokemonFactory.getPokedex(new SquirtleFactory(7,"Squirtle","Water",
                "Tiny Turtle Pokemon",0.5F,9.0F,"Torrent", 44,48,65,
                50,64,43));







        System.out.println(charmander.toString());
        System.out.println(bulbasur.toString());
        System.out.println(squirtle.toString());
    }
}
