package behavioral.Template_Pattern;

public class MyLeaveRequest extends LeaveRequest{
    //请假人
    @Override
    String name() {
        return "张三";
    }

    //请假理由
    @Override
    String reason() {
        return "世界这么大，我想去看看";
    }


    //时长
    @Override
    String duration() {
        return "1";
    }
}
