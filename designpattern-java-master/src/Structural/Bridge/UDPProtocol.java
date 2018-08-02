package Structural.Bridge;

public class UDPProtocol implements ProtocolInterface {
    @Override
    public void connect() {
        System.out.println("链接协议：UDP");
    }
}
