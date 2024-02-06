package FactoryDesign;

public class PkDataBulbasaur extends PokemonData {
    protected int idData;
    protected String name;
    protected String type;

    public PkDataBulbasaur(int idData, String name, String type) {
        this.idData = idData;
        this.name = name;
        this.type = type;
    }

    public PkDataBulbasaur(){}

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
