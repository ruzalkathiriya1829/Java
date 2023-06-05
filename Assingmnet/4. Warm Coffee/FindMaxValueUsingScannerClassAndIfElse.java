import java.util.Scanner;

public class FindMaxValueUsingScannerClassAndIfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Please Enter value of a:");
        a = sc.nextInt();
        System.out.println("Please Enter value of b:");
        b = sc.nextInt();

        if (a > b) {
            System.out.println("A is max");
        } else {
            System.out.println("B is Max");
        }

    }

}
