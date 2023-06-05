public class SuperKeyword {
    void display() {
        System.out.println("Display function of superkeyword class");
    }
}

class Super extends SuperKeyword {
    void display() {
        System.out.println("Display function of super class");
        super.display();
    }

    public static void main(String[] args) {

        Super s = new Super();

        s.display();

    }
}