package Behavioral.Template;

public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    /**
     * 出生
     */
    protected abstract void born();

    /**
     * 成长
     */
    protected abstract void growUp();

    /**
     * 学习
     */
    protected abstract void study();

    /**
     * 工作
     */
    protected abstract void work();

    /**
     * 结婚
     */
    protected abstract void getMarried();

    /**
     * 生子
     */
    protected abstract void havaChildren();

    /**
     * 变老
     */
    protected abstract void beOld();

    /**
     * 死亡
     */
    protected abstract void die();

    public void life(){
        born();
        growUp();
        study();
        work();
        getMarried();
        havaChildren();
        beOld();
        die();
    }
}
