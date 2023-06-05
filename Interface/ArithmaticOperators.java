import java.util.Scanner;

interface ArithmaticOperators {

    public void sum(int a, int b);

    public void subtraction(int a, int b);

    public void multiplication(int a, int b);

    public void division(int a, int b);

    public void sum(int a, int b, int c);

    public void subtraction(int a, int b, int c);

    public void multiplication(int a, int b, int c);

    public void division(int a, int b, int c);

}

class MainClass implements ArithmaticOperators {

    public void sum(int a, int b) {
        int c = a + b;
        System.out.println("Sum of " + a + " & " + b + " = " + c);
    }

    public void subtraction(int a, int b) {
        int c = a - b;
        System.out.println("Subtraction of " + a + " & " + b + " = " + c);
    }

    public void multiplication(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication " + a + " & " + b + " = " + c);

    }

    public void division(int a, int b) {
        int c = a / b;
        System.out.println("Division of " + a + " & " + b + " = " + c);
    }

    public void sum(int a, int b, int c) {
        int d = a + b;
        System.out.println("Sum of " + a + " , " + b + " & " + c + " = " + d);
    }

    public void subtraction(int a, int b, int c) {
        int d = a - b;
        System.out.println("subtraction of " + a + " , " + b + " & " + c + " = " + d);
    }

    public void multiplication(int a, int b, int c) {
        int d = a * b;
        System.out.println("multiplication of " + a + " , " + b + " & " + c + " = " + d);
    }

    public void division(int a, int b, int c) {
        int d = a / b;
        System.out.println("division of " + a + " , " + b + " & " + c + " = " + d);
    }

    public static void main(String[] args) {

        int choice;

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "please select your choice \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
        choice = sc.nextInt();

        MainClass m = new MainClass();

        switch (choice) {
            case 1:
                m.sum(10, 20);
                m.sum(10, 20, 30);
                break;

            case 2:
                m.subtraction(20, 10);
                m.subtraction(30, 20, 10);
                break;

            case 3:
                m.multiplication(2, 6);
                m.multiplication(3, 2, 1);
                break;

            case 4:
                m.division(6, 2);
                m.division(18, 9, 3);
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }

    }
}