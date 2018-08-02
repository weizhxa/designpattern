package Structural.Facade;

public class Vnnox {

    private int index = 0;

    /**
     * 注册用户
     * @param username
     * @return
     */
    public String register(String username){
        System.out.println(this.addIndex() + " 注册成功：" + username);
        return username;
    }

    /**
     * 登录
     * @param username
     */
    public void login(String username){
        System.out.println(this.addIndex() + " 用户登录:" + username);
    }

    /**
     * 上传媒体
     */
    public void uploadMedia(String mediaName){
        System.out.println(this.addIndex() + " 上传媒体:" + mediaName);
    }

    /**
     * 制作清单
     * @param playlistName
     */
    public String createPlaylist(String playlistName){
        System.out.println(this.addIndex() + " 制作清单:" + playlistName + " 成功");
        return playlistName;
    }

    /**
     * 制作排期
     * @param planName
     */
    public String createPlan(String planName){
        System.out.println(this.addIndex() + " 制作排期:" + planName + " 成功");
        return planName;
    }

    /**
     * 创建播放器
     * @param playerName
     */
    public String createPlayer(String playerName){
        System.out.println(this.addIndex() + " 创建播放器:" + playerName + " 成功");
        return playerName;
    }

    /**
     * 终端绑定
     */
    public void bindPlayer(String playerName){
        System.out.println(this.addIndex() + " 绑定播放器:" + playerName + " 成功");
    }

    /**
     * 发布节目
     * @param planName
     * @param playerName
     */
    public void sendPlan(String planName, String playerName){
        System.out.println(this.addIndex() + " 将节目:" + planName + " 下发给播放器:" + playerName + "成功");
    }

    public int addIndex()
    {
        this.index = index + 1;
        return index;
    }

}
