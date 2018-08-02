package Creational.Singleton;

public class Connection {

    /**
     * 私有化构造方法
     */
    private Connection(){}

    public void name(){
        System.out.println("我的功能是链接，我的模式是单例");
    }

//    /**
//     * 错误示例
//     * @return
//     */
//    public static Connection getInstance(){
//        return new Connection();
//    }



//
//    private static final Connection connection = new Connection();
//    /**
//     * 饿汉式
//     * 在类的加载时即实例化了本对象
//     * @return
//     */
//    public static Connection getInstance(){
//        return connection;
//    }

    /**
     * 懒汉模式
     * 多线程时不能保证单例
     */
    private static Connection connection;

//    public static Connection getInstance(){
//        if (connection == null){
//            connection = new Connection();
//        }
//        return connection;
//    }

    /**
     * 懒汉模式
     * 线程安全，但是会降低效能
     * 只对new  进行同步
     * @return
     */
//    public static synchronized Connection getInstance(){
//        if (connection == null){
//            connection = new Connection();
//        }
//        return connection;
//    }

    /**
     * 不需要锁定整个方法
     * 只需要同步new()
     */
    public static Connection getInstance(){
        if (connection == null){
            synchronized (Connection.class){
                if (connection == null){//双重判断
                    connection = new Connection();
                }
            }
        }
        return connection;
    }




}
