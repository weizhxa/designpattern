package Structural.Bridge;

public class TcpProtocol implements ProtocolInterface {
    @Override
    public void connect() {
        System.out.println("链接协议：TCP");
    }
}
