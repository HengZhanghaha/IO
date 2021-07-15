package RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("D:\\MySoftware\\IntelliJ IDEA 2020.3.1\\IDEAproject\\JavaProject\\LearnIO\\doc\\lisao.txt","r")){
            System.out.println("文件初始指针位置: " + raf.getFilePointer());

            //设置指针偏移
            raf.seek(100);
            System.out.println("设置偏移量之后指针位置:" + raf.getFilePointer());

            int len;
            byte[] bytes = new byte[1024];
            while ((len = raf.read(bytes)) != -1){
                String str = new String(bytes,0,len, StandardCharsets.UTF_8);
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
