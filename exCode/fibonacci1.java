package exCode;

public class fibonacci1 {
 
    public static int fib(int n) {
        if (n == 0) {
            return n;
        } else if (n == 1) {
            return 1;
        } else {
            return(fib(n-1) + fib(n-2));
        }
    }
 
    public static void main(String[] args) {
        System.out.println(fib(10));   
    }
}
