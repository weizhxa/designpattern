package Behavioral.Command;

public class DefendCommand implements Command {

    SpaceShip spaceShip;

    public DefendCommand(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
    }

    /**
     * 防御
     */
    public void execute() {
        spaceShip.setEnergy(100);
        spaceShip.defend();
        spaceShip.defendEnd();
    }
}
