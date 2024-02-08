package Generation1.Type;

import PokemonGame.PokemonMoves;

public abstract class Normal implements PokemonMoves {
    private final String skillName;
    private final String skillType;
    private final float skillPower;
    private final short skillPoints;
    private final String skillEffect;

    public Normal(String skillName, String skillType, float skillPower, short skillPoints, String skillEffect) {
        this.skillName = skillName;
        this.skillType = skillType;
        this.skillPower = skillPower;
        this.skillPoints = skillPoints;
        this.skillEffect = skillEffect;
    }

    @Override
    public String getSkillName() {
        return this.skillName;
    }

    @Override
    public String getSkillType() {
        return this.skillType;
    }
    @Override
    public Float getSkillPower() {
        return this.skillPower;
    }
    @Override
    public short getSkillPoints() {
        return this.skillPoints;
    }
    @Override
    public String getSkillEffect() {
        return this.skillEffect;
    }

}
