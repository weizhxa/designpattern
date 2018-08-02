package Structural.Adapter.Oss;

public interface StorageInterface {

    /**
     * 上传
     */
    public void upload(String mediaName);

    /**
     * 获取下载地址
     */
    public void get(String mediaName);

    /**
     * 签名
     */
    public void signature(String mediaName);
}
