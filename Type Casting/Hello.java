public class Hello {

    // void sum(int a, int b) {
    // int c;
    // c = a + b;
    // System.out.println("Sum = " + c);
    // }

    // void multi(int x, int y) {
    // int z;
    // z = x * y;
    // System.out.println("multiplication =" + z);
    // }

    // void sub(int p, int q) {
    // int r;
    // r = p * q;
    // System.out.println("Substraction =" + r);
    // }

    // void division(int n, int o) {
    // int m;
    // m = n * o;
    // System.out.println("Division = " + m);
    // }

    // public static void main(String[] args) {

    // Hello h = new Hello();
    // h.sum(10, 20);
    // h.multi(30, 40);
    // h.sub(15, 20);
    // h.division(30, 60);

    // }

    // void sum() {
    // int a = 10, b = 12, c;
    // c = a + b;
    // System.out.println("Sum = " + c);
    // }

    // void multi() {
    // int x = 10, y = 12, z;
    // z = x * y;
    // System.out.println("multiplication =" + z);
    // }

    // void sub() {
    // int p = 10, q = 12, r;
    // r = p * q;
    // System.out.println("Substraction =" + r);
    // }

    // void division() {
    // int n = 13, o = 3, m;
    // m = n * o;
    // System.out.println("Division = " + m);
    // }

    // public static void main(String[] args) {

    // Hello h = new Hello();
    // h.sum();
    // h.multi();
    // h.sub();
    // h.division();

    // }

    void sum() {
        int a = 12, b = 13, c;
        c = a + b;
        System.out.println("Sum = " + c);
    }

    void multi() {
        int x = 12, y = 34, z;
        z = x * y;
        System.out.println("multiplication =" + z);
    }

    void sub() {
        int p = 12, q = 12, r;
        r = p * q;
        System.out.println("Substraction =" + r);
    }

    void division() {
        int m, n = 13, o = 14;
        m = n * o;
        System.out.println("Division = " + m);
    }

    public static void main(String[] args) {

        // int a = 10, b = 12, x = 12, y = 2, p = 2, q = 5, n = 12, o = 5;

        Hello h = new Hello();
        h.sum();
        h.multi();
        h.sub();
        h.division();

    }
}