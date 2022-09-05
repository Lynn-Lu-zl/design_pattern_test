package behavioral.state_pattern;

public interface ISwitchState {
    //开通vip，状态变成vip会员
    void openvip();
    //会员过期，用户状态变为普通用户状态
    void past();
}
