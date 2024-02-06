package FactoryDesign;

public class PokemonStatsFactory {

    public static PokemonStats getStats(String pkName, int idStats, int hp, int attack, int defense, int spAttack, int spDefense, int speed){

        if ("BULBASAUR".equalsIgnoreCase(pkName))
            return new PkStatsBulbasaur(idStats,hp,attack,defense,spAttack,spDefense,speed);
        else if ("CHARMANDER".equalsIgnoreCase(pkName)) {
            return new PkStatsCharmander(idStats,hp,attack,defense,spAttack,spDefense,speed);
        } else if ("SQUIRTLE".equalsIgnoreCase(pkName)) {
            return new PkStatsSquirtle(idStats,hp,attack,defense,spAttack,spDefense,speed);
        }



        return null;
    }
}
