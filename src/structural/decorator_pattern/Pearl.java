package structural.decorator_pattern;

/**4、创建具体装饰类即加料类
 *
 *
 * 加料类继承奶茶装饰类
 *
 * 具体装饰类：给奶茶的料，加入珍珠
 */
public class Pearl extends Decorator{
    //加的料名
    private String pearl = "+珍珠";
    //珍珠的价格
    private Double pearlprice = 3.00;
    //珍珠加在哪种奶茶里
    private MilkTea milkTea = null;


    //有参构造器，将订单制作的奶茶参数赋值传递给该类定义的属性milkTea，它是MilkTea类可以调用MilkTea类的属性从而达到描述叠加、价钱叠加
    public Pearl(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String type() {
        //奶茶描述叠加
        return milkTea.type() + pearl;
    }

    @Override
    public Double price() {

        //奶茶价钱叠加
        return milkTea.price() + pearlprice;
    }
}
