package Behavioral.State;

public class NormalAttack implements State {
    @Override
    public void attack(Superman superman) {
        if (superman.getEnergy() < 100 && superman.getMagic() < 100){
            System.out.println("普通攻击");

            superman.setEnergy(superman.getEnergy() + 30);
            superman.setMagic(superman.getMagic() +40);

            superman.setStop(true);
        }
    }
}
