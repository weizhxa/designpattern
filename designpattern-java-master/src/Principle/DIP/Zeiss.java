package Principle.DIP;

public class Zeiss implements Camera {
    @Override
    public void install() {
        System.out.println("安装蔡司镜头");
    }

    @Override
    public void picture() {
        System.out.println("蔡司镜头拍照");
    }

    @Override
    public void video() {
        System.out.println("蔡司镜头录像");
    }
}
