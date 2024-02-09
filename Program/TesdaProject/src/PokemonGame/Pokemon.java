package PokemonGame;

public abstract class Pokemon implements PokemonData,PokemonStats{

    private final int id;
    private final String name;
    private final int hp;
    private final int attack;
    private final int defense;
    private final int spAttack;
    private final int spDefense;
    private final int speed;




    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", spAttack=" + spAttack +
                ", spDefense=" + spDefense +
                ", speed=" + speed +
                '}';
    }

    public Pokemon(int id, String name, int hp, int attack, int defense, int spAttack,
                   int spDefense, int speed) {

        this.id = id;
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
    }



    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public int getAttack() {
        return this.attack;
    }

    @Override
    public int getDefense() {
        return this.defense;
    }

    @Override
    public int getSpAttack() {
        return this.spAttack;
    }

    @Override
    public int getSpDefense() {
        return this.spDefense;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }








    protected abstract int setId(int id);
    protected abstract String setName(String name);
    protected abstract int setHp(int hp);
    protected abstract int setAttack(int attack);
    protected abstract int setDefense(int defense);
    protected abstract int setSpAttack(int spAttack);
    protected abstract int setSpDefense(int spDefense);
    protected abstract int setSpeed(int speed);


}
