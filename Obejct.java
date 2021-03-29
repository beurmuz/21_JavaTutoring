public class Obejct {
    public static void sum(int i, int j) {
        System.out.println("sum : " + (i+j));
    }
    public static void avg(int i, int j) {
        System.out.println("avg : " + ((i+j)/2));
    }
    public static void main(String[] args) {
        sum(2,1);
        avg(2,1);

        sum(2,2);
        avg(2,2);
        // ...
        sum(9,9);
        avg(9,9);
    }
}
