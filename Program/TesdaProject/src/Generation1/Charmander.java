package Generation1;

public class Charmander {

    private int id;
    private int name;

    public Charmander(int id, int name, String species, String type, float height, float weight,
                      String abilities, int hp, int attack, int defense, int spAttack, int spDefense,
                      int speed, int total) {

        this.id = id;
        this.name = name;
        this.species = species;
        this.type = type;
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

    public int getId() {
        return id;
    }

    private String species;
    private String type;
    private float height;
    private float weight;
    private String abilities;

    private int hp;
    private int attack;
    private int defense;
    private int spAttack;
    private int spDefense;
    private int speed;
    private int total;





}
