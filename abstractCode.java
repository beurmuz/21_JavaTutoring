public class abstractCode {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.b());
    }
}

// 추상 클래스A 
abstract class A {
    public abstract String b();
    
    public void d() {
        System.out.println("world");
    }
}

// 클래스A를 상속한 하위 클래스 만들기
class B extends A {
    public String b() {
        String syn = "클래스A 사용하기";
        return syn;
    }
}