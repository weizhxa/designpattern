package Behavioral.Template;

public class American extends Person {

    public American(String name) {
        super(name);
    }

    @Override
    protected void born() {
        System.out.println(name + " 出生在美国");
    }

    @Override
    protected void growUp() {
        System.out.println(name + " 吃汉堡和牛排长大");
    }

    @Override
    protected void study() {
        System.out.println(name + " 开放式教育让我成长，大学学习了律师");
    }

    @Override
    protected void work() {
        System.out.println(name + " 在华尔街律师事务所工作");
    }

    @Override
    protected void getMarried() {
        System.out.println(name + " 在美国教堂举办了婚礼");
    }

    @Override
    protected void havaChildren() {
        System.out.println(name + " 有3个孩子");
    }

    @Override
    protected void beOld() {
        System.out.println(name + " 变老后独自生活");
    }

    @Override
    protected void die() {
        System.out.println(name + " 辞世，举行了西式葬礼");
    }


}
