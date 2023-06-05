import java.util.Scanner;

public class Shape {

    double length, width, area, pi = 3.14, radius;

    void areaOfShape() {

        System.out.println("This is a Shape class method areaOfShape is called");
    }

}

class Rectangle extends Shape {

    Scanner sc = new Scanner(System.in);

    void areaOfShape() {

        System.out.println("please enter value of length:");
        length = sc.nextDouble();

        System.out.println("please enter value of width:");
        width = sc.nextDouble();

        area = length * width;

        System.out.println("Area of Rectangle = " + area);
    }

    void display() {

        areaOfShape();
        super.areaOfShape();
    }
}

class Triangle extends Shape {

    Scanner sc = new Scanner(System.in);

    void areaOfShape() {

        System.out.println("please enter value of radius:");
        radius = sc.nextDouble();

        area = pi * radius * radius;

        System.out.println("Area of Rectangle = " + area);
    }

    void display() {

        areaOfShape();
        super.areaOfShape();
    }

    public static void main(String[] args) {

        Triangle t = new Triangle();

        t.display();

        Rectangle R = new Rectangle();
        R.du

    }

}
