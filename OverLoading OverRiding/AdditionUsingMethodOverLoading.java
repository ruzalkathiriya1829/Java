// overloading
public class AdditionUsingMethodOverLoading {
    void sum() {
        System.out.println(10);
    }

    void sum(int a) {
        System.out.println(a + 10);
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public static void main(String[] args) {

        AdditionUsingMethodOverLoading a = new AdditionUsingMethodOverLoading();
        a.sum();
        a.sum(10);
        a.sum(10, 20);
        a.sum(10, 20, 30);
        a.sum(10, 20, 30, 40);

    }
}