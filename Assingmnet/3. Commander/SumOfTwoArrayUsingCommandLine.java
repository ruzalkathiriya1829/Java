public class SumOfTwoArrayUsingCommandLine {

    public static void main(String[] args) {

        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];

        System.out.println("Array of a:");
        for (int i = 0; i <= 4; i++) {
            a[i] = Integer.parseInt(args[i]);
            System.out.println(args[i]);
        }

        System.out.println("Array of b:");
        for (int i = 0; i <= 4; i++) {
            b[i] = Integer.parseInt(args[i]);
            System.out.println(args[i]);
        }

        System.out.println("sum of a and b array:");
        for (int i = 0; i <= 4; i++) {
            c[i] = Integer.parseInt(args[i]);
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }

    }
}
