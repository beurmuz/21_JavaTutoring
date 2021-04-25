import java.io.*;

class B{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt")); // FileReader의 생성자
        input = bReader.readLine();
        System.out.println(input);
    }
}
class C{
    void run() {
        B b = new B();
        b.run();
    }
}

public class excode {
    public static void main(String[] args) {
        C c = new C();
        c.run();
    }
}
