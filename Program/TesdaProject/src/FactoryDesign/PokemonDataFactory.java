package FactoryDesign;

public class PokemonDataFactory {

    public static PokemonData getData(int idData , String name, String type){

        if ("BULBASAUR".equalsIgnoreCase(name)){
            return new PkDataBulbasaur(idData,name,type);
        } else if ("CHARMANDER".equalsIgnoreCase(name)) {
            return new PkDataCharmander(idData,name,type);
        } else if ("SQUIRTLE".equalsIgnoreCase(name)) {
            return new PkDataSquirtle(idData,name,type);
        }


        return null;

    }
}
