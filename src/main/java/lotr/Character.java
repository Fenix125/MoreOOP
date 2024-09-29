package lotr;

import lombok.Getter;

@Getter
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;
    public Character(int hp, int power, KickStrategy kickStrat){
        this.hp = hp;
        this.power = power;
        this.kickStrategy = kickStrat;
    }
    public void kick(Character c){
        kickStrategy.kick(this, c);
    }
    public boolean isAlive(){
        return hp > 0;
    }
    public void setHp(int hp){
        if (hp >= 0){
            this.hp = hp;
        }
        else{
            this.hp = 0;
        }
    }
    public void setPower(int power){
        if (power >= 0){
            this.power = power;
        }
        else{
            this.power = 0;
        }
    }
}
