import java.util.Scanner;

public class Area {

    double length, width;

    public void getdata(Double length, Double width) {

        double area;
        this.length = length;
        this.width = width;

        area = length * width;

        System.out.println("Area of rectangle = " + area);

    }

    public static void main(String[] args) {

        double length, width;

        Scanner sc = new Scanner(System.in);

        Area a = new Area();

        System.out.println("please enter value of length = ");
        length = sc.nextDouble();

        System.out.println("please enter value of width = ");
        width = sc.nextDouble();

        a.getdata(length, width);

        // a.getdata(12.5, 12.5);

    }
}