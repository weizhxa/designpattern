package Creational.Prototype;

public class Mongo implements Cloneable{
    private Config config;

    public Mongo(Config config) {
        this.config = config;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public Mongo clone(){
        Mongo mongo = null;

        try {

            mongo = (Mongo) super.clone();

            //获取引用中原来的值
            String hostClone = config.getHost();
            int port = config.getPort();

            try {
                //实例化
                Config configClone = mongo.getConfig().getClass().newInstance();
                //引用对象内部赋值
                configClone.setHost(hostClone);
                configClone.setPort(port);
                //原型赋值
                mongo.config = configClone;

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return mongo;
    }
}
