public class Obejct {
    public static void sum(int i, int j) {
        System.out.println("sum : " + (i+j));
    }
    public static void avg(int i, int j) {
        System.out.println("avg : " + ((i+j)/2));
    }
    public static void main(String[] args) {

        int a = 2, b = 1;
        sum(a,b);
        avg(a,b);

        a = 3;
        b = 5;
        sum(a,b);
        avg(a,b);
        // ...

        a = 4;
        b =8;
        sum(a,b);
        avg(a,b);
    }
}
