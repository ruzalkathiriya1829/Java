public class GrandFather {

    int age = 60;

    void GrandFatherAge() {
        System.out.println("Grandfather Age = " + age);
    }
}

class Father extends GrandFather {
    int age = 38;

    void FatherAge() {
        System.out.println("Grandfather Age = " + age);
    }
}

class Child extends Father {
    int age = 18;

    void ChildAge() {
        System.out.println("Grandfather Age = " + age);
    }

    public static void main(String[] args) {

        Child c = new Child();
        c.GrandFatherAge();
        c.FatherAge();
        c.ChildAge();

    }
}
