package TemplateMethod;

public class WildFactory {

    public static Info  getInfo(String tier,float height, float weight, char gender, String category, String abilities){
        if ("S".equalsIgnoreCase(tier)){
            System.out.println("Tier S");
            return new PokemonInfo(height,weight,gender,category,abilities);
        }else if ("A+".equalsIgnoreCase(tier)){
            System.out.println("Tier A+");
            return new PokemonInfo(height,weight,gender,category,abilities);
        }
        return null;

    }

    public static BaseStats getStats(String tier,int hp,int attack,int defense, int spAttack, int spDefense, int speed){

        if ("S".equalsIgnoreCase(tier)){
            System.out.println("Tier S");
            return new PokemonStats(hp, attack, defense, spAttack, spDefense, speed);
        }else if ("A+".equalsIgnoreCase(tier)){
            System.out.println("Tier A+");
            return new PokemonStats(hp, attack, defense, spAttack, spDefense, speed);
        }

        return null;
    }
}
