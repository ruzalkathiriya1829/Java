import java.util.Scanner;

class StudentMarkSheetUsingScannerAndConstructor {

    int m1, m2, m3, total;
    String grade;
    float per;

    StudentMarkSheetUsingScannerAndConstructor() {
        System.out.println("****************Student MarkSheet***************");
    }

    void displayTotal(int m1, int m2, int m3) {
        total = m1 + m2 + m3;

    }

    void displayPer() {
        per = total / 3;
    }

    void displayDesign() {
        System.out.println("m1\tm2\tm3\ttotal\tper\tgrade");
        System.out.println("----------------------------------------------");
    }

    void displayResult(int m1, int m2, int m3) {

        System.out.println(m1 + "\t" + m2 + "\t" + m3 + "\t" + total + "\t" + per + " %" + "\t" + grade);
    }

    void displayGrade() {

        if (per < 35) {
            grade = "Fail";
        } else if (per > 35 && per <= 50) {
            grade = "C";
        } else if (per > 50 && per <= 70) {
            grade = "B";
        } else if (per > 70 && per <= 90) {
            grade = "A";
        } else {
            grade = "A+";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m1, m2, m3;

        System.out.println("Enter m1 marks:");
        m1 = sc.nextInt();

        System.out.println("Enter m2 marks:");
        m2 = sc.nextInt();

        System.out.println("Enter m3 marks:");
        m3 = sc.nextInt();

        StudentMarkSheetUsingScannerAndConstructor s = new StudentMarkSheetUsingScannerAndConstructor();

        s.displayTotal(m1, m2, m3);
        s.displayPer();
        s.displayGrade();
        s.displayDesign();
        s.displayResult(m1, m2, m3);

    }

}