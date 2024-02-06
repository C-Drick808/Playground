package FactoryDesign;

public class WildDataFactory {

    public static WildData getData(int idData , String name, String type){

        if ("BULBASAUR".equalsIgnoreCase(name)) return new WildData(idData,name,type);




        return null;


    }
}
