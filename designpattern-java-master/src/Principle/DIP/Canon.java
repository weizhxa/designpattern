package Principle.DIP;

public class Canon implements Camera {
    @Override
    public void install() {
        System.out.println("安装佳能镜头");
    }

    @Override
    public void picture() {
        System.out.println("佳能镜头拍照");
    }

    @Override
    public void video() {
        System.out.println("佳能镜头摄像");
    }
}
