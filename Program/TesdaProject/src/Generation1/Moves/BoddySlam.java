package Generation1.Moves;

import Generation1.Type.Normal;

public class BoddySlam extends Normal {
    public BoddySlam(String skillName, String skillType, float skillPower, short skillPoints, String skillEffect) {
        super("Body Slam", "Normal", 85F, (short) 15, "May paralyze opponent.");
    }
}
