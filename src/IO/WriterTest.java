package IO;

//字符流:可以写中文，标点
  //写入
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {
    public static void main(String[] args) throws IOException {
        String disFilePath = "D:\\MySoftware\\IntelliJ IDEA 2020.3.1\\IDEAproject\\JavaProject\\LearnIO\\doc\\Writer.txt";
        Writer writer = new FileWriter(disFilePath);

        String text = "Writer抽象类是英语写出字符流的父类(相当于OutputStream),将指定的字符信息写出到目的地。定义了输出流的基本方法:\n" +
                "\tvoid write(int c):写入单个数组\n" +
                "\tvoid write(char[] cbuf):写入字符数组\n" +
                "\tvoid write(String str):写入字符串\n" +
                "\tvoid write(String str,int len,int off):指定大小\n" +
                "\tvoid flush():刷新该流的缓冲\n" +
                "\tvoid close():关闭该流";
        writer.write(text);
        writer.close();
    }
}
