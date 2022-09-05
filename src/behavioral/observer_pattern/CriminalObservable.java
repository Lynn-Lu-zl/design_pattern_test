package behavioral.observer_pattern;

/**
 * 实现观察者接口和继承被观察者基类，定义出具体的罪犯与警察类
 * 警察属于观察者，实现了观察者接口
 * 罪犯属于被观察者，继承继承被观察者基类,当罪犯有犯罪行为时，所有的观察者都会收到通知。
 *
 *
 */
public class CriminalObservable extends Observable{

    public void crime(String event)
    {
        System.out.println("罪犯" + event);
        //当罪犯有犯罪行为时，所有的观察者都会收到通知。
        notifyObservers(event);
    }

}
