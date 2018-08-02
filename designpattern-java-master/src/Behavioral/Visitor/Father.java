package Behavioral.Visitor;

public class Father implements Visitor {


    public void visit(Son son) {
        son.sport();
        System.out.println("我是爸爸，我喜欢陪孩子一起运动");
    }

    public void visit(Daughter daughter) {
        daughter.sing();
        System.out.println("我是爸爸，我喜欢听女儿唱歌");
    }
}
