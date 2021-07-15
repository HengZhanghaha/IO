package IO;

import java.io.*;

//实例:复制图片
public class TestIO {
    public static void main(String[] args) throws IOException {
        String nowImg = "D:\\MyData\\mine\\壁纸2.jpg";
        String newImg = "D:\\MySoftware\\IntelliJ IDEA 2020.3.1\\IDEAproject\\JavaProject\\LearnIO\\doc\\no1.jpg";

        //经典方法:读一个，写一个
        long startTime = System.currentTimeMillis();
        System.out.println("1.start................");
        OutputStream outputStream = new FileOutputStream(newImg);
        InputStream inputStream = new FileInputStream(nowImg);
        int read;
        while ((read = inputStream.read()) != -1){
            outputStream.write(read);
        }
        inputStream.close();
        outputStream.close();

        System.out.println("1.end..........................");
        long endTime = System.currentTimeMillis();
        System.out.println("1->>共用时:" + (endTime-startTime) + "ms");

        //优化后:写到缓冲区一部分，再写入
        String newImg2 = "D:\\MySoftware\\IntelliJ IDEA 2020.3.1\\IDEAproject\\JavaProject\\LearnIO\\doc\\no2.jpg";
        startTime = System.currentTimeMillis();
        System.out.println("2.start................");
        outputStream = new FileOutputStream(newImg2);
        inputStream = new FileInputStream(nowImg);

        //一般最好是1024的整数倍
        byte[] bytes = new byte[1024];
        int length;
        while ((length = inputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,1024);
        }
        System.out.println("2.end..........................");
        endTime = System.currentTimeMillis();
        System.out.println("2->>共用时:" + (endTime-startTime) + "ms");
    }
}
