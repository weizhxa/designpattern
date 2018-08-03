package creational.factorymethod.simplefactory;

public class OperatorFactory {
    public Operator generateOperator(String operatorStr) {
        Operator operator = null;
        switch (operatorStr) {
            case "+":
                operator = new AddOperator();
                break;
            case "-":
                operator = new SubOperator();
                break;
                //在工厂方法中添加此方法
            case "^":
                operator = new PowOperator();
                break;
        }
        return operator;
    }
}
