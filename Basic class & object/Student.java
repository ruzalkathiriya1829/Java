class Student
{
     int rollNo;

    void setData()
    {
        rollNo=20;
    }

    void getData()
    {
        System.out.println("The roll no is"+rollNo);
    }

    public static void main(String[] args)
    {
        Student s = new Student();
        s.setData();
        s.getData();
    }
}