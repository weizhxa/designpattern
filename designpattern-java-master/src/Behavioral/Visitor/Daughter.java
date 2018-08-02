package Behavioral.Visitor;

public class Daughter implements Children {

    /**
     * 女儿允许被访问
     * @param visitor
     */
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void sing(){
        System.out.println("我是女儿，我喜欢唱歌");
    }
}
