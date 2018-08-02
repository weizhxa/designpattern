package Behavioral.State;

public class KillAttack implements State {
    public void attack(Superman superman) {
        if (superman.getMagic() > 100 && superman.getEnergy() > 100){
            System.out.println("必杀暴击");
            superman.setMagic(0);
            superman.setEnergy(0);

            superman.setStop(true);
        }
    }
}