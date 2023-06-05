class StudentMarkSheetUsingConstructor {

    int m1, m2, m3, total;
    String grade;
    float per;

    StudentMarkSheetUsingConstructor() {
        System.out.println("****************Student MarkSheet***************");
    }

    StudentMarkSheetUsingConstructor(int x, int y, int z) {
        m1 = x;
        m2 = y;
        m3 = z;
    }

    void displayTotal() {
        total = m1 + m2 + m3;

    }

    void displayPer() {
        per = total / 3;

    }

    void displayDesign()
    {
        System.out.println("m1\tm2\tm3\ttotal\tper\tgrade");
        System.out.println("----------------------------------------------");
    }

    void displayResult() {
       
        System.out.println(m1 + "\t" + m2 + "\t" + m3 + "\t" + total + "\t" + per + " %" + "\t" + grade);
    }

    void displayGrade() {

        if (per < 35) {
            grade = "Fail";
        } else if (per > 35 && per <= 50) {
            grade = "C";
        } else if (per > 50 && per <= 70) {
            grade = "B";
        } else if (per > 70 && per <=  90) {
            grade = "A";
        } else {
            grade = "A+";
        }

    }

    public static void main(String[] args) {

        StudentMarkSheetUsingConstructor s = new StudentMarkSheetUsingConstructor();

        StudentMarkSheetUsingConstructor s1 = new StudentMarkSheetUsingConstructor(33, 32, 23);
        s1.displayTotal();
        s1.displayPer();
        s1.displayGrade();
        s1.displayDesign();
        s1.displayResult();

        StudentMarkSheetUsingConstructor s2 = new StudentMarkSheetUsingConstructor(60, 40, 30);
        s2.displayTotal();
        s2.displayPer();
        s2.displayGrade();
        s2.displayResult();

        StudentMarkSheetUsingConstructor s3 = new StudentMarkSheetUsingConstructor(55, 60, 65);
        s3.displayTotal();
        s3.displayPer();
        s3.displayGrade();
        s3.displayResult();

        StudentMarkSheetUsingConstructor s4 = new StudentMarkSheetUsingConstructor(55, 80, 87);
        s4.displayTotal();
        s4.displayPer();
        s4.displayGrade();
        s4.displayResult();

        StudentMarkSheetUsingConstructor s5 = new StudentMarkSheetUsingConstructor(95, 94, 93);
        s5.displayTotal();
        s5.displayPer();
        s5.displayGrade();
        s5.displayResult();

    }

}