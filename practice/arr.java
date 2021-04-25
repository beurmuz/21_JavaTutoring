class Text{
    private int[] arr_ex = new int[3];
    Text() {
        arr_ex[0] = 0;
        arr_ex[1] = 10;
        arr_ex[2] = 20;
    }
    public void z(int num1, int num2) {
        try {
            System.out.println(arr_ex[num1]/arr_ex[num2]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch(Exception e) {
            System.out.println("Exception");
        }
    }
}

public class arr {

    public static void main(String[] args) {
        Text text = new Text();
        text.z(10,0);
        text.z(1,0);
        text.z(2,1);
    }
    
}

