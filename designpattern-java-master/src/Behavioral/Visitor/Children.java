package Behavioral.Visitor;

public interface Children {

    /**
     * 定义接待接口
     * @param visitor
     */
    public void accept(Visitor visitor);
}
