package Structural.Facade;

public class Main {
    public static void main(String[] args) {
        //直接使用VNNOX
        Vnnox vnnox = new Vnnox();

        //注册用户
        String username = vnnox.register("vnnox");

        //登录
        vnnox.login(username);

        //创建播放器
        String player = vnnox.createPlayer("player_1");

        //终端绑定
        vnnox.bindPlayer("player_1");

        //上传媒体
        vnnox.uploadMedia("十九大会议视频.mov");

        //制作清单
        String playlist = vnnox.createPlaylist("十九大宣传清单");

        //制作排期
        String plan = vnnox.createPlan("全国第十九次人民代表大会");

        //发布节目
        vnnox.sendPlan(plan, player);


        //使用facade定义的接口处理发布节目
        System.out.println("====================");

        Vnnox vnnox1 = new Vnnox();
        VnnoxFacade vnnoxFacade = new VnnoxFacade(vnnox1);
        vnnoxFacade.useVnnox("customer", "player_1", "media_1", "playlist_1", "plan_1");
    }
}
