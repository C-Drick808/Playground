package Generation1.Moves;

import Generation1.Type.Normal;

public class Harden extends Normal {

    public Harden(String skillName, String skillType, float skillPower, short skillPoints, String skillEffect) {
        super("Harden", "Type", 0F, (short)30, "Raises user's Defense.");
    }
}
