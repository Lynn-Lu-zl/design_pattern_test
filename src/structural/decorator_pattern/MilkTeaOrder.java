package structural.decorator_pattern;

/**
 * 5、奶茶订单
 */
public class MilkTeaOrder {


     public static void main(String[] args) {
         //订单1：一杯巧克力奶茶+布丁+珍珠

         //制作巧克力奶茶
         MilkTea chocolateMT = new ChocolateMT();

         //+布丁
         chocolateMT = new Pudding(chocolateMT);

         //+珍珠
         chocolateMT = new Pearl(chocolateMT);

         System.out.println("订单1小票：");
         System.out.println("点餐：" + chocolateMT.type() );
         System.out.println("合计："+ chocolateMT.price() );
         System.out.println("-----------------------------");

         //订单2：一杯QQ奶茶+珍珠

         //制作qq奶茶
         MilkTea qqmt = new QQMT();

         //+珍珠
         qqmt = new Pearl(qqmt);

         System.out.println("订单2小票：");
         System.out.println("点餐：" + qqmt.type());
         System.out.println("合计：" + qqmt.price());



     }
}
