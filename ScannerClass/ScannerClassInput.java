import java.util.Scanner;

public class ScannerClassInput {
    public static void main(String[] args) {

        int rollno;
        int fees;
        String name;
        String course;

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your name:");
        name = sc.nextLine();

        System.out.println("please enter your course:");
        course = sc.nextLine();

        System.out.println("please enter your rollno:");
        rollno = sc.nextInt();

        System.out.println("please enter your fees:");
        fees = sc.nextInt();

        System.out.println("rollno = " + rollno);
        System.out.println("Name = " + name);
        System.out.println("Fees = " + fees);
        System.out.println("Course = " + course);

    }
}