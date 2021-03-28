public class inoutMethod {

    public static void repeatGo(int i,int j) {
        int num;
        System.out.println(i +"에서 시작해서, " + j +"까지 반복합니다.");
        for(num=i; num < j; num++) {
            System.out.println("현재 num의 값 : " + num);
        }
    }
    public static void main(String[] args) {
        repeatGo(0,6);
    }
}
