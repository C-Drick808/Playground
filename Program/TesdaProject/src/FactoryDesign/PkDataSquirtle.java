package FactoryDesign;

public class PkDataSquirtle extends PokemonData{

    protected int idData;
    protected String name;
    protected String type;

    public PkDataSquirtle(int idData, String name, String type) {
        this.idData = idData;
        this.name = name;
        this.type = type;
    }

    @Override
    public int getIdData() {
        return this.idData;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
