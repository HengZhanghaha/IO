package DaYinLiu;

//printStream: 输出流

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PintfStream01 {
    public static void main(String[] args) {
        try (PrintStream printStream = new PrintStream(new FileOutputStream("D:\\MySoftware\\IntelliJ IDEA 2020.3.1\\IDEAproject\\JavaProject\\LearnIO\\doc\\Printf.txt"))){
            printStream.println("hello world~~");
            printStream.println("老铁，加油！！");

            //重定向输入
            System.setOut(printStream);
            System.out.println("1454851845184");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
