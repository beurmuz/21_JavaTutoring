package exCode;

public class power {
    // public static double for_power(double x, int n) {
    //     int i;
    //     double r = 1.0;
    //     for(i=0; i<n; i++) {
    //         r = r*x;
    //     }
    //     return(r);
    // }

    public static double re_power(double x, int n) {
        if(n==0) {
            return 1;
        }
        else if ((n%2)==0) { // n이 짝수일 때 
            return re_power(x*x, n/2);
        } else { // n이 홀수일 때
            return x*re_power(x*x, (n-1)/2);
        }
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 3;
        double beforeTime = System.currentTimeMillis(); // 코드 실행 전 시간 받아오기
        //System.out.println(for_power(x,n));
        System.out.println(re_power(x, n));
        double  afterTime = System.currentTimeMillis(); // 코드 실행 후 시간 받아오기
        double secDiffTime = (afterTime - beforeTime)*0.001; 
        System.out.println("소요시간 : "+secDiffTime);
    }
}
