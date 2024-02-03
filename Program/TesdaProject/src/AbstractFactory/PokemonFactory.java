package AbstractFactory;

import AbstractFactory.CreatePokemon;
import AbstractFactory.Pokedex;

public class PokemonFactory {

    public static Pokedex getPokedex(CreatePokemon factory){
        return factory.createPokemon();
    }
}
