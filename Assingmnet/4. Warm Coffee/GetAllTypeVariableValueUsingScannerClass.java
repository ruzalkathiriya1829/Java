import java.util.Scanner;

public class GetAllTypeVariableValueUsingScannerClass {

    public static void main(String[] args) {

        int i1, i2, i3;
        float f1, f2, f3;
        double d1, d2, d3;
        long l1, l2, l3;
        String s1, s2, s3;

        Scanner sc = new Scanner(System.in);

        // for the get value from user//

        System.out.println("---------Integer Values----------");
        System.out.println("please enter value of i1:");
        i1 = sc.nextInt();
        System.out.println("please enter value of i2:");
        i2 = sc.nextInt();
        System.out.println("please enter value of i3:");
        i3 = sc.nextInt();

        System.out.println("\n---------Float Values----------");
        System.out.println("please enter value of f1:");
        f1 = sc.nextFloat();
        System.out.println("please enter value of f2:");
        f2 = sc.nextFloat();
        System.out.println("please enter value of f3:");
        f3 = sc.nextFloat();

        System.out.println("\n---------Double Values----------");
        System.out.println("please enter value of d1:");
        d1 = sc.nextDouble();
        System.out.println("please enter value of d2:");
        d2 = sc.nextDouble();
        System.out.println("please enter value of d3:");
        d3 = sc.nextDouble();

        System.out.println("\n---------Long Values----------");
        System.out.println("please enter value of l1:");
        l1 = sc.nextLong();
        System.out.println("please enter value of l2:");
        l2 = sc.nextLong();
        System.out.println("please enter value of l3:");
        l3 = sc.nextLong();

        System.out.println("\n---------String Values----------");
        System.out.println("please enter value of s1:");
        s1 = sc.nextLine();
        System.out.println("please enter value of s2:");
        s2 = sc.nextLine();
        System.out.println("please enter value of s3:");
        s3 = sc.nextLine();

        // for the OutPut//

        System.out.println("_______________________Output_______________________");

        System.out.println("---------Integer Values----------");
        System.out.println("Integer value i1 = " + i1);
        System.out.println("Integer value i2 = " + i2);
        System.out.println("Integer value i3 = " + i3);

        System.out.println("\n---------Float Values----------");
        System.out.println("Float value f1 = " + f1);
        System.out.println("Float value f2 = " + f2);
        System.out.println("Float value f3 = " + f3);

        System.out.println("\n---------Double Values----------");
        System.out.println("Double value d1 = " + d1);
        System.out.println("Double value d2 = " + d2);
        System.out.println("Double value d3 = " + d3);

        System.out.println("\n---------Long Values----------");
        System.out.println("Long value l1 = " + l1);
        System.out.println("Long value l2 = " + l2);
        System.out.println("Long value l3 = " + l3);

        System.out.println("\n---------String Values----------");
        System.out.println("String value s1 = " + s1);
        System.out.println("String value s2 = " + s2);
        System.out.println("String value s3 = " + s3);

    }
}