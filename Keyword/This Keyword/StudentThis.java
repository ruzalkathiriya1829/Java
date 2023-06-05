public class StudentThis {
    int a, b, c;

    void display(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sum() {

        c = a + b;
        return c;
    }

    public static void main(String[] args) {

        StudentThis s = new StudentThis();
        s.display(10, 20);
        int z = s.sum();
        System.out.println("sum =  " + z);

    }
}