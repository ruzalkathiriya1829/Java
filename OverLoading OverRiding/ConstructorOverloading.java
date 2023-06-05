public class ConstructorOverloading {

    int id;
    String name;
    int age;

    ConstructorOverloading() {
        System.out.println("default constructor is called ");
    }

    ConstructorOverloading(int i) {

        id = i;
    }

    ConstructorOverloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {

        ConstructorOverloading c = new ConstructorOverloading();

        ConstructorOverloading c1 = new ConstructorOverloading(101);
        c1.display();

        ConstructorOverloading c2 = new ConstructorOverloading(101, "Ruzal", 19);
        c2.display();

    }

}
