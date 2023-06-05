public interface Myinterface {

    public void display(int a, String name);

    public void sum(int a, int b);
}

class MyClass implements Myinterface {

    final int s = 1009;

    public void display(int a, String name) {
        System.out.println("display function is called " + a + "    " + name);
    }

    public void sum(int a, int b) {
        System.out.println(a + b);

    }

    public static void main(String[] args) {

        MyClass m = new MyClass();
        m.display(10, "hello");
        m.sum(30, 40);

        System.out.println(m.s);

    }
}
