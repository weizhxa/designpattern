package Behavioral.Command;

public class AttackCommand implements Command{

    SpaceShip spaceShip;

    public AttackCommand(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
    }

    /**
     *  攻击命令
     */
    public void execute() {
        spaceShip.setVerification(true);
        spaceShip.setSafety(true);
        spaceShip.attack();
        spaceShip.attackEnd();
    }
}
