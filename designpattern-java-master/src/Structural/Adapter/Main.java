package Structural.Adapter;

import Structural.Adapter.Oss.OssClient;
import Structural.Adapter.Oss.S3ClientAdapter;
import Structural.Adapter.Oss.S3ClientAdapter2;
import Structural.Adapter.Oss.StorageInterface;
import Structural.Adapter.S3.AmazonInterface;
import Structural.Adapter.S3.S3Client;

public class Main {
    public static void main(String[] args) {

        /**
         * 1、客户端使用OSS处理存储业务
         */
        StorageInterface ossClient = new OssClient();
        Business business = new Business(ossClient);
        business.run();

        System.out.println("===============");

        /**
         * 业务发生了变更
         * 必须对原来的业务做大量的修改
         */
        AmazonInterface s3Client = new S3Client();
        BusinessModified businessModified = new BusinessModified(s3Client);
        businessModified.run();

        System.out.println("===============");

        /**
         * 使用委让方式的S3适配器
         */
        AmazonInterface s3client = new S3Client();
        StorageInterface S3Adapter1 = new S3ClientAdapter(s3client);

        Business business1 = new Business(S3Adapter1);
        business1.run();

        System.out.println("===============");

        /**
         * 使用继承方式的S3适配器
         */
        StorageInterface s3clientAdapter2 = new S3ClientAdapter2();
        Business business2 = new Business(s3clientAdapter2);
        business2.run();

    }
}
