package TemplateMethod;

import FactoryDesign.*;

import java.util.ArrayList;

public class PokemonTemplate{

    //template method, final so subclasses can't override
    /*public final void buildJourney(){

        buildFoundation();
        buildType();
        buildMoves();
        System.out.println("Successfully Started the journey");
    }*/

    public void buildFoundation(){

    }

    //public abstract void buildMoves();
    //public abstract void buildType();



}
