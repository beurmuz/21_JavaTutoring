class Calculator {
    int a,b; 
    static double PI = 3.14;

    public void setOprands(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum() {
        System.out.println("sum : " + (this.a + this.b));
    }

    public void avg() {
        System.out.println("avg : " + ((this.a + this.b)/2));
    }

}
public class Obejct {
        public static void main(String[] args) {

        Calculator c1 = new Calculator();
        System.out.println(c1.PI);

        Calculator c2 = new Calculator();
        System.out.println(c2.PI);
    }
}
