package structural.decorator_pattern;




/**
 * 2、创建两个具体的奶茶类：巧克力奶茶，QQ奶茶
 * 继承奶茶接口，具体奶茶类：qq奶茶
 */
public class QQMT implements MilkTea{


    private String type = "QQ奶茶";

    @Override
    public String type() {
        //奶茶名称就是定义的属性：qq奶茶
        return type;
    }

    @Override
    public Double price() {
        //qq奶茶价格
        return 8.00;
    }
}
