package Structural.Proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        //不使用代理
        Connect tcp = new Tcp();
        tcp.request();
        tcp.sendData();
        tcp.close();


        System.out.println("-------静态代理---------");
                //使用静态代理
                Connect tcp1 = new Tcp();
                Connect tpcProxy = new TcpProxy(tcp1);

                tpcProxy.request();
                tpcProxy.sendData();
                tpcProxy.close();

                System.out.println("------动态代理----------");
                //使用动态代理
                Connect tcp2 = new Tcp();

                ProxyHandle proxyHandle = new ProxyHandle(tcp2);

                Connect proxyObject =(Connect) Proxy.newProxyInstance(tcp2.getClass().getClassLoader(),
                tcp2.getClass().getInterfaces(),
                proxyHandle
                );

                proxyObject.request();

    }
}