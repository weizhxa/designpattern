package Structural.Proxy;

public class Tcp implements Connect {
    @Override
    public void request() {
        System.out.println("发送链接请求");
    }

    @Override
    public void sendData() {
        System.out.println("发送数据");
    }

    @Override
    public void close() {
        System.out.println("关闭链接");
    }
}
