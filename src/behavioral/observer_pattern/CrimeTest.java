package behavioral.observer_pattern;

/**
 * 罪犯犯罪测试，看警察能不能收到通知
 */
public class CrimeTest {

     public static void main(String[] args) {
         //创建一个法外狂徒张三对象
         CriminalObservable zhangsan = new CriminalObservable();

         //创建3个警察观察张三的犯罪行为
         PoliceObserver policeObserver1 = new PoliceObserver();
         PoliceObserver policeObserver2 = new PoliceObserver();
         PoliceObserver policeObserver3 = new PoliceObserver();

         //将3个警察添加到观察张三犯罪的观察列表
         zhangsan.addObserver(policeObserver1);
         zhangsan.addObserver(policeObserver2);
         zhangsan.addObserver(policeObserver3);

         //张三开始犯罪，警察收到消息
         zhangsan.crime("正在越狱...");

     }
}
