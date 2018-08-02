package Structural.Adapter.Oss;

public class OssClient implements StorageInterface {
    @Override
    public void upload(String mediaName) {
        System.out.println("上传媒体:" + mediaName);
    }

    @Override
    public void get(String mediaName) {
        System.out.println("获取下载链接:" + mediaName);
    }

    @Override
    public void signature(String mediaName) {
        System.out.println("文件签名:" + mediaName);
    }
}
