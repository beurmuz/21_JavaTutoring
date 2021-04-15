class calculator2 {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() { // 합계를 구하는 메소드
        System.out.println(this.left + this.right);
    }
 
    public void avg() { // 평균을 구하는 메소드
        System.out.println((this.left + this.right) / 2);
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

class MultiplecationCalculator extends calculator2 {
	public void multiplecation() {
    	System.out.println(this.left*this.right);
    }
}
 
public class Inheritance2 {
 
    public static void main(String[] args) {
 
        MultiplecationCalculator c1 = new MultiplecationCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
        c1.multiplecation();
    }
 
}