public class FindMinUsingIfElseAmongThreeValue_8 {
    
    public static void main(String[] args)
    {
        int a=100, b=25, c=13;

        if(a<b)
        {
            if(a<c)
            {
                System.out.println("A is min");
            }
            else
            {
                System.out.println("C is min");
            }
        }
        else
        {
           if(b<c)
           {
                System.out.println("B is min");
           }
           else
           {
                System.out.println("C is min");
           }
        }
    }

}
