public class sportsList {
    public static void Array1(){
        String[] grade1 = {"HO", "DH", "WJ"};
        String[] grade2 = {"HM", "GJ", "WG"};
        String[] grade3 = {"MS", "JW", "JB"};
        
        System.out.println("대회에 출전하는 1학년은 " + grade1[0] + ", " + grade1[1]+ ", " + grade1[2] + " 입니다.");
        System.out.println("대회에 출전하는 2학년은 " + grade2[0] + ", " + grade2[1]+ ", " + grade2[2] + " 입니다.");
        System.out.println("대회에 출전하는 3학년은 " + grade3[0] + ", " + grade3[1]+ ", " + grade3[2] + " 입니다.");
    }

    public static void Array2(){
        String[] grade1 = new String[3];
        grade1[0] = "HO";
        grade1[1] = "DH";
        grade1[2] = "WJ";

        System.out.println("1학년은 총 " + grade1.length + "명이 출전합니다.");
    }

    public static void UseArray1(){
        String[] students = {"JB","JW","MS","GJ","WG","HO","DH","WJ","HM"};
        for (int i = 0; i < students.length; i++) {
            String student = students[i]; 
            System.out.println(student + "은 " + i + "번째로 출전함");
        }
    }

    public static void UseArray2(){
        String[] students = {"JB","JW","MS","GJ","WG","HO","DH","WJ","HM"};
        for (String e : students) {
            System.out.println(e +"이 출전했습니다. ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Array1 실행 결과------------");
        Array1();

        System.out.println("Array2 실행 결과------------");
        Array2();

        System.out.println("UseArray1 실행 결과------------");
        UseArray1();

        System.out.println("UseArray2 실행 결과------------");
        UseArray2();
    }
}
