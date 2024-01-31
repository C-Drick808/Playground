public abstract class Pokemon{

    protected PokemonData pkData;

    public Pokemon(PokemonData pkData) {
        this.pkData = pkData;
    }

    abstract public void applyData();
}
