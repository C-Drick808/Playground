package TemplateMethod;

import java.lang.reflect.Array;
import java.util.Random;

public class Fire implements PokemonType{

    @Override
    public void Statistics() {

        PokemonInfo info = new PokemonInfo();
        Random random = new Random();

        int randomPlus = random.nextInt(10);

        int[] stats = {30,20,30,20,30,20};
        int plusPoints = 0;

        if (info.getHeight() >= 1.8 || info.getWeight() >= 10.5){

            int fireHp = Array.getInt(stats,0);
            int fireAttack = Array.getInt(stats,1);
            int fireDefense = Array.getInt(stats,2);
            int fireSpAttack = Array.getInt(stats,3);
            int fireSpDefense = Array.getInt(stats,4);
            int fireSpeed = Array.getInt(stats,5);

            int totalFireHp = fireHp+=randomPlus;
            int totalFireAttack = fireAttack+=randomPlus;
            int totalFireDefense = fireDefense+=randomPlus;
            int totalFireSpAttack = fireSpAttack+=randomPlus;
            int totalFireSPDefense = fireSpDefense+=randomPlus;
            int totalFireSpeed = fireSpeed+=randomPlus;

        }else {
            int fireHp = Array.getInt(stats,0);
            int fireAttack = Array.getInt(stats,1);
            int fireDefense = Array.getInt(stats,2);
            int fireSpAttack = Array.getInt(stats,3);
            int fireSpDefense = Array.getInt(stats,4);
            int fireSpeed = Array.getInt(stats,5);

            int FireHp = fireHp+=randomPlus;
            int FireAttack = fireAttack+=randomPlus;
            int FireDefense = fireDefense+=randomPlus;
            int FireSpAttack = fireSpAttack+=randomPlus;
            int FireSPDefense = fireSpDefense+=randomPlus;
            int FireSpeed = fireSpeed+=randomPlus;
        }






    }
}
