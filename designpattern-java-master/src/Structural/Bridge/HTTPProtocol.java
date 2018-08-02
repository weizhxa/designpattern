package Structural.Bridge;

public class HTTPProtocol implements ProtocolInterface {
    @Override
    public void connect() {
        System.out.println("链接协议：http");
    }
}
