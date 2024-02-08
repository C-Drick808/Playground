package PokemonGame;

import Generation1.Pokemon.*;

import java.util.Scanner;

public class LoadPokedex {
    public LoadPokedex(){

        Wild bulbasaur = new Bulbasaur(1,"Bulbasaur",45,49,49,65,65,45);
        Wild charmander = new Charmander(4,"Charmander",39,52,43,60,50,65);
        Wild squirtle = new Squirtle(7,"Squirtle",44,48,65,50,64,43);
        Wild caterpie = new Caterpie(10,"Caterpie",45,30,35,20,20,45);
        Wild weedle = new Weedle(13,"Weedle",40,35,30,20,20,50);
        Wild kakuna = new Kakuna(14,"Kakuna",45,25,50,25,25,35);
        Wild pidgey = new Pidgey(16,"Pidgey",40,45,40,35,35,56);
        Wild rattata = new Rattata(19,"Rattata",30,56,35,25,35,72);
        Wild spearow = new Spearow(21,"Spearow",40,60,30,31,31,70);
        Wild ekans = new Ekans(23,"Ekans",35,60,44,40,54,55);
        Wild pikachu = new Pikachu(25,"Pikachu",35,55,40,50,50,90);
        Wild sandshrew = new Sanshrew(27,"Sandshrew",50,75,85,20,30,40);


        Scanner sc = new Scanner(System.in);
        boolean isEnd = false;


        do {


            int primaryPkHp = charmander.getHp();
            int primaryPkAttack = charmander.getAttack();

            int primaryScHp = squirtle.getHp();
            int primaryScAttack = squirtle.getAttack();



            System.out.println("SELECT A MOVE");
            System.out.println("[1] Use Primary Pokemon");
            System.out.println("[2] Use Secondary Pokemon");
            System.out.println("[0] Exit");
            System.out.print("Enter your move: ");
            int move = sc.nextInt();

            switch (move) {

                case 1: {

                }
                case 2: {
                    int totalDamage = 10;
                    primaryScHp = totalDamage;
                    System.out.println("Secondary Primary Pokemon");
                    break;
                }
                case 0: {
                    System.out.println("Break A Loop");
                    isEnd = true;
                    break;
                }

            }
        }while (isEnd!=true);


    }
}
