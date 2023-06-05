public class Constructor {

    // void hello() {
    //     System.out.println("Good morning!!");
    // }

    // Constructor() {
    //     System.out.println("Hello");
    // }

    Constructor(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {

     //   Constructor c = new Constructor();
        Constructor c1 = new Constructor(10, 5);
       // c.hello();

    }
}