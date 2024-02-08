package PokemonGame;

public class Wild extends Pokemon{
    private final int id;
    private final String name;
    private final int hp;
    private final int attack;
    private final int defense;
    private final int spAttack;
    private final int spDefense;
    private final int speed;








    public Wild(int id, String name, int hp, int attack, int defense, int spAttack, int spDefense, int speed) {

        super(id,name,hp,attack,defense,spAttack,spDefense,speed);

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
    protected int setId(int id) {
        return this.id;
    }
    @Override
    public String setName(String name) {
        return this.name;
    }

    @Override
    public int setHp(int hp) {
        return this.hp;
    }

    @Override
    public int setAttack(int attack) {
        return this.attack;
    }

    @Override
    public int setDefense(int defense) {
        return this.defense;
    }

    @Override
    public int setSpAttack(int spAttack) {
        return this.spAttack;
    }

    @Override
    public int setSpDefense(int spDefense) {
        return this.spDefense;
    }
    @Override
    public int setSpeed(int speed) {
        return this.speed;
    }
}
