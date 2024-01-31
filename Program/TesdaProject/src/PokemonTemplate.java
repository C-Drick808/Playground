public abstract class PokemonTemplate{
    public final void buildPokemon(){

        buildPkData();
        buildPkStats();
        buildPkMoves();
        System.out.println("Pokemon is Built");
    }

    private void buildPkStats(){
        System.out.println("Building Stats");
    }

    public abstract void buildPkMoves();

    private void buildPkData(){


    }

}
