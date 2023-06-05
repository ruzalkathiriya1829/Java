public class Student {
    int rollno;
    String name;
    static String collagename = "RW";

    public void setData(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;

        System.out.println(rollno + " " + name + " " + collagename);
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.setData(1, "Ragini");

        Student s1 = new Student();
        s1.setData(2, "Mohini");

        Student s2 = new Student();
        s2.setData(3, "Ram");
    }
}