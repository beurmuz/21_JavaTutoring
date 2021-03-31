class Calculator {
    int a,b; // 전역 변수 선언

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
        c1.setOprands(2, 1);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(3, 5);
        c2.sum();
        c2.avg();
    }
}
