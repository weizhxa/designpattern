package Behavioral.Command;

public class SpaceShip {

    /**
     * 武器保险
     */
    Boolean safety = false;

    /**
     * 安全认证
     */
    Boolean verification = false;

    public void setSafety(Boolean safety) {
        this.safety = safety;
    }

    public void setVerification(Boolean verification) {
        this.verification = verification;
    }

    /**
     * 攻击
     */
    public void attack(){
        if (safety == true && verification == true){
            System.out.println("开始攻击");
        }
        else
        {
            System.out.println("武器保险未打开或武器未授权");
        }
    }

    /**
     * 攻击结束，状态恢复
     */
    public void attackEnd(){
        this.safety = false;
        this.verification = false;
        System.out.println("结束攻击，系统恢复");
    }

    /**
     * 能量值
     */
    int energy = 0;

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     *
     */
    public void defend(){
        if (energy >= 100){
            System.out.println("开启防御,防御强度:" + energy);
        }
        else{
            System.out.println("能量不足");
        }
    }

    public void defendEnd(){
        this.energy = 0;
        System.out.println("结束防御，系统恢复");
    }
}
