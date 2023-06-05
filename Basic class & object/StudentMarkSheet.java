class StudentMarkSheet
{
    static int rollNo;

    static void setData()
    {
        rollNo=10;
    }

    static void getData()
    {
        System.out.println("The roll no is"+rollNo);
    }

    public static void main(String[] args)
    {
        setData();
        getData();
    }
}