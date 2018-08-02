package Structural.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandle implements InvocationHandler{

    private Connect connect;

    public ProxyHandle(Connect connect) {
        this.connect = connect;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("使用美国服务器代理：");

        method.invoke(connect, args);
        return null;
    }

}