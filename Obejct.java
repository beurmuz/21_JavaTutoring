class cal {
    // int a,b; 

    // public void setOprands(int a, int b) {
    //     this.a = a;
    //     this.b = b;
    // }

    public static void sum(int a, int b) {
        System.out.println("sum : " + (a+b));
    }

    public static void avg(int a, int b) {
        System.out.println("avg : " + ((a+b)/2));
    }

}
public class Obejct {
        public static void main(String[] args) {
        cal.sum(10,20); // 30
        cal.avg(10,20); // 15

        cal.sum(50,50); // 100
        cal.avg(50,50); // 50
    }
}
