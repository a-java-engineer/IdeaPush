package observer;

import java.util.ArrayList;

//抽象主题
public interface Subject {
    //把所有观察者对象保存到一个集合里
     ArrayList<Observer> observers=new ArrayList<>();

     //定义添加和删除观察者的方法

    //添加观察者
    public void addObserver(Observer observer);


    //删除观察者
    public void deleObserver(Observer observer);
    //在具体主题的状态发生变化时,给所有注册过的观察者发送通知
    public void notifyObservers();

}

