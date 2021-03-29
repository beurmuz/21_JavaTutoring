import java.util.Scanner;
public class inOut2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하면 *3의 값이 출력됩니다.");
        while(sc.hasNextInt()) {
            System.out.println("연산결과 : " + sc.nextInt()*3);
        }
        System.out.println("숫자 이외의 것을 입력하여 while문이 종료됩니다.");
        sc.close();
    }
}  
