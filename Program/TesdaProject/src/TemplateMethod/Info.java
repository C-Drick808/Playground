package TemplateMethod;

public abstract class Info {

    public abstract float getHeight();
    public abstract float getWeight();
    public abstract char getGender();
    public abstract String getCategory();
    public abstract String getAbilities();

    @Override
    public String toString() {
        return "Info{" +
                "Height= " + this.getHeight() +
                "Weight= " + this.getWeight() +
                "Gender= " + this.getGender() +
                "Category= " + this.getCategory() +
                "Abilities= " + this.getAbilities() +
                "}";
    }
}
