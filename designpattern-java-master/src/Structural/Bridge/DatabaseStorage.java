package Structural.Bridge;

public class DatabaseStorage extends AbstractStorage {

    public DatabaseStorage(ProtocolInterface protocal) {
        super(protocal);
    }

    @Override
    public void connectServer() {
        System.out.println("数据库存储");
        protocal.connect();
    }
}
