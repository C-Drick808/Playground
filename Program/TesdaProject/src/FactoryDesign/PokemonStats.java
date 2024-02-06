package FactoryDesign;

public class PokemonStats extends WildStats{

    protected int idStats;
    protected int hp;
    private int attack;
    private int defense;
    private int spAttack;
    private int spDefense;
    private int speed;

    public PokemonStats(int idStats, int hp, int attack, int defense, int spAttack, int spDefense, int speed) {
        this.idStats = idStats;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
    }


    @Override
    public int getIdStats() {
        return this.idStats;
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
}
