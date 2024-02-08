package Generation1.Moves;

import Generation1.Type.Fire;

public class FirePunch extends Fire {

    public FirePunch(String skillName, String skillType, float skillPower, short skillPoints, String skillEffect) {
        super("Fire Punch", "Fire", 75F, (short)5, "May burn opponent.");
    }
}
