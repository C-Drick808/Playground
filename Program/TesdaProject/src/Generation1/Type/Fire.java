package Generation1.Type;

import PokemonGame.PokemonMoves;

public class Fire implements PokemonMoves {
    private final String skillName;
    private final String skillType;
    private final float skillPower;
    private final short skillPoints;
    private final String skillEffect;

    public Fire(String skillName, String skillType, float skillPower, short skillPoints, String skillEffect) {
        this.skillName = skillName;
        this.skillType = skillType;
        this.skillPower = skillPower;
        this.skillPoints = skillPoints;
        this.skillEffect = skillEffect;
    }

    @Override
    public String getSkillName() {
        return null;
    }

    @Override
    public String getSkillType() {
        return null;
    }

    @Override
    public Float getSkillPower() {
        return null;
    }

    @Override
    public short getSkillPoints() {
        return 0;
    }

    @Override
    public String getSkillEffect() {
        return null;
    }
}
