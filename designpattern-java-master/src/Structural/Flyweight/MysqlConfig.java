package Structural.Flyweight;

public class MysqlConfig implements ConfigInterface {
    private String host;
    /**
     * 内部存储内蕴数据
     */
    private int port = 3306;
    private String username = "root";
    private String password = "123456";

    /**
     * 实现接口中的方法
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}