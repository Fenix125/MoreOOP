package lotr;

public class Hobbit extends Character{
    public Hobbit(){
        super(3, 0);
    }
    @Override
    public void kick(Character c) {
        toCry();
    }
    public void toCry(){
        System.out.println("😭");
    }
    @Override
    public String toString() {
        return "Hobbit{hp="+getHp()+", power="+getPower()+"}";
    }

}
