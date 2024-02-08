package Generation1.Moves;

import Generation1.Type.Fire;

public class FireSpin extends Fire {
    public FireSpin(String skillName, String skillType, float skillPower, short skillPoints, String skillEffect) {
        super("Fire Spin", "Type", 35F, (short)15, "Traps opponent, damaging them for 4-5 turns.");
    }
}
