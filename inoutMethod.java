public class inoutMethod {

    public static void repeatGo(int i) {
        int num = i;
        System.out.println("num의 초기값은 " + i +"입니다.");
        for(num=1; num < 5; num++) {
            System.out.println("현재 num의 값은 " + num +"입니다.");
        }
    }
    public static void main(String[] args) {
        repeatGo(0);
    }
}
