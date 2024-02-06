package FactoryDesign;

public class PokemonFactory {

    public static Pokemon getPokemon(int id ,String name,String type,String species,
                                     float height,float weight,String abilities,
                                     int hp,int attack,int defense,int spAttack,int spDefense,int speed){

        if ("BULBASUR".equalsIgnoreCase(name))return new Bulbasur(id,name,type,species,height,weight,abilities,
                hp,attack,defense,spAttack,spDefense,speed);

        return null;
    }
}
