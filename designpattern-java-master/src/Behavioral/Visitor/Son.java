package Behavioral.Visitor;

public class Son implements Children {

    /**
     * son允许被visitor访问
     * @param visitor
     */
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void sport(){
        System.out.println("我是儿子，我喜欢运动");
    }
}
