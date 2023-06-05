//without return type with argument 

public class FunctionWithoutReturnTypeWithArgument {

    void calc(int x, int y) {
        int sum = x + y;
        System.out.print("Sum of two numbers is :" + sum);
    }

    public static void main(String[] args) {

        FunctionWithoutReturnTypeWithArgument F = new FunctionWithoutReturnTypeWithArgument();

        int a = 14;
        int b = 6;

        F.calc(a, b);

    }
    
}
