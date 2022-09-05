package behavioral.state_pattern;

public class User implements IUser,ISwitchState{
    //默认用户为普通用户
    private IUser state  = new Normal();

    @Override
    public void openvip() {
        //如果用户开通了vip则切换成vip会员状态
        state = new VIP();
        System.out.println("开通VIP成功!!!有效期：给你一首歌的时间");


    }

    @Override
    public void past() {
        //如果用户的vip到期了切换成普通用户状态
        state = new Normal();
        System.out.println("一首歌听完了，你的vip会员已到期，欢迎下次开通...");

    }


    @Override
    public void songs() {
        //普通歌所有人都可以听
        state.songs();
    }

    @Override
    public void jaychou_songs() {
        //判断用户状态是否可以听杰伦的歌
        state.jaychou_songs();


    }
}
