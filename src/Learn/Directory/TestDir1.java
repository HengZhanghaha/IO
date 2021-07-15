package Learn.Directory;

import java.io.File;

public class TestDir1 {
    public static void main(String[] args) {
        File file = new File("D:\\MySoftware\\IntelliJ IDEA 2020.3.1" +
                "\\IDEAproject\\JavaProject\\LearnIO\\doc\\test");

        //创建一级目录
        System.out.println("mkdir :" + file.mkdir());
        boolean delete = file.delete();
        System.out.println(delete);

        //创建多级目录
        File file2 = new File("D:\\MySoftware\\IntelliJ IDEA 2020.3.1" +
                "\\IDEAproject\\JavaProject\\LearnIO\\doc\\test5\\test1\\test2");
        System.out.println("mkdirs:" + file2.mkdirs());

        //获取子文件或目录
        File file1 = new File("D:\\MyData\\mine\\QQdata\\MobileFile\\我的爱人\\照片");
        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
