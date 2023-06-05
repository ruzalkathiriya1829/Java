public class StudentConstructorWithFunction {

    int m1, m2, total;

    StudentConstructorWithFunction() {
        System.out.println("empty constructor is called");
    }

    StudentConstructorWithFunction(int x, int y) {
        m1 = x;
        m2 = y;
    }

    void displayTotal() {
        total = m1 + m2;
        System.out.println(total);
    }

    public static void main(String[] args) {

        StudentConstructorWithFunction s = new StudentConstructorWithFunction();

        StudentConstructorWithFunction s1 = new StudentConstructorWithFunction(20, 23);
        s1.displayTotal();
    }
}
