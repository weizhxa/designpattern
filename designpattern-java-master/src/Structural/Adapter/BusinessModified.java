package Structural.Adapter;

import Structural.Adapter.S3.AmazonInterface;

public class BusinessModified {
    private AmazonInterface S3client;

    public BusinessModified(AmazonInterface s3client) {
        S3client = s3client;
    }


    public void run(){

        S3client.putMedia("a.jpg");
        S3client.putMedia("b.jpb");
        S3client.putMedia("c.mov");
        S3client.putMedia("d.mp4");

        S3client.downloadAuth("c.mov");
        S3client.downloadAuth("d.mp4");

        S3client.mediaUrl("a.jpg");
        S3client.mediaUrl("b.jpg");

    }
}
