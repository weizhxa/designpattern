package Structural.Flyweight;

import java.util.HashMap;

public class MysqlFlyweightFactory {

    /**
     * 定义静态map
     */
    private static HashMap<String, MysqlConfig> pool  = new HashMap<>();

    /**
     * 静态方法工厂
     * @param host
     * @return
     */
    public static MysqlConfig getMysqlConfig(String host){
        MysqlConfig mysqlConfig = pool.get(host);

        if (mysqlConfig == null){
            //实例化享元类，并设定外蕴参数
            mysqlConfig = new MysqlConfig();
            mysqlConfig.setHost(host);

            //对象池中添加
            pool.put(host, mysqlConfig);
        }

        return mysqlConfig;
    }
}
