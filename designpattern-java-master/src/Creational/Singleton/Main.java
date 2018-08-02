package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        connection.name();

        Connection connection1 = Connection.getInstance();
        connection1.name();

        if (connection == connection1){
            System.out.println("两个实例完全相等");
        }else
        {
            System.out.println("两个实例不相等");
        }
    }
}
