package Behavioral.Command;

public class Main {
    public static void main(String[] args) {

        SpaceShip spaceShip = new SpaceShip();

        //攻击
        spaceShip.setSafety(true);
        spaceShip.setVerification(true);
        spaceShip.attack();
        spaceShip.attackEnd();

        //防御
        spaceShip.setEnergy(1400);
        spaceShip.defend();
        spaceShip.defendEnd();


        System.out.println("---------------");

        //使用命令攻击与防御
        Command attackCommand = new AttackCommand(spaceShip);
        Command defendCommand = new DefendCommand(spaceShip);

        attackCommand.execute();
        defendCommand.execute();


        System.out.println("-----------");


        //使用调用者invoker执行命令
        Invoker invoker = new Invoker(attackCommand, defendCommand);
        invoker.execute();


        System.out.println("-----------");

        //优化invoker
        invoker.addCommand(attackCommand);
        invoker.executeAll();

        System.out.println("-----");

        invoker.addCommand(defendCommand);
        invoker.executeAll();

        System.out.println("-----");

        invoker.removeCommand(attackCommand);
        invoker.removeCommand(defendCommand);
        invoker.executeAll();

    }
}
