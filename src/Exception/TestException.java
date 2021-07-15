package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//测试try-with-resuorse语法
public class TestException {
    public static void main(String[] args){
        String nowImg = "D:\\MyData\\mine\\壁纸2.jpg";
        String newImg = "D:\\MySoftware\\IntelliJ IDEA 2020.3.1\\IDEAproject\\JavaProject\\LearnIO\\doc\\no3.jpg";

        long startTime = System.currentTimeMillis();
        System.out.println("2.start................");

        //一般最好是1024的整数倍
        byte[] bytes = new byte[1024];
        int length;

        //使用try(){}catch{}
        try ( FileOutputStream outputStream = new FileOutputStream(newImg);  FileInputStream inputStream = new FileInputStream(nowImg)){
            while ((length = inputStream.read(bytes)) != -1){
                outputStream.write(bytes,0,1024);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("2.end..........................");
        long endTime = System.currentTimeMillis();
        System.out.println("2->>共用时:" + (endTime-startTime) + "ms");
    }
}
