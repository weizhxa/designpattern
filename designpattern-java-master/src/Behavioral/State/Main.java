package Behavioral.State;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();

        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();
        hero.attack();

        //模拟吃药瓶
        hero.setMagic(100);

        hero.attack();

        System.out.println("-------使用状态模式----------");

        //实例化状态
        EnergyAttack energyAttack = new EnergyAttack();
        MagicAttack magicAttack = new MagicAttack();
        NormalAttack normalAttack = new NormalAttack();
        KillAttack killAttack = new KillAttack();

        //添加不同状态
        Superman superman = new Superman();
        superman.addState(energyAttack);
        superman.addState(magicAttack);
        superman.addState(normalAttack);
        superman.addState(killAttack);

        //根据状态的变化实现不同的攻击类型
        superman.attack();
        superman.attack();
        superman.attack();
        superman.attack();
        superman.attack();
        superman.attack();
        superman.attack();
        superman.attack();
        superman.attack();

        //模拟吃药瓶
        superman.setEnergy(1000);
        superman.setMagic(1000);
        superman.attack();
    }
}