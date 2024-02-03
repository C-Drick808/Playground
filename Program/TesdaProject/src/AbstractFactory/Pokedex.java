package AbstractFactory;

public abstract class Pokedex{

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
    //public abstract int getTotal();


    @Override
    public String toString() {
        return "Pokedex{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", species='" + getSpecies() + '\'' +
                ", height=" + getHeight() + " m" +
                ", weight=" + getWeight() + " kg" +
                ", abilities='" + getAbilities() + '\'' +
                ", hp=" + getHp() +
                ", attack=" + getAttack() +
                ", defense=" + getDefense() +
                ", spAttack=" + getSpAttack() +
                ", spDefense=" + getSpDefense() +
                ", speed=" + getSpeed() +
                //", total=" + getTotal() +
                '}';
    }

}
