class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        if(right == 0) { // setOprands의 두번째 인자로 0이 들어오면 예외를 발생시킴
            throw new IllegalArgumentException("두번째 인자 값은 0이 될 수 없습니다.");
        }
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.println("계산결과는 "+ this.left/this.right + " 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}