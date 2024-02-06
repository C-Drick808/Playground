package FactoryDesign;

import java.util.Scanner;

public class TestFactory {


    public TestFactory(boolean isNewPokemon){

        if (isNewPokemon){

            System.out.println("Pokemon Data");

            System.out.println("Enter a pokemon id: ");
            System.out.println("Enter a pokemon name: ");
            System.out.println("Enter a pokemon type: ");
            System.out.println("Enter a pokemon species: ");
            System.out.println("Enter a pokemon height: : ");
            System.out.println("Enter a pokemon weight: ");
            System.out.println("Enter a pokemon abilities: ");

            System.out.println("Pokemon Base Stats");

            System.out.println("Enter a pokemon hp: ");
            System.out.println("Enter a pokemon attack: ");
            System.out.println("Enter a pokemon defense: ");
            System.out.println("Enter a pokemon special attack: ");
            System.out.println("Enter a pokemon special defense: ");
            System.out.println("Enter a pokemon speed: ");


        }else {

            Pokemon pokemon = PokemonFactory.getPokemon(1,"Bulbasur","Grass","Seed",0.7F,6.9F,
                    "Overgrow",45,49,49,65,65,45);
        }



    }

    public static void main(String[] args) {

    }
}
