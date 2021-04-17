// 추상 클래스 ab_cal
abstract class ab_cal{
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    public abstract void sum(); // 추상 메소드sum 선언
    public abstract void avg(); // 추상 메소드avg 선언

    public void run(){
        sum();
        avg();
    }
}

// 추상 클래스 ab_cal을 상속받는 클래스CalculatorDP
class CalculatorDP extends ab_cal { 
    // 추상 클래스ab_cal의 추상 메소드sum, avg를 오버라이딩 함
    public void sum(){
        System.out.println("+++++ sum :"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("+++++ avg :"+(this.left+this.right)/2);
    }
}

// 추상 클래스 ab_cal을 상속받는 클래스CalculatorDM 
class CalculatorDM extends ab_cal { 
    // 추상 클래스ab_cal의 추상 메소드sum, avg를 오버라이딩 함
    public void sum(){ 
        System.out.println("----- sum :"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("----- avg :"+(this.left+this.right)/2);
    }
} 
public class abstractCalculator {
    public static void main(String[] args) { 
        CalculatorDP c1 = new CalculatorDP();
        c1.setOprands(10, 20);
        c1.run();
         
        CalculatorDM c2 = new CalculatorDM();
        c2.setOprands(10, 20);
        c2.run();
    }
}