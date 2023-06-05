//without argument without return type

public class FunctionWithoutArgumentWithoutReturnType {

    void hello() {
        System.out.println("Hello");
    }

    void world() {
        System.out.println("world");
    }

    void good() {
        System.out.println("Good");
    }

    void Morning() {
        System.out.println("Morning");
    }

    public static void main(String[] args) {

        FunctionWithoutArgumentWithoutReturnType f = new FunctionWithoutArgumentWithoutReturnType();

        f.hello();
        f.world();
        f.good();
        f.Morning();

    }
}