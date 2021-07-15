package HuanChongLiu;

import java.io.*;

//复制大文件
public class CopyBigFile01 {
    public static void main(String[] args) {
        String nowFileFath = "D:\\mydownload\\1153.7z";
        String newFilePath = "D:\\MySoftware\\IntelliJ IDEA 2020.3.1\\IDEAproject\\JavaProject\\LearnIO\\doc\\1153.7z";

        long startTime = System.currentTimeMillis();
        System.out.println("start.......");
        //!!经典字节数组:1375ms
//        try (InputStream newFile = new FileInputStream(nowFileFath); OutputStream nowFile = new FileOutputStream(newFilePath)){

        //!!缓冲流数组 :332ms
        try (InputStream newFile = new BufferedInputStream(new FileInputStream(nowFileFath));OutputStream nowFile = new BufferedOutputStream(new FileOutputStream(newFilePath))){
            byte[] bytes = new byte[1024];
            int len = 0;
            int index = 0;
            while ((len = newFile.read(bytes)) != -1){
                nowFile.write(bytes,0,len);
                index ++;
                if(index % 1024 == 0){
                    System.out.println("写入了" + (index / 1024) + "M");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("共花费了" + (endTime - startTime) +"ms");
    }
}
