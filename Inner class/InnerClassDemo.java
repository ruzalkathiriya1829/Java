import java.util.Scanner;

public class InnerClassDemo {

    class InnerClass {

        int a, b, c;

        void displaySum(int a, int b) {

            int c = a + b;
            System.out.println("Sum = " + c);
        }

        void displaySubStraction(int a, int b) {

            int c = a - b;
            System.out.println("Substraction = " + c);
        }

        void displayMultiplication(int a, int b) {

            int c = a * b;
            System.out.println("Multiplication = " + c);
        }

        void displayDivision(int a, int b) {

            int c = a / b;
            System.out.println("Division = " + c);
        }
    }

    public static void main(String[] args) {

        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter value of a:");
        a = sc.nextInt();

        System.out.println("please enter value of b:");
        b = sc.nextInt();

        InnerClassDemo.InnerClass i = new InnerClassDemo().new InnerClass();
        i.displaySum(a, b);
        i.displaySubStraction(a, b);
        i.displayMultiplication(a, b);
        i.displayDivision(a, b);

    }

}