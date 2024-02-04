package TemplateMethod;

public abstract class BaseStats {

    public abstract int getHp();
    public abstract int getAttack();
    public abstract int getDefense();
    public abstract int getSpAttack();
    public abstract int getSpDefense();
    public abstract int getSpeed();

    @Override
    public String toString() {
        return "BaseStats{" +
                "HP= "+ getHp()+
                "Attack= "+ getAttack()+
                "Defense= "+ getDefense()+
                "SP Attack= "+ getSpAttack()+
                "SP Defense="+ getSpDefense()+
                "Speed= "+ getSpeed()+
                "}";
    }
}
