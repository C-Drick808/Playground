package FactoryDesign;

import Generation1.Bulbasaur;

import java.util.ArrayList;

public class TestFactory {

    public static void main(String[] args){

        PokemonData bulbasaur = (PokemonData) PokemonDataFactory.getData(1,"Bulbasaur","GRASS");
        PokemonData charmander = (PokemonData) PokemonDataFactory.getData(4,"Charmander","FIRE");
        PokemonData squirtle = (PokemonData) PokemonDataFactory.getData(7,"Squirtle","WATER");


        PokemonStats bulbasaur1 = (PokemonStats) PokemonStatsFactory.getStats("Bulbasaur",1,45,49,
                49,65,65,45);
        PokemonStats charmander1 = (PokemonStats) PokemonStatsFactory.getStats("Charmander",4,39,52,43,
                60,50,65);
        PokemonStats squirtle1 = (PokemonStats) PokemonStatsFactory.getStats("Squirtle",7,44,48,65,
                50,64,43);


        String bulbaId = String.valueOf(bulbasaur.getIdData());
        String bulbaName = bulbasaur.getName();
        String bulbaType = bulbasaur.getType();

        StringBuilder sbBulbasaur = new StringBuilder();

        sbBulbasaur.append(bulbaId);
        sbBulbasaur.append(bulbaName);
        sbBulbasaur.append(bulbaType);

        System.out.println(sbBulbasaur);

        int id = sbBulbasaur.length()(bulbaId.length() - bul)

        String subId = sbBulbasaur.substring(0,1);
        String subName = sbBulbasaur.substring(1,10);
        System.out.println(subId);
        System.out.println(subName);

        ArrayList<String> PokemonData = new ArrayList<String>();
        PokemonData.add(subId);
        PokemonData.add(subName);




        System.out.println(PokemonData.toString());




















        /*System.out.println("POKEMON DATA");
        System.out.println(bulbasaur);
        System.out.println("\n" + charmander);
        System.out.println("\n"+squirtle);
        System.out.println("POKEMON STATS");
        System.out.println(bulbasaur1);
        System.out.println("\n" + charmander1);
        System.out.println("\n"+squirtle1);*/

    }
}
