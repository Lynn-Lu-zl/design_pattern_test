package behavioral.observer_pattern;


/**
 * 实现观察者接口和继承被观察者基类，定义出具体的罪犯与警察类
 * 警察属于观察者，实现了观察者接口
 * 罪犯属于被观察者，继承继承被观察者基类
 *
 *
 */
public class PoliceObserver implements Observer{

    //private String policeObserver;

    //用于对被观察者发出的事件做出响应，当警察收到事件后，做出响应，这里的响应就是简单的打印了一条日志
    @Override
    public void update(String event) {
        System.out.println("警察收到消息，罪犯" + event);

    }
}
