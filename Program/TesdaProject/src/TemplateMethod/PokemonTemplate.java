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

    public abstract void buildMoves();
    public abstract void buildType();


    private void buildPokemonData(){

    }

    private void buildPokemonStats(){
        System.out.println("Pokemon Stats Blah Blah");
    }
}
