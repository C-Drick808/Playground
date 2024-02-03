package Generation1;

import AbstractFactory.Pokedex;

public class Squirtle extends Pokedex {
    private final int id;
    private final String name;
    private final String type;
    private final String species;
    private final float height;
    private final float weight;
    private final String abilities;

    private final int hp;
    private final int attack;
    private final int defense;
    private final int spAttack;
    private final int spDefense;
    private final int speed;
    //private final int total;

    public Squirtle(int id, String name, String type, String species, float height, float weight,
                      String abilities, int hp, int attack, int defense, int spAttack, int spDefense,
                      int speed) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.abilities = abilities;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
        //this.total = total;
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
    public String getType() {
        return this.type;
    }

    @Override
    public String getSpecies() {
        return this.species;
    }

    @Override
    public float getHeight() {
        return this.height;
    }

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public String getAbilities() {
        return this.abilities;
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
