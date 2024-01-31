public class Pokemon1 extends Pokemon{

    public Pokemon1(PokemonData pkData) {
        super(pkData);
    }

    @Override
    public void applyData() {
        System.out.println("Pokemon Applying data");
        pkData.applyData();
    }
}
