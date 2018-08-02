package Behavioral.Observer;

import java.util.ArrayList;

public class Observable {

    /**
     * 定义观察者容器
     */
    ArrayList<Observer> observerArrayList = new ArrayList<>();

    /**
     * 定义变化状态锁
     */
    Boolean changeStatus = false;

    /**
     * 添加观察者
     * @param observer
     */
    public void addObserver(Observer observer){
        observerArrayList.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void removeObserver(Observer observer){
        observerArrayList.remove(observer);
    }

    /**
     * 获取观察者数量
     * @return
     */
    public int getObserverNum(){
        return observerArrayList.size();
    }

    /**
     * 打开变化状态锁
     */
    public void setChanged(){
        this.changeStatus = true;
    }

    /**
     * 通知所有观察者
     */
    public void notifyAll(String msg){
        if (changeStatus == true)
        {
            for (Observer observer : observerArrayList){
                observer.update(msg);
            }
        }
        //还原锁
        this.changeStatus = false;
    }
}
