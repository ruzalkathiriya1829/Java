import java.util.Scanner;

public class CheckNumberPositiveNegativeOrZeroUsingScannerClass {

    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);

        System.out.println("please Enter value of number:");
        number = sc.nextInt();

        if (number == 0) {
            System.out.println("Number is zero");
        } else {
            if (number > 0) {
                System.out.println(number + " is positive number");
            } else {
                System.out.println(number + " is negative number");
            }
        }

    }

}
