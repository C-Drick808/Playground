package FactoryDesign;

public abstract class PokemonData {

    public abstract int getIdData();
    public abstract String getName();
    public abstract String getType();

    @Override
    public String toString() {
        return "WildData{" +
                "ID= "+getIdData()+" "+
                "NAME= "+getName()+" "+
                "TYPE= "+getType()+" "+
                "}";
    }
}
