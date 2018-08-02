package Behavioral.Observer;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {

    public void update(Observable o, Object arg) {
        Content content = (Content) arg;
        System.out.println("客户端接收到信息:" + content.getContent());
    }
}
