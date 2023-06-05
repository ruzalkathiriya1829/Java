import java.util.Scanner;

public class StudentMarksheetUsingInnerClass {

    public class InnerClass {

        int m1, m2, m3, total;
        float per;
        String grade;

        void displayHeding() {
            System.out.println("....................Student MarkSheet...................");
        }

        void disPlayTotal(int m1, int m2, int m3) {
            total = m1 + m2 + m3;
        }

        void displayPer() {
            per = total / 3;
        }

        void displayDesign() {
            System.out.println("m1\tm2\tm3\ttotal\tper\tgrade");
            System.out.println("__________________________________");
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

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m1, m2, m3;

        System.out.println("please enter your m1:");
        m1 = sc.nextInt();

        System.out.println("please enter your m2:");
        m2 = sc.nextInt();

        System.out.println("please enter your m2:");
        m3 = sc.nextInt();

        StudentMarksheetUsingInnerClass.InnerClass i = new StudentMarksheetUsingInnerClass().new InnerClass();

        i.displayHeding();
        i.disPlayTotal(m1, m2, m3);
        i.displayPer();
        i.displayGrade();
        i.displayDesign();
        i.displayResult(m1, m2, m3);

    }
}
