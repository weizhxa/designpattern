package Structural.Adapter;

import Structural.Adapter.Oss.StorageInterface;

public class Business {
    private StorageInterface ossClient;

    public Business(StorageInterface ossClient) {
        this.ossClient = ossClient;
    }

    public void run(){

        ossClient.upload("a.jpg");
        ossClient.upload("b.jpb");
        ossClient.upload("c.mov");
        ossClient.upload("d.mp4");

        ossClient.signature("c.mov");
        ossClient.signature("d.mp4");

        ossClient.get("a.jpg");
        ossClient.get("b.jpg");

    }
}
