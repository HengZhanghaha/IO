package ZhuanHuanLiu;

import java.io.*;

//转换流
public class TestZhuanHuanLiu {
    public static void main(String[] args) {
        String nowFile = "D:\\MySoftware\\IntelliJ IDEA 2020.3.1\\IDEAproject\\JavaProject\\LearnIO\\doc\\test2.txt";
        //乱码
//        try (BufferedReader input = new BufferedReader(new FileReader(nowFile))){
        //指定编码集
        try (BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(nowFile),"UTF8"))){
        String line;
            while ((line = input.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
