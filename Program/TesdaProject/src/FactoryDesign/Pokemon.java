package FactoryDesign;

public abstract class Pokemon {

    public abstract int getId();
    public abstract String getName();
    public abstract String getType();
    public abstract String getSpecies();
    public abstract float getHeight();
    public abstract float getWeight();
    public abstract String getAbilities();

    public abstract int getHp();
    public abstract int getAttack();
    public abstract int getDefense();
    public abstract int getSpAttack();
    public abstract int getSpDefense();
    public abstract int getSpeed();
    public abstract int getTotal();

    @Override
    public String toString() {
        return "POKEMON{" +
                "id="+this.getId()+" "+
                "name="+this.getName()+" "+
                "type="+this.getType()+" "+
                "species="+this.getSpecies()+" "+
                "height="+this.getHeight()+" "+
                "weight="+this.getWeight()+" "+
                "abilities="+this.getAbilities()+" "+
                "\n"+"\t hp="+getHp()+" "+
                "attack="+getAttack()+" "+
                "defense="+getDefense()+" "+
                "spAttack="+getSpAttack()+" "+
                "spDefense="+getSpDefense()+" "+
                "spSpeed="+getSpeed()+" "+
                "totalStats="+getTotal()+" "+
                "}";
    }
}