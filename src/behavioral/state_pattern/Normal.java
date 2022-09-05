package behavioral.state_pattern;

public class Normal implements IUser{



    @Override
    public void songs() {
        System.out.println("开始播放歌曲...");
    }

    @Override
    public void jaychou_songs() {
        System.out.println("想听杰伦的歌请开通vip！！！");
    }
}
