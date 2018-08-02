package Structural.Composite;

public class TestCase implements Component {

    String name;

    public TestCase(String name) {
        this.name = name;
    }

    @Override
    public void runTestcase() {
        System.out.println("执行测试用例：" + name);
    }

    @Override
    public void add(Component component) {
        System.out.println("测试用例不支持添加子构件");
    }

    @Override
    public void remove(Component component) {
        System.out.println("测试用例不支持删除子构件");
    }

    @Override
    public Component getChild() {
        System.out.println("测试用例不支持获取子构件");
        return null;
    }
}
