package lotr;
import java.util.Random;


public class CharacterFactory {
    private static Class<?>[] charClasses = {Hobbit.class, Elf.class, King.class, Knight.class};
    public Character createCharacter(){
        Random ran = new Random();
        int randNum = ran.nextInt(charClasses.length);
        try{
            return (Character) charClasses[randNum].getDeclaredConstructor().newInstance();
        } catch (Exception e){
            return null;
        }
    }
}
