package Behavioral.Visitor;

import java.util.ArrayList;

public class ObjectStructure {
    ArrayList<Children> childrenArrayList = new ArrayList<>();

    /**
     * 容器中的对象遍历被访问
     */
    public void takeCare(Visitor visitor){
        for (Children child : childrenArrayList){
            child.accept(visitor);
        }
    }

    /**
     * 容器中添加被访问者
     * @param children
     */
    public void add(Children children){
        childrenArrayList.add(children);
    }
}
