package Learn.File;

//文件信息相关

import java.io.File;
import java.util.Date;

public class TestFile2 {
    public static void main(String[] args) {
        File file = new File("D:\\MySoftware\\IntelliJ IDEA 2020.3.1" +
                "\\IDEAproject\\JavaProject\\LearnIO\\doc\\LearnIO.md");

        //文件是否存在
        System.out.println("exists:  " + file.exists());
        //文件是否可写
        System.out.println("canWrite: "+ file.canWrite());
        //文件是否可读
        System.out.println("canRead: "+file.canRead());
        //是否是文件，而不是目录
        System.out.println("isFile: " + file.isFile());
        //是否是目录，而不是文件
        System.out.println("isDirectory: " + file.isDirectory());
        //是否是绝对路径
        System.out.println("isAbsolute: " + file.isAbsolute());

        //文件最后的修改时间
        System.out.println("lastModified: " + new Date(file.lastModified()));

        //文件大小
        System.out.println("length" + file.length());
    }
}
