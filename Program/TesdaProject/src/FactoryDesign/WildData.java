package FactoryDesign;

public class WildData extends PokemonData{

    protected int idData;
    protected String name;

    public WildData(int idData, String name, String type) {
        this.idData = idData;
        this.name = name;
        this.type = type;
    }

    protected String type;

    @Override
    public int getIdData() {
        return idData;
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
