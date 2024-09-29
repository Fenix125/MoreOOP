package lotr;
import java.util.Random;
public class GameManager {
    public void fight(Character c1, Character c2){
        Random ran = new Random();
        while (c1.getHp() > 0 && c2.getHp() > 0) {
            int turn = ran.nextInt(2);
            if (turn == 0){
                System.out.println(c1 + " attacks: " + c2);
                c1.kick(c2);
                System.out.println("     |: " + c2);
                
            }
            else{
                System.out.println(c2 + " attacks: " + c1);
                c2.kick(c1);
                System.out.println("     |: " + c1);

            }
        }
    }
}
