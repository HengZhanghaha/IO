package IO;

//输出流
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建一个文件输出流，如果对应文件不存在，那么会新建一个
        OutputStream outputStream = new FileOutputStream("D:\\MySoftware\\IntelliJ IDEA 2020.3.1\\IDEAproject\\JavaProject\\LearnIO\\doc\\test.txt");
        byte[] bytes = "牛小".getBytes();
        outputStream.write(bytes);

        bytes = "hello world".getBytes();
        outputStream.write(bytes,0,7);
        outputStream.close();   //千万别忘，如果不写，jvm不会回收
    }
}
