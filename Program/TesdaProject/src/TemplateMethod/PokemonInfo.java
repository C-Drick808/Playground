package TemplateMethod;

public class PokemonInfo extends Info{

    private float height;
    private float weight;
    private char gender;
    private String category;
    private String abilities;

    public PokemonInfo(float height, float weight, char gender, String category, String abilities) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.category = category;
        this.abilities = abilities;
    }

    public PokemonInfo(){

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
    public char getGender() {
        return this.gender;
    }

    @Override
    public String getCategory() {
       return this.category;
    }

    @Override
    public String getAbilities() {
        return this.abilities;
    }
}
