package behavioral.observer_pattern2;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * Java 源码中的观察者模式
 * Java 已经为我们提供了的 Observable 类和 Observer 类，
 * 我们在用到观察者模式时，无需自己创建这两个基类
 *
 *
 * 区别：为了让 Observable 的适用范围更广
 * 1、用于保存观察者列表的容器不是 ArrayList，而是 Vector
 *
 * 2、添加了一个 changed 字段，以及 setChanged 和 clearChanged 方法。分析可知，当 changed 字段为 true 时，才会通知所有观察者，否则不通知观察者。所以当我们使用此类时，想要触发 notifyObservers 方法，必须先调用 setChanged 方法。这个字段相当于在被观察者和观察者之间添加了一个可控制的阀门。
 *
 * 3、提供了 countObservers 方法，用于计算观察者数量
 *
 * 4、添加了一些 synchronized 关键字保证线程安全
 *
 */
public class Criminal extends Observable {

    private boolean changed = false;
    private Vector<Observer> obs;
    /**
     * 构造一个具有零个观察者的 Observable。
     */
    public Criminal() {
        obs = new Vector<>();
    }

    /**
     * 将一个观察者添加到该对象的观察者集合中，
     * 前提是它与集合中已经存在的某个观察者不同。
     * 通知将发送到多个的顺序
     *
     * @param o 要添加的观察者
     * @throws NullPointerException 如果参数 o 为空
     */
    //@Override
    public synchronized void addObserver(Observer o) {
        if (o == null)
            throw new NullPointerException();
        if (!obs.contains(o)) {
            obs.addElement(o);
        }
    }

    /**
     * 从该对象的观察者集中删除一个观察者
     *
     * @param o the observer to be deleted.
     */
    @Override
    public synchronized void deleteObserver(Observer o) {
        //super.deleteObserver(o);
        obs.removeElement(o);
    }

    /**
     * 如果这个对象发生了变化，如 hasChanged方法所指示的，
     * 则通知它的所有观察者
     * 然后调用clearChanged方法
     * 表明这个对象不再改变了
     * <p>
     * Each observer has its <code>update</code> method called with two
     * arguments: this observable object and <code>null</code>. In other
     * words, this method is equivalent to:
     * <blockquote><tt>
     * notifyObservers(null)</tt></blockquote>
     *
     * @see Observable#clearChanged()
     * @see Observable#hasChanged()
     * @see Observer#update(Observable, Object)
     */
    @Override
    public void notifyObservers() {
        //super.notifyObservers();
        notifyObservers(null);
    }

    /**
     * 如果这个对象发生了变化，如 hasChanged方法所指示的，
     * 则通知它的所有观察者
     * 然后调用clearChanged方法
     * 表明这个对象不再改变了
     * <p>
     * Each observer has its <code>update</code> method called with two
     * arguments: this observable object and the <code>arg</code> argument.
     *
     * @param arg any object.
     * @see Observable#clearChanged()
     * @see Observable#hasChanged()
     * @see Observer#update(Observable, Object)
     */
    @Override
    public void notifyObservers(Object arg) {
        //1、
        // Object[] arrLocal;
        // synchronized (this) {
        //     if (!hasChanged())
        //         return;
        //     arrLocal = obs.toArray();
        //     clearChanged();
        // }
        //
        // for (int i = arrLocal.length - 1; i >= 0; i--)
        //     //强转成Police对象类型的update方法
        //     ((Observer) arrLocal[i]).update(this, arg);

        //2、
        //super.notifyObservers(arg);



        //3、遍历观察者列表通知列表中的每一个观察者
        for (Observer observer : obs) {
            observer.update(this, arg);
        }
    }


    /**
     * 观察犯罪行为
     * @param event
     */
    public void crime(String event)
    {
        System.out.println("罪犯" + event);
        //当罪犯有犯罪行为时，所有的观察者都会收到通知。
        notifyObservers(event);
    }


    /**
     * 清除观察者列表，使该对象不再有任何观察者。
     */
    @Override
    public synchronized void deleteObservers() {
        //super.deleteObservers();
        obs.removeAllElements();
    }

    /**
     * 将此Observable对象标记为已更改；
     * hasChanged方法现在将返回 true
     */
    @Override
    protected synchronized void setChanged() {
        //super.setChanged();
        changed = true;
    }

    /**
     * 表示此对象不再更改，或者已经通知所有观察者其最近的更改，
     * 因此hasChanged方法现在将返回false.
     * 此方法由notifyObservers方法自动调用。
     *
     * @see Observable#notifyObservers()
     * @see Observable#notifyObservers(Object)
     */
    @Override
    protected synchronized void clearChanged() {
        //super.clearChanged();
        changed = false;
    }

    /**
     * 测试此对象是否已更改。
     * @see Observable#clearChanged()
     * @see Observable#setChanged()
     */
    @Override
    public synchronized boolean hasChanged() {
        //return super.hasChanged();
        //changed = false
        return changed;
    }

    /**
     * 返回此 Observable对象的观察者数量
     *
     * @return 该对象的观察者数量
     */
    @Override
    public synchronized int countObservers() {
        //return super.countObservers();
        return obs.size();
    }


}
