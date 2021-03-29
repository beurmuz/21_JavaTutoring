import java.util.Scanner;

public class inOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("입력 값 * 3 = "+(i*3));
        sc.close();
    }
}
