package Behavioral.State;

public class EnergyAttack implements State {
    @Override
    public void attack(Superman superman) {
        if (superman.getMagic() <100 && superman.getEnergy() >= 100){
            System.out.println("物理暴击");
            superman.setEnergy(0);
            superman.setStop(true);
        }
    }
}
