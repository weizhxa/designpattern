package Behavioral.State;

public class MagicAttack implements State {
    @Override
    public void attack(Superman superman) {
        if (superman.getMagic() >= 100 && superman.getEnergy() <= 100){
            System.out.println("魔法攻击");
            superman.setMagic(0);
            superman.setStop(true);
        }
    }
}
