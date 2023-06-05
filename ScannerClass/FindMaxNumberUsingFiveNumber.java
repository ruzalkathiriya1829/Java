import java.util.Scanner;

public class FindMaxNumberUsingFiveNumber {

    public static void main(String[] args) {

        int a, b, c, d, e;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter value of a:");
        a = sc.nextInt();
        System.out.println("Please Enter value of b:");
        b = sc.nextInt();
        System.out.println("Please Enter value of c:");
        c = sc.nextInt();
        System.out.println("Please Enter value of d:");
        d = sc.nextInt();
        System.out.println("Please Enter value of e:");
        e = sc.nextInt();

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    if (a > e) {
                        System.out.println("A is max");
                    } else {
                        System.out.println("E is max");
                    }
                } else {
                    if (d > e) {
                        System.out.println("D is max");
                    } else {
                        System.out.println("E is max");
                    }
                }
            } else {
                if (c > d) {
                    if (c > e) {
                        System.out.println("C is max");
                    } else {
                        System.out.println("E is max");
                    }
                } else {
                    if (d > e) {
                        System.out.println("D is max");
                    } else {
                        System.out.println("E is max");
                    }
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    if (b > e) {
                        System.out.println("B is max");
                    } else {
                        System.out.println("E is max");
                    }
                } else {
                    if (d > e) {
                        System.out.println("D is max");
                    } else {
                        System.out.println("E is max");
                    }
                }
            } else {
                if (c > d) {
                    if (c > e) {
                        System.out.println("C is max");
                    } else {
                        System.out.println("E is max");
                    }
                } else {
                    if (d > e) {
                        System.out.println("D is max");
                    } else {
                        System.out.println("E is max");
                    }
                }
            }
        }

    }

}
