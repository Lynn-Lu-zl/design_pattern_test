package behavioral.Template_Pattern;

/**
 * 请假模板:
 *
 * 本人：___
 * 请假理由：___
 * 请假：___天
 * 望批准
 *
 * 所有的其他步骤（固定字符串）都是稳定的，
 * 只有姓名、请假原因、请假时长是抽象的，需要延迟到子类去实现
 */
abstract class LeaveRequest {
    abstract String name();
    abstract String reason();
    abstract String duration();

    void request(){
        System.out.print("本人：");
        System.out.print(name());
        System.out.println("\n");
        System.out.print("请假理由：");
        System.out.print(reason());
        System.out.println("\n");
        System.out.print("请假：");
        System.out.print(duration()+"天");
        System.out.println("\n");
        System.out.print("望批准");
    }
}
