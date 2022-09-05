package behavioral.observer_pattern2;

import java.util.Observable;
import java.util.Observer;

/**
 * Java 源码中的观察者模式
 * Java 已经为我们提供了的 Observable 类和 Observer 类，
 * 我们在用到观察者模式时，无需自己创建这两个基类
 */
public class Police implements Observer {
    /**
     *
     *update 方法用于响应 Observable 的事件
     * 每当观察到的对象发生变化时，都会调用他的方法
     *
     * 区别：为了保证此 Observer 的适用范围更广
     * @param o   将 Observable 对象也提供给了 Observer
     * @param arg 参数类型变成了 Object
     *
     */

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("警察收到消息，"+ o +  arg);
    }
}
