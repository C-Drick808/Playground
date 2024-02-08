package Generation1.Moves;

import Generation1.Type.Normal;

public class Barrage extends Normal {
    protected Barrage(String skillName, String skillType, float skillPower, short skillPoints, String skillEffect) {
        super("Barrage","Normal", 15F, (short) 20, "Hits 2-5 times in one turn.");
    }
}
