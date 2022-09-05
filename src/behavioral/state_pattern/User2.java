package behavioral.state_pattern;


/**
 * 不使用状态模式：
 * IUser 接口中的每个功能都需要判断用户是否为 vip会员，
 * 也就是说每个方法中都有 if (state == State.VIP) {} else {} 语句，
 * 如果状态不止两种，还需要用上 switch-case 语句来判断状态
 *
 * 缺点：
 * 判断用户状态会产生大量的分支判断语句，导致代码冗长；
 * 当状态有增加或减少时，需要改动多个地方，违反开闭原则。
 */
public class User2 implements IUser,ISwitchState{
    //默认用户为普通用户
    private State state = State.NORMAL;

    @Override
    public void openvip() {
        //如果用户开通了vip则切换成vip会员状态
        state = State.VIP;
        System.out.println("开通VIP成功!!!有效期：给你一首歌的时间");

    }

    @Override
    public void past() {
        //如果用户的vip到期了切换成普通用户状态
        state = State.NORMAL;
        System.out.println("一首歌听完了，你的vip会员已到期，欢迎下次开通...");

    }


    @Override
    public void songs() {
        //普通歌所有人都可以听
        System.out.println("开始播放歌曲..");
    }

    @Override
    public void jaychou_songs() {
        //判断用户状态是否可以听杰伦的歌


        if (state == State.VIP)
        {

            System.out.println("开始播放周杰伦的歌...");
        }
        System.out.println("想听杰伦的歌请开通vip！！！");

    }
}
