public class SetterGetterWithThreeFunctionUsingThisKeyword {

    int a, b, c;

    void setDataA(int a) {
        this.a = a;
    }

    int getDataA() {
        return a;
    }

    void setDataB(int b) {
        this.b = b;
    }

    int getDataB() {
        return b;
    }

    void setDataC(int c) {
        this.c = c;
    }

    int getDataC() {
        return c;
    }

    public static void main(String[] args) {

        SetterGetterWithThreeFunctionUsingThisKeyword s = new SetterGetterWithThreeFunctionUsingThisKeyword();
        s.setDataA(10);
        int a = s.getDataA();
        System.out.println("a = " + a);

        s.setDataB(20);
        int b = s.getDataB();
        System.out.println("b = " + b);

        s.setDataC(30);
        int c = s.getDataC();
        System.out.println("c = " + c);

    }
}
