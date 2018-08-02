package Structural.Adapter.S3;

public class S3Client implements AmazonInterface {
    @Override
    public void putMedia(String mediaName) {
        System.out.println("上传媒体：" + mediaName);
    }

    @Override
    public void mediaUrl(String mediaName) {
        System.out.println("获取下载链接：" + mediaName);
    }

    @Override
    public void downloadAuth(String mediaName) {
        System.out.println("文件签名：" + mediaName);
    }
}
