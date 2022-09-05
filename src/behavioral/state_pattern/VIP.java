package behavioral.state_pattern;

public class VIP implements IUser{


    @Override
    public void songs() {
        System.out.println("开始播放普通歌曲....");
    }

    @Override
    public void jaychou_songs() {
        System.out.println("开始播放周杰伦的歌...");
    }
}
