package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        AbstractStorage databaseStorage = new DatabaseStorage(new HTTPProtocol());
        databaseStorage.connectServer();

        System.out.println("------------");

        AbstractStorage dataStorage2 = new DatabaseStorage(new TcpProtocol());
        dataStorage2.connectServer();

        System.out.println("------------");

        AbstractStorage fileStorage = new FileStorage(new SNMPProtocol());
        fileStorage.connectServer();

        System.out.println("------------");

        AbstractStorage fileStorage1 = new FileStorage(new UDPProtocol());
        fileStorage1.connectServer();
    }
}