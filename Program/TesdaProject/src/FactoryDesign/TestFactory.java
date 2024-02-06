package FactoryDesign;

public class TestFactory {

    public static void main(String[] args){
        PokemonData data = new WildData(1,"Bulbasaur","Grass");

        PokemonStats stats = new PokemonStats(1,45,49,49,65,65,45);

        System.out.println(data);
        System.out.println(stats);
    }
}
