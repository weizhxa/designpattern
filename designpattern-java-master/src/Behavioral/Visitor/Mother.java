package Behavioral.Visitor;

public class Mother implements Visitor {

    public void visit(Son son) {
        son.sport();
        System.out.println("我是妈妈，我鼓励儿子坚持运动");
    }


    public void visit(Daughter daughter) {
        daughter.sing();
        System.out.println("我是妈妈，我弹钢琴为女儿唱歌伴奏");
    }
}
