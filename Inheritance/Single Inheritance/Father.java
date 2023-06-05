public class Father {
    int age = 38;

    void displayFather() {
        System.out.println("Age = " + age);
    }
}

class Child extends Father {
    int age = 18;

    void displayChild() {

        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {

        Child c = new Child();
        c.displayFather();
        c.displayChild();

    }
}