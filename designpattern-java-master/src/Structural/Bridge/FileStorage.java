package Structural.Bridge;

public class FileStorage extends AbstractStorage {

    public FileStorage(ProtocolInterface protocal) {
        super(protocal);
    }

    @Override
    public void connectServer() {
        System.out.println("文件存储");
        protocal.connect();
    }
}
