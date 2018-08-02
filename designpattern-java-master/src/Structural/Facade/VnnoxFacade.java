package Structural.Facade;

public class VnnoxFacade {
    /**
     * 定义引用
     */
    private Vnnox vnnox;

    public VnnoxFacade(Vnnox vnnox) {
        this.vnnox = vnnox;
    }

    public void useVnnox(String usename, String playerName, String mediaName, String playlistName, String planName){
        /**
         * 注册
         */
        String newUsename = vnnox.register(usename);

        /**
         * 登录
         */
        vnnox.login(newUsename);

        /**
         * 创建播放器
         */
        String newPlayer = vnnox.createPlayer(playerName);

        /**
         * 绑定播放器
         */
        vnnox.bindPlayer(newPlayer);

        /**
         * 上传媒体
         */
        vnnox.uploadMedia(mediaName);

        /**
         * 制作清单
         */
        vnnox.createPlaylist(playlistName);

        /**
         * 制作排期
         */
        String newPlan = vnnox.createPlan(planName);

        /**
         * 发布节目
         */
        vnnox.sendPlan(newPlan, newPlayer);
    }
}
