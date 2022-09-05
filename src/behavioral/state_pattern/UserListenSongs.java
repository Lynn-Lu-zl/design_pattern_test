package behavioral.state_pattern;

public class UserListenSongs {
     public static void main(String[] args) {
         //创建一个用户，打开音乐软件，刚注册，默认为普通用户
         User user = new User();

         //点一首普通歌
         user.songs();
         System.out.println("-------------");

         //再来一首杰伦的歌
         user.jaychou_songs();
         System.out.println("-------------");

         //为了杰伦开个vip吧
         user.openvip();

         System.out.println("-------------");

         //赶紧听歌
         user.jaychou_songs();

         System.out.println("-------------");

         //过期了
         user.past();
         System.out.println("-------------");

         //意犹未尽，再听一遍，发现会员过期了
         user.jaychou_songs();
     }
}
