//with argument with return type

public class FunctionWithArgumentWithReturnType {

    void addition(int a, int b) {
        int c;
        c = a + b;
        System.out.println("Addition = " + c);
    }

    void substraction(int x, int y) {
        int z;
        z = x - y;
        System.out.println("substraction = " + z);
    }

    void multiplication(int a1, int b1) {
        int c1;
        c1 = a1 * b1;
        System.out.println("Multiplication = " + c1);
    }

    void division(int x1, int y1) {
        int z1;
        z1 = x1 - y1;
        System.out.println("Division = " + z1);
    }

    public static void main(String[] args) {

        FunctionWithArgumentWithReturnType F = new FunctionWithArgumentWithReturnType();
        F.addition(10, 20);
        F.substraction(50, 5);
        F.multiplication(5, 7);
        F.division(12, 6);

    }
}
