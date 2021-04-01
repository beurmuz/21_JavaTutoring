package exCode;

public class factorial1 {

    // for문으로 팩토리얼 구현하기
    public static int for_factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(result +" x "+ i +" = " + result*i);
            result = result * i;
        }
        return result; 
    }

    public static int re_factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            System.out.println("factorial("+n+")");
            return n*re_factorial(n-1);
        }
    }
    
    public static void main(String[] args) {
        int n=5;
        System.out.println(n+"! = " + for_factorial(n) + "\n");
        System.out.println(n+"! = " + re_factorial(n));

    }
}
