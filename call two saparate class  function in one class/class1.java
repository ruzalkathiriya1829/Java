public class class1 {

    void display() {
        System.out.println("display method call of class1");
    }

    public static void main(String[] args) {

        class1 c1 = new class1();
        c1.display();

        class2 c2 = new class2();
        c2.disPlay();
    }

}