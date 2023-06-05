import java.util.Scanner;

abstract class Shape {

    abstract void read();

    abstract void show();

}

class Rectangle extends Shape {

    Scanner sc = new Scanner(System.in);

    int length, width;

    void read() {
        System.out.println("please enter value of length:");
        length = sc.nextInt();

        System.out.println("please enter value of width:");
        width = sc.nextInt();
    }

    void show() {

        int area;

        area = length * width;

        System.out.println("Area of Rectangle = " + area);
    }
}

class Circle extends Shape {

    Scanner sc = new Scanner(System.in);

    float radius;

    final float pi = 3.14f;

    public void read() {
        System.out.println("please enter value of radius:");
        radius = sc.nextFloat();
    }

    public void show() {

        float area;

        area = pi * radius * radius;

        System.out.println("Area of Circle = " + area);

    }

    public static void main(String[] args) {

        Shape s = new Rectangle();
        s.read();
        s.show();

        Shape s1 = new Circle();
        s1.read();
        s1.show();
    }
}