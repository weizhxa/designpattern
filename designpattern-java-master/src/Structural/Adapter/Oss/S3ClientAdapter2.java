package Structural.Adapter.Oss;

import Structural.Adapter.S3.S3Client;

/**
 * 类适配器
 * 使用继承的方式
 */
public class S3ClientAdapter2 extends S3Client implements StorageInterface {
    @Override
    public void upload(String mediaName) {
        putMedia(mediaName);
    }

    @Override
    public void get(String mediaName) {
        mediaUrl(mediaName);
    }

    @Override
    public void signature(String mediaName) {
        downloadAuth(mediaName);
    }
}
