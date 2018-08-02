package Structural.Composite;

public interface Component {

    /**
     * 业务接口
     * 执行测试用例
     */
    public void runTestcase();

    /**
     * 增加构件
     * @param component
     */
    public void add(Component component);

    /**
     * 移除构件
     * @param component
     */
    public void remove(Component component);

    /**
     * 获取构件
     * @param i
     * @return
     */
    public Component getChild();
}
