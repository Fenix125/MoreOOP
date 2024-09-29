package lotr;

public class Hobbit extends Character{
    public Hobbit(){
        super(3, 0, new Hobbitkick());
    }
    @Override
    public String toString() {
        return "Hobbit{hp="+getHp()+", power="+getPower()+"}";
    }

}
