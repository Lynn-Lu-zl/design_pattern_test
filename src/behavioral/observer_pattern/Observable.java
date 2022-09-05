package behavioral.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者的父类，基类
 */
public class Observable {
    //创建一个观察者列表
    private List<Observer> observers = new ArrayList<>();

    //将 observer 对象添加到观察者列表中
    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }


    //将 observer 对象从观察者列表中移除
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    //通知所有观察者有事件发生，具体实现是调用所有观察者的 update 方法
    public void  notifyObservers(String event)
    {
        for (Observer observer1 : observers) {
            observer1.update(event);
        }
    }
}
