class C1 {
    static int static_variable = 1; // 고정 클래스 변수 선언
    int instance_variable = 2; // 가변 클래스 변수 선언

    static void static_static() { // 고정 클래스 메소드 선언 
        System.out.println(static_variable); 
    }

    static void static_instance() { // 고정 클래스 메소드 선언
        //System.out.println(instance_variable);
        // 클래스 메소드에서는 인스턴스 변수에 접근할 수 없음
    }

    void instance_static() { // 인스턴스 클래스 메소드 선언
        System.out.println(static_variable);
        // 인스턴스 메소드에서는 클래스 변수에 접근할 수 있음
    }

    void instance_instance() { // 인스턴스 클래스 메소드 선언
        System.out.println(instance_variable);
    }
}

public class ClassMember {
    public static void main(String[] args) {
        C1 c = new C1();
        //c.static_static();
        // 인스턴스를 통해 정적 메소드에 접근 -> O
        // 인스턴스 메소드가 정적 변수에 접근 -> O

        //c.static_instance();
        // 인스턴스를 통해 정적 메소드에 접근 -> O
        // 정적 메소드가 인스턴스 변수에 접근 -> X

        c.instance_static();
        // 인스턴스를 통해 인스턴스 메소드에 접근 -> O
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> O

        c.instance_instance();
        // 인스턴스를 통해 인스턴스 메소드에 접근 -> O
        // 인스턴스 메소드가 클래스 변수에 접근 -> O

        C1.static_static();
        // 클래스를 통해 클래스 메소드에 접근 -> O
        // 클래스 메소드가 클래스 변수에 접근 -> O

        C1.static_instance();
        // 클래스를 통해 클래스 메소드에 접근 -> O
        // 클래스 메소드가 인스턴스 메소드에 접근 -> X

        //C1.instance_static();
        // 클래스를 통해 인스턴스 메소드에 접근 -> X

        //C1.instance_instance();
        // 클래스를 통해 인스턴스 메소드에 접근 -> X
    }
}
