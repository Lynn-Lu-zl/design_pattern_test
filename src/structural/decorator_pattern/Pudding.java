package structural.decorator_pattern;

/**
 * 4、创建具体装饰类即加料类
 *
 * 加料类继承装饰类
 * 具体装饰类：给奶茶的料，加入布丁
 */
public class Pudding  extends Decorator{
    //加的料名
    private String pudding = "+布丁";
    //布丁的价格
    private Double puddingprice = 4.00;
    //布丁加在哪种奶茶里
    private MilkTea milkTea = null;


    //有参构造器，将订单制作的奶茶参数赋值传递给该类定义的属性milkTea，它是MilkTea类可以调用MilkTea类的属性从而达到描述叠加、价钱叠加
    public Pudding(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String type() {
        //奶茶描述叠加
        return milkTea.type() + pudding;
    }

    @Override
    public Double price() {
        //价钱叠加
        return milkTea.price() + puddingprice;
    }
}
