public class Student {

    int rollno;
    String name;

    Student(int rollno, String name) {

        this.rollno = rollno;
        this.name = name;
    }

    public void display() {
        System.out.println("rollno = " + rollno + "\n" + "name = " + name);
    }

    public static void main(String[] args) {

        Student s = new Student(101, "ruzal");
        {
            s.display();
        }
    }

}