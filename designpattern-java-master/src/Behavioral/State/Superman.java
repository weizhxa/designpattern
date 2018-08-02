package Behavioral.State;

import java.util.ArrayList;

public class Superman {
    private int magic = 0;
    private int energy = 0;

    /**
     * state array list
     */
    ArrayList<State> stateList = new ArrayList<>();

    Boolean stop = false;


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

    public Boolean getStop() {
        return stop;
    }

    public void setStop(Boolean stop) {
        this.stop = stop;
    }

    public void addState(State state)
    {
        stateList.add(state);
    }

    /**
     * 超人攻击
     */
    public void attack(){
        for (State state : stateList){
            state.attack(this);

            //实现if else 中的终止，防止重复的遍历
            if (stop == true){
                break;
            }
        }

        //恢复遍历功能
        this.stop = false;
    }
}
