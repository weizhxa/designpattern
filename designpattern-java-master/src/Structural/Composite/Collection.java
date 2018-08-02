package Structural.Composite;

import java.util.ArrayList;

public class Collection implements Component {

    String name;

    /**
     * 定义容器构件中的容器
     */
    ArrayList <Component> list = new ArrayList<>();

    public Collection(String name) {

        this.name = name;
    }

    @Override
    public void runTestcase() {

        System.out.println("执行集合：" + name);

        for (Object object : list){
            ((Component) object).runTestcase();
        }
    }

    @Override
    public void add(Component component) {

        list.add(component);
    }

    @Override
    public void remove(Component component) {

        list.remove(component);
    }

    @Override
    public Component getChild() {
        return (Component)list;
    }
}