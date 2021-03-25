public class makeMethod {

    public static void gugudan() {
        for (int i = 2; i < 10; i++) {
            System.out.println(i+"단 시작!");
            for (int j = 1; j < 10; j++) {
                System.out.println(i+" * "+j+" = "+ i*j);
            }
        }
        System.out.println("---구구단 게임 종료!--");
    }
    public static void main(String[] args) {
        System.out.println("---구구단 게임 시작!---");
        gugudan();
    }
}
