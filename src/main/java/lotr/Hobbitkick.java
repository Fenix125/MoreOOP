package lotr;

public class Hobbitkick implements KickStrategy{
    @Override
    public void kick(Character attacker, Character defender) {
        toCry();
    }
    public void toCry(){
        System.out.println("😭");
    }
}
