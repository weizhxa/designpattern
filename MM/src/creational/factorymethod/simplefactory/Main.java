package creational.factorymethod.simplefactory;

public class Main {
    //如果是简单工厂的话，需要添加一个N次方运算的方法之外，还需要修改工厂方法，添加case语句。
    public static void main(String[] args) {
        OperatorFactory operatorFactory = new OperatorFactory();
        Operator operatorAdd = operatorFactory.generateOperator("+");
        operatorAdd.operate(1,2);

        Operator operatorSub = operatorFactory.generateOperator("-");
        operatorSub.operate(1,2);

        //添加一个m的n次方的操作
        Operator operatorPow = operatorFactory.generateOperator("^");
        operatorPow.operate(2,3);
    }
}
