package exCode;

public class fibonacci2 {
    public static void fib(int t) {
        // 반복문을 이용한 피보나치수열
        // f(n) = f(n-1) + f(n-2)
        // 단 f(1) = 1 ,f(2) =2, 규칙은 f(3) 부터
        int n = 0;
        int n1 = 1;
        int n2 = 1;
        int n3 = 1;
 
        for (n = 0; n < t; n++) {
 
            if (n == 0 || n == 1) {
                //System.out.println(1);
            }else {
                n1 = n2;
                n2 = n3;
                n3 = n1 + n2;
                //System.out.println(n3);
            }
         }
         System.out.println(n3);
    }
    public static void main(String[] args) {
        fib(5);
    }
}
