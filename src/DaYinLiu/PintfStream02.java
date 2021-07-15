package DaYinLiu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class PintfStream02 {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("D:\\MySoftware\\IntelliJ IDEA 2020.3.1\\IDEAproject\\JavaProject\\LearnIO\\doc\\Printf.txt")){
            System.setIn(inputStream);
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
