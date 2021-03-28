public class inoutMethod {

    public static int repeatGo(int i,int j) {
        int num;
        int total = 0;
        System.out.println(i +"에서 시작해서, " + (j-1) +"까지 합산합니다.");
        for(num=i; num < j; num++) {
            total += num;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(repeatGo(0,6));
    }
}
