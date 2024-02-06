package FactoryDesign;

public abstract class PokemonStats {

    public abstract int getIdStats();
    public abstract int getHp();
    public abstract int getAttack();
    public abstract int getDefense();
    public abstract int getSpAttack();
    public abstract int getSpDefense();
    public abstract int getSpeed();

    @Override
    public String toString() {
        return "WildStats{" +
                "ID= " + getIdStats()+" "+
                "HP= " + getHp()+" "+
                "ATTACK= " + getAttack()+" "+
                "DEFENSE= " + getDefense()+" "+
                "SP ATTACK= " + getSpAttack()+" "+
                "SP DEFENSE= "+ getSpDefense()+" "+
                "SPEED= "+ getSpeed()+" "+
                "}";
    }

}
