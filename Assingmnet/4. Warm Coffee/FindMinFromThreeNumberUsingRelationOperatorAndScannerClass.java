import java.util.Scanner;

public class FindMinFromThreeNumberUsingRelationOperatorAndScannerClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("please Enter value of a:");
        a = sc.nextInt();

        System.out.println("please Enter value of b:");
        b = sc.nextInt();

        System.out.println("please Enter value of c:");
        c = sc.nextInt();

        if (a < b) {
            if (a < c) {
                System.out.println("A is min");
            } else {
                System.out.println("C is min");
            }
        } else {
            if (b < c) {
                System.out.println("B is min");
            } else {
                System.out.println("C is min");
            }
        }

    }

}
