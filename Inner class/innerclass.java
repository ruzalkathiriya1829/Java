import java.util.Scanner;

public class innerclass {

    class inner {

        int displaySum(int a, int b) {
            int c = a + b;
            return c;
        }

    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int a, b, result;

        System.out.println("please enter value of a:");
        a = x.nextInt();

        System.out.println("please enter value of b:");
        b = x.nextInt();

        innerclass.inner i1 = new innerclass().new inner();

        result = i1.displaySum(a, b);

        System.out.println("sum = " +result);
    }

}
