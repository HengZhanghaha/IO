package IO;

//Reader
  //写出
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "D:\\MySoftware\\IntelliJ IDEA 2020.3.1\\IDEAproject\\JavaProject\\LearnIO\\doc\\Writer.txt";

        Reader reader = new FileReader(srcFilePath);
        int ch;
        while ((ch = reader.read()) != -1){
            char text = (char) ch;
            System.out.print(text);
        }
        reader.close();
    }
}
