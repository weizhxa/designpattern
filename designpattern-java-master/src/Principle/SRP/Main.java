package Principle.SRP;

/**
 * Single Responsibility Principle
 * 单一职责原则
 */
public class Main {
    public static void main(String[] args) throws Exception {

        CreateData createData = new CreateData();
        createData.receiveData("abc", "123");
        createData.validate();
        createData.connection();
        createData.save();

        System.out.println("============");

        //职责拆分后,接收数据
        ReceiveData receiveData = new ReceiveData();
        String[] result = receiveData.receive("abc", "123");

        //校验数据
        ValidateData validateData = new ValidateData();
        validateData.validate(result);

        //链接数据库
        Connection connection = new Connection();
        connection.connect();

        //保存
        SaveData saveData = new SaveData();
        saveData.save(result);
    }
}
