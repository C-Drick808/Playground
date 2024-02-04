package TemplateMethod;

public class testFactory {

    public static void main(String[] args) {

        Info info = WildFactory.getInfo("S",0.7F,6.9F,'M',"Seed Pokemon","Overgrow");

        BaseStats stats = WildFactory.getStats("S",45,49,49,65,65,45);



        System.out.println(info);
        System.out.println(stats);
    }
}
