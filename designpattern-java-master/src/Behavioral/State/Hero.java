package Behavioral.State;

public class Hero {
    /**
     * 魔法值
     */
    private int magic = 0;

    /**
     * 能量值
     */
    private int energy = 0;

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * 攻击
     */
    public void attack(){
        if (magic < 100 && energy < 100){

            System.out.println("普通攻击");
            this.magic += 30;
            this.energy += 50;

        }else if (magic >= 100 && energy < 100){

            System.out.println("魔法暴击");
            this.magic = 0;

        }else if (magic <100 && energy >= 100){

            System.out.println("物理暴击");
            this.energy = 0;

        }else if (magic >= 100 && energy >= 100){

            System.out.println("必杀暴击");
            this.energy = 0;
            this.magic = 0;

        }
    }
}
