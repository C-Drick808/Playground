package TemplateMethod;

public abstract class PokemonTemplate {

    //template method, final so subclasses can't override
    public final void buildPokemon(){

        buildPokemonData();
        buildMoves();
        buildType();
        buildPokemonStats();
        System.out.println("Successfully Created Pokemon");
    }

    private void buildPokemonData(){

    }

    public abstract void buildMoves();
    public abstract void buildType();


    private void buildPokemonStats(){
        System.out.println("Pokemon Stats Blah Blah");
    }
}
