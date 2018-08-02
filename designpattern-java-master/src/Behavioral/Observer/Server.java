package Behavioral.Observer;

import java.util.Observable;

public class Server extends Observable {

    private Content content;

    public void setContent(Content content) {
        this.content = content;
        System.out.println("服务器发出信息:" + content.getContent());

        this.setChanged();
        this.notifyObservers(content);
    }
}
