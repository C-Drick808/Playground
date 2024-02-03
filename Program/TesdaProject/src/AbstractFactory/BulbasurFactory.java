package AbstractFactory;

import Generation1.Bulbasur;

public class BulbasurFactory implements CreatePokemon{
    public BulbasurFactory(int id, String name, String type, String species, float height,
                           float weight, String abilities, int hp, int attack, int defense, int spAttack,
                           int spDefense, int speed, int total) {

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
        this.total = total;
    }

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
    private final int total;

    @Override
    public Pokedex createPokemon() {
        return new Bulbasur(id,name,type,species,height,weight,abilities,hp,attack,defense,spAttack,spDefense,speed);
    }
}
