package Learn.File;

//文件名相关的方法

import java.io.File;

public class TestFile1 {
    public static void main(String[] args) {
        File file = new File("doc\\LearnIO.md");

        //绝对路径
        System.out.println(file.getAbsoluteFile());
        //抽象路径
        System.out.println(file.getPath());
        //文件名
        System.out.println(file.getName());
        //剪切文件到......
        file.renameTo(new File("D:\\io.md"));
    }
}
