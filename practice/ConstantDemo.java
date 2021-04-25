package practice;

enum Stock {
    peachCrush("sweet"), rum("pungent"), soju("bitter"); // Stock의 상수 선언 + 생성자 호출
    private String flavor;
    Stock(String flavor) { // 생성자
        System.out.println("Call Constructor " + this);
        this.flavor = flavor;
    }
    String getFlavor() {
        return this.flavor;
    }
}

enum Sales {
    Acompany, soju, Ccompany;
}

public class ConstantDemo {
     
    public static void main(String[] args) {
        for(Stock f : Stock.values()){
            System.out.println(f+", "+f.getFlavor());
        }
    }
}