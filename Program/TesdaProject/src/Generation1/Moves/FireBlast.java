package Generation1.Moves;

import Generation1.Type.Fire;

public class FireBlast extends Fire {
    public FireBlast(String skillName, String skillType, float skillPower, short skillPoints, String skillEffect) {
        super("FireBlast", "Fire",110F, (short)5, "May burn opponent.");
    }
}
