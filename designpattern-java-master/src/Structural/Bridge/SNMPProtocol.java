package Structural.Bridge;

public class SNMPProtocol implements ProtocolInterface {
    @Override
    public void connect() {
        System.out.println("链接协议：SNMP");
    }
}
