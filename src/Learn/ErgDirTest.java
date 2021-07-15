package Learn;


//案例一:遍历一个目录所有的子目录和文件名
import java.io.File;

public class ErgDirTest {

    private static void ErgDir(File dir, int num){
        for (int i = 0;i < num;i++){
            System.out.print(" ");
        }
        System.out.println(dir.getName());
        //获取子文件和目录
        File[] files = dir.listFiles();
        assert files != null;
        for (File file : files) {
            if (file.isDirectory()){
                ErgDir(file,num + 2);
            }else {
                for (int i = 0;i < num+2;i++){
                    System.out.print(" ");
                }
                System.out.println(file.getName());
            }
        }

    }
    private static void ErgDir(File dir){
        ErgDir(dir,0);
    }

    private static void ErgDir(String path){
        ErgDir(new File(path));
    }


    public static void main(String[] args) {
        //用户只需要传入路径的字符串，可变的
        ErgDir("D:\\MySoftware\\7-Zip");
    }
}
