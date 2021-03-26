public class notMakeMethod {

    public static void howGugudan(int i) {
        System.out.println("---" + i + "단 공부하기---");
        for(int j = 1; j < 10; j++) {
            System.out.println(i + " * "+ j +" = "+i*j);
        }
        System.out.println("---" + i + "단 공부 완료!---\n");
    }
    public static void main(String[] args) {
        howGugudan(2);
        howGugudan(3);
        System.out.println(".... \n");
        howGugudan(9);
    }
}
