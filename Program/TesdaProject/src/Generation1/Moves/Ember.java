package Generation1.Moves;

import Generation1.Type.Fire;

public class Ember extends Fire {
    public Ember(String skillName, String skillType, float skillPower, short skillPoints, String skillEffect) {
        super("Ember", "Fire", 40F, (short)25, "May burn opponent.");
    }
}
