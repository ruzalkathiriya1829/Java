public class CheckPositiveNagativeZero_4 {
    
    public static void main(String[] args) {
        
        int number = -10;

        if(number==0)
        {
            System.out.println("Number is zero");
        }
        else
        {
            if(number>0)
            {
                System.out.println(number + " is positive number");
            }
            else
            {
                System.out.println(number + " is negative number");
            }
        }
    }

}
