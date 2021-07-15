package IO;

//输入流

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("D:\\MySoftware\\IntelliJ IDEA 2020.3.1\\IDEAproject\\JavaProject\\LearnIO\\doc\\test.txt");

        int read;
        while ((read = inputStream.read()) != -1){
            System.out.println((char)read);
        }
        inputStream.close();
    }
}
