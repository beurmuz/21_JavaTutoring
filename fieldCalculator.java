class field_cal {
    static final double PI = 3.14; // 값이 변하지 않도록 규제함
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        field_cal.PI = 6; // PI의 값을 바꾸려고 시도함 
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class fieldCalculator {
 
    public static void main(String[] args) {
 
        field_cal c1 = new field_cal();
        System.out.println(c1.PI);
        //Calculator.PI = 10;
 
 
    }
 
}