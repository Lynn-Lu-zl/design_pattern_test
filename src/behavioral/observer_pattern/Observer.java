package behavioral.observer_pattern;

/**
 * 观察者接口，基类
 * update 方法：用于对被观察者发出的事件做出响应
 */
public interface Observer {
    // String observer = null;

    void update(String event);

    //void update(String observer,String event);
}
