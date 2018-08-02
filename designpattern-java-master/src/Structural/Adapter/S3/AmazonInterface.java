package Structural.Adapter.S3;

public interface AmazonInterface {

    /**
     * 上传媒体
     */
    public void putMedia(String mediaName);

    /**
     * 获取下载链接
     */
    public void mediaUrl(String mediaName);

    /**
     * 文件签名
     */
    public void downloadAuth(String mediaName);
}
