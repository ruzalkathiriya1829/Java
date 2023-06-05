//Method overloading 
//class name same, function same, parameter different 

class MethodOverloading {
    public void display() {
        System.out.println("parent class - display");
    }

    public void display(int a) {

    }

    public void display(int b, int a) {

    }

    public static void main(String[] args) {
        MethodOverloading p = new MethodOverloading();
        p.display();
        p.display(10, 20);
    }
}
