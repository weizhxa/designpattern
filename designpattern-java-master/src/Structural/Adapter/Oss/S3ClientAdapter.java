package Structural.Adapter.Oss;

import Structural.Adapter.S3.AmazonInterface;
import Structural.Adapter.S3.S3Client;

/**
 * 对象适配器
 * 使用委让的方式
 */
public class S3ClientAdapter implements StorageInterface {

    private AmazonInterface s3Client;

    /**
     * 持有S3引用
     * @param s3Client
     */
    public S3ClientAdapter(AmazonInterface s3Client) {
        this.s3Client = s3Client;
    }

    @Override
    public void upload(String mediaName) {
        s3Client.putMedia(mediaName);
    }

    @Override
    public void get(String mediaName) {
        s3Client.mediaUrl(mediaName);
    }

    @Override
    public void signature(String mediaName) {
        s3Client.downloadAuth(mediaName);
    }
}
