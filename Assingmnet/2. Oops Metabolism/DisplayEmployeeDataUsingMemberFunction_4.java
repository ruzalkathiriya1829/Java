public class DisplayEmployeeDataUsingMemberFunction_4 {
    
    int emp_id, emp_salary;
    String emp_name, emp_designation;

    void set()
    {
        emp_id = 101;
        emp_name = "Sima Joshi";
        emp_designation = "Project Leader";
        emp_salary = 55000;
    }

    void display()
    {
         System.out.println("Employee Id = " +emp_id);
         System.out.println("Employee Name = " +emp_name);
         System.out.println("Employee Designation = "+emp_designation);
         System.out.println("Employee Salary = " +emp_salary);
    }

    public static void main(String[] args) {
        DisplayEmployeeDataUsingMemberFunction d1 = new DisplayEmployeeDataUsingMemberFunction();
        d1.set();
        d1.display();
    }


}
