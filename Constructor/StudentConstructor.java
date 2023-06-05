class StudentConstructor {

    StudentConstructor() {
        System.out.println("Empty Constructor is called");
    }

    StudentConstructor(int a) {
        System.out.println("Parameterized Constructor is called");
    }

    public static void main(String[] args) {
        StudentConstructor s = new StudentConstructor();
        StudentConstructor s1 = new StudentConstructor(5);
    }
}