package Behavioral.Template;

public class Chinese extends Person {
    public Chinese(String name) {
        super(name);
    }

    @Override
    protected void born() {
        System.out.println(name + "出生在中国");
    }

    @Override
    protected void growUp() {
        System.out.println(name + " 吃面条米饭长大");
    }

    @Override
    protected void study() {
        System.out.println(name + " 通过高考进入大学学习了软件");
    }

    @Override
    protected void work() {
        System.out.println(name + " 在软件公司工作");
    }

    @Override
    protected void getMarried() {
        System.out.println(name + " 与中国人结婚");
    }

    @Override
    protected void havaChildren() {
        System.out.println(name + " 有孝顺了孩子");
    }

    @Override
    protected void beOld() {
        System.out.println(name + " 在家四世同堂");
    }

    @Override
    protected void die() {
        System.out.println(name + " 平凡了走完了一生");
    }
}
