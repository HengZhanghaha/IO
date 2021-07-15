package Learn.File;

import java.io.File;
import java.io.IOException;

public class TestFile3 {
    public static void main(String[] args) {
        File file = new File("D:\\MySoftware\\IntelliJ IDEA 2020.3.1" +
                "\\IDEAproject\\JavaProject\\LearnIO\\doc\\test.txt");

        //创建文件
        try {
            System.out.println("createNewFile: " + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //删除文件
        System.out.println("delete: " + file.delete());
    }
}
