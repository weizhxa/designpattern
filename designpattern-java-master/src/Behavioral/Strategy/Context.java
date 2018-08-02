package Behavioral.Strategy;

public class Context {
    /**
     * 策略引用
     */
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void save(){
        strategy.save();
    }
}
