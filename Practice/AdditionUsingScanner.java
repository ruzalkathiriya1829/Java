import java.util.Scanner;

public class AdditionUsingScanner {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner x = new Scanner(System.in);

        System.out.println("Enter value of a:");
        a = x.nextInt();

        System.out.println("Enter value of b:");
        b = x.nextInt();

        c = a + b;

        System.out.println(c);

    }
}