package lotr;

import java.util.Random;

public class NobleKick implements KickStrategy{
    @Override
    public void kick(Character attacker, Character defender) {
        defender.setHp(defender.getHp() - new Random().nextInt(attacker.getPower()));
    }
}
