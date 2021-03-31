class Calculator {
    int a,b; 
    static double PI = 3.14;
    static int base = 10;

    public void setOprands(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum() {
        System.out.println("sum : " + (this.a + this.b + base));
    }

    public void avg() {
        System.out.println("avg : " + ((this.a + this.b + base)/2));
    }

}
public class Obejct {
        public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum(); // 40출력
        c1.avg(); // 20출력

        Calculator.base = 100;
        c1.sum(); // 130출력
        c1.avg(); // 65출력
    }
}
