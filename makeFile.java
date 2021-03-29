import java.util.Scanner;
import java.io.*;

public class makeFile {
    public static void main(String[] args) {
        try {
            File file = new File("out.txt");
            System.out.println("out.txt파일을 열어옵니다.");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*3);
            }
            System.out.println("while문이 종료됩니다.");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
