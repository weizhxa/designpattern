package Structural.Proxy;

public class TcpProxy implements Connect {

    private Connect tcp;

    public TcpProxy(Connect tcp) {
        this.tcp = tcp;
    }

    @Override
    public void request() {
        System.out.println("使用美国服务器做代理：");
        tcp.request();
    }

    @Override
    public void sendData() {
        System.out.println("使用美国服务器做代理：");
        tcp.sendData();
    }

    @Override
    public void close() {
        System.out.println("使用美国服务器做代理：");
        tcp.close();
    }
}
