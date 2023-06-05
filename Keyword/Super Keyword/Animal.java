public class Animal {

    void color() {
        System.out.println("Color function of animal class");
    }

}

class Dog extends Animal {

    void color() {

        super.color();
        System.out.println("Color function of dog class");
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        {
            d.color();
        }

    }
}
