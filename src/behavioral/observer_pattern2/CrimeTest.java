package behavioral.observer_pattern2;

public class CrimeTest {
     public static void main(String[] args) {
         //创建一个法外狂徒张三对象
         Criminal zhangsan = new Criminal();

         //创建3个警察观察张三的犯罪行为
         Police police1 = new Police();
         Police police2 = new Police();
         Police police3 = new Police();

         //将3个警察添加到观察张三犯罪的观察列表
         zhangsan.addObserver(police1);
         zhangsan.addObserver(police2);
         zhangsan.addObserver(police3);

         //张三开始犯罪，警察收到消息
         zhangsan.crime("正在越狱...");


     }
}
