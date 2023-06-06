//import java.util.Scanner;

public class ArithmeticException {

    public static void main(String[] args) {

        int a = 50;
        int b = 0;
        int c;

        // Scanner sc = new Scanner(System.in);

        // int a, b, c;

        // System.out.println("please enter value of a:");
        // a = sc.nextInt();

        // System.out.println("please entre value of b:");
        // b = sc.nextInt();

        try {
            c = a / b;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Arithmetic exception is occur... ");
        }

    }
}
