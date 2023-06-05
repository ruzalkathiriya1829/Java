public class GrandFather {
    int age = 60;

    void GrandFatherAge() {
        System.out.println("GrandFather age = " + age);
    }
}

class Father extends GrandFather {
    int age = 40;

    void FatherAge() {
        System.out.println("Father age = " + age);
    }
}

class Uncle extends GrandFather {
    int age = 37;

    void UncleAge() {
        System.out.println("Uncle age = " + age);
    }

    public static void main(String[] args) {
        Uncle u = new Uncle();

        u.GrandFatherAge();
        // u.Fatherage();
        // not called because Father and Uncle both class extend grandfather class
        // grandfather class is parent and two child of this class
        // one father and second uncle
        u.UncleAge();

    }
}