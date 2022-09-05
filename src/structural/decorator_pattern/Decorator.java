package structural.decorator_pattern;

/**
 * 3、创建实现奶茶种类接口的装饰类
 *
 * 创建奶茶种类的装饰类Decorator，让加料类继承装饰类
 */
public class Decorator implements MilkTea{

    private String type = "我只是装饰器，不知道是哪种奶茶";
    @Override
    public String type() {
        return null;
    }

    @Override
    public Double price() {
        //价格由种类来决定
        return 0.00;
    }
}
