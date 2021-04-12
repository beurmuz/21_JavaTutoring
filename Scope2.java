public class Scope2 {
        static int i = 5;
     
        static void a() {
            int i = 10;
            System.out.println("메소드a의 변수 i값은 : " + i);            
            b();
        }
     
        static void b() {
            System.out.println("메소드b에서 읽는 변수 i의 값은 : " + i);
        }
     
        public static void main(String[] args) {
            a();
        }
}
