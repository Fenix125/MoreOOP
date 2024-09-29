package lotr;

public class Elfkick implements KickStrategy{
    @Override
    public void kick(Character attacker, Character defender) {
        if (defender.getPower() < attacker.getPower()){
            defender.setHp(0);
        }
        else{
            attacker.setPower(attacker.getPower() - 1);
        }
    }
}
