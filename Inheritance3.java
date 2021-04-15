class Calculator3 {
    int left, right;
     
    // public Calculator3() {}

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() {
        return ((this.left + this.right)/2);
    }
}
 
class SubstractionableCalculator2 extends Calculator3 {
    public void sum() {
    	System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
    }

    public int avg() {
        return super.avg();
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class Inheritance3 {
    public static void main(String[] args) {
        SubstractionableCalculator2 c1 = new SubstractionableCalculator2();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}