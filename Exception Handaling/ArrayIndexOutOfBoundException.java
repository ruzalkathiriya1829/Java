import java.util.Scanner;

public class ArrayIndexOutOfBoundException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for (int i = 0; i < 4; i++) {
            System.out.println(a[i]);
        }

        try {
            System.out.println("Enter the element:");
            int e = sc.nextInt();
            System.out.println("Element in the given index is :: " + a[e]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you have entered is invalid");
        }
    }

}
