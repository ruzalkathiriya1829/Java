//class different , function same , parameter same
//method overriding

class MethodOverloading {
    public void display() {
        System.out.println("parent class - display");
    }

    public void display(int a) {

    }

    public void display(int b, int a) {

    }

}

public class MethodOverridding extends MethodOverloading {
    
    public void display()
    {

        System.out.println("child class - display");
    }

    public static void main(String[] args)
    {
        MethodOverridding c = new MethodOverridding();
        c.display();
    }
}
